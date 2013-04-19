package net.sf.ictalive.log.analysis_v2.plan;

import java.util.ArrayList;
import java.util.Random;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.tasks.Plan;

public class PlanInfo {

	Random rand = new Random();
	Plan plan;
	float throughtput_avg, throughtput_min, throughtput_max;
	float result_fail, result_succ, result_abort;
	ArrayList<Action> actionList = new ArrayList<Action>();
	
	public PlanInfo(Plan p){
		this.plan = p;
		generateRand();		
		result_fail = rand.nextInt(5);
		result_succ= rand.nextInt(25);
		if (result_succ < 10)
			result_succ += 10;
		result_abort = rand.nextInt(5);
	}
	
	private void generateRand(){
		throughtput_min = rand.nextFloat();
		while(throughtput_min > 0.5f)
			throughtput_min = rand.nextFloat();
		throughtput_max = rand.nextFloat();
		while(throughtput_max <= 0.5f)
			throughtput_max = rand.nextFloat();
		throughtput_avg = rand.nextFloat();
		while(throughtput_avg >= throughtput_max ||	throughtput_avg <= throughtput_min)
			throughtput_avg = rand.nextFloat();
		
		
	}
	
	
	public String getName(){ return plan.getName();}
	
	public void addAction(Action a){
		actionList.add(a);
	}

	public ArrayList<Action> getActionList(){
		return actionList;
	}
	
	public float getThroughtput_avg(){ return throughtput_avg;}
	public float getThroughtput_max(){ return throughtput_max;}
	public float getThroughtput_min(){ return throughtput_min;}
	public float getResult_fail(){ return result_fail;}
	public float getResult_succ(){ return result_succ;}
	public float getResult_abort(){ return result_abort;}
}

