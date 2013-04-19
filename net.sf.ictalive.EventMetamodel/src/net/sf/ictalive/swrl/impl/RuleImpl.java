/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.impl;

import java.util.Collection;

import net.sf.ictalive.swrl.Annotation;
import net.sf.ictalive.swrl.Antecedent;
import net.sf.ictalive.swrl.Consequent;
import net.sf.ictalive.swrl.Rule;
import net.sf.ictalive.swrl.RuleType;
import net.sf.ictalive.swrl.SwrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.impl.RuleImpl#getURIReference <em>URI Reference</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.impl.RuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.impl.RuleImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.impl.RuleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.impl.RuleImpl#getHead <em>Head</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule
{
	/**
	 * The default value of the '{@link #getURIReference() <em>URI Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIReference()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURIReference() <em>URI Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIReference()
	 * @generated
	 * @ordered
	 */
	protected String uriReference = URI_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType TYPE_EDEFAULT = RuleType.IMPLIES;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Antecedent body;

	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Consequent head;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl()
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
		return SwrlPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURIReference()
	{
		return uriReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIReference(String newURIReference)
	{
		String oldURIReference = uriReference;
		uriReference = newURIReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__URI_REFERENCE, oldURIReference, uriReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RuleType newType)
	{
		RuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation()
	{
		if (annotation == null)
		{
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, SwrlPackage.RULE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Antecedent newBody, NotificationChain msgs)
	{
		Antecedent oldBody = body;
		body = newBody;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Antecedent newBody)
	{
		if (newBody != body)
		{
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.RULE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.RULE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequent getHead()
	{
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Consequent newHead, NotificationChain msgs)
	{
		Consequent oldHead = head;
		head = newHead;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Consequent newHead)
	{
		if (newHead != head)
		{
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.RULE__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.RULE__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.RULE__HEAD, newHead, newHead));
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
			case SwrlPackage.RULE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case SwrlPackage.RULE__BODY:
				return basicSetBody(null, msgs);
			case SwrlPackage.RULE__HEAD:
				return basicSetHead(null, msgs);
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
			case SwrlPackage.RULE__URI_REFERENCE:
				return getURIReference();
			case SwrlPackage.RULE__TYPE:
				return getType();
			case SwrlPackage.RULE__ANNOTATION:
				return getAnnotation();
			case SwrlPackage.RULE__BODY:
				return getBody();
			case SwrlPackage.RULE__HEAD:
				return getHead();
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
			case SwrlPackage.RULE__URI_REFERENCE:
				setURIReference((String)newValue);
				return;
			case SwrlPackage.RULE__TYPE:
				setType((RuleType)newValue);
				return;
			case SwrlPackage.RULE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SwrlPackage.RULE__BODY:
				setBody((Antecedent)newValue);
				return;
			case SwrlPackage.RULE__HEAD:
				setHead((Consequent)newValue);
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
			case SwrlPackage.RULE__URI_REFERENCE:
				setURIReference(URI_REFERENCE_EDEFAULT);
				return;
			case SwrlPackage.RULE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SwrlPackage.RULE__ANNOTATION:
				getAnnotation().clear();
				return;
			case SwrlPackage.RULE__BODY:
				setBody((Antecedent)null);
				return;
			case SwrlPackage.RULE__HEAD:
				setHead((Consequent)null);
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
			case SwrlPackage.RULE__URI_REFERENCE:
				return URI_REFERENCE_EDEFAULT == null ? uriReference != null : !URI_REFERENCE_EDEFAULT.equals(uriReference);
			case SwrlPackage.RULE__TYPE:
				return type != TYPE_EDEFAULT;
			case SwrlPackage.RULE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case SwrlPackage.RULE__BODY:
				return body != null;
			case SwrlPackage.RULE__HEAD:
				return head != null;
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
		result.append(" (URIReference: ");
		result.append(uriReference);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
