package net.sf.ictalive.coordination.tasks.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomClassAtomArgValueCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralDataLiteralCompartment2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralDataLiteralCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomDataRangeAtomOneOfCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatWhileWhileConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomSameAsAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskInputMessageMapCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskPreconditionCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TasksCollectionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.part.Messages;

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
public class CoordinationNavigatorContentProvider implements
		ICommonContentProvider {

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
	public CoordinationNavigatorContentProvider() {
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
					.getContents(), TasksCollectionEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof CoordinationNavigatorGroup) {
			CoordinationNavigatorGroup group = (CoordinationNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) parentElement;
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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {

		case TasksCollectionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			CoordinationNavigatorGroup links = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_TasksCollection_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(TaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ProcessPerformedByEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SequenceComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(InputMessageMapParameterEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileConditionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructListFirstEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompositeActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ProcessPerformedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
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

		case TaskEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Task_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(TaskPreconditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(TaskInputMessageMapCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(InputMessageMapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AtomicActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ProcessPerformedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
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

		case InputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Input_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputMessageMapParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Output_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputMessageMapParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SequenceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(SequenceComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrder_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrder_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBag_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBag_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ChoiceComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(AnyOrderComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ControlConstructBagRestEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
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

		case PerformEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Perform_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Perform_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(PerformProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ChoiceComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(TaskComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructBagFirstEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructList_2030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructList_2030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ControlConstructListRestEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
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

		case ConditionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Condition_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(AtomListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AtomListEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(ClassAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualPropertyAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(SameIndividualAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					CoordinationVisualIDRegistry
							.getType(DifferentIndividualsAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(BuiltInAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataRangeAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomListAtomListFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DatavaluedPropertyAtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ClassAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualIDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IndividualPropertyAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualID2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariable2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualID3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariable3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SameIndividualAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualID4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariable4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DifferentIndividualsAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualID5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariable5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DataRangeAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataValue2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DataLiteralEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataValueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DatavaluedPropertyAtomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualVariable6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(IndividualID6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataLiteral2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataVariable2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DataLiteral2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DataValueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InputMessageMapEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_InputMessageMap_3057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputMessageMapParameterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProcessPerformedByEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessPerformedBy_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksSourceByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompositeProcessComposedOfEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_PerformProcess_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_PerformProcess_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ChoiceComponents_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ChoiceComponents_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrderComponents_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrderComponents_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SequenceComponents_4024_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SequenceComponents_4024_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SequenceEditPart.VISUAL_ID));
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

		case TaskComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_TaskComponents_4025_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_TaskComponents_4025_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(TaskEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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

		case InputMessageMapParameterEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_InputMessageMapParameter_4027_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_InputMessageMapParameter_4027_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(OutputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(InputMessageMapEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4028_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4028_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseThen_4029_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case IfThenElseElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseElse_4030_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case RepeatUntilUntilProcessEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilUntilProcess_4031_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case RepeatWhileWhileConditionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhileWhileCondition_4032_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case ControlConstructBagFirstEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4033_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4033_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListFirst_4034_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListFirst_4034_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(SequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AnyOrderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
		return TasksCollectionEditPart.MODEL_ID
				.equals(CoordinationVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new CoordinationNavigatorItem((View) it.next(), parent,
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
		if (element instanceof CoordinationAbstractNavigatorItem) {
			CoordinationAbstractNavigatorItem abstractNavigatorItem = (CoordinationAbstractNavigatorItem) element;
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
