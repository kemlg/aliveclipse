/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.service.provider.ServicesEditPlugin;

import net.sf.ictalive.service.template.TemplateFactory;
import net.sf.ictalive.service.template.TemplateFlow;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.service.template.TemplateFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateFlowItemProvider
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
	public TemplateFlowItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF);
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
	 * This returns TemplateFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateFlow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TemplateFlow_type");
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

		switch (notification.getFeatureID(TemplateFlow.class)) {
			case TemplatePackage.TEMPLATE_FLOW__COMPOSED_OF:
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
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.TEMPLATE_FLOW__COMPOSED_OF,
				 TemplateFactory.eINSTANCE.createSplitJoin()));
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
