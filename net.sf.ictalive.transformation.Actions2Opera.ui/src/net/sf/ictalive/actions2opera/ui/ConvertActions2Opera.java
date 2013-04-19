package net.sf.ictalive.actions2opera.ui;

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
import org.eclipse.swt.widgets.TableItem;

public class ConvertActions2Opera {

	public static final URI transformationURI = 
		URI.createPlatformPluginURI("/net.sf.ictalive.Actions2Opera/transforms/Actions2Opera.qvto", true);
		
	private static String createArgument(TableItem[] tableitems, int index ){
		
		String reply ="";
		
		for (TableItem item : tableitems){			
			if(reply.equals(""))
				reply = item.getText(index);
			else
				reply = reply +";"+ item.getText(index);
		}
		
		return reply;
	}
	
	public static void convertActions2Opera(Resource actionResource, Resource operaResource, String ontology, TableItem[] tableitems ) {
		
		//System.out.println("converting Actions 2 Opera");		
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		ModelExtent input = new BasicModelExtent(actionResource.getContents());
		ModelExtent output = new BasicModelExtent();
				
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("inActions", createArgument(tableitems, 0 ) );
		context.setConfigProperty("inOptions", createArgument(tableitems, 1 ));
		context.setConfigProperty("inContainers", createArgument(tableitems, 2 ));
		context.setConfigProperty("inOntologyURI", ontology);
			
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output);
		
		if(diagnostic.getSeverity() == Diagnostic.OK) {
			operaResource.getContents().addAll(output.getContents());			
		} else {
			IStatus status = BasicDiagnostic.toIStatus(diagnostic);
			InvokeActivator.getDefault().getLog().log(status);
		}	
	}	

}
