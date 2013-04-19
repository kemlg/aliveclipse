package edu.bath.alivetemplates;

import java.net.URI;
import java.util.Collection;

import jaspwrapper.exec.Program;

/**
 * An interface allowing one to define a type handler. Whenever a piece of 
 * data is encountered, its type is checked, and looked up in a master list.
 * The data is registered with each handler in the list which can deal with 
 * that type of data.
 * 
 * Once all data has been accounted for, the handlers are all invoked, and 
 * facts are asserted about the data which has been previously registered.
 * 
 * It is possible to register more than one handler for a particular data type.
 * @author adan
 *
 */
public interface ASPValueHandler {
	/**
	 * Returns the Class of the type which this will handle.
	 * @return URI of type which this handler deals with.
	 */
	public Collection<URI> typeHandled();
	
	/**
	 * Registers an item of data with the handler.
	 * @param dataItem Item of data to register.
	 * @param What data object is hashed to.
	 */
	public void registerData(Object dataItem, String hash);
	
	/**
	 * Invokes a handler over a dataset so it can make assertions.
	 * @param aspProg ASP program to make assertions in.
	 */
	public void invoke(Program aspProg);
}
