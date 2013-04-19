package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.io.File;

import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.Activator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class PlanDirectorySelectionPage extends WizardSelectionPage {

	private Text directoryText, prefixText;
	private IStructuredSelection selection;
	private IContainer selectedLocation;

	public PlanDirectorySelectionPage(IStructuredSelection selection) {
		super("Select a directory to store plan in");
		this.selection = selection;
		setDescription("Select a directory in which to store any plans that are generated");
	}

	public void setSelection(IStructuredSelection selection){
		this.selection = selection;
	}
	
	public IContainer getSelectedLocation() {
		return selectedLocation;
	}

	public String getPrefixText() {
		return prefixText.getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		Label label = new Label(container, SWT.NULL);
		label.setText("&Save plans in directory:");

		directoryText = new Text(container, SWT.SINGLE | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		directoryText.setLayoutData(gd);
		directoryText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				directoryTextChanged();
			}
		});

		// set the directory path if a directory if a suitable selection has
		// been made
		if (selection != null) {
			Object first = selection.getFirstElement();
			if (first instanceof IFile) {
				IFile folder = (IFile) first;
				IContainer par = folder.getParent();
				if (par == null)
					directoryText.setText(File.separatorChar
							+ folder.getProject().getName() + File.separator);
				else if (par instanceof IProject) {
					directoryText.setText(File.separatorChar
							+ folder.getProject().getName() + File.separator);
				} else {
					directoryText.setText(File.separatorChar
							+ folder.getProject().getName() + File.separator
							+ par.getProjectRelativePath());
				}

			} else if (first instanceof IFolder) {
				IFolder folder = (IFolder) first;
				directoryText.setText(File.separatorChar
						+ folder.getProject().getName() + File.separatorChar
						+ folder.getProjectRelativePath().toOSString());
			} else if (first instanceof IProject) {
				directoryText.setText(File.separatorChar
						+ ((IProject) first).getName() + File.separatorChar);
			}
		}

		Button browse = new Button(container, SWT.PUSH);
		browse.setText("Browse...");
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}

		});

		label = new Label(container, SWT.NULL);
		label.setText("&Prefix for generated file names:");
		prefixText = new Text(container, SWT.SINGLE | SWT.BORDER);
		prefixText.setLayoutData(gd);

		setControl(container);
	}

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), true,
				"Select directory");
		dialog.setTitle("Select Directory");
		if (dialog.open() == ContainerSelectionDialog.OK) {

			Object[] results = dialog.getResult();
			if (results != null && results.length == 1) {
				IPath location = null;
				if (results[0] instanceof IPath){
					location  = (IPath)results[0];
				} else if (results[0] instanceof IResource){
					location = ((IResource)results[0]).getLocation();
				}
				if (location!=null){
				directoryText.setText(location.toPortableString());
			}
		}}
	}

	private void directoryTextChanged() {

		selectedLocation = null;
		String fileName = directoryText.getText();
		if (fileName.length() == 0) {
			updateStatus("Directory name must be specified");
			return;
		}
		IResource container = null;
		try {
			container = ResourcesPlugin.getWorkspace().getRoot()// .getFile(
					.findMember(new Path(fileName));
		} catch (IllegalArgumentException e) {
			updateStatus(e.getMessage());
			return;
		}
		// .findMember(fileName);
		if (container == null
				|| (container.getType() != IResource.FOLDER && container
						.getType() != IResource.PROJECT)
				|| !(container.exists())) {
			updateStatus("Directory must exist within the current workspace");
			return;
		}
		// if (!container.isAccessible()) {
		// updateStatus("File must be writable");
		// return;
		// }
		if (fileName.indexOf('\\', 1) > 0) {
			updateStatus("Directory name must be valid");
			return;
		}

		selectedLocation = (IContainer) container;
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

}
