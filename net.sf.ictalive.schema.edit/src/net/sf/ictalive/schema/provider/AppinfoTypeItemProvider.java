/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.schema.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.schema.AppinfoType;
import net.sf.ictalive.schema.SchemaFactory;
import net.sf.ictalive.schema.SchemaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
 * This is the item provider adapter for a {@link net.sf.ictalive.schema.AppinfoType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppinfoTypeItemProvider
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
	public AppinfoTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AppinfoType_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AppinfoType_source_feature", "_UI_AppinfoType_type"),
				 SchemaPackage.Literals.APPINFO_TYPE__SOURCE,
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
			childrenFeatures.add(SchemaPackage.Literals.APPINFO_TYPE__MIXED);
			childrenFeatures.add(SchemaPackage.Literals.APPINFO_TYPE__ANY_ATTRIBUTE);
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
	 * This returns AppinfoType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AppinfoType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AppinfoType)object).getSource();
		return label == null || label.length() == 0 ?
			getString("_UI_AppinfoType_type") :
			getString("_UI_AppinfoType_type") + " " + label;
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

		switch (notification.getFeatureID(AppinfoType.class)) {
			case SchemaPackage.APPINFO_TYPE__SOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.APPINFO_TYPE__MIXED:
			case SchemaPackage.APPINFO_TYPE__ANY_ATTRIBUTE:
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
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ALL,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANNOTATION,
					 SchemaFactory.eINSTANCE.createAnnotationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANY,
					 SchemaFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createWildcard())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__APPINFO,
					 SchemaFactory.eINSTANCE.createAppinfoType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createTopLevelAttribute())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP,
					 SchemaFactory.eINSTANCE.createNamedAttributeGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT,
					 SchemaFactory.eINSTANCE.createComplexContentType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION,
					 SchemaFactory.eINSTANCE.createDocumentationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ELEMENT,
					 SchemaFactory.eINSTANCE.createTopLevelElement())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__FIELD,
					 SchemaFactory.eINSTANCE.createFieldType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__GROUP,
					 SchemaFactory.eINSTANCE.createNamedGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__IMPORT,
					 SchemaFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__INCLUDE,
					 SchemaFactory.eINSTANCE.createIncludeType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__KEY,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__KEYREF,
					 SchemaFactory.eINSTANCE.createKeyrefType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__LIST,
					 SchemaFactory.eINSTANCE.createListType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__NOTATION,
					 SchemaFactory.eINSTANCE.createNotationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__PATTERN,
					 SchemaFactory.eINSTANCE.createPatternType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__REDEFINE,
					 SchemaFactory.eINSTANCE.createRedefineType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__RESTRICTION,
					 SchemaFactory.eINSTANCE.createRestrictionType1())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SCHEMA,
					 SchemaFactory.eINSTANCE.createSchemaType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SELECTOR,
					 SchemaFactory.eINSTANCE.createSelectorType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT,
					 SchemaFactory.eINSTANCE.createSimpleContentType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelSimpleType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__TOTAL_DIGITS,
					 SchemaFactory.eINSTANCE.createTotalDigitsType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__UNION,
					 SchemaFactory.eINSTANCE.createUnionType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.APPINFO_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__WHITE_SPACE,
					 SchemaFactory.eINSTANCE.createWhiteSpaceType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ALL ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ANNOTATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ANY ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__APPINFO ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_TYPE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ELEMENT ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__FIELD ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__GROUP ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__IMPORT ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__INCLUDE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__KEY ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__KEYREF ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__LIST ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__NOTATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__PATTERN ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__REDEFINE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__RESTRICTION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SCHEMA ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SELECTOR ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_TYPE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__TOTAL_DIGITS ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__UNION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__WHITE_SPACE;

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
		return SchemaEditPlugin.INSTANCE;
	}

}
