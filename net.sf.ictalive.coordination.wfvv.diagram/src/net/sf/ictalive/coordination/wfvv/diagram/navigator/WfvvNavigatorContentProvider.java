package net.sf.ictalive.coordination.wfvv.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactment2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListActionGroundingListCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorViewEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanAgentReplanCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActReceiverEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActSenderEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureEffectCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionCoordActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventAsserterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEventFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroup2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEventGroupCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventModelContainerEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ExecutedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactDueToEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactEffectEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactRelateEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Message2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.MessageEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NSNormsEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NormInstanceViolatedEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ParameterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionPlanDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionPlanExecutionCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanScheduleEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSchedulePlanScheduleCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisPlanSynthesisCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanningActionsPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActReceiveActCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentReplaceAgentCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResultEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActSendActCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEnactingAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationServiceInvocationCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.StartedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationUnmetRequirementEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.Messages;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;

import org.eclipse.core.resources.IFile;
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
public class WfvvNavigatorContentProvider implements ICommonContentProvider {

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
	public WfvvNavigatorContentProvider() {
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
					.getContents(), EventModelContainerEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof WfvvNavigatorGroup) {
			WfvvNavigatorGroup group = (WfvvNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WfvvNavigatorItem) {
			WfvvNavigatorItem navigatorItem = (WfvvNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {

		case EventModelContainerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			WfvvNavigatorGroup links = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_EventModelContainer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(Event2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionEnactment2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanEnactmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EnactmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(PlanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ObjectiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EventGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EventGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FactDueToEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FactEffectEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FactRelateEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEnactingAgentEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(FailureActReasonEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DisasterReasonEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(NSNormsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CommunicativeActReceiverEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CommunicativeActSenderEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationUnmetRequirementEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ActionCauseEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(EnactmentResourceEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionCoordActionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionPlanEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(EventAsserterEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ActorAgentEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingListRestEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingOwlsProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Event_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EventEventFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ActorViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(EventEventFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ContentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(EventAsserterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Event2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Event_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EventAsserterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActionEnactment2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionEnactment_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionEnactment_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionEnactmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(EnactmentResourceEditPart.VISUAL_ID));
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

		case PlanEnactmentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanEnactment_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanEnactment_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionEnactmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(EnactmentResourceEditPart.VISUAL_ID));
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

		case EnactmentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Enactment_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Enactment_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionEnactmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(EnactmentResourceEditPart.VISUAL_ID));
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

		case PlanEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Plan_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Plan_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(CoordinationActionPlanEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
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

		case AgentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Agent_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ServiceInvocationEnactingAgentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActorAgentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ActorEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Actor_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Actor_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(CommunicativeActReceiverEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(CommunicativeActSenderEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(EventAsserterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActorAgentEditPart.VISUAL_ID));
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

		case ObjectiveEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Objective_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(TaskViolationUnmetRequirementEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ResourceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Resource_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EnactmentResourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AtomicActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionGroundingOwlsProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompositeActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionGroundingOwlsProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventGroupEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EventGroupEventGroupCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(EventGroupEventGroupCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ActionGroundingListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingList_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingList_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(ActionGroundingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionGroundingListRestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionGroundingListRestEditPart.VISUAL_ID));
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

		case ContentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(StartedActEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureFactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(PlanSynthesisEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ContentContentFigureEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case StartedActEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_StartedAct_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_StartedAct_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case ExecutedActEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ExecutedAct_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ExecutedAct_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case FailureActEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FailureAct_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FailureAct_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FailureActReasonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case DisasterEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Disaster_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Disaster_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(DisasterReasonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case NormInstanceViolatedEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_NormInstanceViolated_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_NormInstanceViolated_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case ReceiveActEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ReceiveAct_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ReceiveAct_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ReceiveActReceiveActCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(MessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CommunicativeActReceiverEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(CommunicativeActSenderEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case SendActEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_SendAct_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_SendAct_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(SendActSendActCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(Message2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CommunicativeActReceiverEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(CommunicativeActSenderEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case DeadlineViolationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_DeadlineViolation_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_DeadlineViolation_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case TaskViolationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_TaskViolation_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_TaskViolation_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationUnmetRequirementEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case AvailabilityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Availability_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Availability_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactRelateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case PlanSynthesisEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanSynthesis_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanSynthesis_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case ResultEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Result_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FailureActReasonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(DisasterReasonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PlanDistributionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanDistribution_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanDistribution_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case PlanScheduleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanSchedule_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanSchedule_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case PlanExecutionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanExecution_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanExecution_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(PlanningActionsPlanEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case ServiceInvocationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ServiceInvocation_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ServiceInvocation_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEnactingAgentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case ReplaceAgentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ReplaceAgent_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ReplaceAgent_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case AgentReplanEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_AgentReplan_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_AgentReplan_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case NotifyStateOfWorldEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_NotifyStateOfWorld_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_NotifyStateOfWorld_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WfvvVisualIDRegistry.getType(ResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
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

		case CoordinationActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationAction_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationAction_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(FactDueToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(FactEffectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionByActorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionEnactmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(ActionCauseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionCoordActionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), WfvvVisualIDRegistry
							.getType(CoordinationActionPlanEditPart.VISUAL_ID));
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

		case Event3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_Event_3029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(EventAsserterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActionGroundingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup incominglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGrounding_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup outgoinglinks = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGrounding_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(CoordinationActionCoordActionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingOwlsProcessEditPart.VISUAL_ID));
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

		case FactDueToEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactDueTo_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactDueTo_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(PlanSynthesisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(StartedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
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

		case FactEffectEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactEffect_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactEffect_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(PlanSynthesisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(StartedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
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

		case FactRelateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactRelate_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FactRelate_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(StartedActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(StartedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
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

		case PlanningActionsPlanEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanningActionsPlan_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanningActionsPlan_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
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

		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ServiceInvocationEnactingAgent_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ServiceInvocationEnactingAgent_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
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

		case FailureActReasonEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FailureActReason_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_FailureActReason_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ResultEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
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

		case DisasterReasonEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_DisasterReason_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_DisasterReason_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ResultEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
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

		case CommunicativeActReceiverEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CommunicativeActReceiver_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CommunicativeActReceiver_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
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

		case CommunicativeActSenderEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CommunicativeActSender_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CommunicativeActSender_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
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

		case TaskViolationUnmetRequirementEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_TaskViolationUnmetRequirement_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_TaskViolationUnmetRequirement_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ObjectiveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
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

		case ActionByActorEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionByActor_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionByActor_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
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

		case ActionEnactmentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionEnactment_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionEnactment_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionEnactment2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanEnactmentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EnactmentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
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

		case ActionCauseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionCause_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionCause_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(StartedActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ExecutedActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(FailureActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(DisasterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NormInstanceViolatedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ReceiveActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(SendActEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(DeadlineViolationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(TaskViolationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(AvailabilityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanSynthesisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanDistributionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanScheduleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanExecutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ServiceInvocationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ReplaceAgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(AgentReplanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(NotifyStateOfWorldEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
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

		case EnactmentResourceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_EnactmentResource_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_EnactmentResource_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionEnactment2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(PlanEnactmentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EnactmentEditPart.VISUAL_ID));
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

		case CoordinationActionCoordActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationActionCoordAction_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationActionCoordAction_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionGroundingEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
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

		case CoordinationActionPlanEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationActionPlan_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationActionPlan_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CoordinationActionEditPart.VISUAL_ID));
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

		case EventAsserterEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_EventAsserter_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_EventAsserter_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(Event2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
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

		case ActorAgentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActorAgent_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActorAgent_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(ActorEditPart.VISUAL_ID));
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

		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanHasAtomicProcessGroundingList_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_PlanHasAtomicProcessGroundingList_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionGroundingListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry.getType(PlanEditPart.VISUAL_ID));
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

		case ActionGroundingListRestEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingListRest_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingListRest_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(ActionGroundingListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingListEditPart.VISUAL_ID));
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

		case ActionGroundingOwlsProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			WfvvNavigatorGroup target = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingOwlsProcess_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WfvvNavigatorGroup source = new WfvvNavigatorGroup(
					Messages.NavigatorGroupName_ActionGroundingOwlsProcess_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), WfvvVisualIDRegistry
					.getType(AtomicActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					WfvvVisualIDRegistry
							.getType(ActionGroundingEditPart.VISUAL_ID));
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
		return EventModelContainerEditPart.MODEL_ID.equals(WfvvVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result
					.add(new WfvvNavigatorItem((View) it.next(), parent,
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
		if (element instanceof WfvvAbstractNavigatorItem) {
			WfvvAbstractNavigatorItem abstractNavigatorItem = (WfvvAbstractNavigatorItem) element;
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
