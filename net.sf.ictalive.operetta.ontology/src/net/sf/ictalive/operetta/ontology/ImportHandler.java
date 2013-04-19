package net.sf.ictalive.operetta.ontology;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resources;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.ui.*;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import net.sf.ictalive.operetta.OM.presentation.OMEditor;

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

public class ImportHandler extends AbstractHandler implements IHandler {

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
			
			
			return import_(window.getShell(), parentDir, Util.getResourceName(resource)+".owl", editingDomain, resource);
		}
		return null;
		
	}
	
	// this method is called (by ImportDashboardAction) when the plugin is run from the dashboard
	public String importAction(URI organisationURI, String ontologyFilePath) {
		System.out.println("Execute import");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(organisationURI, true); 

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
		
//		String selectedFilePath = import_(shell, parentDir, filename, null, resource);

		String selectedFilePath = parentDir+"/" + filename;
		importOntology(resource, null, selectedFilePath);
		
		if (selectedFilePath != null) {
			try {
				resource.save( null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return selectedFilePath;
	}


	public String import_(Shell shell, String defaultFilePath, String defaultFilename, TransactionalEditingDomain editingDomain, Resource resource) {
		
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);		
		dialog.setFilterPath(defaultFilePath);
		dialog.setFileName(defaultFilename);

		dialog.setText("Select File");
	
		dialog.setFilterExtensions(new String[] { "*.owl" });
		dialog.setFilterNames(new String[] { "Ontology Files (*.owl)" });
	
		String selectedFilePath = dialog.open();
		if (selectedFilePath != null)
			importOntology(resource, editingDomain, selectedFilePath);
		return selectedFilePath;
	}
	
	public void importOntology(Resource resource, TransactionalEditingDomain editingDomain, String filePath) {
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		
		
		// use the FileManager to find the input file
		InputStream in = FileManager.get().open( filePath );
		if (in == null) {
		    throw new IllegalArgumentException(
		                                 "File: " + filePath + " not found");
		}

		// read the RDF/XML file
		model.read(in, null);
		// TODO: why null instead of leaving out parameter?

		OperAModel operAModel = (OperAModel)resource.getContents().get(0);
		CS cs = operAModel.getOm().getCs();

		//create new ontology
		Ontology importedOntology = OMFactory.eINSTANCE.createOntology();
		importedOntology.setOntologyID("Imported");
		
		
		//Add new concepts
		ExtendedIterator classes = model.listClasses();

	    while (classes.hasNext())
	    {
	      OntClass thisClass = (OntClass) classes.next();
	      if (Util.getName(thisClass.toString()) != null)
	    	  { 
	    	  	Concept c = OMFactory.eINSTANCE.createConcept();
	    	  	c.setConcept(Util.getName(thisClass.toString()));
	    	  	c.setURI(thisClass.toString());
	    	  	c.setType(ConceptType.CLASS);
	    	  	
	    	  	importedOntology.getClasses().add(c);
	    	  }

	      ExtendedIterator instances = thisClass.listInstances();

	      while (instances.hasNext())
	      {
	        Individual thisInstance = (Individual) instances.next();
	        Concept c = OMFactory.eINSTANCE.createConcept();
    	  	c.setConcept(Util.getName(thisInstance.toString()));
    	  	c.setURI(thisInstance.toString());
    	  	c.setType(ConceptType.INDIVIDUAL);
    	  	
    	  	importedOntology.getClasses().add(c);
	      }
	    }
	    
	    ExtendedIterator properties = model.listAllOntProperties();
	    
	    while (properties.hasNext())
	    {
	    	OntProperty thisProperty = (OntProperty) properties.next();
	    	Concept c = OMFactory.eINSTANCE.createConcept();
    	  	c.setConcept(Util.getName(thisProperty.toString()));
    	  	c.setURI(thisProperty.toString());
    	  	c.setType(ConceptType.PROPERTY);
    	  	
    	  	importedOntology.getClasses().add(c);
	    }
	    
	    Ontology oldImported = Util.getOntologyByName(resource, "Imported");
		
	    if (editingDomain != null) { // if there is an editor, we use the command stack so the import appears in the undo history
	    	if (oldImported != null)
	    		editingDomain.getCommandStack().execute(
	    				DeleteCommand.create(editingDomain, oldImported));
		
	    	editingDomain.getCommandStack().execute(
	    			AddCommand.create(editingDomain, cs, cs.getOntology(), importedOntology));
	    }
	    else {
	    	EList<Ontology> ontologies = cs.getOntology();
			if (oldImported != null) 
				ontologies.remove(oldImported);
			ontologies.add(importedOntology);
	    }
	    	
		// TODO: Simply throwing the old one away is not what we want
				
	}
	
	
}
