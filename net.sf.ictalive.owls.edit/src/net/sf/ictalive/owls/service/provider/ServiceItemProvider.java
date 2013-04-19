/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.owls.expr.provider.OwlsEditPlugin;

import net.sf.ictalive.owls.process.ProcessFactory;

import net.sf.ictalive.owls.profile.ProfileFactory;

import net.sf.ictalive.owls.service.Service;
import net.sf.ictalive.owls.service.ServiceFactory;
import net.sf.ictalive.owls.service.ServicePackage;

import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingFactory;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.owls.service.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider
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
	public ServiceItemProvider(AdapterFactory adapterFactory) {
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

			addProvidedByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Provided By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_providedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_providedBy_feature", "_UI_Service_type"),
				 ServicePackage.Literals.SERVICE__PROVIDED_BY,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ServicePackage.Literals.SERVICE__PRESENTS);
			childrenFeatures.add(ServicePackage.Literals.SERVICE__DESCRIBED_BY);
			childrenFeatures.add(ServicePackage.Literals.SERVICE__SUPPORTS);
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
	 * This returns Service.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Service"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Service_type");
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

		switch (notification.getFeatureID(Service.class)) {
			case ServicePackage.SERVICE__PRESENTS:
			case ServicePackage.SERVICE__DESCRIBED_BY:
			case ServicePackage.SERVICE__SUPPORTS:
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
				(ServicePackage.Literals.SERVICE__PRESENTS,
				 ServiceFactory.eINSTANCE.createServiceProfile()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__PRESENTS,
				 ProfileFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__DESCRIBED_BY,
				 ServiceFactory.eINSTANCE.createServiceModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__DESCRIBED_BY,
				 ProcessFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__DESCRIBED_BY,
				 ProcessFactory.eINSTANCE.createAtomicProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__DESCRIBED_BY,
				 ProcessFactory.eINSTANCE.createCompositeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__DESCRIBED_BY,
				 ProcessFactory.eINSTANCE.createSimpleProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__SUPPORTS,
				 ServiceFactory.eINSTANCE.createServiceGrounding()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SERVICE__SUPPORTS,
				 WsdlGroundingFactory.eINSTANCE.createWsdlGrounding()));
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
