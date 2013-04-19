/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service;

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
 * @see net.sf.ictalive.owls.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://owls1.1/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ser";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = net.sf.ictalive.owls.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.service.impl.ServiceGroundingImpl <em>Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.service.impl.ServiceGroundingImpl
	 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceGrounding()
	 * @generated
	 */
	int SERVICE_GROUNDING = 0;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__SUPPORTED_BY = 0;

	/**
	 * The number of structural features of the '<em>Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.service.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.service.impl.ServiceImpl
	 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRESENTS = 0;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIBED_BY = 1;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUPPORTS = 2;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDED_BY = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.service.impl.ServiceModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.service.impl.ServiceModelImpl
	 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceModel()
	 * @generated
	 */
	int SERVICE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__DESCRIBES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.service.impl.ServiceProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.service.impl.ServiceProfileImpl
	 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceProfile()
	 * @generated
	 */
	int SERVICE_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Presented By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__PRESENTED_BY = 0;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.service.impl.ServiceProviderImpl
	 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__PROVIDES = 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.service.ServiceGrounding <em>Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grounding</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceGrounding
	 * @generated
	 */
	EClass getServiceGrounding();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supported By</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EReference getServiceGrounding_SupportedBy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see net.sf.ictalive.owls.service.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.owls.service.Service#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presents</em>'.
	 * @see net.sf.ictalive.owls.service.Service#getPresents()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Presents();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.service.Service#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Described By</em>'.
	 * @see net.sf.ictalive.owls.service.Service#getDescribedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DescribedBy();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.service.Service#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supports</em>'.
	 * @see net.sf.ictalive.owls.service.Service#getSupports()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Supports();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.service.Service#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By</em>'.
	 * @see net.sf.ictalive.owls.service.Service#getProvidedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ProvidedBy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.service.ServiceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceModel
	 * @generated
	 */
	EClass getServiceModel();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.owls.service.ServiceModel#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Describes</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceModel#getDescribes()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_Describes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.service.ServiceModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceModel#getId()
	 * @see #getServiceModel()
	 * @generated
	 */
	EAttribute getServiceModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.service.ServiceModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceModel#getVersion()
	 * @see #getServiceModel()
	 * @generated
	 */
	EAttribute getServiceModel_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.service.ServiceProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceProfile
	 * @generated
	 */
	EClass getServiceProfile();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy <em>Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Presented By</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_PresentedBy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.service.ServiceProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.service.ServiceProvider#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see net.sf.ictalive.owls.service.ServiceProvider#getProvides()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Provides();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.service.impl.ServiceGroundingImpl <em>Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.service.impl.ServiceGroundingImpl
		 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceGrounding()
		 * @generated
		 */
		EClass SERVICE_GROUNDING = eINSTANCE.getServiceGrounding();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUNDING__SUPPORTED_BY = eINSTANCE.getServiceGrounding_SupportedBy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.service.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.service.impl.ServiceImpl
		 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Presents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PRESENTS = eINSTANCE.getService_Presents();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DESCRIBED_BY = eINSTANCE.getService_DescribedBy();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUPPORTS = eINSTANCE.getService_Supports();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PROVIDED_BY = eINSTANCE.getService_ProvidedBy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.service.impl.ServiceModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.service.impl.ServiceModelImpl
		 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceModel()
		 * @generated
		 */
		EClass SERVICE_MODEL = eINSTANCE.getServiceModel();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__DESCRIBES = eINSTANCE.getServiceModel_Describes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MODEL__ID = eINSTANCE.getServiceModel_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MODEL__VERSION = eINSTANCE.getServiceModel_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.service.impl.ServiceProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.service.impl.ServiceProfileImpl
		 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceProfile()
		 * @generated
		 */
		EClass SERVICE_PROFILE = eINSTANCE.getServiceProfile();

		/**
		 * The meta object literal for the '<em><b>Presented By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__PRESENTED_BY = eINSTANCE.getServiceProfile_PresentedBy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.service.impl.ServiceProviderImpl
		 * @see net.sf.ictalive.owls.service.impl.ServicePackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__PROVIDES = eINSTANCE.getServiceProvider_Provides();

	}

} //ServicePackage
