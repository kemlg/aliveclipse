/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.expr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.ictalive.owls.expr.ExprFactory
 * @model kind="package"
 * @generated
 */
public interface ExprPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/owls/expr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprPackage eINSTANCE = net.sf.ictalive.owls.expr.impl.ExprPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.expr.impl.ExpressionImpl
	 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logic Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOGIC_LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Expression Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_BODY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.expr.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.expr.impl.ConditionImpl
	 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Logic Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LOGIC_LANGUAGE = EXPRESSION__LOGIC_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Expression Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION_BODY = EXPRESSION__EXPRESSION_BODY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VERSION = EXPRESSION__VERSION;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.expr.ExpressionLanguage <em>Expression Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.expr.ExpressionLanguage
	 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getExpressionLanguage()
	 * @generated
	 */
	int EXPRESSION_LANGUAGE = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.expr.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see net.sf.ictalive.owls.expr.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.expr.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.expr.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.expr.Expression#getLogicLanguage <em>Logic Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Language</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression#getLogicLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_LogicLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.expr.Expression#getExpressionBody <em>Expression Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Body</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression#getExpressionBody()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExpressionBody();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.expr.Expression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression#getId()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.expr.Expression#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.expr.Expression#getVersion()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Version();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.owls.expr.ExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Language</em>'.
	 * @see net.sf.ictalive.owls.expr.ExpressionLanguage
	 * @generated
	 */
	EEnum getExpressionLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExprFactory getExprFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.expr.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.expr.impl.ConditionImpl
		 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.expr.impl.ExpressionImpl
		 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Logic Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__LOGIC_LANGUAGE = eINSTANCE.getExpression_LogicLanguage();

		/**
		 * The meta object literal for the '<em><b>Expression Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSION_BODY = eINSTANCE.getExpression_ExpressionBody();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__ID = eINSTANCE.getExpression_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VERSION = eINSTANCE.getExpression_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.expr.ExpressionLanguage <em>Expression Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.expr.ExpressionLanguage
		 * @see net.sf.ictalive.owls.expr.impl.ExprPackageImpl#getExpressionLanguage()
		 * @generated
		 */
		EEnum EXPRESSION_LANGUAGE = eINSTANCE.getExpressionLanguage();

	}

} //ExprPackage
