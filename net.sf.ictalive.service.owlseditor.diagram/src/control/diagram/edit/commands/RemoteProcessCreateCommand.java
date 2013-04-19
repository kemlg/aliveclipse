/*
 * 
 */
package control.diagram.edit.commands;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.serviceui.ServiceRepositoryImportPage;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.util.Log;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import control.ControlFactory;
import control.Perform;
import control.RemoteProcess;
import control.diagram.util.RemoteServiceImporter;
import control.diagram.util.ServiceImportWizard;

/**
 * @generated
 */
public class RemoteProcessCreateCommand extends EditElementCommand {

	/**
	 * @generated NOT
	 */
	Logger log = LoggerFactory.getLogger(RemoteProcessCreateCommand.class);

	/**
	 * @generated 
	 */
	public RemoteProcessCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		Perform container = (Perform) getElementToEdit();
		if (container.getTheProcess() != null) {
			return false;
		}
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		RemoteProcess newElement = ControlFactory.eINSTANCE
				.createRemoteProcess();

		RemoteServiceImporter testImporter = new RemoteServiceImporter();
		Shell uiShell = (Shell) info;
		newElement = testImporter.setupAliveRepo(uiShell);

		if (newElement == null) {
			return CommandResult.newCancelledCommandResult();
		}

		Perform owner = (Perform) getElementToEdit();
		owner.setTheProcess(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(RemoteProcess newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}
}
