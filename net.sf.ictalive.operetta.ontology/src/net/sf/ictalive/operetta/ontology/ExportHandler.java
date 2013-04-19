package net.sf.ictalive.operetta.ontology;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resources;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import net.sf.ictalive.operetta.OM.presentation.OMEditor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import net.sf.ictalive.operetta.OM.ConceptType;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Concept;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

public class ExportHandler extends AbstractHandler implements IHandler {

	@Override // this method is called when the plugin is run as a Command (e.g. from the menu bar)
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof OMEditor) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			TransactionalEditingDomain editingDomain = (TransactionalEditingDomain)((OMEditor)editor).getEditingDomain();

			Resource resource = (Resource)editingDomain.getResourceSet().getResources().get(0);
			IPath parentDirInWorkspace = URIUtil.getFile(resource.getURI()).getFullPath().removeLastSegments(1);
			String filename = Util.getResourceName(resource)+".owl";

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot workspaceRoot = workspace.getRoot();
			IPath workspaceRootPath = workspaceRoot.getLocation();		   

			String parentDir = workspaceRootPath.append( parentDirInWorkspace ).toOSString();
			
			return export(window.getShell(), parentDir, filename, resource, workspaceRoot);
		}
		return null;
	}

	// this method is called (by ExportDashboardAction) when the plugin is run from the dashboard
	public String exportAction(URI organisationURI, String ontologyFilePath) {
		//System.out.println("exportAction: "+organisationURI + ", "+ontologyFilePath);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(organisationURI, true); 
		//System.out.println("file for resource is "+URIUtil.getFile(resource.getURI()));
		// TODO: is this okay? Do we need to close the resource?
		IPath parentDirInWorkspace;
		String filename;
		if (ontologyFilePath == null) {			
			parentDirInWorkspace = URIUtil.getFile(resource.getURI()).getFullPath().removeLastSegments(1);
			filename = Util.getResourceName(resource)+".owl";
		}
		else {
			IPath filePath = new Path( ontologyFilePath );
			parentDirInWorkspace = filePath.removeLastSegments(1);
			filename = filePath.lastSegment();
		}
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IPath workspaceRootPath = workspaceRoot.getLocation();		   

		String parentDir = workspaceRootPath.append( parentDirInWorkspace ).toOSString();
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		
		return export(shell, parentDir, filename, resource, workspaceRoot);
	}
	
	public String export(Shell shell, String defaultFilePath, String defaultFilename, Resource resource, IResource workspaceRoot) {
		FileDialog dialog = new FileDialog(shell, SWT.SAVE);	
	
	dialog.setText("Select File");

	dialog.setFilterExtensions(new String[] { "*.owl" });
	dialog.setFilterNames(new String[] { "Ontology Files (*.owl)" });
			
	dialog.setFileName(defaultFilename);
	
	//System.out.println("target: "+defaultFilename+ " "+defaultFilePath);
	
    dialog.setFilterPath(defaultFilePath);
	// let the dialog start in the current project root
	// Setting the directory is not ideal, but otherwise the dialog starts in / and Eclipse does not
	// remember previously selected directories anyway.
	
	//String filePath = location.toPortableString()+"/Test.owl";
	String selectedFilePath = dialog.open();
	// this returns an os filepath  eg: /Users/martijn/src/Eclipse Workspaces/runtime-EclipseApplication/Test/OrganisationModel/New.owl
	//System.out.println("path returned is "+selectedFilePath);
	
	if (new File(selectedFilePath).exists()) {
		if (!MessageDialog.openQuestion(shell, "Replace file?", "The file '"+selectedFilePath+"' already exists. Do you want to replace the existing file?"))
			selectedFilePath = null;			
	}
	
	if (selectedFilePath != null)
		exportOntology(resource, selectedFilePath, workspaceRoot);
	return selectedFilePath;
}

	/*
 * generated owl
<rdf:RDF
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:owl="http://www.w3.org/2002/07/owl#"
    xmlns:j.0="http://operetta.ictalive.sf.net/ExportedOntology.owl#"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema#"
    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#" > 
  <rdf:Description rdf:about="http://operetta.ictalive.sf.net/ExportedOntology.owl">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#Ontology"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://operetta.ictalive.sf.net/ExportedOntology.owl#Klasse1">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#Class"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://operetta.ictalive.sf.net/ExportedOntology.owl#Prop1">
    <rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://operetta.ictalive.sf.net/ExportedOntology.owl#individual1">
    <rdf:type rdf:resource="http://operetta.ictalive.sf.net/ExportedOntology.owl#Klasse1"/>
  </rdf:Description>
</rdf:RDF>

       
  <rdf:Description rdf:about="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#Klasse1">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#Class"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#DataProp1">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#DatatypeProperty"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#ObjProp1">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#ObjectProperty"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#Individual1">
    <rdf:type rdf:resource="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#Klasse1"/>
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#Thing"/>
  </rdf:Description>
  <rdf:Description rdf:about="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl">
    <rdf:type rdf:resource="http://www.w3.org/2002/07/owl#Ontology"/>
  </rdf:Description>
</rdf:RDF>

the  owl from the file also contains 
    	xmlns:Ontology1264498983673="http://www.semanticweb.org/ontologies/2010/0/Ontology1264498983673.owl#"
       	xmlns:owl2xml="http://www.w3.org/2006/12/owl2-xml#"

and a class thing


TODO:
-what type of ontology model do we create? Now it is OWL_MEM (see http://jena.sourceforge.net/ontology/)
-why does an individual have a second class Thing? (and why don't we get it in the generated ontology)
-no difference between dataprop and objprop. What is the default for a property? Right now, we create an OntProperty
 */
	public void exportOntology(Resource resource, String filePath, IResource workspaceRoot) {
		//Get editing domain

		Ontology exportedOntology = Util.getOntologyByName(resource, "Default");
		
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		
			
		String source = "http://operetta.ictalive.sf.net/"+Util.getResourceName(resource)+".owl";
		String ns = source + "#";

		model.createOntology(source);
		
		if (exportedOntology != null)
		{	EList<Concept> allConcepts = exportedOntology.getClasses();
			for (int i = 0; i < allConcepts.size(); i++) {
				Concept concept = allConcepts.get(i);
				String name = concept.getConcept();
				String uri = concept.getURI();
		
				// todo: figure out if switch is possible here
				if (concept.getType() ==  ConceptType.CLASS) {
					addClass(model, ns, name, uri);
				} else if (concept.getType() ==  ConceptType.INDIVIDUAL) {
					addIndividual(model, ns, name, uri);
				} else if (concept.getType() ==  ConceptType.PROPERTY) {
					addProperty(model, ns, name, uri);
				}
			}			
		
			try {
				OutputStream out = new FileOutputStream( new File(filePath));
				//model.write(System.out);
				model.write(out);
				out.close();
				
				try {
					// Refresh entire workspace.
					// TODO: refine to only refresh the parent of the owl file.
					workspaceRoot.refreshLocal(IFolder.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}

	
	public void addIndividual(OntModel model, String ns, String name, String uri)
	{	if (uri == null) uri = ns + name;
		
		// TODO: is this the right way to get the Thing class? It seems to work.
		OntClass ontClass = model.getOntClass("http://www.w3.org/2002/07/owl#Thing");
		model.createIndividual( uri, ontClass );
		// TODO: maybe store the individual's class in the OperettA model?
	}
	
	public void addClass(OntModel model, String ns, String name, String uri)
	{ 	if (uri == null) uri = ns + name;
		model.createClass(uri);	
	}

	public void addProperty(OntModel model, String ns, String name, String uri)
	{	if (uri == null) uri = ns + name;
		model.createObjectProperty(uri);	
	}
	
}