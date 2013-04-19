/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.Binding;
import control.ControlConstruct;
import control.ControlPackage;
import control.Expr;
import control.Input;
import control.Link;
import control.Loc;
import control.Ontology;
import control.OuterProcess;
import control.Output;
import control.Result;

import control.TemplateConstraint;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.OuterProcessImpl#getConstruct <em>Construct</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getOuterLocals <em>Outer Locals</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getOuterLinks <em>Outer Links</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getOntologies <em>Ontologies</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getTemplateConstraints <em>Template Constraints</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link control.impl.OuterProcessImpl#getServiceDescription <em>Service Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OuterProcessImpl extends NamedElementImpl implements OuterProcess
{
  /**
	 * The cached value of the '{@link #getConstruct() <em>Construct</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConstruct()
	 * @generated
	 * @ordered
	 */
  protected ControlConstruct construct;

  /**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
  protected EList<Input> hasInput;

  /**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
  protected EList<Output> hasOutput;

  /**
	 * The cached value of the '{@link #getHasPrecondition() <em>Has Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasPrecondition()
	 * @generated
	 * @ordered
	 */
  protected EList<Expr> hasPrecondition;

  /**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
  protected EList<Result> hasResult;

  /**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
  protected EList<Binding> bindings;

  /**
	 * The cached value of the '{@link #getOuterLocals() <em>Outer Locals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOuterLocals()
	 * @generated
	 * @ordered
	 */
  protected EList<Loc> outerLocals;

  /**
	 * The cached value of the '{@link #getOuterLinks() <em>Outer Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOuterLinks()
	 * @generated
	 * @ordered
	 */
  protected EList<Link> outerLinks;

  /**
	 * The cached value of the '{@link #getOntologies() <em>Ontologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontology> ontologies;

		/**
	 * The cached value of the '{@link #getTemplateConstraints() <em>Template Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateConstraints()
	 * @generated
	 * @ordered
	 */
	protected TemplateConstraint templateConstraints;

		/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

		/**
	 * The default value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
  protected static final String SERVICE_URI_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
  protected String serviceURI = SERVICE_URI_EDEFAULT;

  /**
	 * The default value of the '{@link #getServiceDescription() <em>Service Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String SERVICE_DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getServiceDescription() <em>Service Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceDescription()
	 * @generated
	 * @ordered
	 */
  protected String serviceDescription = SERVICE_DESCRIPTION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OuterProcessImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ControlPackage.Literals.OUTER_PROCESS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstruct getConstruct()
  {
		return construct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetConstruct(ControlConstruct newConstruct, NotificationChain msgs)
  {
		ControlConstruct oldConstruct = construct;
		construct = newConstruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__CONSTRUCT, oldConstruct, newConstruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConstruct(ControlConstruct newConstruct)
  {
		if (newConstruct != construct) {
			NotificationChain msgs = null;
			if (construct != null)
				msgs = ((InternalEObject)construct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.OUTER_PROCESS__CONSTRUCT, null, msgs);
			if (newConstruct != null)
				msgs = ((InternalEObject)newConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.OUTER_PROCESS__CONSTRUCT, null, msgs);
			msgs = basicSetConstruct(newConstruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__CONSTRUCT, newConstruct, newConstruct));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Input> getHasInput()
  {
		if (hasInput == null) {
			hasInput = new EObjectContainmentEList<Input>(Input.class, this, ControlPackage.OUTER_PROCESS__HAS_INPUT);
		}
		return hasInput;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Output> getHasOutput()
  {
		if (hasOutput == null) {
			hasOutput = new EObjectContainmentEList<Output>(Output.class, this, ControlPackage.OUTER_PROCESS__HAS_OUTPUT);
		}
		return hasOutput;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Expr> getHasPrecondition()
  {
		if (hasPrecondition == null) {
			hasPrecondition = new EObjectContainmentEList<Expr>(Expr.class, this, ControlPackage.OUTER_PROCESS__HAS_PRECONDITION);
		}
		return hasPrecondition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Result> getHasResult()
  {
		if (hasResult == null) {
			hasResult = new EObjectContainmentEList<Result>(Result.class, this, ControlPackage.OUTER_PROCESS__HAS_RESULT);
		}
		return hasResult;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Binding> getBindings()
  {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, ControlPackage.OUTER_PROCESS__BINDINGS);
		}
		return bindings;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Loc> getOuterLocals()
  {
		if (outerLocals == null) {
			outerLocals = new EObjectContainmentEList<Loc>(Loc.class, this, ControlPackage.OUTER_PROCESS__OUTER_LOCALS);
		}
		return outerLocals;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getOuterLinks()
  {
		if (outerLinks == null) {
			outerLinks = new EObjectContainmentEList<Link>(Link.class, this, ControlPackage.OUTER_PROCESS__OUTER_LINKS);
		}
		return outerLinks;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontology> getOntologies() {
		if (ontologies == null) {
			ontologies = new EObjectContainmentEList<Ontology>(Ontology.class, this, ControlPackage.OUTER_PROCESS__ONTOLOGIES);
		}
		return ontologies;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateConstraint getTemplateConstraints() {
		return templateConstraints;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateConstraints(TemplateConstraint newTemplateConstraints, NotificationChain msgs) {
		TemplateConstraint oldTemplateConstraints = templateConstraints;
		templateConstraints = newTemplateConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS, oldTemplateConstraints, newTemplateConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateConstraints(TemplateConstraint newTemplateConstraints) {
		if (newTemplateConstraints != templateConstraints) {
			NotificationChain msgs = null;
			if (templateConstraints != null)
				msgs = ((InternalEObject)templateConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS, null, msgs);
			if (newTemplateConstraints != null)
				msgs = ((InternalEObject)newTemplateConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS, null, msgs);
			msgs = basicSetTemplateConstraints(newTemplateConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS, newTemplateConstraints, newTemplateConstraints));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__SERVICE_NAME, oldServiceName, serviceName));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getServiceURI()
  {
		return serviceURI;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setServiceURI(String newServiceURI)
  {
		String oldServiceURI = serviceURI;
		serviceURI = newServiceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__SERVICE_URI, oldServiceURI, serviceURI));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getServiceDescription()
  {
		return serviceDescription;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setServiceDescription(String newServiceDescription)
  {
		String oldServiceDescription = serviceDescription;
		serviceDescription = newServiceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION, oldServiceDescription, serviceDescription));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
				return basicSetConstruct(null, msgs);
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
				return ((InternalEList<?>)getHasInput()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
				return ((InternalEList<?>)getHasOutput()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
				return ((InternalEList<?>)getHasPrecondition()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
				return ((InternalEList<?>)getHasResult()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
				return ((InternalEList<?>)getOuterLocals()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
				return ((InternalEList<?>)getOuterLinks()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
				return ((InternalEList<?>)getOntologies()).basicRemove(otherEnd, msgs);
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
				return basicSetTemplateConstraints(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
				return getConstruct();
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
				return getHasInput();
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
				return getHasOutput();
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
				return getHasPrecondition();
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
				return getHasResult();
			case ControlPackage.OUTER_PROCESS__BINDINGS:
				return getBindings();
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
				return getOuterLocals();
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
				return getOuterLinks();
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
				return getOntologies();
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
				return getTemplateConstraints();
			case ControlPackage.OUTER_PROCESS__SERVICE_NAME:
				return getServiceName();
			case ControlPackage.OUTER_PROCESS__SERVICE_URI:
				return getServiceURI();
			case ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION:
				return getServiceDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
				setConstruct((ControlConstruct)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
				getHasInput().clear();
				getHasInput().addAll((Collection<? extends Input>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
				getHasOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
				getHasPrecondition().clear();
				getHasPrecondition().addAll((Collection<? extends Expr>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
				getHasResult().clear();
				getHasResult().addAll((Collection<? extends Result>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
				getOuterLocals().clear();
				getOuterLocals().addAll((Collection<? extends Loc>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
				getOuterLinks().clear();
				getOuterLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
				getOntologies().clear();
				getOntologies().addAll((Collection<? extends Ontology>)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
				setTemplateConstraints((TemplateConstraint)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_URI:
				setServiceURI((String)newValue);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION:
				setServiceDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
				setConstruct((ControlConstruct)null);
				return;
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
				getHasInput().clear();
				return;
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
				return;
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
				getHasPrecondition().clear();
				return;
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
				getHasResult().clear();
				return;
			case ControlPackage.OUTER_PROCESS__BINDINGS:
				getBindings().clear();
				return;
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
				getOuterLocals().clear();
				return;
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
				getOuterLinks().clear();
				return;
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
				getOntologies().clear();
				return;
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
				setTemplateConstraints((TemplateConstraint)null);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_URI:
				setServiceURI(SERVICE_URI_EDEFAULT);
				return;
			case ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION:
				setServiceDescription(SERVICE_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ControlPackage.OUTER_PROCESS__CONSTRUCT:
				return construct != null;
			case ControlPackage.OUTER_PROCESS__HAS_INPUT:
				return hasInput != null && !hasInput.isEmpty();
			case ControlPackage.OUTER_PROCESS__HAS_OUTPUT:
				return hasOutput != null && !hasOutput.isEmpty();
			case ControlPackage.OUTER_PROCESS__HAS_PRECONDITION:
				return hasPrecondition != null && !hasPrecondition.isEmpty();
			case ControlPackage.OUTER_PROCESS__HAS_RESULT:
				return hasResult != null && !hasResult.isEmpty();
			case ControlPackage.OUTER_PROCESS__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case ControlPackage.OUTER_PROCESS__OUTER_LOCALS:
				return outerLocals != null && !outerLocals.isEmpty();
			case ControlPackage.OUTER_PROCESS__OUTER_LINKS:
				return outerLinks != null && !outerLinks.isEmpty();
			case ControlPackage.OUTER_PROCESS__ONTOLOGIES:
				return ontologies != null && !ontologies.isEmpty();
			case ControlPackage.OUTER_PROCESS__TEMPLATE_CONSTRAINTS:
				return templateConstraints != null;
			case ControlPackage.OUTER_PROCESS__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ControlPackage.OUTER_PROCESS__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? serviceURI != null : !SERVICE_URI_EDEFAULT.equals(serviceURI);
			case ControlPackage.OUTER_PROCESS__SERVICE_DESCRIPTION:
				return SERVICE_DESCRIPTION_EDEFAULT == null ? serviceDescription != null : !SERVICE_DESCRIPTION_EDEFAULT.equals(serviceDescription);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceURI: ");
		result.append(serviceURI);
		result.append(", serviceDescription: ");
		result.append(serviceDescription);
		result.append(')');
		return result.toString();
	}

} //OuterProcessImpl
