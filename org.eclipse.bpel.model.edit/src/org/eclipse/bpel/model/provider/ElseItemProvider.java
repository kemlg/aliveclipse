/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Else;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3c.dom.Element;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpel.model.Else} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElseItemProvider extends ExtensibleElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseItemProvider(AdapterFactory adapterFactory) {
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BPELPackage.Literals.ELSE__ACTIVITY);
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
	 * This returns Else.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/Else")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Element labelValue = ((Else) object).getDocumentationElement();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Else_type") : //$NON-NLS-1$
				getString("_UI_Else_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Else.class)) {
		case BPELPackage.ELSE__ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createPartnerActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createInvoke()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createReply()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createReceive()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createExit()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createThrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createWait()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createEmpty()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createSequence()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createWhile()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createPick()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createFlow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createAssign()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createCompensateScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createRethrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createExtensionActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createOpaqueActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createForEach()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createRepeatUntil()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createValidate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createIf()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ELSE__ACTIVITY, BPELFactory.eINSTANCE
						.createCompensate()));
	}

}
