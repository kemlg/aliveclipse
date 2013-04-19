package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.Messages;

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

/**
 * @generated
 */
public class BpeldiagNavigatorContentProvider implements ICommonContentProvider {

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
	public BpeldiagNavigatorContentProvider() {
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
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), ProcessContainerEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof BpeldiagNavigatorGroup) {
			BpeldiagNavigatorGroup group = (BpeldiagNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof BpeldiagNavigatorItem) {
			BpeldiagNavigatorItem navigatorItem = (BpeldiagNavigatorItem) parentElement;
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
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {

		case ProcessContainerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			BpeldiagNavigatorGroup links = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_ProcessContainer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(AssignEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(CompensateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(CompensateScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(EmptyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ExitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(FlowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(OnEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEachEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InvokeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PickEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ReceiveEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntilEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ReplyEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScopeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequenceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case WhileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment14EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PartnerActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ElseIfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnAlarmEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnEventEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnMessageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EventHandlerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OperationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup incominglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Flow2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3085_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3087_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnAlarm2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3163_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3165_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnMessage2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3064_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3068_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RepeatUntil3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3089_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3151_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3153_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3155_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3156_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Scope3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3091_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3140_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3142_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3144_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3145_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return getViewChildren2(view, parentElement);
	}
	private Object[] getViewChildren2(View view, Object parentElement) {
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		
		
		case EventHandler2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnAlarm3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3167_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3130_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3132_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3134_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3135_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3169_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ElseIf2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Else2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3213_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3215_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3217_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3219_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
	}
	return getViewChildren3(view, parentElement);
}
private Object[] getViewChildren3(View view, Object parentElement) {
	switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case Scope9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3190_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3192_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3194_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3196_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3249_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3251_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3253_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3255_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnEvent2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Invoke12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3273_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3275_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3277_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3279_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3289_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3291_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3293_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3295_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case If12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(ElseIf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Else2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Invoke14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Pick14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PickPickCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PickPickCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnMessage2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Reply14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup outgoinglinks = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(PartnerActivityOperationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Sequence9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case While14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EventHandler3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnAlarm3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					BpeldiagVisualIDRegistry
							.getType(OnEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PartnerActivityOperationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			BpeldiagNavigatorGroup target = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivityOperation_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BpeldiagNavigatorGroup source = new BpeldiagNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivityOperation_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), BpeldiagVisualIDRegistry
					.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Invoke10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Invoke11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Invoke12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Invoke13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Invoke14EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(PartnerActivity14EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry
							.getType(Receive14EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					BpeldiagVisualIDRegistry.getType(Reply14EditPart.VISUAL_ID));
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
		return ProcessContainerEditPart.MODEL_ID
				.equals(BpeldiagVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new BpeldiagNavigatorItem((View) it.next(), parent,
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
		if (element instanceof BpeldiagAbstractNavigatorItem) {
			BpeldiagAbstractNavigatorItem abstractNavigatorItem = (BpeldiagAbstractNavigatorItem) element;
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
