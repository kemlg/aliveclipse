package net.sf.ictalive.actions2opera.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
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
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class Actions2OperaTransformationWizardPage1 extends WizardPage {
	private Text containerText;
	private Text fileText;		
	private Text actionText;	
	private ISelection selection;
	private IPath actionModel;
		
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public Actions2OperaTransformationWizardPage1(ISelection selection, IPath inActionModel ) {
		super("wizardPage");
		setTitle("Set OperA Model Output File");
		setDescription("This wizard creates a new OperA model from existing Actions");
		this.selection = selection;
		
		actionModel = inActionModel;		
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Action Model:");

		actionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		actionText.setLayoutData(gd);
		actionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});		

		Button actionButton = new Button(container, SWT.PUSH);
		actionButton.setText("Browse...");
		actionButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {				
				handlePlanBrowse();
			}
		});
		
		/////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("&Save To:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button folderButton = new Button(container, SWT.PUSH);
		folderButton.setText("Browse...");
		folderButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContextBrowse();
			}
		});
		
		//////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
				
		initialize();
		dialogChanged();
		setControl(container);							
	}

	private void initialize() {
		
		if(actionModel!=null){			
			actionText.setText(actionModel.toString());
			containerText.setText("/" + actionModel.segment(0) + "/OrganisationModel/");
			fileText.setText(getOperAFromAction());
		}else{		
			actionText.setText("");
			fileText.setText("new_file.opera");
		}		
		
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
			
	}	

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */
	private void handleContextBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new container for OperA model");
		
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	private void handlePlanBrowse() {
				
		ElementTreeSelectionDialog dialog =
			new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setTitle("File Selection");
		dialog.setMessage("Select new Action model");
					
		if (dialog.open() == ElementTreeSelectionDialog.OK) {
			Object[] result = dialog.getResult();
								
			if (result.length == 1) {				
				actionText.setText( new Path(result[0].toString()).toString().substring(1));
				
			}
		}					
	}
		
	
	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		IResource actionContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getAction()));
		IResource operaContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		String operaFileName = getFileName();
		String actionFileName = getAction();
		
		//IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		//String fileName = getFileName();
		
		if (getContainerName().length() == 0) {
			updateStatus("OperA container must be specified");
			return;
		}		
		if (operaContainer == null
				|| (operaContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("OperA container must exist");
			return;
		}
		if (operaContainer == null
				|| (actionContainer.getType() & (IResource.FILE)) == 0) {
			updateStatus("Action File must exist");
			return;
		}
		if (!operaContainer.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}		
		if (operaFileName.length() == 0) {
			updateStatus("OperA File name must be specified");
			return;
		}
		if (operaFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("OperA File name must be valid");
			return;
		}
		if (actionFileName.length() == 0) {
			updateStatus("Action File name must be specified");
			return;
		}
		if (actionFileName.toLowerCase().endsWith(".actions")==false) {
			updateStatus("Action File extension must be \"actions\"");
			return;
		}
		if (operaFileName.toLowerCase().endsWith(".opera")==false) {
			updateStatus("OperA Model File extension must be \"opera\"");
			return;
		}		
	
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
	public String getAction() {
		return actionText.getText();
	}
	
	public IPath getActionModel() {	
		return actionModel;	
	}
	
	public String getOperAFromAction(){
		IPath iPath = Path.fromPortableString(actionText.getText());
		String name = iPath.lastSegment();
		if (name.endsWith(".actions")){
			name = name.substring(0, name.lastIndexOf(".actions"));			
		}
		if (name.startsWith("get")){
			name = name.substring(3);			
		}
	
		return name.concat(".opera");
	}
	
}