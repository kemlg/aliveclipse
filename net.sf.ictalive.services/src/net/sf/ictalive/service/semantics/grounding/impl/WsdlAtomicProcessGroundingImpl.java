/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.impl;

import net.sf.ictalive.service.Service;

import net.sf.ictalive.service.semantics.ProcessModel;

import net.sf.ictalive.service.semantics.grounding.GroundingPackage;
import net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.service.semantics.grounding.WsdlInputMessageMap;
import net.sf.ictalive.service.semantics.grounding.WsdlOperationRef;
import net.sf.ictalive.service.semantics.grounding.WsdlOutputMessageMap;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.Message;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOperation <em>Wsdl Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlInput <em>Wsdl Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOutput <em>Wsdl Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlService <em>Wsdl Service</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlInputMessage <em>Wsdl Input Message</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlOutputMessage <em>Wsdl Output Message</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlReference <em>Wsdl Reference</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlVersion <em>Wsdl Version</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getWsdlDocument <em>Wsdl Document</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlAtomicProcessGroundingImpl extends EObjectImpl implements WsdlAtomicProcessGrounding {
	/**
	 * The cached value of the '{@link #getOwlsProcess() <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlsProcess()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel owlsProcess;

	/**
	 * The cached value of the '{@link #getWsdlOperation() <em>Wsdl Operation</em>}' containment reference.
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
	 * The cached value of the '{@link #getWsdlService() <em>Wsdl Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlService()
	 * @generated
	 * @ordered
	 */
	protected Service wsdlService;

	/**
	 * The cached value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlPort()
	 * @generated
	 * @ordered
	 */
	protected Endpoint wsdlPort;

	/**
	 * The cached value of the '{@link #getWsdlInputMessage() <em>Wsdl Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlInputMessage()
	 * @generated
	 * @ordered
	 */
	protected Message wsdlInputMessage;

	/**
	 * The cached value of the '{@link #getWsdlOutputMessage() <em>Wsdl Output Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlOutputMessage()
	 * @generated
	 * @ordered
	 */
	protected Message wsdlOutputMessage;

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
	 * The default value of the '{@link #getWsdlVersion() <em>Wsdl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlVersion() <em>Wsdl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlVersion()
	 * @generated
	 * @ordered
	 */
	protected String wsdlVersion = WSDL_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlDocument() <em>Wsdl Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlDocument() <em>Wsdl Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlDocument()
	 * @generated
	 * @ordered
	 */
	protected String wsdlDocument = WSDL_DOCUMENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlAtomicProcessGroundingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundingPackage.Literals.WSDL_ATOMIC_PROCESS_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getOwlsProcess() {
		if (owlsProcess != null && owlsProcess.eIsProxy()) {
			InternalEObject oldOwlsProcess = (InternalEObject)owlsProcess;
			owlsProcess = (ProcessModel)eResolveProxy(oldOwlsProcess);
			if (owlsProcess != oldOwlsProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
			}
		}
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetOwlsProcess() {
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlsProcess(ProcessModel newOwlsProcess) {
		ProcessModel oldOwlsProcess = owlsProcess;
		owlsProcess = newOwlsProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOperationRef getWsdlOperation() {
		return wsdlOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlOperation(WsdlOperationRef newWsdlOperation, NotificationChain msgs) {
		WsdlOperationRef oldWsdlOperation = wsdlOperation;
		wsdlOperation = newWsdlOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, oldWsdlOperation, newWsdlOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOperation(WsdlOperationRef newWsdlOperation) {
		if (newWsdlOperation != wsdlOperation) {
			NotificationChain msgs = null;
			if (wsdlOperation != null)
				msgs = ((InternalEObject)wsdlOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, null, msgs);
			if (newWsdlOperation != null)
				msgs = ((InternalEObject)newWsdlOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, null, msgs);
			msgs = basicSetWsdlOperation(newWsdlOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION, newWsdlOperation, newWsdlOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlInputMessageMap getWsdlInput() {
		return wsdlInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlInput(WsdlInputMessageMap newWsdlInput, NotificationChain msgs) {
		WsdlInputMessageMap oldWsdlInput = wsdlInput;
		wsdlInput = newWsdlInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, oldWsdlInput, newWsdlInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlInput(WsdlInputMessageMap newWsdlInput) {
		if (newWsdlInput != wsdlInput) {
			NotificationChain msgs = null;
			if (wsdlInput != null)
				msgs = ((InternalEObject)wsdlInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, null, msgs);
			if (newWsdlInput != null)
				msgs = ((InternalEObject)newWsdlInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, null, msgs);
			msgs = basicSetWsdlInput(newWsdlInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT, newWsdlInput, newWsdlInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOutputMessageMap getWsdlOutput() {
		return wsdlOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlOutput(WsdlOutputMessageMap newWsdlOutput, NotificationChain msgs) {
		WsdlOutputMessageMap oldWsdlOutput = wsdlOutput;
		wsdlOutput = newWsdlOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, oldWsdlOutput, newWsdlOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOutput(WsdlOutputMessageMap newWsdlOutput) {
		if (newWsdlOutput != wsdlOutput) {
			NotificationChain msgs = null;
			if (wsdlOutput != null)
				msgs = ((InternalEObject)wsdlOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, null, msgs);
			if (newWsdlOutput != null)
				msgs = ((InternalEObject)newWsdlOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, null, msgs);
			msgs = basicSetWsdlOutput(newWsdlOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT, newWsdlOutput, newWsdlOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getWsdlService() {
		if (wsdlService != null && wsdlService.eIsProxy()) {
			InternalEObject oldWsdlService = (InternalEObject)wsdlService;
			wsdlService = (Service)eResolveProxy(oldWsdlService);
			if (wsdlService != oldWsdlService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, oldWsdlService, wsdlService));
			}
		}
		return wsdlService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetWsdlService() {
		return wsdlService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlService(Service newWsdlService) {
		Service oldWsdlService = wsdlService;
		wsdlService = newWsdlService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE, oldWsdlService, wsdlService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getWsdlPort() {
		if (wsdlPort != null && wsdlPort.eIsProxy()) {
			InternalEObject oldWsdlPort = (InternalEObject)wsdlPort;
			wsdlPort = (Endpoint)eResolveProxy(oldWsdlPort);
			if (wsdlPort != oldWsdlPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, oldWsdlPort, wsdlPort));
			}
		}
		return wsdlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetWsdlPort() {
		return wsdlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlPort(Endpoint newWsdlPort) {
		Endpoint oldWsdlPort = wsdlPort;
		wsdlPort = newWsdlPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT, oldWsdlPort, wsdlPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getWsdlInputMessage() {
		if (wsdlInputMessage != null && wsdlInputMessage.eIsProxy()) {
			InternalEObject oldWsdlInputMessage = (InternalEObject)wsdlInputMessage;
			wsdlInputMessage = (Message)eResolveProxy(oldWsdlInputMessage);
			if (wsdlInputMessage != oldWsdlInputMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, oldWsdlInputMessage, wsdlInputMessage));
			}
		}
		return wsdlInputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetWsdlInputMessage() {
		return wsdlInputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlInputMessage(Message newWsdlInputMessage) {
		Message oldWsdlInputMessage = wsdlInputMessage;
		wsdlInputMessage = newWsdlInputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE, oldWsdlInputMessage, wsdlInputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getWsdlOutputMessage() {
		if (wsdlOutputMessage != null && wsdlOutputMessage.eIsProxy()) {
			InternalEObject oldWsdlOutputMessage = (InternalEObject)wsdlOutputMessage;
			wsdlOutputMessage = (Message)eResolveProxy(oldWsdlOutputMessage);
			if (wsdlOutputMessage != oldWsdlOutputMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, oldWsdlOutputMessage, wsdlOutputMessage));
			}
		}
		return wsdlOutputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetWsdlOutputMessage() {
		return wsdlOutputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlOutputMessage(Message newWsdlOutputMessage) {
		Message oldWsdlOutputMessage = wsdlOutputMessage;
		wsdlOutputMessage = newWsdlOutputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE, oldWsdlOutputMessage, wsdlOutputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlReference() {
		return wsdlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlReference(String newWsdlReference) {
		String oldWsdlReference = wsdlReference;
		wsdlReference = newWsdlReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE, oldWsdlReference, wsdlReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlVersion() {
		return wsdlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlVersion(String newWsdlVersion) {
		String oldWsdlVersion = wsdlVersion;
		wsdlVersion = newWsdlVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION, oldWsdlVersion, wsdlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlDocument() {
		return wsdlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlDocument(String newWsdlDocument) {
		String oldWsdlDocument = wsdlDocument;
		wsdlDocument = newWsdlDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT, oldWsdlDocument, wsdlDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				return basicSetWsdlOperation(null, msgs);
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return basicSetWsdlInput(null, msgs);
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return basicSetWsdlOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				if (resolve) return getOwlsProcess();
				return basicGetOwlsProcess();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				return getWsdlOperation();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return getWsdlInput();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return getWsdlOutput();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				if (resolve) return getWsdlService();
				return basicGetWsdlService();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				if (resolve) return getWsdlPort();
				return basicGetWsdlPort();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				if (resolve) return getWsdlInputMessage();
				return basicGetWsdlInputMessage();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				if (resolve) return getWsdlOutputMessage();
				return basicGetWsdlOutputMessage();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				return getWsdlReference();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				return getWsdlVersion();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				return getWsdlDocument();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((ProcessModel)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				setWsdlOperation((WsdlOperationRef)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				setWsdlInput((WsdlInputMessageMap)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				setWsdlOutput((WsdlOutputMessageMap)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				setWsdlService((Service)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				setWsdlPort((Endpoint)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				setWsdlInputMessage((Message)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				setWsdlOutputMessage((Message)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				setWsdlReference((String)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				setWsdlVersion((String)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				setWsdlDocument((String)newValue);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME:
				setName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((ProcessModel)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				setWsdlOperation((WsdlOperationRef)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				setWsdlInput((WsdlInputMessageMap)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				setWsdlOutput((WsdlOutputMessageMap)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				setWsdlService((Service)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				setWsdlPort((Endpoint)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				setWsdlInputMessage((Message)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				setWsdlOutputMessage((Message)null);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				setWsdlReference(WSDL_REFERENCE_EDEFAULT);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				setWsdlVersion(WSDL_VERSION_EDEFAULT);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				setWsdlDocument(WSDL_DOCUMENT_EDEFAULT);
				return;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME:
				setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS:
				return owlsProcess != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION:
				return wsdlOperation != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT:
				return wsdlInput != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT:
				return wsdlOutput != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE:
				return wsdlService != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT:
				return wsdlPort != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE:
				return wsdlInputMessage != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE:
				return wsdlOutputMessage != null;
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE:
				return WSDL_REFERENCE_EDEFAULT == null ? wsdlReference != null : !WSDL_REFERENCE_EDEFAULT.equals(wsdlReference);
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION:
				return WSDL_VERSION_EDEFAULT == null ? wsdlVersion != null : !WSDL_VERSION_EDEFAULT.equals(wsdlVersion);
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT:
				return WSDL_DOCUMENT_EDEFAULT == null ? wsdlDocument != null : !WSDL_DOCUMENT_EDEFAULT.equals(wsdlDocument);
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (wsdlReference: ");
		result.append(wsdlReference);
		result.append(", wsdlVersion: ");
		result.append(wsdlVersion);
		result.append(", wsdlDocument: ");
		result.append(wsdlDocument);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WsdlAtomicProcessGroundingImpl
