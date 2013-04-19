package net.sf.ictalive.service.template.ui.dashboard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;

import com.google.common.base.Preconditions;

import edu.bath.alivetemplates.TemplateAnswerSet;
import edu.bath.alivetemplates.TemplateConstructor;

/**
 * Implements the process of grounding a template with progress
 * 
 * @author occ
 * 
 */

public class GroundTemplateAction extends WorkspaceModifyOperation {

	private String serviceOntologyURI;
	private String serviceName;
	private TemplateConstructor builder;
	private TemplateAnswerSet selectedMatch;
	private String serviceLabel;
	private String serviceDesc;
	private IFile targetFile;

	public GroundTemplateAction(IFile targetFile, TemplateConstructor builder,
			String serviceOntologyURI, String serviceName,
			TemplateAnswerSet selectedMatch, String serviceLabel,
			String serviceDesc) {
		super();
		Preconditions.checkNotNull(builder);
		Preconditions.checkNotNull(selectedMatch);
		Preconditions.checkNotNull(targetFile);
		Preconditions.checkNotNull(serviceOntologyURI);
		Preconditions.checkNotNull(serviceName);

		this.targetFile = targetFile;
		this.builder = builder;
		this.serviceOntologyURI = serviceOntologyURI;
		this.serviceName = serviceName;
		this.selectedMatch = selectedMatch;
		this.serviceLabel = serviceLabel;
		this.serviceDesc = serviceDesc;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		monitor.beginTask("Exporting service to file", 350);

		monitor.subTask("Instantiating template");
		java.net.URI ontologyURI = java.net.URI.create(serviceOntologyURI);

		java.net.URI svcURI = URIUtils.createURI(ontologyURI, serviceName);
		OWLOntology owlo = builder.performReplacement(selectedMatch
				.getMapping(), ontologyURI, svcURI);
		monitor.worked(100);
		monitor.subTask("Customising Service");
		Service theService = owlo.getService(svcURI);
		Preconditions.checkNotNull(theService, "Service " + svcURI
				+ " was not found in the returned ontology");
		theService.setLabel(serviceLabel, "EN");
		Profile profile = theService.getProfile();
		if (profile != null) { // I suppose a template could not have a
			// profile
			profile.setServiceName(serviceLabel);
			profile.setTextDescription(serviceDesc);
		}
		monitor.worked(50);

		monitor.subTask("Building Service Ontology");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		owlo.write(bos, ontologyURI);
		monitor.worked(100);
		monitor.subTask("Writing file");
		targetFile.appendContents(new ByteArrayInputStream(bos.toByteArray()),
				IFile.FORCE, new SubProgressMonitor(monitor, 100));

		monitor.done();

	}

}
