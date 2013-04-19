/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile;

import net.sf.ictalive.owls.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.owls.profile.ProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/owls/profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "profile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilePackage eINSTANCE = net.sf.ictalive.owls.profile.impl.ProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.profile.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.profile.impl.ServiceCategoryImpl
	 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__TAXONOMY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__CODE = 2;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__CATEGORY_NAME = 3;

	/**
	 * The number of structural features of the '<em>Service Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.profile.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.profile.impl.ServiceParameterImpl
	 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getServiceParameter()
	 * @generated
	 */
	int SERVICE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Service Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__SERVICE_PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>SParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__SPARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Service Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.profile.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.profile.impl.ProfileImpl
	 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Presented By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PRESENTED_BY = ServicePackage.SERVICE_PROFILE__PRESENTED_BY;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE_NAME = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__TEXT_DESCRIPTION = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__CONTACT_INFORMATION = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_PROCESS = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE_CATEGORY = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE_PARAMETER = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_PARAMETER = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_INPUT = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_OUTPUT = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_PRECONDITION = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HAS_RESULT = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Service Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE_CLASSIFICATION = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE_PRODUCT = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = ServicePackage.SERVICE_PROFILE_FEATURE_COUNT + 13;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.profile.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Category</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceCategory
	 * @generated
	 */
	EClass getServiceCategory();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.ServiceCategory#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxonomy</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceCategory#getTaxonomy()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Taxonomy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.ServiceCategory#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceCategory#getValue()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.ServiceCategory#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceCategory#getCode()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.ServiceCategory#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceCategory#getCategoryName()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_CategoryName();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.profile.ServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Parameter</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceParameter
	 * @generated
	 */
	EClass getServiceParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.ServiceParameter#getServiceParameterName <em>Service Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Parameter Name</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceParameter#getServiceParameterName()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EAttribute getServiceParameter_ServiceParameterName();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.ServiceParameter#getSParameter <em>SParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SParameter</em>'.
	 * @see net.sf.ictalive.owls.profile.ServiceParameter#getSParameter()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EReference getServiceParameter_SParameter();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.profile.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.Profile#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getServiceName()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.Profile#getTextDescription <em>Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Description</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getTextDescription()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_TextDescription();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.Profile#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Information</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getContactInformation()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_ContactInformation();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHas_process <em>Has process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has process</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHas_process()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Has_process();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Category</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getServiceCategory()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_ServiceCategory();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Parameter</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getServiceParameter()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_ServiceParameter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHasParameter <em>Has Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Parameter</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHasParameter()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_HasParameter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Input</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHasInput()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_HasInput();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Output</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHasOutput()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_HasOutput();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHasPrecondition <em>Has Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Precondition</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHasPrecondition()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_HasPrecondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.profile.Profile#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Result</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getHasResult()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_HasResult();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.Profile#getServiceClassification <em>Service Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Classification</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getServiceClassification()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_ServiceClassification();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.profile.Profile#getServiceProduct <em>Service Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Product</em>'.
	 * @see net.sf.ictalive.owls.profile.Profile#getServiceProduct()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_ServiceProduct();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfileFactory getProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.profile.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.profile.impl.ServiceCategoryImpl
		 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getServiceCategory()
		 * @generated
		 */
		EClass SERVICE_CATEGORY = eINSTANCE.getServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__TAXONOMY = eINSTANCE.getServiceCategory_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__VALUE = eINSTANCE.getServiceCategory_Value();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__CODE = eINSTANCE.getServiceCategory_Code();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__CATEGORY_NAME = eINSTANCE.getServiceCategory_CategoryName();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.profile.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.profile.impl.ServiceParameterImpl
		 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getServiceParameter()
		 * @generated
		 */
		EClass SERVICE_PARAMETER = eINSTANCE.getServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Service Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PARAMETER__SERVICE_PARAMETER_NAME = eINSTANCE.getServiceParameter_ServiceParameterName();

		/**
		 * The meta object literal for the '<em><b>SParameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PARAMETER__SPARAMETER = eINSTANCE.getServiceParameter_SParameter();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.profile.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.profile.impl.ProfileImpl
		 * @see net.sf.ictalive.owls.profile.impl.ProfilePackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__SERVICE_NAME = eINSTANCE.getProfile_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Text Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__TEXT_DESCRIPTION = eINSTANCE.getProfile_TextDescription();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__CONTACT_INFORMATION = eINSTANCE.getProfile_ContactInformation();

		/**
		 * The meta object literal for the '<em><b>Has process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_PROCESS = eINSTANCE.getProfile_Has_process();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__SERVICE_CATEGORY = eINSTANCE.getProfile_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Service Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__SERVICE_PARAMETER = eINSTANCE.getProfile_ServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Has Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_PARAMETER = eINSTANCE.getProfile_HasParameter();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_INPUT = eINSTANCE.getProfile_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_OUTPUT = eINSTANCE.getProfile_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Has Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_PRECONDITION = eINSTANCE.getProfile_HasPrecondition();

		/**
		 * The meta object literal for the '<em><b>Has Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__HAS_RESULT = eINSTANCE.getProfile_HasResult();

		/**
		 * The meta object literal for the '<em><b>Service Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__SERVICE_CLASSIFICATION = eINSTANCE.getProfile_ServiceClassification();

		/**
		 * The meta object literal for the '<em><b>Service Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__SERVICE_PRODUCT = eINSTANCE.getProfile_ServiceProduct();

	}

} //ProfilePackage
