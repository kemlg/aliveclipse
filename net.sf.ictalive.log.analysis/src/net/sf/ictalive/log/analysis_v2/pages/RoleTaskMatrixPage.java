package net.sf.ictalive.log.analysis_v2.pages;

import java.util.ArrayList;

import net.sf.ictalive.log.analysis_v2.LoadEventData;
import net.sf.ictalive.log.analysis_v2.plan.RoleTaskInfo;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class RoleTaskMatrixPage extends WizardPage {
	
	LoadEventData loadEvent;
	
	public RoleTaskMatrixPage(String arg0, LoadEventData loadEvent) {
		super(arg0);
		setTitle("Role and Task Matrix");
		setDescription("a table shows the roles taking tasks with results");
		this.loadEvent = loadEvent;
	}
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		Composite composite = new Composite(parent, SWT.NONE);

	    // create the desired layout for this wizard page
		FillLayout fl = new FillLayout();
		fl.type = SWT.HORIZONTAL;//.VERTICAL;
		
		GridLayout gl = new GridLayout();
		int ncol = 1;
		gl.numColumns = ncol;
		gl.makeColumnsEqualWidth=false;
		
	    
		Table table = new Table(composite,  SWT.BORDER | SWT.V_SCROLL
		        | SWT.H_SCROLL);
		table.setHeaderVisible(true);
		String[] titles = { "Roles", "Tasks", "No. of Times", "Succeeded", "Failed", "Aborted" };
		

		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      TableColumn column = new TableColumn(table, SWT.NULL);
		      column.setText(titles[loopIndex]);
		}

		// real data here
/*		String[] roles = {"User", "InteractionTaskManager", "Interface", "ContentAdaptor", "UserModeller", "ContentProvider", 
				"EnvironmentalContextManager", "LegalInfoManager"};
		String[] tasks = {"GetUserAge", "GetUserLocation", "GetIsAdultAge", "GetIsMealTime", "GetWeatherForecast", "GetIsMealTime",
				"GetWeatherForecast", "GetUserMovieCinemaPreferences"};*/

		ArrayList<RoleTaskInfo> roleList = loadEvent.getRoleTaskInfoLIst();
		for (int loopIndex = 0; loopIndex < roleList.size(); loopIndex++) {
			RoleTaskInfo roleTaskInfo = roleList.get(loopIndex);
		      TableItem item = new TableItem(table, SWT.NULL);
		      item.setText("Item " + roleTaskInfo.role);
		      item.setText(0, roleTaskInfo.role.getName());
		      item.setText(1, roleTaskInfo.task.getName());
		      item.setText(2, Integer.toString(roleTaskInfo.times));
		      item.setText(3, Integer.toString(roleTaskInfo.succeed));
		      item.setText(4, Integer.toString(roleTaskInfo.failed));
		      item.setText(5, Integer.toString(roleTaskInfo.aborted));
		}

		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      table.getColumn(loopIndex).pack();
		}

		    table.setBounds(25, 25, 620, 500);

	/*	    table.addListener(SWT.Selection, new Listener() {
		      public void handleEvent(Event event) {
		        if (event.detail == SWT.CHECK) {
		          text.setText("You checked " + event.item);
		        } else {
		          text.setText("You selected " + event.item);
		        }
		      }
		    }); */
		
		setControl(composite);
		
	}
	
	public boolean performFinish() {
		return true;
	}
}
