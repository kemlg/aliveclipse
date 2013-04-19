package net.sf.ictalive.operetta.OM.diagram.is.part;

import java.util.List;

import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart.SceneFigure;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart.SceneToTransitionArcFigure;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart.TransitionToSceneArcFigure;
import net.sf.ictalive.operetta.OM.diagram.is.navigator.OperANavigatorItem;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.ui.part.ShowInContext;

/**
 * @generated
 */
public class OperAISDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	/**
	 * @generated
	 */
	public static final String ID = "net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "net.sf.ictalive.operetta.OM.diagram.is.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public OperAISDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new OperAPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return OperAISDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return OperAISDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		return super.getAdapter(type);
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			return OperAISDiagramEditorPlugin.getInstance()
					.getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider()
				.getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			setDocumentProvider(OperAISDiagramEditorPlugin.getInstance()
					.getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile()
				: null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(
					Messages.OperAISDiagramEditor_SavingDeletedFile, original
							.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog.openWarning(shell,
						Messages.OperAISDiagramEditor_SaveAsErrorTitle,
						Messages.OperAISDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell,
						Messages.OperAISDiagramEditor_SaveErrorTitle,
						Messages.OperAISDiagramEditor_SaveErrorMessage, x
								.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	 * @generated
	 */
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	 * @generated and modified
	 */
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram.eResource() == null)
			return StructuredSelection.EMPTY;
		// this prevents WorkspaceSynchronizer exceptions that seem to be harmless.

		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			OperANavigatorItem item = new OperANavigatorItem(diagram, file,
					false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
	}

	// Added by Martijn, to bring selected scenes to the front
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		//This part solves the problem of "delete" not working in the IS diagram
		IWorkbenchPart thisWorkbenchPart = this;
		IWorkbenchPartSite site = getSite();
		if (site instanceof MultiPageEditorSite) {
			thisWorkbenchPart = ((MultiPageEditorSite) site).getMultiPageEditor();
		}
		if (thisWorkbenchPart == part)
			updateActions(getSelectionActions());
		
		if (selection != null && selection instanceof StructuredSelection) {

			StructuredSelection sel = (StructuredSelection) selection;

			if (sel.getFirstElement() != null
					&& sel.getFirstElement() instanceof EditPart) {
				EditPart editPart = (EditPart) sel.getFirstElement();

				// move up until we arrive at null or a SceneEditPart
				while (!(editPart == null || editPart instanceof SceneEditPart)) {
					editPart = editPart.getParent();

				}
				if (editPart != null) { // this means a scene was selected
					// hierarchy of node edit parts:

					// FreeFormLayeredPane.0 > BorderItemsAwareFreeFormLayer > DiagramEditPart > DefaultSizeNodeFigure > SceneEditPart
					// by removing DefaultNodeFigure from DiagramEditPart, and adding it again, we put it in front.

					IFigure sceneEditPart = ((SceneEditPart) editPart)
							.getPrimaryShape();
					IFigure defaultNodeSizeFigure = sceneEditPart.getParent();
					IFigure diagramEditPart = defaultNodeSizeFigure.getParent();
					diagramEditPart.getChildren().remove(defaultNodeSizeFigure);
					diagramEditPart.getChildren().add(defaultNodeSizeFigure);
					diagramEditPart.repaint();

					// hierarchy of edge edit parts
					// FreeFormLayeredPane.1 > ConnectionLayerEx > <Edge>Figure (e.g. PartialOrderFigure) 
					/*
					IFigure freeFormLayeredPane = diagramEditPart.getParent().getParent(); // 0 is nodes  1 is edges
					IFigure connectionLayerEx = (IFigure)freeFormLayeredPane.getChildren().get(1);
					List<IFigure> edges = connectionLayerEx.getChildren();
					for (IFigure edge : edges) {
						System.out.println("Edge: "+edge);
						if (edge instanceof SceneToTransitionArcFigure) {
							SceneToTransitionArcFigure fig = (SceneToTransitionArcFigure)edge;
							fig.setForegroundColor( ColorConstants.red );
							
						}
						else if	 (edge instanceof TransitionToSceneArcFigure) {
						} // ...
					}*/
				}
			}
		}
	}

}
