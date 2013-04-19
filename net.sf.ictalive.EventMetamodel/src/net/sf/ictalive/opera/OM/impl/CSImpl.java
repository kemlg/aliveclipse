/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import java.util.Collection;

import net.sf.ictalive.opera.OM.CS;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.Ontology;
import net.sf.ictalive.opera.OM.PartialStateDescription;

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
 * An implementation of the model object '<em><b>CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.CSImpl#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.CSImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSImpl extends EObjectImpl implements CS
{
	/**
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialStateDescription> formulas;

	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected Ontology ontology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSImpl()
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
		return OMPackage.Literals.CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialStateDescription> getFormulas()
	{
		if (formulas == null)
		{
			formulas = new EObjectContainmentEList<PartialStateDescription>(PartialStateDescription.class, this, OMPackage.CS__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology()
	{
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntology(Ontology newOntology, NotificationChain msgs)
	{
		Ontology oldOntology = ontology;
		ontology = newOntology;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.CS__ONTOLOGY, oldOntology, newOntology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(Ontology newOntology)
	{
		if (newOntology != ontology)
		{
			NotificationChain msgs = null;
			if (ontology != null)
				msgs = ((InternalEObject)ontology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ONTOLOGY, null, msgs);
			if (newOntology != null)
				msgs = ((InternalEObject)newOntology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ONTOLOGY, null, msgs);
			msgs = basicSetOntology(newOntology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CS__ONTOLOGY, newOntology, newOntology));
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
			case OMPackage.CS__FORMULAS:
				return ((InternalEList<?>)getFormulas()).basicRemove(otherEnd, msgs);
			case OMPackage.CS__ONTOLOGY:
				return basicSetOntology(null, msgs);
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
			case OMPackage.CS__FORMULAS:
				return getFormulas();
			case OMPackage.CS__ONTOLOGY:
				return getOntology();
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
			case OMPackage.CS__FORMULAS:
				getFormulas().clear();
				getFormulas().addAll((Collection<? extends PartialStateDescription>)newValue);
				return;
			case OMPackage.CS__ONTOLOGY:
				setOntology((Ontology)newValue);
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
			case OMPackage.CS__FORMULAS:
				getFormulas().clear();
				return;
			case OMPackage.CS__ONTOLOGY:
				setOntology((Ontology)null);
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
			case OMPackage.CS__FORMULAS:
				return formulas != null && !formulas.isEmpty();
			case OMPackage.CS__ONTOLOGY:
				return ontology != null;
		}
		return super.eIsSet(featureID);
	}

} //CSImpl
