package net.sf.ictalive.aliveclipse.dashboard;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class ChangeDashboardViewAction extends Action implements IWorkbenchAction{

  private static final String ID = "net.sf.ictalive.dashboard.ChangeDashboardViewAction";

  public static int TOP_DOWN = 0;
//  public static int MIDDLE_OUT = 1;
  public static int BOTTOM_UP = 1;
  
  private int dashboardViewType;
  AliveDashboardMediator mediator;
  DashboardPart dashboardPart;
  
  public ChangeDashboardViewAction(int dashboardViewType, AliveDashboardMediator mediator, DashboardPart dashboardPart){
	  setId(ID);
	  this.dashboardViewType = dashboardViewType;
	  this.mediator = mediator;
	  this.dashboardPart = dashboardPart;
  }

  public void run() {
	  if (isChecked()) {
		  //System.err.println("View type changed to "+dashboardViewType);
		  dashboardPart.setDashboardView(dashboardViewType);
		  mediator.setDashboardViewType(dashboardViewType);
		  //AliveDashboardState state = mediator.getState();
		  //state.setOrganisation(URI.createFileURI("bla"));
		  //mediator.updateStatus();
	  }
  }
  
  public int getStyle() {
	  return IWorkbenchAction.AS_RADIO_BUTTON;
  }

  public void dispose() {}

}
