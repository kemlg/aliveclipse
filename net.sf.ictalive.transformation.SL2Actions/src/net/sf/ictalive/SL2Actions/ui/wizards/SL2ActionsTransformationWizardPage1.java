package net.sf.ictalive.SL2Actions.ui.wizards;

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

public class SL2ActionsTransformationWizardPage1 extends WizardPage {
	private Text actionsContainerText;
	private Text actionsFileText;	
	
	private Text operaContainerText;
	private Text operaFileText;	
	
	private Text owlsText;	
	private ISelection selection;
	
	private Button genOpera;
	
	private IPath owlsModel;
		
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public SL2ActionsTransformationWizardPage1(ISelection selection, IPath inModel ) {
		super("wizardPage");
		setTitle("Set the Action and Opera Model Output Files");
		setDescription("This wizard creates or updates an Action and OperA model from an OWL-S description");
		this.selection = selection;
		
		owlsModel = inModel;		
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
		label.setText("&OWL-S Model:");

		owlsText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		owlsText.setLayoutData(gd);
		owlsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});		

		Button actionButton = new Button(container, SWT.PUSH);
		actionButton.setText("Browse...");
		actionButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {				
				handleOWLSBrowse();
			}
		});
		
		/////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("&Save Actions To:");

		actionsContainerText = new Text(container, SWT.BORDER | SWT.SINGLE);		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		actionsContainerText.setLayoutData(gd);
		actionsContainerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button actionsFolderButton = new Button(container, SWT.PUSH);
		actionsFolderButton.setText("Browse...");
		actionsFolderButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleActionsContextBrowse();
			}
		});
				
		//////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("&Actions File name:");

		actionsFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		actionsFileText .setLayoutData(gd);
		actionsFileText .addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
			
		new Label(container, SWT.NULL);
		
		/////////////////////////////
		genOpera = new Button(container, SWT.CHECK);
		genOpera.setText("&Generate OperA");		
		genOpera.setSelection(true);
		
		new Label(container, SWT.NULL);
		
		new Label(container, SWT.NULL);
		
		//
		final Label labelOperaTo = new Label(container, SWT.NULL);
		labelOperaTo.setText("&Save OperA To:");

		operaContainerText = new Text(container, SWT.BORDER | SWT.SINGLE);		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		operaContainerText.setLayoutData(gd);
		operaContainerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		final Button operaFolderButton = new Button(container, SWT.PUSH);
		operaFolderButton.setText("Browse...");
		operaFolderButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleOperaContextBrowse();
			}
		});
		
		//////////////////////////////
		final Label labelOpera = new Label(container, SWT.NULL);
		labelOpera.setText("&OperA File name:");

		operaFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		operaFileText.setLayoutData(gd);
		operaFileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		
		genOpera.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
                if (genOpera.getSelection()==false) {
                	labelOpera.setVisible(false);
                	labelOperaTo.setVisible(false);
                    operaContainerText.setVisible(false);
                    operaFileText.setVisible(false);
                    operaFolderButton.setVisible(false);
                } else {
                	labelOpera.setVisible(true);
                	labelOperaTo.setVisible(true);
                	operaContainerText.setVisible(true); 
                	operaFileText.setVisible(true);
                    operaFolderButton.setVisible(true);
                }
                
                dialogChanged();
            }
        });
		
		new Label(container, SWT.NULL);
		
		initialize();
		dialogChanged();
		setControl(container);							
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
		if(owlsModel!=null){			
			owlsText.setText(owlsModel.toString());
			
			actionsContainerText.setText("/" + owlsModel.segment(0) + "/CoordinationModel/");
			actionsFileText.setText(getActionsFromOWLS());
			
			operaContainerText.setText("/" + owlsModel.segment(0) + "/OrganisationModel/");
			operaFileText.setText(getOperaFromOWLS());
			
		}else{		
			owlsText.setText("");
			actionsFileText.setText("new_file.actions");
			operaFileText.setText("new_file.opera");
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
				
				actionsContainerText.setText(container.getFullPath().toString());
				operaContainerText.setText(container.getFullPath().toString());
			}
		}
			
	}
	
	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleActionsContextBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new container for Actions model");
		
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				actionsContainerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	private void handleOperaContextBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new container for OperA model");
		
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				operaContainerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	private void handleOWLSBrowse() {
				
		ElementTreeSelectionDialog dialog =
			new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());		
		dialog.setTitle("File Selection");
		dialog.setMessage("Select new OWL-S model");
					
		if (dialog.open() == ElementTreeSelectionDialog.OK) {
			Object[] result = dialog.getResult();
								
			if (result.length == 1) {				
				owlsText.setText( new Path(result[0].toString()).toString().substring(1));
				
			}
		}
					
	}
		
	
	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		
		IResource owlsContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getOWLS()));
		String owlsFileName =getOWLS();// getFileName();
		
		IResource actionContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getActionsContainerName()));
		String actionFileName = getActionsFileName();
		
		IResource operaContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getOperaContainerName()));
		String operaFileName = getOperaFileName();
			
		if (getActionsContainerName().length() == 0) {
			updateStatus("Actions container must be specified");
			return;
		}	
		if (getOperaContainerName().length() == 0 && genOpera.getSelection()) {
			updateStatus("OperA container must be specified");
			return;
		}	
		if (actionContainer == null
				|| (actionContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("Actions container must exist");
			return;
		}	
		if(genOpera.getSelection()){
			if (operaContainer == null
					|| (operaContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
				updateStatus("OperA container must exist");
				return;
			}	
		}
		if (owlsContainer == null
				|| (owlsContainer.getType() & (IResource.FILE)) == 0) {
			updateStatus("OWL-S File must exist");
			return;
		}		
		
		if (!actionContainer.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}	
		if (!operaContainer.isAccessible()  && genOpera.getSelection()) {
			updateStatus("Project must be writable");
			return;
		}	
		if (actionFileName.length() == 0) {
			updateStatus("Actions File name must be specified");
			return;
		}
		if (operaFileName.length() == 0  && genOpera.getSelection()) {
			updateStatus("OperA File name must be specified");
			return;
		}
		if (owlsFileName.length() == 0) {
			updateStatus("OWL-S File name must be specified");
			return;
		}
		if (owlsFileName.toLowerCase().endsWith(".owls")==false) {
			updateStatus("OWL-S File extension must be \"owls\"");
			return;
		}
		if (actionFileName.toLowerCase().endsWith(".actions")==false) {
			updateStatus("Actions Model File extension must be \"actions\"");
			return;
		}	
		if (operaFileName.toLowerCase().endsWith(".opera")==false  && genOpera.getSelection()) {
			updateStatus("OperA Model File extension must be \"opera\"");
			return;
		}
		if (actionFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Actions File name must be valid");
			return;
		}
		if (operaFileName.replace('\\', '/').indexOf('/', 1) > 0  && genOpera.getSelection()) {
			updateStatus("OperA File name must be valid");
			return;
		}
				
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getActionsContainerName() {
		return actionsContainerText.getText();
	}
	
	public boolean genOpera() {
		return genOpera.getSelection();
	}
	
	public String getActionsFileName() {
		return actionsFileText.getText();
	}
	
	public String getOperaContainerName() {
		return operaContainerText.getText();
	}

	public String getOperaFileName() {
		return operaFileText.getText();
	}
	
	public String getOWLS() {
		return owlsText.getText();
	}
	
	public IPath getOWLSModel() {	
		return owlsModel;	
	}
	
	public String getActionsFromOWLS(){
		IPath iPath = Path.fromPortableString(owlsText.getText());
		String name = iPath.lastSegment();
		if (name.endsWith(".owls")){
			name = name.substring(0, name.lastIndexOf(".owls"));			
		}
		if (name.startsWith("get")){
			name = name.substring(3);			
		}
	
		return name.concat(".actions");
	}
	
	public String getOperaFromOWLS(){
		IPath iPath = Path.fromPortableString(owlsText.getText());
		String name = iPath.lastSegment();
		if (name.endsWith(".owls")){
			name = name.substring(0, name.lastIndexOf(".owls"));			
		}
		if (name.startsWith("get")){
			name = name.substring(3);			
		}
	
		return name.concat(".opera");
	}
	
}