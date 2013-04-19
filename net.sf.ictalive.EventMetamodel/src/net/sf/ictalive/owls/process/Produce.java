/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.Produce#getProducedBinding <em>Produced Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getProduce()
 * @model
 * @generated
 */
public interface Produce extends ControlConstruct
{
	/**
	 * Returns the value of the '<em><b>Produced Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Binding</em>' reference.
	 * @see #setProducedBinding(OutputBinding)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProduce_ProducedBinding()
	 * @model
	 * @generated
	 */
	OutputBinding getProducedBinding();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Produce#getProducedBinding <em>Produced Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced Binding</em>' reference.
	 * @see #getProducedBinding()
	 * @generated
	 */
	void setProducedBinding(OutputBinding value);

} // Produce
