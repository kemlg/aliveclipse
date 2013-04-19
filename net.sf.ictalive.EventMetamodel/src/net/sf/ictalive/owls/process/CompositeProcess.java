/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo <em>Collapses To</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#isInvocable <em>Invocable</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedInput <em>Computed Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedOutput <em>Computed Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedPrecondition <em>Computed Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedEffect <em>Computed Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess()
 * @model
 * @generated
 */
public interface CompositeProcess extends net.sf.ictalive.owls.process.Process
{
	/**
	 * Returns the value of the '<em><b>Collapses To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo <em>Expands To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapses To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapses To</em>' reference.
	 * @see #setCollapsesTo(SimpleProcess)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_CollapsesTo()
	 * @see net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo
	 * @model opposite="expandsTo"
	 * @generated
	 */
	SimpleProcess getCollapsesTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo <em>Collapses To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapses To</em>' reference.
	 * @see #getCollapsesTo()
	 * @generated
	 */
	void setCollapsesTo(SimpleProcess value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference.
	 * @see #setComposedOf(ControlConstruct)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_ComposedOf()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getComposedOf();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getComposedOf <em>Composed Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Of</em>' reference.
	 * @see #getComposedOf()
	 * @generated
	 */
	void setComposedOf(ControlConstruct value);

	/**
	 * Returns the value of the '<em><b>Invocable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocable</em>' attribute.
	 * @see #setInvocable(boolean)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_Invocable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isInvocable();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#isInvocable <em>Invocable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocable</em>' attribute.
	 * @see #isInvocable()
	 * @generated
	 */
	void setInvocable(boolean value);

	/**
	 * Returns the value of the '<em><b>Computed Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Input</em>' reference.
	 * @see #setComputedInput(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_ComputedInput()
	 * @model
	 * @generated
	 */
	EObject getComputedInput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedInput <em>Computed Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Input</em>' reference.
	 * @see #getComputedInput()
	 * @generated
	 */
	void setComputedInput(EObject value);

	/**
	 * Returns the value of the '<em><b>Computed Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Output</em>' reference.
	 * @see #setComputedOutput(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_ComputedOutput()
	 * @model
	 * @generated
	 */
	EObject getComputedOutput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedOutput <em>Computed Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Output</em>' reference.
	 * @see #getComputedOutput()
	 * @generated
	 */
	void setComputedOutput(EObject value);

	/**
	 * Returns the value of the '<em><b>Computed Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Precondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Precondition</em>' reference.
	 * @see #setComputedPrecondition(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_ComputedPrecondition()
	 * @model
	 * @generated
	 */
	EObject getComputedPrecondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedPrecondition <em>Computed Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Precondition</em>' reference.
	 * @see #getComputedPrecondition()
	 * @generated
	 */
	void setComputedPrecondition(EObject value);

	/**
	 * Returns the value of the '<em><b>Computed Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Effect</em>' reference.
	 * @see #setComputedEffect(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getCompositeProcess_ComputedEffect()
	 * @model
	 * @generated
	 */
	EObject getComputedEffect();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedEffect <em>Computed Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Effect</em>' reference.
	 * @see #getComputedEffect()
	 * @generated
	 */
	void setComputedEffect(EObject value);

} // CompositeProcess
