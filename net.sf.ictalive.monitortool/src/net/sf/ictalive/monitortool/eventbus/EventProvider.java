package net.sf.ictalive.monitortool.eventbus;

import net.sf.ictalive.eventbus.EventBusListener;
import net.sf.ictalive.monitortool.eventbus.EventBusControllerListener;

public interface EventProvider extends EventBusListener 
{
	public void addListener(EventBusControllerListener ebcl);
	
	public String getName();
}
