/*
 * 
 */
package control.diagram.part;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import net.sf.ictalive.service.serviceui.ControlCreationWizardFirstPage;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ControlCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated NOT
	 */
	protected ControlCreationWizardFirstPage diagramModelFirstPage;

	/**
	 * @generated
	 */
	protected ControlCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected ControlCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated NOT
	 */
	private Map<String, String> modelMap = null;

	private EObject existingModel;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.ControlCreationWizardTitle);
		setDefaultPageImageDescriptor(ControlDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewControlWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * Alternative version of init for use with existing model
	 * @generated NOT
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection,
			EObject model, Map<String, String> modelMap) {
		this.modelMap = modelMap;
		this.existingModel = model;
		init(workbench, selection);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {
		// add our custom first page to the wizard
		diagramModelFirstPage = new ControlCreationWizardFirstPage("first_page");

		addPage(diagramModelFirstPage);
		// IFF there is an existing model in use, use it to populate wizard page
		if (modelMap != null) {
			diagramModelFirstPage.importExistingModel(modelMap.get("name"),
					modelMap.get("processName"), modelMap.get("uri"), modelMap
							.get("description"));
		}

		diagramModelFilePage = new ControlCreationWizardPage(
				"DiagramModelFile", getSelection(), "control_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.ControlCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.ControlCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ControlCreationWizardPage(
				"DomainModelFile", getSelection(), "control") {// { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".control_diagram".length()); //$NON-NLS-1$
					setFileName(ControlDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "control")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.ControlCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.ControlCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = ControlDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(),
						monitor,
						// additional parameters from new wizard page to go into OuterProcess
						diagramModelFirstPage.getNameString(),
						diagramModelFirstPage.getURIString(),
						diagramModelFirstPage.getDescription(),
						diagramModelFirstPage.getProcessName(),
						// finally pass in the existing model if we have one
						// or null if not
						existingModel);

				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ControlDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.ControlCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.ControlCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ControlDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
