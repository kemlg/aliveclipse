/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances;

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
 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesFactory
 * @model kind="package"
 * @generated
 */
public interface NormInstancesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NormInstances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/RunTime/normInstance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "normIns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NormInstancesPackage eINSTANCE = net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl <em>Norm Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl
	 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getNormInstance()
	 * @generated
	 */
	int NORM_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE__NORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Partial State Description Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Norm Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl <em>Partial State Description Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl
	 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getPartialStateDescriptionInstance()
	 * @generated
	 */
	int PARTIAL_STATE_DESCRIPTION_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Partial State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Partial State Description Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.NormInstances.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.NormInstances.impl.ValueImpl
	 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.NormInstances.NormInstance <em>Norm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Instance</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstance
	 * @generated
	 */
	EClass getNormInstance();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getNorm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norm</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstance#getNorm()
	 * @see #getNormInstance()
	 * @generated
	 */
	EReference getNormInstance_Norm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstance#getName()
	 * @see #getNormInstance()
	 * @generated
	 */
	EAttribute getNormInstance_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getPartialStateDescriptionInstance <em>Partial State Description Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partial State Description Instance</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstance#getPartialStateDescriptionInstance()
	 * @see #getNormInstance()
	 * @generated
	 */
	EReference getNormInstance_PartialStateDescriptionInstance();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance <em>Partial State Description Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial State Description Instance</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance
	 * @generated
	 */
	EClass getPartialStateDescriptionInstance();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getPartialStateDescription <em>Partial State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partial State Description</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getPartialStateDescription()
	 * @see #getPartialStateDescriptionInstance()
	 * @generated
	 */
	EReference getPartialStateDescriptionInstance_PartialStateDescription();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getName()
	 * @see #getPartialStateDescriptionInstance()
	 * @generated
	 */
	EAttribute getPartialStateDescriptionInstance_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getValue()
	 * @see #getPartialStateDescriptionInstance()
	 * @generated
	 */
	EReference getPartialStateDescriptionInstance_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.NormInstances.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.NormInstances.Value#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.Value#getOf()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Of();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.NormInstances.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.ictalive.runtime.NormInstances.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NormInstancesFactory getNormInstancesFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl <em>Norm Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl
		 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getNormInstance()
		 * @generated
		 */
		EClass NORM_INSTANCE = eINSTANCE.getNormInstance();

		/**
		 * The meta object literal for the '<em><b>Norm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_INSTANCE__NORM = eINSTANCE.getNormInstance_Norm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORM_INSTANCE__NAME = eINSTANCE.getNormInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Partial State Description Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE = eINSTANCE.getNormInstance_PartialStateDescriptionInstance();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl <em>Partial State Description Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl
		 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getPartialStateDescriptionInstance()
		 * @generated
		 */
		EClass PARTIAL_STATE_DESCRIPTION_INSTANCE = eINSTANCE.getPartialStateDescriptionInstance();

		/**
		 * The meta object literal for the '<em><b>Partial State Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION = eINSTANCE.getPartialStateDescriptionInstance_PartialStateDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME = eINSTANCE.getPartialStateDescriptionInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE = eINSTANCE.getPartialStateDescriptionInstance_Value();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.NormInstances.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.NormInstances.impl.ValueImpl
		 * @see net.sf.ictalive.runtime.NormInstances.impl.NormInstancesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__OF = eINSTANCE.getValue_Of();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

	}

} //NormInstancesPackage
