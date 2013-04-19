/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.provider;


import control.ControlFactory;
import control.ControlPackage;
import control.Result;

import java.util.Collection;
import java.util.List;

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

/**
 * This is the item provider adapter for a {@link control.Result} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultItemProvider
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
  public ResultItemProvider(AdapterFactory adapterFactory)
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ControlPackage.Literals.RESULT__IN_CONDITION);
			childrenFeatures.add(ControlPackage.Literals.RESULT__HAS_RESULT_VAR);
			childrenFeatures.add(ControlPackage.Literals.RESULT__HAS_EFFECT);
			childrenFeatures.add(ControlPackage.Literals.RESULT__BINDING_SOURCE);
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
	 * This returns Result.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Result"));
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
		String label = ((Result)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Result_type") :
			getString("_UI_Result_type") + " " + label;
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

		switch (notification.getFeatureID(Result.class)) {
			case ControlPackage.RESULT__IN_CONDITION:
			case ControlPackage.RESULT__HAS_RESULT_VAR:
			case ControlPackage.RESULT__HAS_EFFECT:
			case ControlPackage.RESULT__BINDING_SOURCE:
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
				(ControlPackage.Literals.RESULT__IN_CONDITION,
				 ControlFactory.eINSTANCE.createExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__IN_CONDITION,
				 ControlFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__HAS_RESULT_VAR,
				 ControlFactory.eINSTANCE.createResultVar()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__HAS_EFFECT,
				 ControlFactory.eINSTANCE.createExpr()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__HAS_EFFECT,
				 ControlFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__BINDING_SOURCE,
				 ControlFactory.eINSTANCE.createValueSource()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__BINDING_SOURCE,
				 ControlFactory.eINSTANCE.createValueForm()));

		newChildDescriptors.add
			(createChildParameter
				(ControlPackage.Literals.RESULT__BINDING_SOURCE,
				 ControlFactory.eINSTANCE.createValueFunction()));
	}

  /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ControlPackage.Literals.RESULT__IN_CONDITION ||
			childFeature == ControlPackage.Literals.RESULT__HAS_EFFECT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
