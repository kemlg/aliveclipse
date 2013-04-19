/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera;

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
 * @see net.sf.ictalive.opera.OperaFactory
 * @model kind="package"
 * @generated
 */
public interface OperaPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opera";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://opera/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opera";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperaPackage eINSTANCE = net.sf.ictalive.opera.impl.OperaPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.opera.impl.OperAModelImpl <em>Oper AModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.opera.impl.OperAModelImpl
	 * @see net.sf.ictalive.opera.impl.OperaPackageImpl#getOperAModel()
	 * @generated
	 */
	int OPER_AMODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Om</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL__OM = 1;

	/**
	 * The feature id for the '<em><b>Organisation Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL__ORGANISATION_OBJECTIVES = 2;

	/**
	 * The number of structural features of the '<em>Oper AModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.opera.OperAModel <em>Oper AModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oper AModel</em>'.
	 * @see net.sf.ictalive.opera.OperAModel
	 * @generated
	 */
	EClass getOperAModel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.opera.OperAModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.opera.OperAModel#getName()
	 * @see #getOperAModel()
	 * @generated
	 */
	EAttribute getOperAModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.opera.OperAModel#getOm <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Om</em>'.
	 * @see net.sf.ictalive.opera.OperAModel#getOm()
	 * @see #getOperAModel()
	 * @generated
	 */
	EReference getOperAModel_Om();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.opera.OperAModel#getOrganisationObjectives <em>Organisation Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Objectives</em>'.
	 * @see net.sf.ictalive.opera.OperAModel#getOrganisationObjectives()
	 * @see #getOperAModel()
	 * @generated
	 */
	EReference getOperAModel_OrganisationObjectives();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperaFactory getOperaFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.opera.impl.OperAModelImpl <em>Oper AModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.opera.impl.OperAModelImpl
		 * @see net.sf.ictalive.opera.impl.OperaPackageImpl#getOperAModel()
		 * @generated
		 */
		EClass OPER_AMODEL = eINSTANCE.getOperAModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPER_AMODEL__NAME = eINSTANCE.getOperAModel_Name();

		/**
		 * The meta object literal for the '<em><b>Om</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPER_AMODEL__OM = eINSTANCE.getOperAModel_Om();

		/**
		 * The meta object literal for the '<em><b>Organisation Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPER_AMODEL__ORGANISATION_OBJECTIVES = eINSTANCE.getOperAModel_OrganisationObjectives();

	}

} //OperaPackage
