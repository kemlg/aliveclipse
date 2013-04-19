package net.sf.ictalive.aliveclipse.dashboard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ViewSelectionDialog extends Dialog {
	public ViewSelectionDialog() {
		super(PlatformUI.getWorkbench().getDisplay().getActiveShell(),  SWT.MIN  | SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
//		setText("Please select new dashboard view");
		setText("Select view");
	}
	
	public void open(AliveDashboardMediator mediator, DashboardPart dashboardPart) {

		// Create the dialog window
		Shell shell = new Shell(getParent(), getStyle());
		shell.setText(getText());
		createContents(shell, mediator, dashboardPart);
		shell.pack();
		
		
		shell.open();
		Display display = getParent().getDisplay();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	private void createContents(final Shell shell, final AliveDashboardMediator mediator, DashboardPart dashboardPart) {
		Rectangle parentWindow = getParent().getBounds();
		shell.setLocation(parentWindow.x + (parentWindow.width)/2,
			              parentWindow.y + (parentWindow.height)/2);		
		shell.setLayout(new GridLayout(2, true));

		Button buttons[] = new Button[] {
				mkViewSelectionButton(shell, mediator, dashboardPart, "Top-down", ChangeDashboardViewAction.TOP_DOWN),
//				mkViewSelectionButton(shell, mediator, dashboardPart, "Middle-out", ChangeDashboardViewAction.MIDDLE_OUT),
				mkViewSelectionButton(shell, mediator, dashboardPart, "Bottom-up", ChangeDashboardViewAction.BOTTOM_UP)
				};
		buttons[mediator.getDashboardViewType()].setFocus();
	}
	
	private Button mkViewSelectionButton(final Shell shell, final AliveDashboardMediator mediator, final DashboardPart dashboardPart, final String viewName, final int viewType) {
		Button button = new Button(shell, SWT.PUSH);
		button.setText(viewName);
		button.setLayoutData(new GridData());
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				dashboardPart.setDashboardView(viewType);
				mediator.setDashboardViewType(viewType);
				shell.close();
			}
		});
		return button;
	}
}
