/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.presentation;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

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

import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.provider.OperAEditPlugin;


import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperASSDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.IS;
import net.sf.ictalive.operetta.OM.NS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneType;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OMModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(OperAEditorPlugin.INSTANCE.getString("_UI_OMEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		OperAEditorPlugin.INSTANCE.getString("_UI_OMEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMPackage omPackage = OMPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMFactory omFactory = omPackage.getOMFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMModelWizardNewFileCreationPage newFileCreationPage;

	// OMModelWizardInitialObjectCreationPage initialObjectCreationPage   has been removed

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;


	protected IProject project = null;
	
	// When called from a dashboard, the selection is always <empty selection>. 
	// With setProject, we can override this selection.
	public void setProject(IProject project) {
		this.project = project;
	}
	
	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(OperAEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(OperAEditorPlugin.INSTANCE.getImage("full/wizban/NewOM")));
	}

//	protected Collection<String> getInitialObjectNames()  has been removed

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		//EClass eClass = (EClass)omPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EClass eClass = omPackage.getOperAModel();
		EObject rootObject = omFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and modified
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
								//set name
								((OperAModel)rootObject).setName("New OperA Model");
								//create and add OM
								OM om = OMFactory.eINSTANCE.createOM();
								((OperAModel)rootObject).setOm(om);
								//create and add SS
								SS ss = OMFactory.eINSTANCE.createSS();
								om.setSs(ss);
								//create and add IS
								IS is = OMFactory.eINSTANCE.createIS();
								om.setIs(is);
								//create start and end scenes
								Scene start = OMFactory.eINSTANCE.createScene();
								start.setType(SceneType.START);
								start.setSceneID("start");
								start.setDescription("Default start scene of an interaction structure");
								Scene end = OMFactory.eINSTANCE.createScene();
								end.setType(SceneType.END);
								end.setSceneID("end");
								end.setDescription("Default end scene of an interaction structure");
								//TODO: create basic landmark pattern and fill result
								is.getScenes().add(start);
								is.getScenes().add(end);
								//create and add NS
								NS ns = OMFactory.eINSTANCE.createNS();
								om.setNs(ns);
								//create and add CS
								CS cs = OMFactory.eINSTANCE.createCS();
								om.setCs(cs);
								Ontology ontology = OMFactory.eINSTANCE.createOntology();
								ontology.setOntologyID("Default");
								cs.getOntology().add(ontology);							

								// Create the diagrams
					            //
					            Diagram ssDiagram = ViewService.createDiagram(ss,
					                  SSEditPart.MODEL_ID,
					                  OperASSDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					            if (ssDiagram != null) {
					            	resource.getContents().add(ssDiagram);
					                ssDiagram.setName("SS_Diagram");
					                ssDiagram.setElement(ss);
					            }
					            
					            Diagram isDiagram = ViewService.createDiagram(is,
					                  ISEditPart.MODEL_ID,
					                  OperAISDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					            if (isDiagram != null) {
					            	resource.getContents().add(isDiagram);
					                isDiagram.setName("IS_Diagram");
					                isDiagram.setElement(is);
					            }
							}					
							
							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							
							// instead of letting the user select the encoding, we take the default UTF-8.
							options.put(XMLResource.OPTION_ENCODING, /*initialObjectCreationPage.getEncoding()*/ "UTF-8");
							resource.save(options);
						}
						catch (Exception exception) {
							OperAEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), OperAEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			OperAEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class OMModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public OMModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(OperAEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	// public class OMModelWizardInitialObjectCreationPage extends WizardPage    has been removed	
	
	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		
		newFileCreationPage = new OMModelWizardNewFileCreationPage("net.sf.ictalive.operetta.editor.newFileCreationPageID", selection);
		newFileCreationPage.setTitle(OperAEditorPlugin.INSTANCE.getString("_UI_OMModelWizard_label"));
		newFileCreationPage.setDescription(OperAEditorPlugin.INSTANCE.getString("_UI_OMModelWizard_description"));
		newFileCreationPage.setFileName(OperAEditorPlugin.INSTANCE.getString("_UI_OMEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		 
		if (project != null) {
			setPathAndFilename(project);
		}
		else
			// Try and get the resource selection to determine a current directory for the file dialog.
			//
			if (selection != null && !selection.isEmpty()) {
				// Get the resource...
				//
				Object selectedElement = selection.iterator().next();
				if (selectedElement instanceof IResource) {
					// Get the resource parent, if its a file.
					//
					IResource selectedResource = (IResource)selectedElement;
					if (selectedResource.getType() == IResource.FILE) {
						selectedResource = selectedResource.getParent();
					}

					// This gives us a directory...
					//
					if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
						// Set this for the container.
						//
						setPathAndFilename((IContainer)selectedResource);
					}
				}
			}
	}

	void setPathAndFilename (IContainer projectResource) {
		IResource parent = projectResource.findMember("OrganisationModel")!=null ? projectResource.findMember("OrganisationModel") : projectResource; 
		
		newFileCreationPage.setContainerFullPath(parent.getFullPath());
		
		// Make up a unique new name here.
		//
		String defaultModelBaseFilename = OperAEditorPlugin.INSTANCE.getString("_UI_OMEditorFilenameDefaultBase");
		String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
		String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
		for (int i = 1; ((IContainer)parent).findMember(modelFilename) != null; ++i) {
			modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
		}
		newFileCreationPage.setFileName(modelFilename);

	}
	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
