/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.impl;

import net.sf.ictalive.owls.process.AtomicProcess;

import net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;
import net.sf.ictalive.owls.wsdlGrounding.WsdlInputMessageMap;
import net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef;
import net.sf.ictalive.owls.wsdlGrounding.WsdlOutputMessageMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Atomic Process Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOperation <em>Wsdl Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlInput <em>Wsdl Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOutput <em>Wsdl Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlService <em>Wsdl Service</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlInputMessage <em>Wsdl Input Message</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOutputMessage <em>Wsdl Output Message</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlVersion <em>Wsdl Version</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlDocument <em>Wsdl Document</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlReference <em>Wsdl Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlAtomicProcessGroundingImpl extends EObjectImpl implements WsdlAtomicProcessGrounding
{
	/**
	 * The cached value of the '{@link #getOwlsProcess() <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlsProcess()
	 * @generated
	 * @ordered
	 */
	protected AtomicProcess owlsProcess;

	/**
	 * The cached value of the '{@link #getWsdlOperation() <em>Wsdl Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlOperation()
	 * @generated
	 * @ordered
	 */
	protected WsdlOperationRef wsdlOperation;

	/**
	 * The cached value of the '{@link #getWsdlInput() <em>Wsdl Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlInput()
	 * @generated
	 * @ordered
	 */
	protected WsdlInputMessageMap wsdlInput;

	/**
	 * The cached value of the '{@link #getWsdlOutput() <em>Wsdl Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlOutput()
	 * @generated
	 * @ordered
	 */
	protected WsdlOutputMessageMap wsdlOutput;

	/**
	 * The cached value of the '{@link #getWsdlService() <em>Wsdl Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlService()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlService;

	/**
	 * The cached value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlPort()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlPort;

	/**
	 * The cached value of the '{@link #getWsdlInputMessage() <em>Wsdl Input Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlInputMessage()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlInputMessage;

	/**
	 * The cached value of the '{@link #getWsdlOutputMessage() <em>Wsdl Output Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlOutputMessage()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlOutputMessage;

	/**
	 * The cached value of the '{@link #getWsdlVersion() <em>Wsdl Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlVersion()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlVersion;

	/**
	 * The cached value of the '{@link #getWsdlDocument() <em>Wsdl Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlDocument()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlDocument;

	/**
	 * The default value of the '{@link #getWsdlReference() <em>Wsdl Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlReference()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlReference() <em>Wsdl Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlReference()
	 * @generated
	 * @ordered
	 */
	protected String wsdlReference = WSDL_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlAtomicProcessGroundingImpl()
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
		return WsdlGroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicProcess getOwlsProcess()
	{
		if (owlsProcess != null && owlsProcess.eIsProxy())
		{
			InternalEObject oldOwlsProcess = (InternalEObject)owlsProcess;
			owlsProcess = (AtomicProcess)eResolveProxy(oldOwlsProcess);
			if (owlsProcess != oldOwlsProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
			}
		}
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicProcess basicGetOwlsProcess()
	{
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlsProcess(AtomicProcess newOwlsProcess)
	{
		AtomicProcess oldOwlsProcess = owlsProcess;
		owlsProcess = newOwlsProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOperationRef getWsdlOperation()
	{
		if (wsdlOperation != null && wsdlOperation.eIsProxy())
		{
			InternalEObject oldWsdlOperation = (InternalEObject)wsdlOperation;
			wsdlOperation = (WsdlOperationRef)eResolveProxy(oldWsdlOperation);
			if (wsdlOperation != oldWsdlOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, oldWsdlOperation, wsdlOperation));
			}
		}
		return wsdlOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOperationRef basicGetWsdlOperation()
	{
		return wsdlOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOperation(WsdlOperationRef newWsdlOperation)
	{
		WsdlOperationRef oldWsdlOperation = wsdlOperation;
		wsdlOperation = newWsdlOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, oldWsdlOperation, wsdlOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlInputMessageMap getWsdlInput()
	{
		return wsdlInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlInput(WsdlInputMessageMap newWsdlInput, NotificationChain msgs)
	{
		WsdlInputMessageMap oldWsdlInput = wsdlInput;
		wsdlInput = newWsdlInput;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, oldWsdlInput, newWsdlInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlInput(WsdlInputMessageMap newWsdlInput)
	{
		if (newWsdlInput != wsdlInput)
		{
			NotificationChain msgs = null;
			if (wsdlInput != null)
				msgs = ((InternalEObject)wsdlInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, null, msgs);
			if (newWsdlInput != null)
				msgs = ((InternalEObject)newWsdlInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, null, msgs);
			msgs = basicSetWsdlInput(newWsdlInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, newWsdlInput, newWsdlInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOutputMessageMap getWsdlOutput()
	{
		return wsdlOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlOutput(WsdlOutputMessageMap newWsdlOutput, NotificationChain msgs)
	{
		WsdlOutputMessageMap oldWsdlOutput = wsdlOutput;
		wsdlOutput = newWsdlOutput;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, oldWsdlOutput, newWsdlOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOutput(WsdlOutputMessageMap newWsdlOutput)
	{
		if (newWsdlOutput != wsdlOutput)
		{
			NotificationChain msgs = null;
			if (wsdlOutput != null)
				msgs = ((InternalEObject)wsdlOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, null, msgs);
			if (newWsdlOutput != null)
				msgs = ((InternalEObject)newWsdlOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, null, msgs);
			msgs = basicSetWsdlOutput(newWsdlOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, newWsdlOutput, newWsdlOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlService()
	{
		return wsdlService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlService(EObject newWsdlService, NotificationChain msgs)
	{
		EObject oldWsdlService = wsdlService;
		wsdlService = newWsdlService;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, oldWsdlService, newWsdlService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlService(EObject newWsdlService)
	{
		if (newWsdlService != wsdlService)
		{
			NotificationChain msgs = null;
			if (wsdlService != null)
				msgs = ((InternalEObject)wsdlService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, null, msgs);
			if (newWsdlService != null)
				msgs = ((InternalEObject)newWsdlService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, null, msgs);
			msgs = basicSetWsdlService(newWsdlService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, newWsdlService, newWsdlService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlPort()
	{
		return wsdlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlPort(EObject newWsdlPort, NotificationChain msgs)
	{
		EObject oldWsdlPort = wsdlPort;
		wsdlPort = newWsdlPort;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, oldWsdlPort, newWsdlPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlPort(EObject newWsdlPort)
	{
		if (newWsdlPort != wsdlPort)
		{
			NotificationChain msgs = null;
			if (wsdlPort != null)
				msgs = ((InternalEObject)wsdlPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, null, msgs);
			if (newWsdlPort != null)
				msgs = ((InternalEObject)newWsdlPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, null, msgs);
			msgs = basicSetWsdlPort(newWsdlPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, newWsdlPort, newWsdlPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlInputMessage()
	{
		return wsdlInputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlInputMessage(EObject newWsdlInputMessage, NotificationChain msgs)
	{
		EObject oldWsdlInputMessage = wsdlInputMessage;
		wsdlInputMessage = newWsdlInputMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, oldWsdlInputMessage, newWsdlInputMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlInputMessage(EObject newWsdlInputMessage)
	{
		if (newWsdlInputMessage != wsdlInputMessage)
		{
			NotificationChain msgs = null;
			if (wsdlInputMessage != null)
				msgs = ((InternalEObject)wsdlInputMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, null, msgs);
			if (newWsdlInputMessage != null)
				msgs = ((InternalEObject)newWsdlInputMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, null, msgs);
			msgs = basicSetWsdlInputMessage(newWsdlInputMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, newWsdlInputMessage, newWsdlInputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlOutputMessage()
	{
		return wsdlOutputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlOutputMessage(EObject newWsdlOutputMessage, NotificationChain msgs)
	{
		EObject oldWsdlOutputMessage = wsdlOutputMessage;
		wsdlOutputMessage = newWsdlOutputMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, oldWsdlOutputMessage, newWsdlOutputMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOutputMessage(EObject newWsdlOutputMessage)
	{
		if (newWsdlOutputMessage != wsdlOutputMessage)
		{
			NotificationChain msgs = null;
			if (wsdlOutputMessage != null)
				msgs = ((InternalEObject)wsdlOutputMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, null, msgs);
			if (newWsdlOutputMessage != null)
				msgs = ((InternalEObject)newWsdlOutputMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, null, msgs);
			msgs = basicSetWsdlOutputMessage(newWsdlOutputMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, newWsdlOutputMessage, newWsdlOutputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlVersion()
	{
		return wsdlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlVersion(EObject newWsdlVersion, NotificationChain msgs)
	{
		EObject oldWsdlVersion = wsdlVersion;
		wsdlVersion = newWsdlVersion;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION, oldWsdlVersion, newWsdlVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlVersion(EObject newWsdlVersion)
	{
		if (newWsdlVersion != wsdlVersion)
		{
			NotificationChain msgs = null;
			if (wsdlVersion != null)
				msgs = ((InternalEObject)wsdlVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION, null, msgs);
			if (newWsdlVersion != null)
				msgs = ((InternalEObject)newWsdlVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION, null, msgs);
			msgs = basicSetWsdlVersion(newWsdlVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION, newWsdlVersion, newWsdlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlDocument()
	{
		if (wsdlDocument != null && wsdlDocument.eIsProxy())
		{
			InternalEObject oldWsdlDocument = (InternalEObject)wsdlDocument;
			wsdlDocument = eResolveProxy(oldWsdlDocument);
			if (wsdlDocument != oldWsdlDocument)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT, oldWsdlDocument, wsdlDocument));
			}
		}
		return wsdlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetWsdlDocument()
	{
		return wsdlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlDocument(EObject newWsdlDocument)
	{
		EObject oldWsdlDocument = wsdlDocument;
		wsdlDocument = newWsdlDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT, oldWsdlDocument, wsdlDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlReference()
	{
		return wsdlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlReference(String newWsdlReference)
	{
		String oldWsdlReference = wsdlReference;
		wsdlReference = newWsdlReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE, oldWsdlReference, wsdlReference));
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
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return basicSetWsdlInput(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return basicSetWsdlOutput(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				return basicSetWsdlService(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				return basicSetWsdlPort(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				return basicSetWsdlInputMessage(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				return basicSetWsdlOutputMessage(null, msgs);
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				return basicSetWsdlVersion(null, msgs);
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
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				if (resolve) return getOwlsProcess();
				return basicGetOwlsProcess();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				if (resolve) return getWsdlOperation();
				return basicGetWsdlOperation();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return getWsdlInput();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return getWsdlOutput();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				return getWsdlService();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				return getWsdlPort();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				return getWsdlInputMessage();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				return getWsdlOutputMessage();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				return getWsdlVersion();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				if (resolve) return getWsdlDocument();
				return basicGetWsdlDocument();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				return getWsdlReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((AtomicProcess)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				setWsdlOperation((WsdlOperationRef)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				setWsdlInput((WsdlInputMessageMap)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				setWsdlOutput((WsdlOutputMessageMap)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				setWsdlService((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				setWsdlPort((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				setWsdlInputMessage((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				setWsdlOutputMessage((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				setWsdlVersion((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				setWsdlDocument((EObject)newValue);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				setWsdlReference((String)newValue);
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
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((AtomicProcess)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				setWsdlOperation((WsdlOperationRef)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				setWsdlInput((WsdlInputMessageMap)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				setWsdlOutput((WsdlOutputMessageMap)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				setWsdlService((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				setWsdlPort((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				setWsdlInputMessage((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				setWsdlOutputMessage((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				setWsdlVersion((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				setWsdlDocument((EObject)null);
				return;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				setWsdlReference(WSDL_REFERENCE_EDEFAULT);
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
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				return owlsProcess != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				return wsdlOperation != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return wsdlInput != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return wsdlOutput != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				return wsdlService != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				return wsdlPort != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				return wsdlInputMessage != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				return wsdlOutputMessage != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				return wsdlVersion != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				return wsdlDocument != null;
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				return WSDL_REFERENCE_EDEFAULT == null ? wsdlReference != null : !WSDL_REFERENCE_EDEFAULT.equals(wsdlReference);
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
		result.append(" (wsdlReference: ");
		result.append(wsdlReference);
		result.append(')');
		return result.toString();
	}

} //WsdlAtomicProcessGroundingImpl
