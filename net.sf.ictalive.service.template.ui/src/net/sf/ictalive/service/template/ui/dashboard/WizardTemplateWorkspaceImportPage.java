package net.sf.ictalive.service.template.ui.dashboard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardResourceImportPage;

public class WizardTemplateWorkspaceImportPage extends WizardResourceImportPage {

	WizardTemplateWorkspaceImportPage(String name,
			IStructuredSelection selection) {
		super(name, selection);
	}

	@Override
	protected void createSourceGroup(Composite arg0) {
		
	}

	@Override
	protected ITreeContentProvider getFileProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ITreeContentProvider getFolderProvider() {
		// TODO Auto-generated method stub
		return null;
	}

}
