package net.sf.ictalive.service.template.ui.dashboard;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class SelectExportLocationWizardPage extends WizardPage {
	IResource selectedDestination;

	public SelectExportLocationWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	IResource getSelectedDestination() {
		return selectedDestination;
	}

	public SelectExportLocationWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);

		setPageComplete(validatePage());

	}

	public boolean validatePage() {
		return selectedDestination != null;
	}

}
