/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.template.TemplatePackage
 * @generated
 */
public interface TemplateFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplateFactory eINSTANCE = net.sf.ictalive.service.template.impl.TemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Template</em>'.
	 * @generated
	 */
	ServiceTemplate createServiceTemplate();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	TemplateFlow createTemplateFlow();

	/**
	 * Returns a new object of class '<em>Ground Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Template</em>'.
	 * @generated
	 */
	GroundTemplate createGroundTemplate();

	/**
	 * Returns a new object of class '<em>Abstract Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Process Model</em>'.
	 * @generated
	 */
	AbstractProcessModel createAbstractProcessModel();

	/**
	 * Returns a new object of class '<em>Bound Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Template Parameter</em>'.
	 * @generated
	 */
	BoundTemplateParameter createBoundTemplateParameter();

	/**
	 * Returns a new object of class '<em>Bound Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Process Model</em>'.
	 * @generated
	 */
	BoundProcessModel createBoundProcessModel();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	TemplateConstraint createTemplateConstraint();

	/**
	 * Returns a new object of class '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Order</em>'.
	 * @generated
	 */
	AnyOrder createAnyOrder();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else</em>'.
	 * @generated
	 */
	IfThenElse createIfThenElse();

	/**
	 * Returns a new object of class '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform</em>'.
	 * @generated
	 */
	Perform createPerform();

	/**
	 * Returns a new object of class '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Until</em>'.
	 * @generated
	 */
	RepeatUntil createRepeatUntil();

	/**
	 * Returns a new object of class '<em>Repeat While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat While</em>'.
	 * @generated
	 */
	RepeatWhile createRepeatWhile();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split</em>'.
	 * @generated
	 */
	Split createSplit();

	/**
	 * Returns a new object of class '<em>Split Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Join</em>'.
	 * @generated
	 */
	SplitJoin createSplitJoin();

	/**
	 * Returns a new object of class '<em>Control Construct List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Construct List</em>'.
	 * @generated
	 */
	ControlConstructList createControlConstructList();

	/**
	 * Returns a new object of class '<em>Control Construct Bag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Construct Bag</em>'.
	 * @generated
	 */
	ControlConstructBag createControlConstructBag();

	/**
	 * Returns a new object of class '<em>Interval Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval Thing</em>'.
	 * @generated
	 */
	IntervalThing createIntervalThing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemplatePackage getTemplatePackage();

} //TemplateFactory
