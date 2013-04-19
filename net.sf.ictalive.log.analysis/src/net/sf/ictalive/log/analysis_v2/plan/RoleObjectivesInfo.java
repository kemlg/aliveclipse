package net.sf.ictalive.log.analysis_v2.plan;

import java.util.Vector;

import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.runtime.event.Actor;

public class RoleObjectivesInfo {

	private Role role;
	private Vector<Objective> objectives;
	private SS ss;
	
	public RoleObjectivesInfo(Actor r, SS s){
		role = OMFactory.eINSTANCE.createRole();
		role.setName(r.getName());
		objectives = new Vector<Objective>();
		ss =s;
	}

	public RoleObjectivesInfo(Actor r, SS s, Task t){
		role = OMFactory.eINSTANCE.createRole();
		role.setName(r.getName());
		objectives = new Vector<Objective>();
		ss =s;
		
		Objective objective = OMFactory.eINSTANCE.createObjective();
		objective.setName(t.getName());
		objectives.add(objective);
		// add a new objective to the SS
		ss.getObjectives().add(objective);
		role.getObjectives().add(objective);
	}
	
	public void addObjective(Task t){
		
		Objective objective = OMFactory.eINSTANCE.createObjective();
		objective.setName(t.getName());
		objectives.add(objective);
		// add a new objective to the SS
		ss.getObjectives().add(objective);
		role.getObjectives().add(objective);
	}
	
	public Vector<Objective> getRoleObjectives(){
		return objectives;
	}
	
	public String getRoleName(){
		return role.getName();
	}
}
