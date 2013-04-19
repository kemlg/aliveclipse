/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see control.ControlPackage
 * @generated
 */
public interface ControlFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ControlFactory eINSTANCE = control.impl.ControlFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
  NamedElement createNamedElement();

  /**
	 * Returns a new object of class '<em>Process Var</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Var</em>'.
	 * @generated
	 */
  ProcessVar createProcessVar();

  /**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

		/**
	 * Returns a new object of class '<em>Template Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Constraint</em>'.
	 * @generated
	 */
	TemplateConstraint createTemplateConstraint();

		/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
  Input createInput();

  /**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
  Output createOutput();

  /**
	 * Returns a new object of class '<em>Outer Process</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outer Process</em>'.
	 * @generated
	 */
  OuterProcess createOuterProcess();

  /**
	 * Returns a new object of class '<em>Remote Process</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Process</em>'.
	 * @generated
	 */
  RemoteProcess createRemoteProcess();

  /**
	 * Returns a new object of class '<em>Template Process</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Process</em>'.
	 * @generated
	 */
  TemplateProcess createTemplateProcess();

  /**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
  Sequence createSequence();

  /**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
  Choice createChoice();

  /**
	 * Returns a new object of class '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Order</em>'.
	 * @generated
	 */
  AnyOrder createAnyOrder();

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
	 * Returns a new object of class '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else</em>'.
	 * @generated
	 */
  IfThenElse createIfThenElse();

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
	 * Returns a new object of class '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform</em>'.
	 * @generated
	 */
  Perform createPerform();

  /**
	 * Returns a new object of class '<em>Produce</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produce</em>'.
	 * @generated
	 */
  Produce createProduce();

  /**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
  Set createSet();

  /**
	 * Returns a new object of class '<em>Value Source</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Source</em>'.
	 * @generated
	 */
  ValueSource createValueSource();

  /**
	 * Returns a new object of class '<em>Value Form</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Form</em>'.
	 * @generated
	 */
  ValueForm createValueForm();

  /**
	 * Returns a new object of class '<em>Value Function</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Function</em>'.
	 * @generated
	 */
  ValueFunction createValueFunction();

  /**
	 * Returns a new object of class '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Binding</em>'.
	 * @generated
	 */
  InputBinding createInputBinding();

  /**
	 * Returns a new object of class '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Binding</em>'.
	 * @generated
	 */
  OutputBinding createOutputBinding();

  /**
	 * Returns a new object of class '<em>Loc Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc Binding</em>'.
	 * @generated
	 */
  LocBinding createLocBinding();

  /**
	 * Returns a new object of class '<em>Link Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Binding</em>'.
	 * @generated
	 */
  LinkBinding createLinkBinding();

  /**
	 * Returns a new object of class '<em>output Binding Source</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>output Binding Source</em>'.
	 * @generated
	 */
  outputBindingSource createoutputBindingSource();

  /**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
  Result createResult();

  /**
	 * Returns a new object of class '<em>Result Var</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Var</em>'.
	 * @generated
	 */
  ResultVar createResultVar();

  /**
	 * Returns a new object of class '<em>Local</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local</em>'.
	 * @generated
	 */
  Local createLocal();

  /**
	 * Returns a new object of class '<em>Loc</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc</em>'.
	 * @generated
	 */
  Loc createLoc();

  /**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
  Link createLink();

  /**
	 * Returns a new object of class '<em>Construct Bag</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Construct Bag</em>'.
	 * @generated
	 */
  ControlConstructBag createControlConstructBag();

  /**
	 * Returns a new object of class '<em>Construct List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Construct List</em>'.
	 * @generated
	 */
  ControlConstructList createControlConstructList();

  /**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
  Condition createCondition();

  /**
	 * Returns a new object of class '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expr</em>'.
	 * @generated
	 */
  Expr createExpr();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ControlPackage getControlPackage();

} //ControlFactory
