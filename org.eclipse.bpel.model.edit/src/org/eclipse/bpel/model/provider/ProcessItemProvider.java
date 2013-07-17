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
 * This is the item provider adapter for a {@link org.eclipse.bpel.model.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends BPELExtensibleElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
			addQueryLanguagePropertyDescriptor(object);
			addExpressionLanguagePropertyDescriptor(object);
			addSuppressJoinFailurePropertyDescriptor(object);
			addVariableAccessSerializablePropertyDescriptor(object);
			addExitOnStandardFaultPropertyDescriptor(object);
			addMessageExchangesPropertyDescriptor(object);
			addAbstractProcessProfilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_name_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_name_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_targetNamespace_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_targetNamespace_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__TARGET_NAMESPACE, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Query Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_queryLanguage_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_queryLanguage_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__QUERY_LANGUAGE, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expression Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_expressionLanguage_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_expressionLanguage_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__EXPRESSION_LANGUAGE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suppress Join Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressJoinFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_suppressJoinFailure_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_suppressJoinFailure_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__SUPPRESS_JOIN_FAILURE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Variable Access Serializable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableAccessSerializablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_variableAccessSerializable_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_variableAccessSerializable_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__VARIABLE_ACCESS_SERIALIZABLE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getString("_UI_Process_exitOnStandardFault_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_exitOnStandardFault_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__EXIT_ON_STANDARD_FAULT,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getString("_UI_Process_messageExchanges_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_messageExchanges_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__MESSAGE_EXCHANGES, true,
						false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Abstract Process Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractProcessProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Process_abstractProcessProfile_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Process_abstractProcessProfile_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						BPELPackage.Literals.PROCESS__ABSTRACT_PROCESS_PROFILE,
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
			childrenFeatures.add(BPELPackage.Literals.PROCESS__PARTNER_LINKS);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__VARIABLES);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__ACTIVITY);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__FAULT_HANDLERS);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__EVENT_HANDLERS);
			childrenFeatures
					.add(BPELPackage.Literals.PROCESS__CORRELATION_SETS);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__IMPORTS);
			childrenFeatures.add(BPELPackage.Literals.PROCESS__EXTENSIONS);
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
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Process")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.eclipse.bpel.model.Process) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Process_type") : //$NON-NLS-1$
				getString("_UI_Process_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(org.eclipse.bpel.model.Process.class)) {
		case BPELPackage.PROCESS__NAME:
		case BPELPackage.PROCESS__TARGET_NAMESPACE:
		case BPELPackage.PROCESS__QUERY_LANGUAGE:
		case BPELPackage.PROCESS__EXPRESSION_LANGUAGE:
		case BPELPackage.PROCESS__SUPPRESS_JOIN_FAILURE:
		case BPELPackage.PROCESS__VARIABLE_ACCESS_SERIALIZABLE:
		case BPELPackage.PROCESS__EXIT_ON_STANDARD_FAULT:
		case BPELPackage.PROCESS__ABSTRACT_PROCESS_PROFILE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case BPELPackage.PROCESS__PARTNER_LINKS:
		case BPELPackage.PROCESS__VARIABLES:
		case BPELPackage.PROCESS__ACTIVITY:
		case BPELPackage.PROCESS__FAULT_HANDLERS:
		case BPELPackage.PROCESS__EVENT_HANDLERS:
		case BPELPackage.PROCESS__CORRELATION_SETS:
		case BPELPackage.PROCESS__IMPORTS:
		case BPELPackage.PROCESS__EXTENSIONS:
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
				BPELPackage.Literals.PROCESS__PARTNER_LINKS,
				BPELFactory.eINSTANCE.createPartnerLinks()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__VARIABLES,
				BPELFactory.eINSTANCE.createVariables()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createPartnerActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createReply()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createReceive()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createExit()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createWait()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createEmpty()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createPick()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createCompensateScope()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createRethrow()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createExtensionActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createOpaqueActivity()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createValidate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__ACTIVITY,
				BPELFactory.eINSTANCE.createCompensate()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__FAULT_HANDLERS,
				BPELFactory.eINSTANCE.createFaultHandler()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__EVENT_HANDLERS,
				BPELFactory.eINSTANCE.createEventHandler()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__CORRELATION_SETS,
				BPELFactory.eINSTANCE.createCorrelationSets()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__IMPORTS,
				BPELFactory.eINSTANCE.createImport()));

		newChildDescriptors.add(createChildParameter(
				BPELPackage.Literals.PROCESS__EXTENSIONS,
				BPELFactory.eINSTANCE.createExtensions()));
	}

}
