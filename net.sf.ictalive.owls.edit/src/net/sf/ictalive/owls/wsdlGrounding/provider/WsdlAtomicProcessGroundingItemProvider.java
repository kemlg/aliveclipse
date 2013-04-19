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

import net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingFactory;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;

import net.sf.ictalive.rules.ruleml.RulemlFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WsdlAtomicProcessGroundingItemProvider
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
	public WsdlAtomicProcessGroundingItemProvider(AdapterFactory adapterFactory) {
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

			addOwlsProcessPropertyDescriptor(object);
			addWsdlOperationPropertyDescriptor(object);
			addWsdlDocumentPropertyDescriptor(object);
			addWsdlReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owls Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwlsProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WsdlAtomicProcessGrounding_owlsProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WsdlAtomicProcessGrounding_owlsProcess_feature", "_UI_WsdlAtomicProcessGrounding_type"),
				 WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WsdlAtomicProcessGrounding_wsdlOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WsdlAtomicProcessGrounding_wsdlOperation_feature", "_UI_WsdlAtomicProcessGrounding_type"),
				 WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Document feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlDocumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WsdlAtomicProcessGrounding_wsdlDocument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WsdlAtomicProcessGrounding_wsdlDocument_feature", "_UI_WsdlAtomicProcessGrounding_type"),
				 WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WsdlAtomicProcessGrounding_wsdlReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WsdlAtomicProcessGrounding_wsdlReference_feature", "_UI_WsdlAtomicProcessGrounding_type"),
				 WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE);
			childrenFeatures.add(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION);
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
	 * This returns WsdlAtomicProcessGrounding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WsdlAtomicProcessGrounding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WsdlAtomicProcessGrounding)object).getWsdlReference();
		return label == null || label.length() == 0 ?
			getString("_UI_WsdlAtomicProcessGrounding_type") :
			getString("_UI_WsdlAtomicProcessGrounding_type") + " " + label;
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

		switch (notification.getFeatureID(WsdlAtomicProcessGrounding.class)) {
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
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
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 XMLTypeFactory.eINSTANCE.createSimpleAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 XMLTypeFactory.eINSTANCE.createSimpleAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 XMLTypeFactory.eINSTANCE.createSimpleAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 XMLTypeFactory.eINSTANCE.createSimpleAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlAtomicProcessGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOperationRef()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 WsdlGroundingFactory.eINSTANCE.createGD()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ExprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ExprFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createControlConstructList()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createLocal()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProcessFactory.eINSTANCE.createValueOf()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProfileFactory.eINSTANCE.createServiceCategory()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProfileFactory.eINSTANCE.createServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ServiceFactory.eINSTANCE.createServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 TimeFactory.eINSTANCE.createIntervalThing()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createOperAModel()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createOM()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createSS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createIS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createNS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createCS()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createNorm()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createIndividualDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createRoleDeonticStatement()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createHierarchyDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createMarketDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createNetworkDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createSceneToTransitionArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createTransitionToSceneArc()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createLandmarkPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPartialOrder()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 RulemlFactory.eINSTANCE.createImplies()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 RulemlFactory.eINSTANCE.createBody()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 RulemlFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
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
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION ||
			childFeature == WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT;

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
