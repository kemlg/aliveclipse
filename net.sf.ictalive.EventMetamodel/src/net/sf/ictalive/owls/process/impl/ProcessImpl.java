/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import java.util.Collection;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Local;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.Result;

import net.sf.ictalive.owls.service.impl.ServiceModelImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasLocal <em>Has Local</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasClient <em>Has Client</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasParticipant <em>Has Participant</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProcessImpl#getPerformedByRole <em>Performed By Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ServiceModelImpl implements net.sf.ictalive.owls.process.Process
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasParameter() <em>Has Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> hasParameter;

	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> hasInput;

	/**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> hasOutput;

	/**
	 * The cached value of the '{@link #getHasLocal() <em>Has Local</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<Local> hasLocal;

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
	 * The cached value of the '{@link #getHasClient() <em>Has Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasClient()
	 * @generated
	 * @ordered
	 */
	protected Participant hasClient;

	/**
	 * The cached value of the '{@link #getHasParticipant() <em>Has Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParticipant()
	 * @generated
	 * @ordered
	 */
	protected Participant hasParticipant;

	/**
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected Participant performedBy;

	/**
	 * The cached value of the '{@link #getHasPrecondition() <em>Has Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Condition hasPrecondition;

	/**
	 * The cached value of the '{@link #getPerformedByRole() <em>Performed By Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedByRole()
	 * @generated
	 * @ordered
	 */
	protected EList<String> performedByRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl()
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
		return ProcessPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getHasParameter()
	{
		if (hasParameter == null)
		{
			hasParameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, ProcessPackage.PROCESS__HAS_PARAMETER);
		}
		return hasParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getHasInput()
	{
		if (hasInput == null)
		{
			hasInput = new EObjectResolvingEList<Input>(Input.class, this, ProcessPackage.PROCESS__HAS_INPUT);
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
		if (hasOutput == null)
		{
			hasOutput = new EObjectResolvingEList<Output>(Output.class, this, ProcessPackage.PROCESS__HAS_OUTPUT);
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Local> getHasLocal()
	{
		if (hasLocal == null)
		{
			hasLocal = new EObjectResolvingEList<Local>(Local.class, this, ProcessPackage.PROCESS__HAS_LOCAL);
		}
		return hasLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getHasResult()
	{
		if (hasResult == null)
		{
			hasResult = new EObjectContainmentEList<Result>(Result.class, this, ProcessPackage.PROCESS__HAS_RESULT);
		}
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getHasClient()
	{
		if (hasClient != null && hasClient.eIsProxy())
		{
			InternalEObject oldHasClient = (InternalEObject)hasClient;
			hasClient = (Participant)eResolveProxy(oldHasClient);
			if (hasClient != oldHasClient)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__HAS_CLIENT, oldHasClient, hasClient));
			}
		}
		return hasClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetHasClient()
	{
		return hasClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasClient(Participant newHasClient)
	{
		Participant oldHasClient = hasClient;
		hasClient = newHasClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__HAS_CLIENT, oldHasClient, hasClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getHasParticipant()
	{
		if (hasParticipant != null && hasParticipant.eIsProxy())
		{
			InternalEObject oldHasParticipant = (InternalEObject)hasParticipant;
			hasParticipant = (Participant)eResolveProxy(oldHasParticipant);
			if (hasParticipant != oldHasParticipant)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__HAS_PARTICIPANT, oldHasParticipant, hasParticipant));
			}
		}
		return hasParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetHasParticipant()
	{
		return hasParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasParticipant(Participant newHasParticipant)
	{
		Participant oldHasParticipant = hasParticipant;
		hasParticipant = newHasParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__HAS_PARTICIPANT, oldHasParticipant, hasParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getPerformedBy()
	{
		if (performedBy != null && performedBy.eIsProxy())
		{
			InternalEObject oldPerformedBy = (InternalEObject)performedBy;
			performedBy = (Participant)eResolveProxy(oldPerformedBy);
			if (performedBy != oldPerformedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__PERFORMED_BY, oldPerformedBy, performedBy));
			}
		}
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetPerformedBy()
	{
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedBy(Participant newPerformedBy)
	{
		Participant oldPerformedBy = performedBy;
		performedBy = newPerformedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__PERFORMED_BY, oldPerformedBy, performedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getHasPrecondition()
	{
		return hasPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPrecondition(Condition newHasPrecondition, NotificationChain msgs)
	{
		Condition oldHasPrecondition = hasPrecondition;
		hasPrecondition = newHasPrecondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__HAS_PRECONDITION, oldHasPrecondition, newHasPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPrecondition(Condition newHasPrecondition)
	{
		if (newHasPrecondition != hasPrecondition)
		{
			NotificationChain msgs = null;
			if (hasPrecondition != null)
				msgs = ((InternalEObject)hasPrecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__HAS_PRECONDITION, null, msgs);
			if (newHasPrecondition != null)
				msgs = ((InternalEObject)newHasPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__HAS_PRECONDITION, null, msgs);
			msgs = basicSetHasPrecondition(newHasPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__HAS_PRECONDITION, newHasPrecondition, newHasPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPerformedByRole()
	{
		if (performedByRole == null)
		{
			performedByRole = new EDataTypeUniqueEList<String>(String.class, this, ProcessPackage.PROCESS__PERFORMED_BY_ROLE);
		}
		return performedByRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ProcessPackage.PROCESS__HAS_RESULT:
				return ((InternalEList<?>)getHasResult()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS__HAS_PRECONDITION:
				return basicSetHasPrecondition(null, msgs);
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
		switch (featureID)
		{
			case ProcessPackage.PROCESS__NAME:
				return getName();
			case ProcessPackage.PROCESS__HAS_PARAMETER:
				return getHasParameter();
			case ProcessPackage.PROCESS__HAS_INPUT:
				return getHasInput();
			case ProcessPackage.PROCESS__HAS_OUTPUT:
				return getHasOutput();
			case ProcessPackage.PROCESS__HAS_LOCAL:
				return getHasLocal();
			case ProcessPackage.PROCESS__HAS_RESULT:
				return getHasResult();
			case ProcessPackage.PROCESS__HAS_CLIENT:
				if (resolve) return getHasClient();
				return basicGetHasClient();
			case ProcessPackage.PROCESS__HAS_PARTICIPANT:
				if (resolve) return getHasParticipant();
				return basicGetHasParticipant();
			case ProcessPackage.PROCESS__PERFORMED_BY:
				if (resolve) return getPerformedBy();
				return basicGetPerformedBy();
			case ProcessPackage.PROCESS__HAS_PRECONDITION:
				return getHasPrecondition();
			case ProcessPackage.PROCESS__PERFORMED_BY_ROLE:
				return getPerformedByRole();
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
		switch (featureID)
		{
			case ProcessPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_PARAMETER:
				getHasParameter().clear();
				getHasParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_INPUT:
				getHasInput().clear();
				getHasInput().addAll((Collection<? extends Input>)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
				getHasOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_LOCAL:
				getHasLocal().clear();
				getHasLocal().addAll((Collection<? extends Local>)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_RESULT:
				getHasResult().clear();
				getHasResult().addAll((Collection<? extends Result>)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_CLIENT:
				setHasClient((Participant)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_PARTICIPANT:
				setHasParticipant((Participant)newValue);
				return;
			case ProcessPackage.PROCESS__PERFORMED_BY:
				setPerformedBy((Participant)newValue);
				return;
			case ProcessPackage.PROCESS__HAS_PRECONDITION:
				setHasPrecondition((Condition)newValue);
				return;
			case ProcessPackage.PROCESS__PERFORMED_BY_ROLE:
				getPerformedByRole().clear();
				getPerformedByRole().addAll((Collection<? extends String>)newValue);
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
		switch (featureID)
		{
			case ProcessPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__HAS_PARAMETER:
				getHasParameter().clear();
				return;
			case ProcessPackage.PROCESS__HAS_INPUT:
				getHasInput().clear();
				return;
			case ProcessPackage.PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
				return;
			case ProcessPackage.PROCESS__HAS_LOCAL:
				getHasLocal().clear();
				return;
			case ProcessPackage.PROCESS__HAS_RESULT:
				getHasResult().clear();
				return;
			case ProcessPackage.PROCESS__HAS_CLIENT:
				setHasClient((Participant)null);
				return;
			case ProcessPackage.PROCESS__HAS_PARTICIPANT:
				setHasParticipant((Participant)null);
				return;
			case ProcessPackage.PROCESS__PERFORMED_BY:
				setPerformedBy((Participant)null);
				return;
			case ProcessPackage.PROCESS__HAS_PRECONDITION:
				setHasPrecondition((Condition)null);
				return;
			case ProcessPackage.PROCESS__PERFORMED_BY_ROLE:
				getPerformedByRole().clear();
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
		switch (featureID)
		{
			case ProcessPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.PROCESS__HAS_PARAMETER:
				return hasParameter != null && !hasParameter.isEmpty();
			case ProcessPackage.PROCESS__HAS_INPUT:
				return hasInput != null && !hasInput.isEmpty();
			case ProcessPackage.PROCESS__HAS_OUTPUT:
				return hasOutput != null && !hasOutput.isEmpty();
			case ProcessPackage.PROCESS__HAS_LOCAL:
				return hasLocal != null && !hasLocal.isEmpty();
			case ProcessPackage.PROCESS__HAS_RESULT:
				return hasResult != null && !hasResult.isEmpty();
			case ProcessPackage.PROCESS__HAS_CLIENT:
				return hasClient != null;
			case ProcessPackage.PROCESS__HAS_PARTICIPANT:
				return hasParticipant != null;
			case ProcessPackage.PROCESS__PERFORMED_BY:
				return performedBy != null;
			case ProcessPackage.PROCESS__HAS_PRECONDITION:
				return hasPrecondition != null;
			case ProcessPackage.PROCESS__PERFORMED_BY_ROLE:
				return performedByRole != null && !performedByRole.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", performedByRole: ");
		result.append(performedByRole);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
