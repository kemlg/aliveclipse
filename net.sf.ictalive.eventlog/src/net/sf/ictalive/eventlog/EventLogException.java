package net.sf.ictalive.eventlog;

public class EventLogException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1131870106775295162L;
	
	public EventLogException(Throwable cause)
	{
		this.initCause(cause);
	}
}
