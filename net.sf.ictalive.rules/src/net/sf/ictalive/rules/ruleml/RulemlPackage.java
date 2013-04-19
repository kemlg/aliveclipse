/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.ruleml;

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
 * @see net.sf.ictalive.rules.ruleml.RulemlFactory
 * @model kind="package"
 * @generated
 */
public interface RulemlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ruleml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/ruleml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ruleml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulemlPackage eINSTANCE = net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.ruleml.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.ruleml.impl.ImpliesImpl
	 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__BODY = 1;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.ruleml.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.ruleml.impl.BodyImpl
	 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.ruleml.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.ruleml.impl.HeadImpl
	 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 2;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.ruleml.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see net.sf.ictalive.rules.ruleml.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.ruleml.Implies#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see net.sf.ictalive.rules.ruleml.Implies#getHead()
	 * @see #getImplies()
	 * @generated
	 */
	EReference getImplies_Head();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.ruleml.Implies#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see net.sf.ictalive.rules.ruleml.Implies#getBody()
	 * @see #getImplies()
	 * @generated
	 */
	EReference getImplies_Body();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.ruleml.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see net.sf.ictalive.rules.ruleml.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.ruleml.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see net.sf.ictalive.rules.ruleml.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulemlFactory getRulemlFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.rules.ruleml.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.ruleml.impl.ImpliesImpl
		 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES__HEAD = eINSTANCE.getImplies_Head();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES__BODY = eINSTANCE.getImplies_Body();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.ruleml.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.ruleml.impl.BodyImpl
		 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.ruleml.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.ruleml.impl.HeadImpl
		 * @see net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

	}

} //RulemlPackage
