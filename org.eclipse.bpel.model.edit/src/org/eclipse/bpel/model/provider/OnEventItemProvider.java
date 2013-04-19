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
import org.eclipse.bpel.model.OnEvent;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3c.dom.Element;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpel.model.OnEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnEventItemProvider extends ExtensibleElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnEventItemProvider(AdapterFactory adapterFactory) {
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

			addPartnerLinkPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addPortTypePropertyDescriptor(object);
			addMessageTypePropertyDescriptor(object);
			addFromPartsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Partner Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartnerLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_OnEvent_partnerLink_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_OnEvent_partnerLink_feature", "_UI_OnEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.ON_EVENT__PARTNER_LINK, true,
						false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_OnEvent_operation_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_OnEvent_operation_feature", "_UI_OnEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.ON_EVENT__OPERATION, true, false,
						false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_OnEvent_portType_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_OnEvent_portType_feature", "_UI_OnEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.ON_EVENT__PORT_TYPE, true, false,
						false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Message Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_OnEvent_messageType_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_OnEvent_messageType_feature", "_UI_OnEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.ON_EVENT__MESSAGE_TYPE, true,
						false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the From Parts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_OnEvent_fromParts_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_OnEvent_fromParts_feature", "_UI_OnEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.ON_EVENT__FROM_PARTS, true, false,
						true, null, null, null));
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
			childrenFeatures.add(BPELPackage.Literals.ON_EVENT__ACTIVITY);
			childrenFeatures.add(BPELPackage.Literals.ON_EVENT__VARIABLE);
			childrenFeatures.add(BPELPackage.Literals.ON_EVENT__CORRELATIONS);
			childrenFeatures
					.add(BPELPackage.Literals.ON_EVENT__CORRELATION_SETS);
			childrenFeatures
					.add(BPELPackage.Literals.ON_EVENT__MESSAGE_EXCHANGE);
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
	 * This returns OnEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/OnEvent")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Element labelValue = ((OnEvent) object).getDocumentationElement();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_OnEvent_type") : //$NON-NLS-1$
				getString("_UI_OnEvent_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(OnEvent.class)) {
		case BPELPackage.ON_EVENT__ACTIVITY:
		case BPELPackage.ON_EVENT__VARIABLE:
		case BPELPackage.ON_EVENT__CORRELATIONS:
		case BPELPackage.ON_EVENT__CORRELATION_SETS:
		case BPELPackage.ON_EVENT__MESSAGE_EXCHANGE:
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
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createPartnerActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createInvoke()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createReply()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createReceive()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createExit()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createThrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createWait()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createEmpty()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createSequence()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createWhile()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createPick()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createFlow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createAssign()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createCompensateScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createRethrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createExtensionActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createOpaqueActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createForEach()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createRepeatUntil()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createValidate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createIf()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__ACTIVITY, BPELFactory.eINSTANCE
						.createCompensate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__VARIABLE, BPELFactory.eINSTANCE
						.createVariable()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__CORRELATIONS,
				BPELFactory.eINSTANCE.createCorrelations()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__CORRELATION_SETS,
				BPELFactory.eINSTANCE.createCorrelationSets()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.ON_EVENT__MESSAGE_EXCHANGE,
				BPELFactory.eINSTANCE.createMessageExchange()));
	}

}
