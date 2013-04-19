/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.coordination.actions.ActionsFactory;
import net.sf.ictalive.coordination.agents.AgentsFactory;
import net.sf.ictalive.coordination.tasks.TasksFactory;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.WfvvFactory;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.owls.expr.ExprFactory;
import net.sf.ictalive.owls.process.ProcessFactory;
import net.sf.ictalive.owls.service.ServiceFactory;
import net.sf.ictalive.owls.time.TimeFactory;
import net.sf.ictalive.rules.ruleml.RulemlFactory;
import net.sf.ictalive.rules.swrl.SwrlFactory;
import net.sf.ictalive.runtime.NormInstances.NormInstancesFactory;
import net.sf.ictalive.runtime.action.ActionFactory;
import net.sf.ictalive.runtime.enactment.EnactmentFactory;
import net.sf.ictalive.runtime.event.EventFactory;
import net.sf.ictalive.runtime.fact.FactFactory;
import net.sf.ictalive.schema.SchemaFactory;
import net.sf.ictalive.service.architecture.ArchitectureFactory;
import net.sf.ictalive.service.semantics.SemanticsFactory;
import net.sf.ictalive.service.syntax.SyntaxFactory;
import net.sf.ictalive.service.template.TemplateFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.coordination.wfvv.EventModelContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventModelContainerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENTS);
			childrenFeatures.add(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENT_GROUPS);
			childrenFeatures.add(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EventModelContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventModelContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EventModelContainer_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EventModelContainer.class)) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
			case WfvvPackage.EVENT_MODEL_CONTAINER__OBJECTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENTS,
				 EventFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENT_GROUPS,
				 WfvvFactory.eINSTANCE.createEventGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 WfvvFactory.eINSTANCE.createEventModelContainer()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 WfvvFactory.eINSTANCE.createEventGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createAtomicAction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createCompositeAction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createActionResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createAtomicActionResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionsFactory.eINSTANCE.createActionsCollection()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 AgentsFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 AgentsFactory.eINSTANCE.createMasModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createActionGroundingList()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createActionGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createTasksCollection()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TasksFactory.eINSTANCE.createPlansCollection()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 NormInstancesFactory.eINSTANCE.createNormInstance()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 NormInstancesFactory.eINSTANCE.createPartialStateDescriptionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 NormInstancesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createTransitionNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createActions()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createAtomicAction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createAtomList()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createBuiltInAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createClassAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createIndividualPropertyAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createSameIndividualAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDifferentIndividualsAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDatavaluedPropertyAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDataRangeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createIndividualVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createIndividualID()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDataVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SwrlFactory.eINSTANCE.createDataLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createCommunicativeAction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createCoordinationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createPlanSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createPlanDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createPlanSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createPlanExecution()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createServiceInvocation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createMatchmakerResponse()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createReplaceAgent()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createAgentReplan()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createNotifyStateOfWorld()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createStateOfWorld()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createMatchmakerQuery()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ActionFactory.eINSTANCE.createMatchmakerResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EnactmentFactory.eINSTANCE.createEnactment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EnactmentFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EnactmentFactory.eINSTANCE.createActionEnactment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EnactmentFactory.eINSTANCE.createPlanEnactment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EnactmentFactory.eINSTANCE.createServiceInvocationEnactment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createActorView()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createObserverView()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createProxyView()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 EventFactory.eINSTANCE.createCause()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createStartedAct()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createExecutedAct()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createFailureAct()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createDisaster()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createReceiveAct()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createSendAct()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createDeadlineViolation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createTaskViolation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createAvailability()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createLandmarkFulfilment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createNormConditionFulfilment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createObjectiveFulfilment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createPlayerFulfilment()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createNormInstanceViolated()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createNormInstanceActivated()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 FactFactory.eINSTANCE.createNormInstanceExpired()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createOpenAttrs()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createAnnotated()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createAttributeGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createComplexRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createRealGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createKeybase()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createLocalComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createLocalElement()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createLocalSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createNamedAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createNamedGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createNarrowMaxMin()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createSimpleExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createSimpleRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createTopLevelAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createTopLevelComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createTopLevelElement()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SchemaFactory.eINSTANCE.createTopLevelSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 net.sf.ictalive.service.ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 net.sf.ictalive.service.ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 net.sf.ictalive.service.ServiceFactory.eINSTANCE.createServiceConsumer()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 net.sf.ictalive.service.ServiceFactory.eINSTANCE.createSL()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 net.sf.ictalive.service.ServiceFactory.eINSTANCE.createServiceImplemetation()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SyntaxFactory.eINSTANCE.createInterfaceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SyntaxFactory.eINSTANCE.createOperationDescription()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SyntaxFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SyntaxFactory.eINSTANCE.createEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SyntaxFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createProcessModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceInput()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 SemanticsFactory.eINSTANCE.createServiceResult()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createServiceTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createTemplateFlow()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createGroundTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createAbstractProcessModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createBoundTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createBoundProcessModel()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createTemplateConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 TemplateFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createServiceFramework()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createTemplateRepository()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createTemplateMatchmaker()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createServiceMatchmaker()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createServiceTemplateMatchmaker()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createServiceDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createExecutionFramework()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 ArchitectureFactory.eINSTANCE.createDeployedService()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS,
				 XMLTypeFactory.eINSTANCE.createSimpleAnyType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENTS ||
			childFeature == WfvvPackage.Literals.EVENT_MODEL_CONTAINER__OBJECTS ||
			childFeature == WfvvPackage.Literals.EVENT_MODEL_CONTAINER__EVENT_GROUPS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WfvvEditPlugin.INSTANCE;
	}

}
