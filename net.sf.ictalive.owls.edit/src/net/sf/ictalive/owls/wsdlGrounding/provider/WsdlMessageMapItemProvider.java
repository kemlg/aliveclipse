/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.operetta.OM.OMFactory;

import net.sf.ictalive.owls.expr.ExprFactory;

import net.sf.ictalive.owls.expr.provider.OwlsEditPlugin;

import net.sf.ictalive.owls.process.ProcessFactory;

import net.sf.ictalive.owls.profile.ProfileFactory;

import net.sf.ictalive.owls.service.ServiceFactory;

import net.sf.ictalive.owls.time.TimeFactory;

import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingFactory;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;
import net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap;

import net.sf.ictalive.rules.ruleml.RulemlFactory;

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
 * This is the item provider adapter for a {@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WsdlMessageMapItemProvider
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
	public WsdlMessageMapItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART);
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
	 * This returns WsdlMessageMap.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WsdlMessageMap"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WsdlMessageMap_type");
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

		switch (notification.getFeatureID(WsdlMessageMap.class)) {
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
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
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART,
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
			childFeature == WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__OWLS_PARAMETER ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART;

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
		return OwlsEditPlugin.INSTANCE;
	}

}
