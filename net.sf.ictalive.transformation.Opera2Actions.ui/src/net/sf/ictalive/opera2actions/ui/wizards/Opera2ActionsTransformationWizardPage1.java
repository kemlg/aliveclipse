package net.sf.ictalive.opera2actions.ui.wizards;

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

public class Opera2ActionsTransformationWizardPage1 extends WizardPage {
	private Text containerText;
	private Text fileText;		
	private Text operaText;	
	private ISelection selection;
	private IPath operaModel;
		
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public Opera2ActionsTransformationWizardPage1(ISelection selection, IPath inModel ) {
		super("wizardPage");
		setTitle("Set Actions Model Output File");
		setDescription("This wizard creates a new Action model from an existing OperA");
		this.selection = selection;
		
		operaModel = inModel;		
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
		label.setText("&OperA Model:");

		operaText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		operaText.setLayoutData(gd);
		operaText.addModifyListener(new ModifyListener() {
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

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
		if(operaModel!=null){			
			operaText.setText(operaModel.toString());
			containerText.setText("/" + operaModel.segment(0) + "/CoordinationModel/");
			fileText.setText(getActionsFromOpera());
		}else{		
			operaText.setText("");
			fileText.setText("new_file.actions");
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
				"Select new container for Actions model");
		
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
		dialog.setMessage("Select new OperA model");
					
		if (dialog.open() == ElementTreeSelectionDialog.OK) {
			Object[] result = dialog.getResult();
								
			if (result.length == 1) {				
				operaText.setText( new Path(result[0].toString()).toString().substring(1));
				
			}
		}
					
	}
		
	
	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		IResource operaContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getOperA()));
		IResource actionContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		String operaFileName =getOperA();// getFileName();
		String actionFileName = getFileName();
			
		if (getContainerName().length() == 0) {
			updateStatus("Actions container must be specified");
			return;
		}		
		if (actionContainer == null
				|| (actionContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("Actions container must exist");
			return;
		}		
		if (operaContainer == null
				|| (operaContainer.getType() & (IResource.FILE)) == 0) {
			updateStatus("OperA File must exist");
			return;
		}		
		
		if (!actionContainer.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}		
		if (actionFileName.length() == 0) {
			updateStatus("Actions File name must be specified");
			return;
		}
		if (operaFileName.length() == 0) {
			updateStatus("OperA File name must be specified");
			return;
		}
		if (operaFileName.toLowerCase().endsWith(".opera")==false) {
			updateStatus("OperA File extension must be \"opera\"");
			return;
		}
		if (actionFileName.toLowerCase().endsWith(".actions")==false) {
			updateStatus("Actions Model File extension must be \"actions\"");
			return;
		}		
		if (actionFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Actions File name must be valid");
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
	
	public String getOperA() {
		return operaText.getText();
	}
	
	public IPath getOperAModel() {	
		return operaModel;	
	}
	
	public String getActionsFromOpera(){
		IPath iPath = Path.fromPortableString(operaText.getText());
		String name = iPath.lastSegment();
		if (name.endsWith(".opera")){
			name = name.substring(0, name.lastIndexOf(".opera"));			
		}
		if (name.startsWith("get")){
			name = name.substring(3);			
		}
	
		return name.concat(".actions");
	}
	
}