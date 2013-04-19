/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.io.File;

import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.Activator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

/**
 * @author dcorsar
 * 
 */
public class TaskFileSelectionPage extends WizardPage {

	private static final String DEFAULT_MSG = "Select the \".tasks\" file that contains the task to plan for.";

	private Text taskFileNameText;

	private boolean fromFileSelection;

	private IFile selectedFile;

	private IStructuredSelection selection;

	protected TaskFileSelectionPage(IStructuredSelection selection) {
		super("Task Selection");
		this.selection = selection;
		setDescription(DEFAULT_MSG);
		setPageComplete(false);
		fromFileSelection = false;
	}

	public void setSelection(IStructuredSelection selection){
		this.selection = selection;
		if (selection!=null && selection.getFirstElement()!=null){
			System.out.println(selection.getFirstElement().getClass());
		}
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
		label.setText("&Task file:");

		taskFileNameText = new Text(container, SWT.SINGLE | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		taskFileNameText.setLayoutData(gd);
		taskFileNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button browse = new Button(container, SWT.PUSH);
		browse.setText("Browse...");
		if (this.selection != null) {
			Object obj = this.selection.getFirstElement();
			if (obj != null && obj instanceof IFile) {
				IFile file = (IFile) obj;
				System.out.println(file.getName());
				if (file.getName().endsWith(".tasks")) {
					taskFileNameText.setText( File.separatorChar + file.getProject().getName()
							+ File.separatorChar
							+ file.getProjectRelativePath().toOSString());
				}
			}
		}
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});

		setControl(container);
	}

	private void handleBrowse() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(),
				IResource.FILE);
		dialog.setTitle("Select a .tasks file");
		dialog
				.setMessage("Select a .tasks file to open (? = any character, * = any string):");
		int open = dialog.open();
		if (open == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IFile selectedFile = (IFile) result[0];
				this.selectedFile = null;
				fromFileSelection = true;
				taskFileNameText.setText(selectedFile.getFullPath().toString());
				fromFileSelection = false;
				validateFileSelection(selectedFile);

			}
		}
	}

	private void dialogChanged() {
		this.selectedFile = null;
		if (!fromFileSelection) {
			String fileName = taskFileNameText.getText();
			if (fileName.length() == 0) {
				updateStatus(DEFAULT_MSG);
//				selectedFile = null;
				return;
			}
			IFile container = null;
			try {
				container = ResourcesPlugin.getWorkspace().getRoot().getFile(
						new Path(fileName));
			} catch (IllegalArgumentException e) {
				updateStatus(e.getMessage());
				container = null;
				return;
			}
			validateFileSelection(container);
		}
	}

	private void validateFileSelection(IFile container) {
		this.selectedFile = null;
		String fileName = container.getName();
		if (container == null || (container.getType() != IResource.FILE)
				|| !(container.exists())) {
			updateStatus("Selected file must exist.");
			return;
		}
		if (fileName.indexOf('\\', 1) > 0) {
			updateStatus("File must have a name.");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("tasks") == false) {
				updateStatus("File extension must be \"tasks\"");
				return;
			}
		}
		selectedFile = container;
		updateStatus(null);
	}

	/**
	 * Returns the selected file, only if a valid tasks file has been selected
	 * otherwise null is returned.
	 * 
	 * @return The selected tasks file, if a valid tasks file has been selected
	 *         otherwise null.
	 */
	public IFile getSelectedFile() {
		return this.selectedFile;
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

}
