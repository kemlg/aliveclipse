/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.sf.ictalive.service.semantics.SemanticsFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semantics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/serviceLevel/semantics/0.5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticsPackage eINSTANCE = net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl <em>Service Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceProfileImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceProfile()
	 * @generated
	 */
	int SERVICE_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Presented By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__PRESENTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Has Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__HAS_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__SERVICE_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__HAS_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__HAS_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__HAS_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Has Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__HAS_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Service Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE__SERVICE_CLASSIFICATION = 8;

	/**
	 * The number of structural features of the '<em>Service Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROFILE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl <em>Service Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceGrounding()
	 * @generated
	 */
	int SERVICE_GROUNDING = 1;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__SUPPORTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__PROCESS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__NAME = 3;

	/**
	 * The feature id for the '<em><b>Bind Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING__BIND_PARAMS = 4;

	/**
	 * The number of structural features of the '<em>Service Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GROUNDING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.IOEPImpl <em>IOEP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.IOEPImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getIOEP()
	 * @generated
	 */
	int IOEP = 9;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOEP__HAS_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Has Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOEP__HAS_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOEP__HAS_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOEP__HAS_RESULT = 3;

	/**
	 * The number of structural features of the '<em>IOEP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOEP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ProcessModelImpl <em>Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ProcessModelImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getProcessModel()
	 * @generated
	 */
	int PROCESS_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__HAS_INPUT = IOEP__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__HAS_CONDITION = IOEP__HAS_CONDITION;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__HAS_OUTPUT = IOEP__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__HAS_RESULT = IOEP__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__NAME = IOEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__DESCRIBES = IOEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FEATURE_COUNT = IOEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceCategoryImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__TAXONOMY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__CODE = 3;

	/**
	 * The number of structural features of the '<em>Service Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceParameterImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceParameter()
	 * @generated
	 */
	int SERVICE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Service Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceInputImpl <em>Service Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceInputImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceInput()
	 * @generated
	 */
	int SERVICE_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INPUT__TYPE = SERVICE_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INPUT__NAME = SERVICE_PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Service Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INPUT_FEATURE_COUNT = SERVICE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceOutputImpl <em>Service Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceOutputImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceOutput()
	 * @generated
	 */
	int SERVICE_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT__TYPE = SERVICE_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT__NAME = SERVICE_PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Service Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_FEATURE_COUNT = SERVICE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceConditionImpl <em>Service Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceConditionImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceCondition()
	 * @generated
	 */
	int SERVICE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Service Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.impl.ServiceResultImpl <em>Service Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.impl.ServiceResultImpl
	 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceResult()
	 * @generated
	 */
	int SERVICE_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESULT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESULT__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Service Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESULT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceProfile <em>Service Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Profile</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile
	 * @generated
	 */
	EClass getServiceProfile();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy <em>Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Presented By</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_PresentedBy();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasProcess <em>Has Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Process</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getHasProcess()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_HasProcess();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Category</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getServiceCategory()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_ServiceCategory();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getName()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EAttribute getServiceProfile_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Input</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getHasInput()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_HasInput();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Output</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getHasOutput()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_HasOutput();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Result</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getHasResult()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_HasResult();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasCondition <em>Has Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Condition</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getHasCondition()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EReference getServiceProfile_HasCondition();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceClassification <em>Service Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Classification</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getServiceClassification()
	 * @see #getServiceProfile()
	 * @generated
	 */
	EAttribute getServiceProfile_ServiceClassification();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceGrounding <em>Service Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Grounding</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding
	 * @generated
	 */
	EClass getServiceGrounding();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supported By</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EReference getServiceGrounding_SupportedBy();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Model</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getProcessModel()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EReference getServiceGrounding_ProcessModel();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getInterface()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EReference getServiceGrounding_Interface();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getName()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EAttribute getServiceGrounding_Name();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getBindParams <em>Bind Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bind Params</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getBindParams()
	 * @see #getServiceGrounding()
	 * @generated
	 */
	EAttribute getServiceGrounding_BindParams();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Model</em>'.
	 * @see net.sf.ictalive.service.semantics.ProcessModel
	 * @generated
	 */
	EClass getProcessModel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ProcessModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.ProcessModel#getName()
	 * @see #getProcessModel()
	 * @generated
	 */
	EAttribute getProcessModel_Name();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.service.semantics.ProcessModel#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Describes</em>'.
	 * @see net.sf.ictalive.service.semantics.ProcessModel#getDescribes()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Describes();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Category</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory
	 * @generated
	 */
	EClass getServiceCategory();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceCategory#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxonomy</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory#getTaxonomy()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Taxonomy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceCategory#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory#getValue()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory#getName()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceCategory#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory#getCode()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Code();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Parameter</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceParameter
	 * @generated
	 */
	EClass getServiceParameter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.ServiceParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceParameter#getType()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EReference getServiceParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.ServiceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceParameter#getName()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EAttribute getServiceParameter_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceInput <em>Service Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Input</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceInput
	 * @generated
	 */
	EClass getServiceInput();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceOutput <em>Service Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Output</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceOutput
	 * @generated
	 */
	EClass getServiceOutput();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceCondition <em>Service Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Condition</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCondition
	 * @generated
	 */
	EClass getServiceCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.ServiceCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceCondition#getExpression()
	 * @see #getServiceCondition()
	 * @generated
	 */
	EReference getServiceCondition_Expression();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.ServiceResult <em>Service Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Result</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceResult
	 * @generated
	 */
	EClass getServiceResult();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.ServiceResult#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceResult#getExpression()
	 * @see #getServiceResult()
	 * @generated
	 */
	EReference getServiceResult_Expression();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.ServiceResult#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see net.sf.ictalive.service.semantics.ServiceResult#getResult()
	 * @see #getServiceResult()
	 * @generated
	 */
	EReference getServiceResult_Result();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.IOEP <em>IOEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOEP</em>'.
	 * @see net.sf.ictalive.service.semantics.IOEP
	 * @generated
	 */
	EClass getIOEP();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.semantics.IOEP#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input</em>'.
	 * @see net.sf.ictalive.service.semantics.IOEP#getHasInput()
	 * @see #getIOEP()
	 * @generated
	 */
	EReference getIOEP_HasInput();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.semantics.IOEP#getHasCondition <em>Has Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Condition</em>'.
	 * @see net.sf.ictalive.service.semantics.IOEP#getHasCondition()
	 * @see #getIOEP()
	 * @generated
	 */
	EReference getIOEP_HasCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.semantics.IOEP#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output</em>'.
	 * @see net.sf.ictalive.service.semantics.IOEP#getHasOutput()
	 * @see #getIOEP()
	 * @generated
	 */
	EReference getIOEP_HasOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.semantics.IOEP#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Result</em>'.
	 * @see net.sf.ictalive.service.semantics.IOEP#getHasResult()
	 * @see #getIOEP()
	 * @generated
	 */
	EReference getIOEP_HasResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticsFactory getSemanticsFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl <em>Service Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceProfileImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceProfile()
		 * @generated
		 */
		EClass SERVICE_PROFILE = eINSTANCE.getServiceProfile();

		/**
		 * The meta object literal for the '<em><b>Presented By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__PRESENTED_BY = eINSTANCE.getServiceProfile_PresentedBy();

		/**
		 * The meta object literal for the '<em><b>Has Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__HAS_PROCESS = eINSTANCE.getServiceProfile_HasProcess();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__SERVICE_CATEGORY = eINSTANCE.getServiceProfile_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROFILE__NAME = eINSTANCE.getServiceProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__HAS_INPUT = eINSTANCE.getServiceProfile_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__HAS_OUTPUT = eINSTANCE.getServiceProfile_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Has Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__HAS_RESULT = eINSTANCE.getServiceProfile_HasResult();

		/**
		 * The meta object literal for the '<em><b>Has Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROFILE__HAS_CONDITION = eINSTANCE.getServiceProfile_HasCondition();

		/**
		 * The meta object literal for the '<em><b>Service Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROFILE__SERVICE_CLASSIFICATION = eINSTANCE.getServiceProfile_ServiceClassification();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl <em>Service Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceGrounding()
		 * @generated
		 */
		EClass SERVICE_GROUNDING = eINSTANCE.getServiceGrounding();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUNDING__SUPPORTED_BY = eINSTANCE.getServiceGrounding_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUNDING__PROCESS_MODEL = eINSTANCE.getServiceGrounding_ProcessModel();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GROUNDING__INTERFACE = eINSTANCE.getServiceGrounding_Interface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_GROUNDING__NAME = eINSTANCE.getServiceGrounding_Name();

		/**
		 * The meta object literal for the '<em><b>Bind Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_GROUNDING__BIND_PARAMS = eINSTANCE.getServiceGrounding_BindParams();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ProcessModelImpl <em>Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ProcessModelImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getProcessModel()
		 * @generated
		 */
		EClass PROCESS_MODEL = eINSTANCE.getProcessModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODEL__NAME = eINSTANCE.getProcessModel_Name();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__DESCRIBES = eINSTANCE.getProcessModel_Describes();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceCategoryImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceCategory()
		 * @generated
		 */
		EClass SERVICE_CATEGORY = eINSTANCE.getServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__TAXONOMY = eINSTANCE.getServiceCategory_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__VALUE = eINSTANCE.getServiceCategory_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__NAME = eINSTANCE.getServiceCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__CODE = eINSTANCE.getServiceCategory_Code();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceParameterImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceParameter()
		 * @generated
		 */
		EClass SERVICE_PARAMETER = eINSTANCE.getServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PARAMETER__TYPE = eINSTANCE.getServiceParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PARAMETER__NAME = eINSTANCE.getServiceParameter_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceInputImpl <em>Service Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceInputImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceInput()
		 * @generated
		 */
		EClass SERVICE_INPUT = eINSTANCE.getServiceInput();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceOutputImpl <em>Service Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceOutputImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceOutput()
		 * @generated
		 */
		EClass SERVICE_OUTPUT = eINSTANCE.getServiceOutput();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceConditionImpl <em>Service Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceConditionImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceCondition()
		 * @generated
		 */
		EClass SERVICE_CONDITION = eINSTANCE.getServiceCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONDITION__EXPRESSION = eINSTANCE.getServiceCondition_Expression();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.ServiceResultImpl <em>Service Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.ServiceResultImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getServiceResult()
		 * @generated
		 */
		EClass SERVICE_RESULT = eINSTANCE.getServiceResult();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESULT__EXPRESSION = eINSTANCE.getServiceResult_Expression();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESULT__RESULT = eINSTANCE.getServiceResult_Result();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.impl.IOEPImpl <em>IOEP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.impl.IOEPImpl
		 * @see net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl#getIOEP()
		 * @generated
		 */
		EClass IOEP = eINSTANCE.getIOEP();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOEP__HAS_INPUT = eINSTANCE.getIOEP_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOEP__HAS_CONDITION = eINSTANCE.getIOEP_HasCondition();

		/**
		 * The meta object literal for the '<em><b>Has Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOEP__HAS_OUTPUT = eINSTANCE.getIOEP_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Has Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOEP__HAS_RESULT = eINSTANCE.getIOEP_HasResult();

	}

} //SemanticsPackage
