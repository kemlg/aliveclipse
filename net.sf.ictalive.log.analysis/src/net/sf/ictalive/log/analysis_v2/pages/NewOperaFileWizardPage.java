package net.sf.ictalive.log.analysis_v2.pages;

import java.io.IOException;
import java.io.InputStream;

import net.sf.ictalive.log.analysis_v2.Activator;
import net.sf.ictalive.log.analysis_v2.AnalyseLogWizard;
import net.sf.ictalive.log.analysis_v2.NewOperaFileWizard;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


public class NewOperaFileWizardPage extends WizardNewFileCreationPage {

		InputStream inputStream ;
		
	    public NewOperaFileWizardPage(IStructuredSelection selection) {
	        super("NewOperaFileWizardPage", selection);
	        setTitle("Opera File");
	        setDescription("Creates a new Opera File");
	        setFileExtension("opera");
	        
	    }

	    @Override
	    protected InputStream getInitialContents() {
	    
	        try {
	        	return Activator.getDefault().getBundle().getEntry("/").openStream();
	        } catch (IOException e) {
	//        	e.printStackTrace();
	            return null; // ignore and create empty comments
	        }
	    }
	    /**
		 * @generated
		 */
		@Override
		public IWizardPage getNextPage() {
			OperAFunctionsPage page = ((NewOperaFileWizard)getWizard()).operAFunctionsPage;
			
			return page;
		}
		
		public boolean performFinish() {
			MessageDialog.openInformation(this.getShell(), "NewOperaFileWizard", "performFinish");
			return false;
		}
		/**
		 * @see IWizardPage#canFlipToNextPage()
		 */
		public boolean canFlipToNextPage()
		{
			if (getErrorMessage() != null) return false;
			return true;
		}
}
