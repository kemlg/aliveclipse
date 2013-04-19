package net.sf.ictalive.monitortool.dialogs;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class EventBusLocation implements IViewActionDelegate
{
	private IViewPart view;
	private String value;

	public void init(IViewPart view)
	{
		this.view = view; // cache the view part, this will be used in run
							// action
		// to fetch the parent shell for dialog
	}

	public void run(IAction action)
	{
		InputDialog dialog = new InputDialog(view.getSite().getShell(),
				"Add EventBus Location", "Enter ip (e.g. 127.0.0.1)", "127.0.0.1", null); // new input
																	// dialog
		if (dialog.open() == IStatus.OK)
		{ // open dialog and wait for return status code.
			// If user clicks ok display message box
			String value = dialog.getValue(); // fetch the value entered by the
												// user.
			MessageBox box = new MessageBox(view.getSite().getShell(),
					SWT.ICON_INFORMATION);
			setValue(value);
		}
		else
		{
			setValue(null);
		}
	}

	private void setValue(String value)
	{
		this.value = value;
	}

	public void selectionChanged(IAction action, ISelection selection)
	{
	}

	public String getValue()
	{
		return value;
	}
}
