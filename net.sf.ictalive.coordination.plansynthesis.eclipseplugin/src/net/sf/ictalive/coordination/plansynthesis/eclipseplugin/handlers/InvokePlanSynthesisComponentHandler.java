/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.handlers;

import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards.InvokePlanSynthesisComponentWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * 
 * A simple handler which extends AbstractHandler, an IHandler base class, and
 * handles commands for invoking the plan syntheis component.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 * 
 * @author David Corsar
 * 
 */
public class InvokePlanSynthesisComponentHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public InvokePlanSynthesisComponentHandler() {
	}

	/**
	 * Creates and displays an {@link InvokePlanSynthesisComponentWizard}.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		InvokePlanSynthesisComponentWizard wizard = new InvokePlanSynthesisComponentWizard();
		WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
		dialog.create();
		dialog.open();

		return null;
	}
}