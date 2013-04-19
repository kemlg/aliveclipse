package net.sf.ictalive.cl2sl.ui;

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

import net.sf.ictalive.service.syntax.StyleEncoding;
import net.sf.ictalive.service.syntax.TransportProtocol;

public class ConvertCL2SL {

	public static final URI transformationURI = 
		URI.createPlatformPluginURI("/net.sf.ictalive.CL2SL/transforms/CL2SL.qvto", true);
	
	
	public static void convertPlan2Service(Resource planResource, Resource serviceResource, String serviceName, String serviceEndpoint, String serviceNamespace, String binding, String style_encod) {
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
				
	//	System.out.println("convert -> " + serviceName + ", " + serviceEndpoint+" , "+ serviceNamespace + ", " + binding + ", " + style_encod );
		
		ModelExtent input = new BasicModelExtent(planResource.getContents());
		ModelExtent output = new BasicModelExtent();
		
		// setup the execution environment details -> 
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("service_name", serviceName);
		context.setConfigProperty("endpoint", serviceEndpoint);
		context.setConfigProperty("name_space", serviceNamespace);
		
		if (binding.equals("SOAP")){ 
			context.setConfigProperty("binding", TransportProtocol.SOAP); //default
		}
		else{
			
		}
		
		if ( style_encod.equals("Document Literal")){
			context.setConfigProperty("encoding", StyleEncoding.DOCUMENT_LITERAL );
		}else{
			context.setConfigProperty("encoding", StyleEncoding.RPC_ENCODED ); //default
		}
		
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output);
		
		if(diagnostic.getSeverity() == Diagnostic.OK) {
			serviceResource.getContents().addAll(output.getContents());			
		} else {
			IStatus status = BasicDiagnostic.toIStatus(diagnostic);
			InvokeActivator.getDefault().getLog().log(status);
		}
		
	}
	
	public static void convertPlan2Service(Resource planResource, Resource serviceResource) {
				
		convertPlan2Service(planResource, serviceResource, null, null, null, "SOAP", "Document Literal");		
	
	}	
}
