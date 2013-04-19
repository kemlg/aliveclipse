/*
 * 
 */
package control.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import control.diagram.edit.parts.*;
import control.diagram.part.ControlVisualIDRegistry;
import control.diagram.part.Messages;

/**
 * @generated
 */
public class ControlNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public ControlNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator it = myEditingDomain.getResourceSet().getResources()
				.iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			Collection result = new ArrayList();
			result
					.addAll(createNavigatorItems(selectViewsByType(resource
							.getContents(), OuterProcessEditPart.MODEL_ID),
							file, false));
			return result.toArray();
		}

		if (parentElement instanceof ControlNavigatorGroup) {
			ControlNavigatorGroup group = (ControlNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ControlNavigatorItem) {
			ControlNavigatorItem navigatorItem = (ControlNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ControlVisualIDRegistry.getVisualID(view)) {

		case OuterProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			ControlNavigatorGroup links = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_OuterProcess_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(LocEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(SequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(ProduceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(SetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OntologyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(TemplateConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(ExprEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(LocBindingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case InputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Input_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Input_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Output_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Output_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LocEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Loc_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SequenceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ChoiceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrderEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoinEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntilEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PerformEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ProduceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SetEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LinkEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Link_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LinkBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ResultEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasResultVarCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ResultVarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultInConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasEffectCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultInConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasEffectCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructList2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructBagEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructBag2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(SplitSplitComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructBag3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructBag4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RemoteProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Result2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(Condition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Expr4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Input2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Input_3105_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Input_3105_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Output2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Output_3106_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_Output_3106_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Result2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultBindingSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasResultVarCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ResultVarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultInConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultInConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ResultResultHasEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ValueSourceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3094_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3094_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueFormEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3095_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3095_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueFunctionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3096_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3096_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TemplateProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ValueSource2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueForm2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueFunction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Set2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ValueSource3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueSource_3048_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueForm3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueForm_3049_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValueFunction3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup outgoinglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup incominglinks = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_ValueFunction_3050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(LinkBindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ControlVisualIDRegistry
							.getType(OutputBindingSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Sequence7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Choice7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Set3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Set4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Set5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Set6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructBag5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyOrder7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Split7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitSplitComponentsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SplitJoin7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructBag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfThenElse7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatWhile7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Condition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Expr6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Perform7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RemoteProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(PerformPerformTheProcessCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(TemplateProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Produce7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Set7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ControlConstructList2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Choice2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(AnyOrder7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Split7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(SplitJoin7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(IfThenElse7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(RepeatWhile7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Perform7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Produce7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry.getType(Set7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ControlVisualIDRegistry
							.getType(ControlConstructList2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LocBindingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup target = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_LocBinding_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup source = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_LocBinding_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LocEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InputBindingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup target = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_InputBinding_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup source = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_InputBinding_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputBindingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup target = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_OutputBinding_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup source = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_OutputBinding_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(OutputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LinkBindingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup target = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_LinkBinding_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup source = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_LinkBinding_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(LinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputBindingSourceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			ControlNavigatorGroup target = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_OutputBindingSource_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ControlNavigatorGroup source = new ControlNavigatorGroup(
					Messages.NavigatorGroupName_OutputBindingSource_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), ControlVisualIDRegistry
					.getType(ValueSourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFormEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueSource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueForm3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					ControlVisualIDRegistry
							.getType(ValueFunction3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					ControlVisualIDRegistry.getType(Output2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return OuterProcessEditPart.MODEL_ID.equals(ControlVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new ControlNavigatorItem((View) it.next(), parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getForeignShortcuts(Diagram diagram, Object parent) {
		Collection result = new ArrayList();
		for (Iterator it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ControlAbstractNavigatorItem) {
			ControlAbstractNavigatorItem abstractNavigatorItem = (ControlAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
