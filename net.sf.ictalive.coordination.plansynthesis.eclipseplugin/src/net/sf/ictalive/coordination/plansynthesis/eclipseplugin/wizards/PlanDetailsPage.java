package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class PlanDetailsPage extends WizardSelectionPage {

	private Text namespaceText, prefixText, fileText, serverText;
	private Spinner maxPlansSpinner;
	private Label fileTextLabel;
	private IResource selectedLocation;
	private String namespace, prefix, server;
	private int maxPlans;
	private boolean singleFile, showSelectPlanFile;
	private IStructuredSelection selection;

	public PlanDetailsPage(IStructuredSelection selection,
			boolean showSelectPlanFile) {
		super("Plan Details");
		this.selection = selection;
		this.showSelectPlanFile = showSelectPlanFile;
		singleFile = true;
		setTitle("Define details for plan synthesis");
		setDescription("Specify details about the plans to be generated.");
		setMessage("Specify details about the plans to be generated.");
		updateStatus(null);
	}

	public String getNamespaceText() {
		return namespace;
	}

	public String getPrefixText() {
		return prefix;
	}

	public int getMaxPlans() {
		return maxPlans;
	}

	public String getServer() {
		return server;
	}

	public IResource getSelectedLocation() {
		return selectedLocation;
	}

	public boolean isSingleFileSelected() {
		return singleFile;
	}

	public void setSelection(IStructuredSelection selection) {
		this.selection = selection;
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
		label.setText("&Namespace of container containing generated plans:");

		namespaceText = new Text(container, SWT.SINGLE | SWT.BORDER);
		namespaceText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				validateTextEntered(namespace = namespaceText.getText(),
						"A namespace for the plan must be entered",
						namespaceText);
			}
		});

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		namespaceText.setLayoutData(gd);

		label = new Label(container, SWT.NULL);
		label.setText("&Prefix for generated plan names:");
		prefixText = new Text(container, SWT.SINGLE | SWT.BORDER);
		prefixText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				validateTextEntered(prefix = prefixText.getText(),
						"A prefix for the plan names must be entered",
						prefixText);

			}
		});
		prefixText.setLayoutData(gd);

		if (this.showSelectPlanFile) {
			Button radioButton = new Button(container, SWT.RADIO);
			radioButton.setText("Store all plans in a single file");
			radioButton.setSelection(true);
			radioButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					singleFile = true;
					fileTextLabel.setText("Store plans in file:");
					fileTextModified();
				}
			});
			radioButton = new Button(container, SWT.RADIO);
			radioButton.setLayoutData(new GridData(
					GridData.HORIZONTAL_ALIGN_BEGINNING,
					GridData.VERTICAL_ALIGN_CENTER, true, false, 2, 1));
			radioButton.setText("Store each plan in a different file");
			radioButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					singleFile = false;
					fileTextLabel.setText("Store plan files in directory:");
					fileTextModified();
				}
			});
			fileTextLabel = new Label(container, SWT.NULL);
			fileTextLabel.setText("Store plans in file:");
			GridData gd2 = new GridData();
			fileTextLabel.setLayoutData(gd2);

			fileText = new Text(container, SWT.SINGLE | SWT.BORDER);
			gd2.horizontalAlignment = GridData.FILL;
			gd2.grabExcessHorizontalSpace = true;
			fileText.setLayoutData(gd2);
			fileText.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					fileTextModified();
				}
			});
			Button b = new Button(container, SWT.PUSH);
			b.setText("...");
			b.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					handleBrowse();
				}
			});
		}

		label = new Label(container, SWT.NULL);
		label.setLayoutData(gd);
		label.setText("Maximum number of plans to generate (-1 for no limit)");
		maxPlansSpinner = new Spinner(container, SWT.BORDER);
		maxPlansSpinner.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				Spinner t = (Spinner) e.getSource();
				try {
					maxPlans = Integer.parseInt(t.getText());
					updateStatus(null);
				} catch (NumberFormatException nfe) {
					updateStatus("Maximum number of plans must be an integer");
					t.setFocus();
				}
			}
		});
		maxPlansSpinner.setValues(1, -1, Integer.MAX_VALUE, 0, 1, 1);

		label = new Label(container, SWT.NULL);
		label.setText("Address of plan service server");

		serverText = new Text(container, SWT.SINGLE | SWT.BORDER);
		serverText.setLayoutData(gd);
		serverText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				Text t = (Text) e.getSource();
				validateTextEntered(server = t.getText(),
						"Enter the location of the plan synthesis server", t);
			}
		});
		serverText.setText("http://localhost:8080");

		setControl(container);
		setPageComplete(true);
	}

	private void validateTextEntered(String text, String errorMessage,
			Text field) {
		if (text == null || "".equals(text)) {
			updateStatus(errorMessage);
			field.setFocus();
		} else {
			updateStatus(null);
		}
	}

	@Override
	public boolean isPageComplete() {
		boolean complete = namespace != null && !("".equals(namespace))
				&& prefix != null && !("".equals(prefix)) && server != null
				&& !("".equals(server));

		return (showSelectPlanFile) ? complete && fileText != null
				&& !("".equals(fileText)) : complete;
	}

	private void fileTextModified() {
		String path = fileText.getText();
		selectedLocation = null;
		if (path == null || path.equals("")) {
			updateStatus("Plan file/folder must be specified");
		} else {
			if (singleFile) {
				try {
					Path p = new Path(path);
					String extension = p.getFileExtension();
					if (extension == null || !"plans".equals(extension)) {
						// if (r==null || r.getType() != IResource.FILE ||
						// !(r.getFileExtension().equals("plans"))){
						updateStatus("Must select a plan file with extension '.plans'");
					} else {
						IResource r = ResourcesPlugin.getWorkspace().getRoot()
								.findMember(path);
						if (r != null) {
							updateStatus("Selected file already exists");
						} else {
							selectedLocation = ResourcesPlugin.getWorkspace()
									.getRoot().getFile(p);
							updateStatus(null);
						}
					}

				} catch (IllegalArgumentException e) {
					updateStatus("Must select a plan file with extension '.plans'");
				}
			} else {
				IResource r = ResourcesPlugin.getWorkspace().getRoot()
						.findMember(path);
				if (r == null
						|| (r.getType() != IResource.FOLDER && r.getType() != IResource.PROJECT)) {
					updateStatus("Must select an existing folder to store plan files in");
				} else {
					selectedLocation = (IContainer) r;
					updateStatus(null);
				}
			}
		}
	}

	private void handleBrowse() {
		// if (singleFile){
		// PlansModelWizard w = new PlansModelWizard();
		// w.init(Activator.getDefault().getWorkbench(), this.selection);
		// WizardDialog wd = new WizardDialog(getShell(), w);
		// wd.create();
		// if (SWT.OK == wd.open()){
		// IFile f = w.getModelFile();
		// fileText.setText(f.getFullPath().toPortableString());
		// }
		// } else {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), true,
				((singleFile) ? "Select containing directory"
						: "Select directory"));
		dialog.setTitle("Select Directory");
		if (dialog.open() == ContainerSelectionDialog.OK) {

			Object[] results = dialog.getResult();
			if (results != null && results.length == 1) {
				IPath location = null;
				if (results[0] instanceof IPath) {
					location = (IPath) results[0];
				} else if (results[0] instanceof IResource) {
					location = ((IResource) results[0]).getLocation();
				}
				if (location != null) {
					fileText.setText(location.toPortableString());
				}
			}
		}
		// }
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(isPageComplete());
	}

}
