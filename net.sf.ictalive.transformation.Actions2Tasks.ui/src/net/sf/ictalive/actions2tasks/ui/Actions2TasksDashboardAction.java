package net.sf.ictalive.actions2tasks.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;

import net.sf.ictalive.actions2tasks.ui.ConvertActions2Tasks;
import net.sf.ictalive.actions2tasks.ui.InvokeActivator;
import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class Actions2TasksDashboardAction extends PluggedInDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveTaskFromActionId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(state.getAction() != null) return null;//no problems to report, activate button
		
		return "No action model selected.";
	}

	@Override
	public void run(AliveDashboardState state) {
		URI inURI = state.getAction();
		Resource inResource = new ResourceSetImpl().getResource(inURI, true);
		
		URI outURI = inURI.trimFileExtension().appendFileExtension("tasks");

//		URI pathURI = inURI.trimFileExtension().trimSegments(1);
//		if(pathURI.lastSegment().contains("OrganisationModel")) {
//			pathURI = pathURI.trimSegments(1);
//			pathURI = pathURI.appendSegment("CoordinationModel");
//			pathURI = pathURI.appendSegment(inURI.trimFileExtension().lastSegment());
//			outURI = pathURI.appendFileExtension("tasks");
//		} else {
//			outURI = inURI.trimFileExtension().appendFileExtension("tasks");
//		}
		
		Resource outResource = new ResourceSetImpl().createResource(outURI);
						
		try {
			ConvertActions2Tasks.convertActions2Tasks(inResource, outResource);			
			outResource.save(Collections.emptyMap());
			state.setTask(outResource.getURI());
			
			String fileLoc = uriToOSFilePath(outURI);
			
			MessageDialog.openInformation(null, "Task Model Generated", "Succesfully generated the Task Model at " + fileLoc + ".");
			
		} catch (Exception e) {
			Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
			InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
			
			MessageDialog.openError(null, "Task Model Generation Failed", "Failed to generate the Task Model.");
		}
		
	}
}
