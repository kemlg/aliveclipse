package edu.bath.alivetemplates;

import jaspwrapper.exec.Program;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * NOTE: Must have handlers registered before adding data!!!
 * @author adan
 *
 */
class ASPValueAsserts {
	private Map<URI, List<ASPValueHandler>> handlerMap = new HashMap<URI, List<ASPValueHandler>>();
	private List<ASPValueHandler> invocationList = new LinkedList<ASPValueHandler>();
	
	/**
	 * Gets a list of ASPTypeHandlers which can be used with a type.
	 * @param type
	 * @return
	 */
	private List<ASPValueHandler> fetchCompatibleHandlers(URI type) {
		List<ASPValueHandler> compatList = new LinkedList<ASPValueHandler>();
		for(URI testCompat : handlerMap.keySet()) {
			if(testCompat.equals(type))
				compatList.addAll(handlerMap.get(testCompat));
		}
		
		return compatList;
	}
	
	/**
	 * Registers a value with all supported handlers.
	 * @param val
	 * @param hash
	 */
	public void registerValue(Object val, String hash, URI datatypeURI) {
		List<ASPValueHandler> list = fetchCompatibleHandlers(datatypeURI);
		for(ASPValueHandler handler : list) {
			handler.registerData(val, hash);
		}
	}
	
	/**
	 * Registers a handler against an individual type. Helper method to allow 
	 * a handler to handle multiple types.
	 * @param type
	 * @param typeHandler
	 */
	private void addValueHandlerType(URI type, ASPValueHandler typeHandler) {
		// First check if we have an entry for this type, if not, create one
		List<ASPValueHandler> list = handlerMap.get(type);
		if(list == null) {
			list = new LinkedList<ASPValueHandler>();
			handlerMap.put(type, list);
		}
		
		list.add(typeHandler);
	}
	
	/**
	 * Adds a handler.
	 * @param type Type to bind to.
	 * @param typeHandler Handler to bind to this type.
	 */
	public void addValueHandler(ASPValueHandler typeHandler) {
		Collection<URI> types = typeHandler.typeHandled();
		for(URI type : types) {
			addValueHandlerType(type, typeHandler);
		}
		
		// Add to invocation list
		invocationList.add(typeHandler);
	}
	
	/**
	 * Invokes all type handlers with assertions going in aspProg.
	 * @param aspProg Where assertions about values are made.
	 */
	public void invokeHandlers(Program aspProg) {
		// Use invocation list because a handler may be mapped to multiple 
		// types, and we don't want to invoke it twice
		for(ASPValueHandler handler : invocationList)
			handler.invoke(aspProg);
	}
}
