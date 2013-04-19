/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.provider;


import control.ControlFactory;
import control.ControlPackage;
import control.OuterProcess;

import java.util.Collection;
import java.util.List;

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
 * This is the item provider adapter for a {@link control.OuterProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OuterProcessItemProvider
  extends NamedElementItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OuterProcessItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addServiceNamePropertyDescriptor(object);
			addServiceURIPropertyDescriptor(object);
			addServiceDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OuterProcess_serviceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OuterProcess_serviceName_feature", "_UI_OuterProcess_type"),
				 ControlPackage.Literals.OUTER_PROCESS__SERVICE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Service URI feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addServiceURIPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OuterProcess_serviceURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OuterProcess_serviceURI_feature", "_UI_OuterProcess_type"),
				 ControlPackage.Literals.OUTER_PROCESS__SERVICE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Service Description feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addServiceDescriptionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OuterProcess_serviceDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OuterProcess_serviceDescription_feature", "_UI_OuterProcess_type"),
				 ControlPackage.Literals.OUTER_PROCESS__SERVICE_DESCRIPTION,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__HAS_INPUT);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__HAS_OUTPUT);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__HAS_PRECONDITION);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__HAS_RESULT);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__BINDINGS);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__OUTER_LOCALS);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__OUTER_LINKS);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__ONTOLOGIES);
			childrenFeatures.add(ControlPackage.Literals.OUTER_PROCESS__TEMPLATE_CONSTRAINTS);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns OuterProcess.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OuterProcess"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((OuterProcess)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OuterProcess_type") :
			getString("_UI_OuterProcess_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(OuterProcess.class)) {
			case ControlPackage.OUTER_PROCESS__SERVICE_NAME:
			case ControlPackage.OUTER_PROCESS__SERVICE_URI:
			case ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
			case ControlPackage.OUTER_PROCESS__BINDINGS:
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createProduce()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT,
				 ControlFactory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__HAS_INPUT,
				 ControlFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__HAS_OUTPUT,
				 ControlFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__HAS_PRECONDITION,
				 ControlFactory.eINSTANCE.createExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__HAS_PRECONDITION,
				 ControlFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__HAS_RESULT,
				 ControlFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
				 ControlFactory.eINSTANCE.createInputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
				 ControlFactory.eINSTANCE.createOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
				 ControlFactory.eINSTANCE.createLocBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
				 ControlFactory.eINSTANCE.createLinkBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
				 ControlFactory.eINSTANCE.createoutputBindingSource()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__OUTER_LOCALS,
				 ControlFactory.eINSTANCE.createLoc()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__OUTER_LINKS,
				 ControlFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__ONTOLOGIES,
				 ControlFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.OUTER_PROCESS__TEMPLATE_CONSTRAINTS,
				 ControlFactory.eINSTANCE.createTemplateConstraint()));
	}

}
