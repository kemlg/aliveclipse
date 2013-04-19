package net.sf.ictalive.coordination.actions.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.ictalive.coordination.actions.diagram.edit.parts.ActionsCollectionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionAtomicActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultCostDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultDurationDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultQualityDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingToParamEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingValueFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomClassAtomArgValueCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionCompositeActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralDataLiteralCompartment2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralDataLiteralCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomDataRangeAtomOneOfCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DistributionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Expression2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseIfThenElseCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputBindingEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ParticipantEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformHasDataFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasInputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasOutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilRepeatUntilCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileRepeatWhileCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileWhileProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomSameAsAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.part.Messages;

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
					.getContents(), ActionsCollectionEditPart.MODEL_ID), file,
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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {

		case ActionsCollectionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			CoordinationNavigatorGroup links = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ActionsCollection_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeActionEditPart.VISUAL_ID));
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
							.getType(ParticipantEditPart.VISUAL_ID));
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
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(InputBindingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ProcessHasInputEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(ProcessHasOutputEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
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
							.getType(SplitComponentsEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
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
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(PerformHasDataFromEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(BindingValueFromEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(BindingToParamEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_CompositeAction_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAction_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ProcessHasInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ProcessHasOutputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
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

		case AtomicActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AtomicAction_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Condition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ProcessHasInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(ProcessHasOutputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
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
					Messages.NavigatorGroupName_Input_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ProcessHasInputEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(BindingToParamEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_Output_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ProcessHasOutputEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(BindingToParamEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ParticipantEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Participant_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ProcessPerformedByEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_Sequence_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Sequence_2029_outgoinglinks,
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_AnyOrder_2030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrder_2030_outgoinglinks,
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_ControlConstructBag_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBag_2031_outgoinglinks,
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
							.getType(SplitComponentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_Perform_2032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Perform_2032_outgoinglinks,
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(PerformHasDataFromEditPart.VISUAL_ID));
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

		case ChoiceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Choice_2033_outgoinglinks,
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_ControlConstructList_2034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructList_2034_outgoinglinks,
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

		case RepeatUntilEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntil_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Condition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
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
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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

		case RepeatWhileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhile_2036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhile_2036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Condition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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

		case IfThenElseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElse_2037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElse_2037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Condition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseThenEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(IfThenElseElseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatUntilUntilProcessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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

		case InputBindingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_InputBinding_2038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_InputBinding_2038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(PerformHasDataFromEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(BindingValueFromEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(BindingToParamEditPart.VISUAL_ID));
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

		case SplitEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Split_2039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_Split_2039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(SplitComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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

		case SplitJoinEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup incominglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoin_2040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup outgoinglinks = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoin_2040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(CompositeProcessComposedOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(SplitJoinComponentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Collections.singleton(view), CoordinationVisualIDRegistry
							.getType(RepeatWhileWhileProcessEditPart.VISUAL_ID));
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

		case ConditionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(AtomListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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

		case Condition2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(AtomListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicActionResultEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(ExpressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(DistributionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Distribution2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CoordinationVisualIDRegistry
							.getType(Distribution3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ExpressionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(AtomListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Expression2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(AtomListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ProcessHasInputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessHasInput_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessHasInput_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
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

		case ProcessHasOutputEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessHasOutput_4027_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessHasOutput_4027_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(OutputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
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

		case ProcessPerformedByEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessPerformedBy_4028_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ProcessPerformedBy_4028_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ParticipantEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(CompositeActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(AtomicActionEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4029_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_CompositeProcessComposedOf_4029_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_PerformProcess_4030_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_PerformProcess_4030_source,
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
					Messages.NavigatorGroupName_ChoiceComponents_4031_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ChoiceComponents_4031_source,
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
					Messages.NavigatorGroupName_AnyOrderComponents_4032_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_AnyOrderComponents_4032_source,
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
					Messages.NavigatorGroupName_SequenceComponents_4033_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SequenceComponents_4033_source,
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

		case SplitComponentsEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitComponents_4045_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitComponents_4045_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoinComponents_4046_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_SplitJoinComponents_4046_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(ControlConstructBagEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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

		case ControlConstructBagRestEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4034_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagRest_4034_source,
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

		case ControlConstructListRestEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4035_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListRest_4035_source,
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
					Messages.NavigatorGroupName_IfThenElseThen_4036_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseThen_4036_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseElse_4037_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_IfThenElseElse_4037_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilUntilProcess_4038_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatUntilUntilProcess_4038_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhileWhileProcess_4039_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_RepeatWhileWhileProcess_4039_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
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
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4040_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructBagFirst_4040_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_ControlConstructListFirst_4041_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_ControlConstructListFirst_4041_source,
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
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatUntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(RepeatWhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(IfThenElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					CoordinationVisualIDRegistry
							.getType(SplitJoinEditPart.VISUAL_ID));
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

		case PerformHasDataFromEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_PerformHasDataFrom_4042_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_PerformHasDataFrom_4042_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputBindingEditPart.VISUAL_ID));
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

		case BindingValueFromEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_BindingValueFrom_4043_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksSourceByType(Collections
					.singleton(view), CoordinationVisualIDRegistry
					.getType(InputBindingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BindingToParamEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoordinationNavigatorGroup target = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_BindingToParam_4044_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoordinationNavigatorGroup source = new CoordinationNavigatorGroup(
					Messages.NavigatorGroupName_BindingToParam_4044_source,
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
							.getType(InputBindingEditPart.VISUAL_ID));
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
		return ActionsCollectionEditPart.MODEL_ID
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
