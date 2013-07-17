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
import org.eclipse.bpel.model.Scope;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpel.model.Scope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeItemProvider extends ActivityItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeItemProvider(AdapterFactory adapterFactory) {
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

			addIsolatedPropertyDescriptor(object);
			addMessageExchangesPropertyDescriptor(object);
			addExitOnStandardFaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Isolated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsolatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Scope_isolated_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Scope_isolated_feature", "_UI_Scope_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.SCOPE__ISOLATED, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Message Exchanges feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageExchangesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Scope_messageExchanges_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Scope_messageExchanges_feature", "_UI_Scope_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.SCOPE__MESSAGE_EXCHANGES, true,
						false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Exit On Standard Fault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExitOnStandardFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Scope_exitOnStandardFault_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Scope_exitOnStandardFault_feature", "_UI_Scope_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.SCOPE__EXIT_ON_STANDARD_FAULT,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BPELPackage.Literals.SCOPE__FAULT_HANDLERS);
			childrenFeatures
					.add(BPELPackage.Literals.SCOPE__COMPENSATION_HANDLER);
			childrenFeatures.add(BPELPackage.Literals.SCOPE__ACTIVITY);
			childrenFeatures.add(BPELPackage.Literals.SCOPE__VARIABLES);
			childrenFeatures.add(BPELPackage.Literals.SCOPE__CORRELATION_SETS);
			childrenFeatures.add(BPELPackage.Literals.SCOPE__EVENT_HANDLERS);
			childrenFeatures.add(BPELPackage.Literals.SCOPE__PARTNER_LINKS);
			childrenFeatures
					.add(BPELPackage.Literals.SCOPE__TERMINATION_HANDLER);
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
	 * This returns Scope.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Scope")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scope) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Scope_type") : //$NON-NLS-1$
				getString("_UI_Scope_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Scope.class)) {
		case BPELPackage.SCOPE__ISOLATED:
		case BPELPackage.SCOPE__EXIT_ON_STANDARD_FAULT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case BPELPackage.SCOPE__FAULT_HANDLERS:
		case BPELPackage.SCOPE__COMPENSATION_HANDLER:
		case BPELPackage.SCOPE__ACTIVITY:
		case BPELPackage.SCOPE__VARIABLES:
		case BPELPackage.SCOPE__CORRELATION_SETS:
		case BPELPackage.SCOPE__EVENT_HANDLERS:
		case BPELPackage.SCOPE__PARTNER_LINKS:
		case BPELPackage.SCOPE__TERMINATION_HANDLER:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
				BPELPackage.Literals.SCOPE__FAULT_HANDLERS,
				BPELFactory.eINSTANCE.createFaultHandler()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__COMPENSATION_HANDLER,
				BPELFactory.eINSTANCE.createCompensationHandler()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createPartnerActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createReply()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createReceive()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createExit()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createWait()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createEmpty()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createPick()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createCompensateScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createRethrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createExtensionActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createOpaqueActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createValidate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__ACTIVITY,
				BPELFactory.eINSTANCE.createCompensate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__VARIABLES,
				BPELFactory.eINSTANCE.createVariables()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__CORRELATION_SETS,
				BPELFactory.eINSTANCE.createCorrelationSets()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__EVENT_HANDLERS,
				BPELFactory.eINSTANCE.createEventHandler()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__PARTNER_LINKS,
				BPELFactory.eINSTANCE.createPartnerLinks()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.SCOPE__TERMINATION_HANDLER,
				BPELFactory.eINSTANCE.createTerminationHandler()));
	}

}
