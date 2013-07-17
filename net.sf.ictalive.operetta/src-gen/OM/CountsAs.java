/**
 */
package OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counts As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.CountsAs#getConcreteFact <em>Concrete Fact</em>}</li>
 *   <li>{@link OM.CountsAs#getAbstractFact <em>Abstract Fact</em>}</li>
 *   <li>{@link OM.CountsAs#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getCountsAs()
 * @model
 * @generated
 */
public interface CountsAs extends EObject
{
  /**
   * Returns the value of the '<em><b>Concrete Fact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Fact</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Fact</em>' reference.
   * @see #setConcreteFact(CountsAsConcreteFact)
   * @see OM.OMPackage#getCountsAs_ConcreteFact()
   * @model required="true"
   * @generated
   */
  CountsAsConcreteFact getConcreteFact();

  /**
   * Sets the value of the '{@link OM.CountsAs#getConcreteFact <em>Concrete Fact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Fact</em>' reference.
   * @see #getConcreteFact()
   * @generated
   */
  void setConcreteFact(CountsAsConcreteFact value);

  /**
   * Returns the value of the '<em><b>Abstract Fact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Fact</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Fact</em>' reference.
   * @see #setAbstractFact(PartialStateDescription)
   * @see OM.OMPackage#getCountsAs_AbstractFact()
   * @model required="true"
   * @generated
   */
  PartialStateDescription getAbstractFact();

  /**
   * Sets the value of the '{@link OM.CountsAs#getAbstractFact <em>Abstract Fact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Fact</em>' reference.
   * @see #getAbstractFact()
   * @generated
   */
  void setAbstractFact(PartialStateDescription value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(Context)
   * @see OM.OMPackage#getCountsAs_Context()
   * @model
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link OM.CountsAs#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

} // CountsAs
