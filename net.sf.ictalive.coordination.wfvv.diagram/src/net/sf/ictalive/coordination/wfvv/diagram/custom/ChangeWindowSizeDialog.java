package net.sf.ictalive.coordination.wfvv.diagram.custom;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class ChangeWindowSizeDialog extends Dialog implements ModifyListener {

	private Spinner s;
	private int selected = 2;
	
	protected ChangeWindowSizeDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite c = (Composite) super.createDialogArea(parent);
		Text t = new Text(c, SWT.READ_ONLY);
		t.setText("Select window size");
		s = new Spinner(c, SWT.BORDER);
		s.setMinimum(2);
		s.addModifyListener(this);
		return c;
	}
	
	public int getSelectedValue(){
		return selected;
	}

	public void modifyText(ModifyEvent e) {
		selected = s.getSelection();
	}

}
