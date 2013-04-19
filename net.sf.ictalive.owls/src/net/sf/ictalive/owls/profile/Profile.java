/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Result;

import net.sf.ictalive.owls.service.ServiceProfile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getTextDescription <em>Text Description</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHas_process <em>Has process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getServiceParameter <em>Service Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getServiceClassification <em>Service Classification</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.Profile#getServiceProduct <em>Service Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends ServiceProfile {
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
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Text Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Description</em>' attribute.
	 * @see #setTextDescription(String)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_TextDescription()
	 * @model
	 * @generated
	 */
	String getTextDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getTextDescription <em>Text Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Description</em>' attribute.
	 * @see #getTextDescription()
	 * @generated
	 */
	void setTextDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Information</em>' attribute.
	 * @see #setContactInformation(Object)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ContactInformation()
	 * @model
	 * @generated
	 */
	Object getContactInformation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getContactInformation <em>Contact Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Information</em>' attribute.
	 * @see #getContactInformation()
	 * @generated
	 */
	void setContactInformation(Object value);

	/**
	 * Returns the value of the '<em><b>Has process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has process</em>' reference.
	 * @see #setHas_process(net.sf.ictalive.owls.process.Process)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_Has_process()
	 * @model
	 * @generated
	 */
	net.sf.ictalive.owls.process.Process getHas_process();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHas_process <em>Has process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has process</em>' reference.
	 * @see #getHas_process()
	 * @generated
	 */
	void setHas_process(net.sf.ictalive.owls.process.Process value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ServiceCategory()
	 * @model
	 * @generated
	 */
	ServiceCategory getServiceCategory();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(ServiceCategory value);

	/**
	 * Returns the value of the '<em><b>Service Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Parameter</em>' reference.
	 * @see #setServiceParameter(ServiceParameter)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ServiceParameter()
	 * @model
	 * @generated
	 */
	ServiceParameter getServiceParameter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getServiceParameter <em>Service Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Parameter</em>' reference.
	 * @see #getServiceParameter()
	 * @generated
	 */
	void setServiceParameter(ServiceParameter value);

	/**
	 * Returns the value of the '<em><b>Has Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parameter</em>' reference.
	 * @see #setHasParameter(Parameter)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_HasParameter()
	 * @model
	 * @generated
	 */
	Parameter getHasParameter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHasParameter <em>Has Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Parameter</em>' reference.
	 * @see #getHasParameter()
	 * @generated
	 */
	void setHasParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' reference.
	 * @see #setHasInput(Input)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_HasInput()
	 * @model
	 * @generated
	 */
	Input getHasInput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHasInput <em>Has Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input</em>' reference.
	 * @see #getHasInput()
	 * @generated
	 */
	void setHasInput(Input value);

	/**
	 * Returns the value of the '<em><b>Has Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' reference.
	 * @see #setHasOutput(Output)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_HasOutput()
	 * @model
	 * @generated
	 */
	Output getHasOutput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHasOutput <em>Has Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output</em>' reference.
	 * @see #getHasOutput()
	 * @generated
	 */
	void setHasOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Has Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Precondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precondition</em>' reference.
	 * @see #setHasPrecondition(Condition)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_HasPrecondition()
	 * @model
	 * @generated
	 */
	Condition getHasPrecondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHasPrecondition <em>Has Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Precondition</em>' reference.
	 * @see #getHasPrecondition()
	 * @generated
	 */
	void setHasPrecondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Has Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' reference.
	 * @see #setHasResult(Result)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_HasResult()
	 * @model
	 * @generated
	 */
	Result getHasResult();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getHasResult <em>Has Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Result</em>' reference.
	 * @see #getHasResult()
	 * @generated
	 */
	void setHasResult(Result value);

	/**
	 * Returns the value of the '<em><b>Service Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Classification</em>' attribute.
	 * @see #setServiceClassification(String)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ServiceClassification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getServiceClassification();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getServiceClassification <em>Service Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Classification</em>' attribute.
	 * @see #getServiceClassification()
	 * @generated
	 */
	void setServiceClassification(String value);

	/**
	 * Returns the value of the '<em><b>Service Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Product</em>' attribute.
	 * @see #setServiceProduct(String)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getProfile_ServiceProduct()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getServiceProduct();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.Profile#getServiceProduct <em>Service Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Product</em>' attribute.
	 * @see #getServiceProduct()
	 * @generated
	 */
	void setServiceProduct(String value);

} // Profile
