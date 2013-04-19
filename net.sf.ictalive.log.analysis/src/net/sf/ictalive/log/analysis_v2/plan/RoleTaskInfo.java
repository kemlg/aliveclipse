package net.sf.ictalive.log.analysis_v2.plan;

import java.util.*;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.runtime.event.Actor;


public class RoleTaskInfo {
	
	Random rand = new Random();
//	String[] roles = {"User", "InteractionTaskManager", "Interface", "ContentAdaptor", "UserModeller"};
//	String[] tasks = {"GetUserAge", "GetUserLocation", "GetIsAdultAge", "GetIsMealTime", "GetWeatherForecast"};
	public int times, failed, succeed, aborted;
	public Actor role;
	public Action task;
	
	
	public RoleTaskInfo(Actor r, Action t){
		role = r;
		task = t;
		times = rand.nextInt(30);
		if(times < 20) times += 20;
		
		succeed = rand.nextInt(25);
		while(succeed < 20) succeed += 10;
		if(succeed >= times) {
			succeed = 20;			
		}
		if((times-succeed) == 0 ) {
			failed = 0; aborted = 0;
		}else{
			failed = rand.nextInt(times-succeed);
			aborted = times - succeed - failed;
			if(aborted < 0) aborted = 0;
		}
	}
	
	

}
