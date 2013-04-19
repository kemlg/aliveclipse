/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.service.ServiceFactory;

import net.sf.ictalive.service.provider.ServicesEditPlugin;

import net.sf.ictalive.service.semantics.grounding.GroundingFactory;
import net.sf.ictalive.service.semantics.grounding.GroundingPackage;
import net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding;

import net.sf.ictalive.service.syntax.SyntaxFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding} object.
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
			addWsdlReferencePropertyDescriptor(object);
			addWsdlDocumentPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
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
				 GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS,
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
				 GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION,
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
				 GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WsdlAtomicProcessGrounding_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WsdlAtomicProcessGrounding_name_feature", "_UI_WsdlAtomicProcessGrounding_type"),
				 GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__NAME,
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
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE);
			childrenFeatures.add(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION);
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
		String label = ((WsdlAtomicProcessGrounding)object).getName();
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
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
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
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT,
				 GroundingFactory.eINSTANCE.createWsdlInputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT,
				 GroundingFactory.eINSTANCE.createWsdlOutputMessageMap()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE,
				 ServiceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT,
				 SyntaxFactory.eINSTANCE.createEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE,
				 SyntaxFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE,
				 SyntaxFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION,
				 ""));
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
			childFeature == GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE ||
			childFeature == GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE;

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
		return ServicesEditPlugin.INSTANCE;
	}

}
