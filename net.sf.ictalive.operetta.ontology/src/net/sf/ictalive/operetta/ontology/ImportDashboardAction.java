package net.sf.ictalive.operetta.ontology;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.jface.dialogs.MessageDialog;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ImportDashboardAction extends PluggedInDashboardAction<AliveDashboardState> {

	public String dashboardActionId() {
		return AliveDashboardState.ImportOntologyId;
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
		ImportHandler h = new ImportHandler();

		String newOntologyFilePath = h.importAction(state.getOrganisation(), uriToOSFilePath( state.getOntology() )); 
//		if (newOntologyFilePath != null) // null means that import was canceled, so don't set ontology
		
		state.setOntology( osFilePathToURI(newOntologyFilePath) );
		
		MessageDialog.openInformation(null, "Ontology Imported", "Ontology "+state.getOntology().lastSegment()+" imported succesfully.");
		
	}
}
