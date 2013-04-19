package net.sf.ictalive.actions2tasks.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class ConvertActions2Tasks {

	public static final URI transformationURI = 
		URI.createPlatformPluginURI("/net.sf.ictalive.Actions2Tasks/transforms/Actions2Tasks.qvto", true);

	public static void convertActions2Tasks(Resource actionsResource, Resource tasksResource) {
		
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		ModelExtent input = new BasicModelExtent(actionsResource.getContents());
		ModelExtent output = new BasicModelExtent();
			
		ExecutionContextImpl context = new ExecutionContextImpl();
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output);
		
		if(diagnostic.getSeverity() == Diagnostic.OK) {
			tasksResource.getContents().addAll(output.getContents());			
		} else {
			IStatus status = BasicDiagnostic.toIStatus(diagnostic);
			InvokeActivator.getDefault().getLog().log(status);
		}
	
	}	
}
