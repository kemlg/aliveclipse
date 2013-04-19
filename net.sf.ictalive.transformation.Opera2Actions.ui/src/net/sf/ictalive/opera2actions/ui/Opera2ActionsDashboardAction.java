package net.sf.ictalive.opera2actions.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class Opera2ActionsDashboardAction extends PluggedInDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveActionFromOrganisationId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if (state.getOrganisation() != null) return null;//no error to report, activate the button
		
		return "No organisation model selected.";
	}

	@Override
	public void run(AliveDashboardState state) {
		URI inURI = state.getOrganisation();
		Resource inResource = new ResourceSetImpl().getResource(inURI, true);

		URI outURI;
		URI pathURI = inURI.trimFileExtension().trimSegments(1);
		if(pathURI.lastSegment().contains("OrganisationModel")) {
			pathURI = pathURI.trimSegments(1);
			pathURI = pathURI.appendSegment("CoordinationModel");
			pathURI = pathURI.appendSegment(inURI.trimFileExtension().lastSegment());
			outURI = pathURI.appendFileExtension("actions");
		} else {
			outURI = inURI.trimFileExtension().appendFileExtension("actions");
		}
		
		outURI = testFileLocation(outURI, false);
		if(outURI == null)
			return;
		
		
		Resource outResource1 = new ResourceSetImpl().createResource(outURI);
		
		URI outURI2 = inURI.trimFileExtension().appendFileExtension("OLCLMap");
		Resource outResource2 = new ResourceSetImpl().createResource(outURI2);
		
		try {
			ConvertOpera2Actions.convertOpera2Actions(inResource, outResource1, outResource2);			
			outResource1.save(Collections.emptyMap());
			outResource2.save(Collections.emptyMap());
			state.setAction(outURI);
			
			String fileLoc = uriToOSFilePath(outURI);
			
			MessageDialog.openInformation(null, "Action Model Generated", "Succesfully generated the Action Model at " + fileLoc + ".");
			
		} catch (Exception e) {
			Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
			InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
			
			MessageDialog.openError(null, "Action Model Generation Failed", "Failed to generate the Action Model.");
			
			state.setAction(null);
		}
	}
	
	public URI testFileLocation(URI uri, boolean close) {
		if(close)
			return null;
		URI result = null;
		
		try {
			if(new ResourceSetImpl().getResource(uri, true) != null) {
				MessageDialog question = new MessageDialog(null, 
															"Overwrite", null,
															"The file "+uri.trimFileExtension().lastSegment()+".actions already exists and will be overwritten. Are you sure?", 
															MessageDialog.QUESTION_WITH_CANCEL, 
															new String[] { IDialogConstants.YES_LABEL,
																		   IDialogConstants.NO_LABEL,
																		   IDialogConstants.CANCEL_LABEL},
															0);
				switch(question.open()) {
				case 0:
					return uri;
				case 1:
					InputDialog dialog = new InputDialog(null, "Specify new filename", "The file already exists.", uri.trimFileExtension().lastSegment()+".actions", null);
					if(dialog.open() == Window.OK) {
						URI newOut = uri.trimFileExtension().trimSegments(1);//path
						newOut = newOut.appendSegment(dialog.getValue());
						if(newOut.trimFileExtension() == newOut)
							newOut = newOut.appendFileExtension("actions");	
						
						URI test = testFileLocation(newOut, false);
						if(test == null && !close)
							return newOut;
						if(newOut != test && !close)
							return test;
						
					} else {
						close = true;
						return null;//stop the transformation.
					}
					break;
				case 2:
					close = true;
					return null;
				}
			}
		} catch (Exception e) {
			//that resource didn't exist, sorry for trying.
		}
		
		return result;
	}
	
	/**
	 * This class validates a the input String. 
	 */
	class Validator implements IInputValidator {
		/**
		 * Validates the String. Returns null for no error, or an error message
		 * 
		 * @param newText the String to validate
		 * @return String
		 */
		private URI outURI;

		public Validator(URI outURI) {
			super();
			this.outURI = outURI;
		}

		public String isValid(String newText) {

			URI newOut = outURI.trimFileExtension().trimSegments(1);//path
			newOut = newOut.appendSegment(newText);
			if(newOut.trimFileExtension() == newOut)
				newOut = newOut.appendFileExtension("actions");

			if(newOut.equals(outURI))
				return "Please enter new value";

			return null;
		}
	}
}
