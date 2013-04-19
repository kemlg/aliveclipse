/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outer Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.OuterProcess#getConstruct <em>Construct</em>}</li>
 *   <li>{@link control.OuterProcess#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link control.OuterProcess#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link control.OuterProcess#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link control.OuterProcess#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link control.OuterProcess#getBindings <em>Bindings</em>}</li>
 *   <li>{@link control.OuterProcess#getOuterLocals <em>Outer Locals</em>}</li>
 *   <li>{@link control.OuterProcess#getOuterLinks <em>Outer Links</em>}</li>
 *   <li>{@link control.OuterProcess#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link control.OuterProcess#getTemplateConstraints <em>Template Constraints</em>}</li>
 *   <li>{@link control.OuterProcess#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link control.OuterProcess#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link control.OuterProcess#getServiceDescription <em>Service Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getOuterProcess()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface OuterProcess extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Construct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Construct</em>' containment reference.
	 * @see #setConstruct(ControlConstruct)
	 * @see control.ControlPackage#getOuterProcess_Construct()
	 * @model containment="true"
	 * @generated
	 */
  ControlConstruct getConstruct();

  /**
	 * Sets the value of the '{@link control.OuterProcess#getConstruct <em>Construct</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construct</em>' containment reference.
	 * @see #getConstruct()
	 * @generated
	 */
  void setConstruct(ControlConstruct value);

  /**
	 * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
	 * The list contents are of type {@link control.Input}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_HasInput()
	 * @model containment="true"
	 * @generated
	 */
  EList<Input> getHasInput();

  /**
	 * Returns the value of the '<em><b>Has Output</b></em>' containment reference list.
	 * The list contents are of type {@link control.Output}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_HasOutput()
	 * @model containment="true"
	 * @generated
	 */
  EList<Output> getHasOutput();

  /**
	 * Returns the value of the '<em><b>Has Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link control.Expr}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Precondition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precondition</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_HasPrecondition()
	 * @model containment="true"
	 * @generated
	 */
  EList<Expr> getHasPrecondition();

  /**
	 * Returns the value of the '<em><b>Has Result</b></em>' containment reference list.
	 * The list contents are of type {@link control.Result}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_HasResult()
	 * @model containment="true"
	 * @generated
	 */
  EList<Result> getHasResult();

  /**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link control.Binding}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_Bindings()
	 * @model containment="true"
	 * @generated
	 */
  EList<Binding> getBindings();

  /**
	 * Returns the value of the '<em><b>Outer Locals</b></em>' containment reference list.
	 * The list contents are of type {@link control.Loc}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outer Locals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Locals</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_OuterLocals()
	 * @model containment="true"
	 * @generated
	 */
  EList<Loc> getOuterLocals();

  /**
	 * Returns the value of the '<em><b>Outer Links</b></em>' containment reference list.
	 * The list contents are of type {@link control.Link}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outer Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Links</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_OuterLinks()
	 * @model containment="true"
	 * @generated
	 */
  EList<Link> getOuterLinks();

  /**
	 * Returns the value of the '<em><b>Ontologies</b></em>' containment reference list.
	 * The list contents are of type {@link control.Ontology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontologies</em>' containment reference list.
	 * @see control.ControlPackage#getOuterProcess_Ontologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ontology> getOntologies();

		/**
	 * Returns the value of the '<em><b>Template Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Constraints</em>' containment reference.
	 * @see #setTemplateConstraints(TemplateConstraint)
	 * @see control.ControlPackage#getOuterProcess_TemplateConstraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateConstraint getTemplateConstraints();

		/**
	 * Sets the value of the '{@link control.OuterProcess#getTemplateConstraints <em>Template Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Constraints</em>' containment reference.
	 * @see #getTemplateConstraints()
	 * @generated
	 */
	void setTemplateConstraints(TemplateConstraint value);

		/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see control.ControlPackage#getOuterProcess_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

		/**
	 * Sets the value of the '{@link control.OuterProcess#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

		/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute.
	 * @see #setServiceURI(String)
	 * @see control.ControlPackage#getOuterProcess_ServiceURI()
	 * @model
	 * @generated
	 */
  String getServiceURI();

  /**
	 * Sets the value of the '{@link control.OuterProcess#getServiceURI <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URI</em>' attribute.
	 * @see #getServiceURI()
	 * @generated
	 */
  void setServiceURI(String value);

  /**
	 * Returns the value of the '<em><b>Service Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Description</em>' attribute.
	 * @see #setServiceDescription(String)
	 * @see control.ControlPackage#getOuterProcess_ServiceDescription()
	 * @model
	 * @generated
	 */
  String getServiceDescription();

  /**
	 * Sets the value of the '{@link control.OuterProcess#getServiceDescription <em>Service Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description</em>' attribute.
	 * @see #getServiceDescription()
	 * @generated
	 */
  void setServiceDescription(String value);

} // OuterProcess
