package net.sf.ictalive.cl2sl.ui.wizards;


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

public class CL2SLTransformationWizardPage1 extends WizardPage {
	private Text containerText;
	private Text fileText;		
	private Text planText;	
	private ISelection selection;
	private IPath planModel;
		
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public CL2SLTransformationWizardPage1(ISelection selection, IPath inPlanModel ) {
		super("wizardPage");
		setTitle("Set Service Model Output File");
		setDescription("This wizard creates a new Service (WSDL or OWLS) from a Service model with *.xmi extension.");
		this.selection = selection;
		
		planModel = inPlanModel;		
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
		label.setText("&Plan Model:");

		planText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		planText.setLayoutData(gd);
		planText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});		

		Button planButton = new Button(container, SWT.PUSH);
		planButton.setText("Browse...");
		planButton.addSelectionListener(new SelectionAdapter() {
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
		
		if(planModel!=null){			
			planText.setText(planModel.toString());
			containerText.setText("/" + planModel.segment(0) + "/ServiceModel/");
			fileText.setText(getServiceFromPlan());
		}else{		
			planText.setText("");
			fileText.setText("new_file.xmi");
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
				"Select new container for service model");
		
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
		dialog.setMessage("Select new Plan model");
					
		if (dialog.open() == ElementTreeSelectionDialog.OK) {
			Object[] result = dialog.getResult();
								
			if (result.length == 1) {				
				planText.setText( new Path(result[0].toString()).toString().substring(1));
				
			}
		}
					
	}
		
	
	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		IResource planContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getPlan()));
		IResource serviceContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		String serviceFileName = getFileName();
		String planFileName = getPlan();
		
		//IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		//String fileName = getFileName();
		
		if (getContainerName().length() == 0) {
			updateStatus("Service container must be specified");
			return;
		}		
		if (serviceContainer == null
				|| (serviceContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("Service container must exist");
			return;
		}
		if (planContainer == null
				|| (planContainer.getType() & (IResource.FILE)) == 0) {
			updateStatus("Plan File must exist");
			return;
		}
		if (!serviceContainer.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}		
		if (serviceFileName.length() == 0) {
			updateStatus("Service File name must be specified");
			return;
		}
		if (serviceFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Service File name must be valid");
			return;
		}
		if (planFileName.length() == 0) {
			updateStatus("Plan File name must be specified");
			return;
		}
		if (planFileName.toLowerCase().endsWith(".plans")==false) {
			updateStatus("Plan File extension must be \"plans\"");
			return;
		}
		if (serviceFileName.toLowerCase().endsWith(".xmi")==false) {
			updateStatus("Service Model File extension must be \"xmi\"");
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
	
	public String getPlan() {
		return planText.getText();
	}
	
	public IPath getPlanModel() {	
		return planModel;	
	}
	
	public String getServiceFromPlan(){
		IPath iPath = Path.fromPortableString(planText.getText());
		String name = iPath.lastSegment();
		if (name.endsWith(".plans")){
			name = name.substring(0, name.lastIndexOf(".plans"));			
		}
		if (name.startsWith("get")){
			name = name.substring(3);			
		}
	
		return name.concat(".xmi");
	}
	
}