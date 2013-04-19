package net.sf.ictalive.opera2actions.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;


import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
 
import net.sf.ictalive.operetta.OM.*;

public class ConvertOpera2Actions {

	public static final URI transformationURI = 
		URI.createPlatformPluginURI("/net.sf.ictalive.Opera2Actions/transforms/Opera2Actions.qvto", true);

	public static void convertOpera2Actions(Resource operaResource, Resource actionsResource, Resource mapResource) {
		
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		ModelExtent input = new BasicModelExtent(operaResource.getContents());
		ModelExtent output1 = new BasicModelExtent();
		ModelExtent output2 = new BasicModelExtent();
		
		
		ExecutionContextImpl context = new ExecutionContextImpl();
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output1, output2);
		
		if(diagnostic.getSeverity() == Diagnostic.OK) {
			actionsResource.getContents().addAll(output1.getContents());
			mapResource.getContents().addAll(output2.getContents());
		} else {
			IStatus status = BasicDiagnostic.toIStatus(diagnostic);
			InvokeActivator.getDefault().getLog().log(status);
		}
	
	}	
}
