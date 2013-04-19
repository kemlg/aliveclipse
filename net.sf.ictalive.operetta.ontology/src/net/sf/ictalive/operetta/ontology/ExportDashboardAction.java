package net.sf.ictalive.operetta.ontology;

import org.eclipse.gmf.internal.common.URIUtil;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ExportDashboardAction extends PluggedInDashboardAction<AliveDashboardState> {

	public String dashboardActionId() {
		return AliveDashboardState.ExportOntologyId;
	}

	public String getProblems(AliveDashboardState state) {
		if (state.getOrganisation() == null)
			return "No organisation model has been selected.";
		else
			if (state.getOntology() != null && URIUtil.getFile(state.getOntology())== null)
				return "Cannot access ontology resource:\n"+state.getOntology()+"\n\nPlease try to refresh the project in the project explorer.";
			else
				
				return null;
	}

	public void run(AliveDashboardState state) {
		ExportHandler h = new ExportHandler();
		
		String newOntologyFilePath = h.exportAction(state.getOrganisation(), uriToOSFilePath( state.getOntology() )); 
		if (newOntologyFilePath != null) // null means that export was canceled, so don't set ontology
			state.setOntology( osFilePathToURI(newOntologyFilePath) );
		
	}
}