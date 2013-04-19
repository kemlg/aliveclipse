package net.sf.ictalive.service.template.ui.dashboard;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Selects a template by URI from the currently configured template sources
 * 
 * @author occ
 * 
 */
public class SelectImportTypePage extends WizardPage {
	public SelectImportTypePage(String pageName) {
		super(pageName);
	}

	Logger log = LoggerFactory.getLogger(SelectImportTypePage.class);
	IResource workspaceResource;
	Button repoButton;
	Button fromWorkspaceButton;
	Label wsResourceLabel;

	@Override
	public void createControl(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout());
		repoButton = new Button(composite, SWT.RADIO);
		repoButton.setText("Load Template from repository");
		repoButton.setSelection(true);

		fromWorkspaceButton = new Button(composite, SWT.RADIO);
		fromWorkspaceButton.setText("Load Template from local file");
		fromWorkspaceButton.setSelection(false);

		final Group fromWorkspaceCopmposite = new Group(composite,
				SWT.SHADOW_OUT);

		fromWorkspaceCopmposite.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));
		fromWorkspaceCopmposite.setText("Selected Template");
		fromWorkspaceCopmposite.setLayout(new GridLayout());

		wsResourceLabel = new Label(fromWorkspaceCopmposite, SWT.NONE);
		wsResourceLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		wsResourceLabel.setText("no template selected");

		Button openFSImportDialogButton = new Button(fromWorkspaceCopmposite,
				SWT.PUSH);
		openFSImportDialogButton.setText("Select Template");

		openFSImportDialogButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				FilteredResourcesSelectionDialog workspaceImportDialog;
				workspaceImportDialog = new FilteredResourcesSelectionDialog(
						parent.getShell(), false, ResourcesPlugin
								.getWorkspace().getRoot(), IResource.FILE);
				workspaceImportDialog
						.setTitle("Select an existing template description");
				workspaceImportDialog
						.setInitialPattern("*.owl, *.owls, *.control");
				workspaceImportDialog.open();
				Object[] result = workspaceImportDialog.getResult();
				if (result.length > 0) {
					Object res = result[0];
					IResource resource = (IResource) res;
					workspaceResource = resource;
					wsResourceLabel.setText(res.toString());
				}
			}
		});

		Listener radioListener = new Listener() {
			@Override
			public void handleEvent(Event ev) {
				if (repoButton.getSelection()) {
					fromWorkspaceCopmposite.setEnabled(false);
				} else {
					fromWorkspaceCopmposite.setEnabled(true);
				}
				setPageComplete(validatePage());
			}
		};
		repoButton.addListener(SWT.Selection, radioListener);
		fromWorkspaceButton.addListener(SWT.Selection, radioListener);
		fromWorkspaceCopmposite.setEnabled(false);
		setPageComplete(validatePage());
		composite.pack();
		setControl(composite);
	}

	private boolean validatePage() {
		boolean valid = repoButton.getSelection()
				|| (fromWorkspaceButton.getSelection() && workspaceResource != null);
		log.debug("Validated page as {}", valid);
		return valid;

	}

	@Override
	public IWizardPage getNextPage() {
		// if (fromWorkspaceButton.getSelection()) {
		// return ((AdaptServiceTemplateDashboardWizard) getWizard())
		// .getShowTemplateMatchesPage();
		// } else {
		// return ((AdaptServiceTemplateDashboardWizard) getWizard())
		// .getServiceRepositoryImportPage();
		// }
		return super.getNextPage();
	}
}
