/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.eclipse.emf.common.CommonPlugin;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.WfvvFactory;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.coordination.wfvv.provider.WfvvEditPlugin;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.service.ServicePackage;

import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class WfvvModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections
			.unmodifiableList(Arrays.asList(WfvvEditorPlugin.INSTANCE
					.getString("_UI_WfvvEditorFilenameExtensions").split(
							"\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = WfvvEditorPlugin.INSTANCE
			.getString("_UI_WfvvEditorFilenameExtensions").replaceAll(
					"\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WfvvPackage wfvvPackage = WfvvPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WfvvFactory wfvvFactory = wfvvPackage.getWfvvFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected WfvvModelWizardNewFileCreationPage newFileCreationPage;

	protected EventSelectionPage eventSelectionPage;

	/**
	 * This is the initial object creation page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected WfvvModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<String> initialObjectNames;

	private EventImportPage importFromLocationPage;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(WfvvEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(WfvvEditorPlugin.INSTANCE
						.getImage("full/wizban/NewWfvv")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated - not
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			initialObjectNames.add(wfvvPackage.getEventModelContainer()
					.getName());
			// for (EClassifier eClassifier : wfvvPackage.getEClassifiers()) {
			// if (eClassifier instanceof EClass) {
			// EClass eClass = (EClass)eClassifier;
			// if (!eClass.isAbstract()) {
			// initialObjectNames.add(eClass.getName());
			// }
			// }
			// }
			// Collections.sort(initialObjectNames,
			// CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated - not
	 */
	protected EObject createInitialModel() {
		// EClass eClass =
		// (EClass)wfvvPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EClass eClass = wfvvPackage.getEventModelContainer();
		EObject rootObject = wfvvFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated - not
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {

						// create an XMI resource set for the event model
						// container
						ResourceSet rs = new ResourceSetImpl();
						rs.getPackageRegistry().put(EventPackage.eNS_URI,
								EventPackage.eINSTANCE);
						rs.getPackageRegistry().put(ActionPackage.eNS_URI,
								ActionPackage.eINSTANCE);
						rs.getPackageRegistry().put(EnactmentPackage.eNS_URI,
								EnactmentPackage.eINSTANCE);
						rs.getPackageRegistry().put(FactPackage.eNS_URI,
								FactPackage.eINSTANCE);

						// create the resource with the eventmodel container
						Resource resource = rs.createResource(URI
								.createPlatformResourceURI(modelFile
										.getFullPath().toString()));
						EventModelContainer container = WfvvFactory.eINSTANCE
								.createEventModelContainer();
						EList<EObject> resourceContents = resource
								.getContents();
						resourceContents.add(container);

						// add the events to the container
						importFromLocationPage.importEvents(container);

						// save the file
						Map options = new TreeMap();
						options.put(
								XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
								Boolean.TRUE);
						resource.save(options);

						if (true)
							return;
						// Create a resource set
						//
						// ResourceSet resourceSet = new ResourceSetImpl();
						// resourceSet.getPackageRegistry().put(EventPackage.eNS_URI,
						// EventPackage.eINSTANCE);
						// resourceSet.getPackageRegistry().put(ActionPackage.eNS_URI,
						// ActionPackage.eINSTANCE);
						// resourceSet.getPackageRegistry().put(EnactmentPackage.eNS_URI,
						// EnactmentPackage.eINSTANCE);
						// resourceSet.getPackageRegistry().put(FactPackage.eNS_URI,
						// FactPackage.eINSTANCE);
						// XMLResourceFactoryImpl factory = new
						// XMLResourceFactoryImpl();
						// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("events",
						// factory);
						//							
						// // Get the URI of the model file.
						// //
						// URI fileURI =
						// URI.createPlatformResourceURI(modelFile.getFullPath().toString(),
						// true);
						//
						// // Create a resource for this file.
						// //
						// Resource resource =
						// resourceSet.createResource(fileURI);
						//
						// // Add the initial model object to the contents.
						// //
						// EObject rootObject = createInitialModel();
						// if (rootObject != null) {
						// resource.getContents().add(rootObject);
						// }
						//
						// EventModelContainer eventModelContainer =
						// (EventModelContainer)rootObject;
						//							
						// // add all relevant concepts, such as events,
						// enactments, actors from the selected
						// // files into the rootObject
						// ArrayList<IResource> selectedFiles =
						// eventSelectionPage.getSelectedFiles();
						// for (IResource ir : selectedFiles){
						// addRelevantEventConcepts(ir, eventModelContainer,
						// resourceSet);
						// }
						//							
						// // Save the contents of the resource to the file
						// system.
						// //
						// Map<Object, Object> options = new HashMap<Object,
						// Object>();
						// options.put(XMLResource.OPTION_ENCODING,
						// "UTF-8");//initialObjectCreationPage.getEncoding());
						// resource.save(options);
					} catch (Exception exception) {
						WfvvEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}

				private void addRelevantEventConcepts(IResource ir,
						EventModelContainer eventModelContainer,
						ResourceSet resourceSet) {
					if (ir.getType() == IResource.FILE && ir.exists()) {
						resourceSet.getResourceFactoryRegistry()
								.getExtensionToFactoryMap().put("events",
										new XMIResourceFactoryImpl());
						Resource resource = resourceSet.getResource(URI
								.createFileURI(ir.getLocation()
										.toPortableString()), true);
						List<EObject> contents = resource.getContents();
						for (int i = 0, j = contents.size(); i < j; i++) {
							EObject eobj = contents.get(0);
							if (eobj instanceof Event) {
								i--;
								j--;
								eventModelContainer.getEvents().add(
										(Event) eobj);
								// continue;
							}
						}
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(new FileEditorInput(modelFile), workbench
						.getEditorRegistry().getDefaultEditor(
								modelFile.getFullPath().toString()).getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						WfvvEditorPlugin.INSTANCE
								.getString("_UI_OpenEditorError_label"),
						exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			WfvvEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public class WfvvModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public WfvvModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
							: "_WARN_FilenameExtension";
					setErrorMessage(WfvvEditorPlugin.INSTANCE.getString(key,
							new Object[] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(
					getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class WfvvModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public WfvvModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(WfvvEditorPlugin.INSTANCE
						.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(WfvvEditorPlugin.INSTANCE
						.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null
					&& getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return WfvvEditPlugin.INSTANCE.getString("_UI_" + typeName
						+ "_type");
			} catch (MissingResourceException mre) {
				WfvvEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						WfvvEditorPlugin.INSTANCE
								.getString("_UI_XMLEncodingChoices")); stringTokenizer
						.hasMoreTokens();) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated - not
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new WfvvModelWizardNewFileCreationPage(
				"Whatever", selection);
		newFileCreationPage.setTitle(WfvvEditorPlugin.INSTANCE
				.getString("_UI_WfvvModelWizard_label"));
		newFileCreationPage.setDescription(WfvvEditorPlugin.INSTANCE
				.getString("_UI_WfvvModelWizard_description"));
		newFileCreationPage.setFileName(WfvvEditorPlugin.INSTANCE
				.getString("_UI_WfvvEditorFilenameDefaultBase")
				+ "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder
						|| selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource
							.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = WfvvEditorPlugin.INSTANCE
							.getString("_UI_WfvvEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS
							.get(0);
					String modelFilename = defaultModelBaseFilename + "."
							+ defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "."
								+ defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new WfvvModelWizardInitialObjectCreationPage(
				"Whatever2");
		initialObjectCreationPage.setTitle(WfvvEditorPlugin.INSTANCE
				.getString("_UI_WfvvModelWizard_label"));
		initialObjectCreationPage.setDescription(WfvvEditorPlugin.INSTANCE
				.getString("_UI_Wizard_initial_object_description"));
		// addPage(initialObjectCreationPage);
		importFromLocationPage = new EventImportPage(new EventImporter[] {
				new EventLogImporter(), new LocalAgentFilesEventImporter() });// ,
																				// new
																				// PreviousImportedAgentEventImporter()});
		addPage(importFromLocationPage);
		// eventSelectionPage = new EventSelectionPage(selection);
		// addPage(eventSelectionPage);
	}

	/**
	 * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
