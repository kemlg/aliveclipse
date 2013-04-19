package net.sf.ictalive.coordination.wfannotation.mapping.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.Messages;

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
public class MappingNavigatorContentProvider implements ICommonContentProvider {

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
	public MappingNavigatorContentProvider() {
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
					.getContents(), MappingContainerEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof MappingNavigatorGroup) {
			MappingNavigatorGroup group = (MappingNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof MappingNavigatorItem) {
			MappingNavigatorItem navigatorItem = (MappingNavigatorItem) parentElement;
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
		switch (MappingVisualIDRegistry.getVisualID(view)) {

		case MappingContainerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			MappingNavigatorGroup links = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_MappingContainer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessToCompositeActionMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseToElseMappingEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ChoiceComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
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
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Process_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(AssignEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(EmptyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ExitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(FlowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ForEach13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Receive13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Rethrow13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessProcessCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandler2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ProcessToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AtomicActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompositeActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ProcessToCompositeActionMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SequenceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(SequenceComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AnyOrderEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrder_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrder_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ControlConstructBagEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBag_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBag_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ChoiceComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(SplitComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PerformEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Perform_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Perform_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ChoiceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ChoiceComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ControlConstructListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructList_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructList_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntilEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatWhileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhile_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhile_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IfThenElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElse_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElse_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ElseToElseMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SplitEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Split_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Split_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(SplitComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SplitJoinEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup incominglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoin_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoin_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Flow2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEachEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InvokeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnAlarmEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Rethrow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnMessageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ForEach12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Receive12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Rethrow12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnMessageOnMessageCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3056_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ReceiveEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3069_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Receive2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3071_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3072_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3073_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3075_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3077_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ReplyEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3078_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScopeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3080_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3087_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3088_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3089_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3091_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3092_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3094_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3096_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3097_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WhileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3102_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		}
		return getViewChildren2(view, parentElement);
	}
	
	private Object[] getViewChildren2(View view, Object parentElement) {
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case Flow5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3109_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3110_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3112_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventHandlerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OnAlarm2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Rethrow10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ForEach6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3115_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3119_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3120_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3121_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Receive5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3122_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3123_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3127_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3128_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3130_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3132_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3133_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3134_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3136_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3137_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Flow6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3144_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3148_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3152_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3153_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3154_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3155_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3157_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3161_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ElseIfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ElseIf_3162_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfEliseIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Flow7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3169_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3170_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3171_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Else_3172_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ForEach10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ElseElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ElseToElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Flow8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3179_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3180_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3181_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3182_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3184_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3186_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3187_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
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
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case Reply7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3188_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3190_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3191_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3192_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3194_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3196_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3197_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3198_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3200_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3201_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3205_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3209_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3210_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3212_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3214_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3215_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3216_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3218_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3219_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3223_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3224_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3225_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3227_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3229_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3230_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3231_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3233_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3234_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3238_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OnEventEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ForEach11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Rethrow11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(OnEventOnEventCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Flow9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Flow_3246_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(FlowFlowCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(FlowToSplitJoinMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3247_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3248_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3249_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3251_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3253_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3254_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3255_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3257_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3258_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3262_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3263_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3264_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3265_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3267_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3269_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3270_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3271_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3273_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3274_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3278_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEach13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForEach_3279_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(PickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEachForEachCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(ForToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_If_3280_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfIfCompartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), MappingVisualIDRegistry
							.getType(IfToIfThenElseMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Invoke13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Invoke_3281_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PartnerActivity13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivity_3283_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
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
					.singleton(view), MappingVisualIDRegistry
					.getType(PickPickCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarmEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PickPickCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OnMessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Receive13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Receive_3285_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatUntil13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_3286_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(RethrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Reply13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Reply_3287_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Scope13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Scope_3289_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ThrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WaitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeScopeCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(EventHandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ScopeToCompositeActionMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sequence9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_3290_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceSequenceCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SequenceToSequenceMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup outgoinglinks = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_While_3294_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Assign9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Compensate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(CompensateScope9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Empty9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Exit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(ExtensionActivity9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(OpaqueActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Pick6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Rethrow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Throw5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry
							.getType(Validate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(Wait5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileWhileCompartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(WhileToRepeatWhileMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventHandler2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnAlarm2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MappingVisualIDRegistry.getType(OnEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivityToAtomicActionMapping_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PartnerActivityToAtomicActionMapping_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(AtomicActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(InvokeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ReceiveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ReplyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Receive9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Receive10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Receive11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Receive12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Invoke13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(PartnerActivity13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Receive13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Reply13EditPart.VISUAL_ID));
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

		case ProcessToCompositeActionMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ProcessToCompositeActionMapping_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ProcessToCompositeActionMapping_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ProcessEditPart.VISUAL_ID));
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

		case SequenceToSequenceMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SequenceToSequenceMapping_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SequenceToSequenceMapping_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(Sequence9EditPart.VISUAL_ID));
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

		case IfToIfThenElseMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfToIfThenElseMapping_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfToIfThenElseMapping_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(If11EditPart.VISUAL_ID));
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

		case WhileToRepeatWhileMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_WhileToRepeatWhileMapping_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_WhileToRepeatWhileMapping_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(While13EditPart.VISUAL_ID));
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

		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilToRepeatUntilMapping_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilToRepeatUntilMapping_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntil13EditPart.VISUAL_ID));
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

		case FlowToSplitJoinMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_FlowToSplitJoinMapping_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_FlowToSplitJoinMapping_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(FlowEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Flow9EditPart.VISUAL_ID));
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

		case ForToRepeatWhileMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForToRepeatWhileMapping_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ForToRepeatWhileMapping_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEachEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ForEach9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEach10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEach11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEach12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ForEach13EditPart.VISUAL_ID));
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

		case ScopeToCompositeActionMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ScopeToCompositeActionMapping_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ScopeToCompositeActionMapping_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ScopeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(Scope13EditPart.VISUAL_ID));
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

		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ElseIfToIfThenElseMapping_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ElseIfToIfThenElseMapping_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ElseIfEditPart.VISUAL_ID));
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

		case ElseToElseMappingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ElseToElseMapping_4024_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ElseToElseMapping_4024_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
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

		case CompositeProcessComposedOfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
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

		case PerformProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PerformProcess_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_PerformProcess_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(AtomicActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
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

		case ChoiceComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ChoiceComponents_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ChoiceComponents_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
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

		case AnyOrderComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrderComponents_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrderComponents_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
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

		case SequenceComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SequenceComponents_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SequenceComponents_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SequenceEditPart.VISUAL_ID));
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

		case ControlConstructBagRestEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
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

		case ControlConstructListRestEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
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

		case IfThenElseThenEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseThen_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseThen_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
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

		case IfThenElseElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseElse_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseElse_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
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

		case RepeatUntilUntilProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilUntilProcess_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilUntilProcess_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
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

		case RepeatWhileWhileProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhileWhileProcess_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhileWhileProcess_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
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

		case ControlConstructBagFirstEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
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

		case ControlConstructListFirstEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListFirst_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListFirst_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
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

		case SplitComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitComponents_4025_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitComponents_4025_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry.getType(SplitEditPart.VISUAL_ID));
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

		case SplitJoinComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			MappingNavigatorGroup target = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoinComponents_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MappingNavigatorGroup source = new MappingNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoinComponents_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), MappingVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					MappingVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
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
		return MappingContainerEditPart.MODEL_ID.equals(MappingVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new MappingNavigatorItem((View) it.next(), parent,
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
		if (element instanceof MappingAbstractNavigatorItem) {
			MappingAbstractNavigatorItem abstractNavigatorItem = (MappingAbstractNavigatorItem) element;
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
