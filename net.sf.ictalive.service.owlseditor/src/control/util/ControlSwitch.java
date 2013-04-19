/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.util;

import control.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see control.ControlPackage
 * @generated
 */
public class ControlSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ControlPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ControlPackage.eINSTANCE;
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public T doSwitch(EObject theEObject)
  {
		return doSwitch(theEObject.eClass(), theEObject);
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ControlPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.PROCESS_VAR: {
				ProcessVar processVar = (ProcessVar)theEObject;
				T result = caseProcessVar(processVar);
				if (result == null) result = caseNamedElement(processVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseProcessVar(parameter);
				if (result == null) result = caseValueSpecifier(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseNamedElement(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.TEMPLATE_CONSTRAINT: {
				TemplateConstraint templateConstraint = (TemplateConstraint)theEObject;
				T result = caseTemplateConstraint(templateConstraint);
				if (result == null) result = caseNamedElement(templateConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseParameter(input);
				if (result == null) result = caseProcessVar(input);
				if (result == null) result = caseValueSpecifier(input);
				if (result == null) result = caseNamedElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseParameter(output);
				if (result == null) result = caseProcessVar(output);
				if (result == null) result = caseValueSpecifier(output);
				if (result == null) result = caseNamedElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.OUTER_PROCESS: {
				OuterProcess outerProcess = (OuterProcess)theEObject;
				T result = caseOuterProcess(outerProcess);
				if (result == null) result = caseNamedElement(outerProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.ABSTRACT_PROCESS: {
				AbstractProcess abstractProcess = (AbstractProcess)theEObject;
				T result = caseAbstractProcess(abstractProcess);
				if (result == null) result = caseNamedElement(abstractProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.REMOTE_PROCESS: {
				RemoteProcess remoteProcess = (RemoteProcess)theEObject;
				T result = caseRemoteProcess(remoteProcess);
				if (result == null) result = caseAbstractProcess(remoteProcess);
				if (result == null) result = caseNamedElement(remoteProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.TEMPLATE_PROCESS: {
				TemplateProcess templateProcess = (TemplateProcess)theEObject;
				T result = caseTemplateProcess(templateProcess);
				if (result == null) result = caseAbstractProcess(templateProcess);
				if (result == null) result = caseNamedElement(templateProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CONTROL_CONSTRUCT: {
				ControlConstruct controlConstruct = (ControlConstruct)theEObject;
				T result = caseControlConstruct(controlConstruct);
				if (result == null) result = caseNamedElement(controlConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseControlConstruct(sequence);
				if (result == null) result = caseNamedElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseControlConstruct(choice);
				if (result == null) result = caseNamedElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.ANY_ORDER: {
				AnyOrder anyOrder = (AnyOrder)theEObject;
				T result = caseAnyOrder(anyOrder);
				if (result == null) result = caseControlConstruct(anyOrder);
				if (result == null) result = caseNamedElement(anyOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseControlConstruct(split);
				if (result == null) result = caseNamedElement(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.SPLIT_JOIN: {
				SplitJoin splitJoin = (SplitJoin)theEObject;
				T result = caseSplitJoin(splitJoin);
				if (result == null) result = caseControlConstruct(splitJoin);
				if (result == null) result = caseNamedElement(splitJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.IF_THEN_ELSE: {
				IfThenElse ifThenElse = (IfThenElse)theEObject;
				T result = caseIfThenElse(ifThenElse);
				if (result == null) result = caseControlConstruct(ifThenElse);
				if (result == null) result = caseNamedElement(ifThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.REPEAT_UNTIL: {
				RepeatUntil repeatUntil = (RepeatUntil)theEObject;
				T result = caseRepeatUntil(repeatUntil);
				if (result == null) result = caseControlConstruct(repeatUntil);
				if (result == null) result = caseNamedElement(repeatUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.REPEAT_WHILE: {
				RepeatWhile repeatWhile = (RepeatWhile)theEObject;
				T result = caseRepeatWhile(repeatWhile);
				if (result == null) result = caseControlConstruct(repeatWhile);
				if (result == null) result = caseNamedElement(repeatWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.PERFORM: {
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseControlConstruct(perform);
				if (result == null) result = caseNamedElement(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.PRODUCE: {
				Produce produce = (Produce)theEObject;
				T result = caseProduce(produce);
				if (result == null) result = caseControlConstruct(produce);
				if (result == null) result = caseNamedElement(produce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseControlConstruct(set);
				if (result == null) result = caseNamedElement(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.VALUE_SPECIFIER: {
				ValueSpecifier valueSpecifier = (ValueSpecifier)theEObject;
				T result = caseValueSpecifier(valueSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.VALUE_SPECIFIER_ELEMENT: {
				ValueSpecifierElement valueSpecifierElement = (ValueSpecifierElement)theEObject;
				T result = caseValueSpecifierElement(valueSpecifierElement);
				if (result == null) result = caseValueSpecifier(valueSpecifierElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.VALUE_SOURCE: {
				ValueSource valueSource = (ValueSource)theEObject;
				T result = caseValueSource(valueSource);
				if (result == null) result = caseNamedElement(valueSource);
				if (result == null) result = caseValueSpecifierElement(valueSource);
				if (result == null) result = caseValueSpecifier(valueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.VALUE_FORM: {
				ValueForm valueForm = (ValueForm)theEObject;
				T result = caseValueForm(valueForm);
				if (result == null) result = caseNamedElement(valueForm);
				if (result == null) result = caseValueSpecifierElement(valueForm);
				if (result == null) result = caseValueSpecifier(valueForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.VALUE_FUNCTION: {
				ValueFunction valueFunction = (ValueFunction)theEObject;
				T result = caseValueFunction(valueFunction);
				if (result == null) result = caseNamedElement(valueFunction);
				if (result == null) result = caseValueSpecifierElement(valueFunction);
				if (result == null) result = caseValueSpecifier(valueFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseProcessVar(binding);
				if (result == null) result = caseNamedElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.SET_BINDING: {
				SetBinding setBinding = (SetBinding)theEObject;
				T result = caseSetBinding(setBinding);
				if (result == null) result = caseBinding(setBinding);
				if (result == null) result = caseProcessVar(setBinding);
				if (result == null) result = caseNamedElement(setBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.INPUT_BINDING: {
				InputBinding inputBinding = (InputBinding)theEObject;
				T result = caseInputBinding(inputBinding);
				if (result == null) result = caseBinding(inputBinding);
				if (result == null) result = caseProcessVar(inputBinding);
				if (result == null) result = caseNamedElement(inputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.OUTPUT_BINDING: {
				OutputBinding outputBinding = (OutputBinding)theEObject;
				T result = caseOutputBinding(outputBinding);
				if (result == null) result = caseBinding(outputBinding);
				if (result == null) result = caseProcessVar(outputBinding);
				if (result == null) result = caseNamedElement(outputBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.LOC_BINDING: {
				LocBinding locBinding = (LocBinding)theEObject;
				T result = caseLocBinding(locBinding);
				if (result == null) result = caseSetBinding(locBinding);
				if (result == null) result = caseBinding(locBinding);
				if (result == null) result = caseProcessVar(locBinding);
				if (result == null) result = caseNamedElement(locBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.LINK_BINDING: {
				LinkBinding linkBinding = (LinkBinding)theEObject;
				T result = caseLinkBinding(linkBinding);
				if (result == null) result = caseBinding(linkBinding);
				if (result == null) result = caseProcessVar(linkBinding);
				if (result == null) result = caseNamedElement(linkBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.OUTPUT_BINDING_SOURCE: {
				outputBindingSource outputBindingSource = (outputBindingSource)theEObject;
				T result = caseoutputBindingSource(outputBindingSource);
				if (result == null) result = caseBinding(outputBindingSource);
				if (result == null) result = caseProcessVar(outputBindingSource);
				if (result == null) result = caseNamedElement(outputBindingSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = caseNamedElement(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case ControlPackage.RESULT_VAR: {
				ResultVar resultVar = (ResultVar)theEObject;
				T result = caseResultVar(resultVar);
				if (result == null) result = caseProcessVar(resultVar);
				if (result == null) result = caseNamedElement(resultVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.LOCAL: {
				Local local = (Local)theEObject;
				T result = caseLocal(local);
				if (result == null) result = caseProcessVar(local);
				if (result == null) result = caseNamedElement(local);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.LOC: {
				Loc loc = (Loc)theEObject;
				T result = caseLoc(loc);
				if (result == null) result = caseLocal(loc);
				if (result == null) result = caseProcessVar(loc);
				if (result == null) result = caseNamedElement(loc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseProcessVar(link);
				if (result == null) result = caseNamedElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CONTROL_CONSTRUCT_BAG: {
				ControlConstructBag controlConstructBag = (ControlConstructBag)theEObject;
				T result = caseControlConstructBag(controlConstructBag);
				if (result == null) result = caseNamedElement(controlConstructBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CONTROL_CONSTRUCT_LIST: {
				ControlConstructList controlConstructList = (ControlConstructList)theEObject;
				T result = caseControlConstructList(controlConstructList);
				if (result == null) result = caseNamedElement(controlConstructList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseExpr(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.EXPR: {
				Expr expr = (Expr)theEObject;
				T result = caseExpr(expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamedElement(NamedElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Process Var</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcessVar(ProcessVar object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseParameter(Parameter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateConstraint(TemplateConstraint object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInput(Input object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOutput(Output object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Outer Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outer Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOuterProcess(OuterProcess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractProcess(AbstractProcess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRemoteProcess(RemoteProcess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Template Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTemplateProcess(TemplateProcess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseControlConstruct(ControlConstruct object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSequence(Sequence object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseChoice(Choice object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnyOrder(AnyOrder object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSplit(Split object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSplitJoin(SplitJoin object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIfThenElse(IfThenElse object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRepeatUntil(RepeatUntil object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRepeatWhile(RepeatWhile object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePerform(Perform object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Produce</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProduce(Produce object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSet(Set object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specifier</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValueSpecifier(ValueSpecifier object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specifier Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specifier Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValueSpecifierElement(ValueSpecifierElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Source</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValueSource(ValueSource object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Form</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValueForm(ValueForm object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Function</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValueFunction(ValueFunction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBinding(Binding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Set Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSetBinding(SetBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInputBinding(InputBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOutputBinding(OutputBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Loc Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLocBinding(LocBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Link Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLinkBinding(LinkBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>output Binding Source</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>output Binding Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseoutputBindingSource(outputBindingSource object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResult(Result object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Result Var</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResultVar(ResultVar object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Local</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLocal(Local object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Loc</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLoc(Loc object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLink(Link object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Construct Bag</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseControlConstructBag(ControlConstructBag object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Construct List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseControlConstructList(ControlConstructList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCondition(Condition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExpr(Expr object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ControlSwitch
