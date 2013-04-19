package net.sf.ictalive.dashboard;

// this is just a tuple containg the label and the id
public class ActionSpecification {
	protected String label, actionId;
	
	public ActionSpecification(String label, String actionId){
		this.label = label;
		this.actionId = actionId;
	}
	
	public String getLabel() {
		return label;
	}

	public String getActionId() {
		return actionId;
	}
}
