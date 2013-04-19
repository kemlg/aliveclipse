package edu.bath.alivetemplates.valuehandlers;

import jaspwrapper.exec.Program;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.bath.alivetemplates.ASPValueHandler;

public class IntegerValueHandler implements ASPValueHandler {
	Map<Integer, String> intHash = new HashMap<Integer, String>();

	@Override
	public Collection<URI> typeHandled() {
		List<URI> types = new LinkedList<URI>();
		types.add(URI.create("http://www.w3.org/2001/XMLSchema#int"));
		return types;
	}

	@Override
	public void registerData(Object dataItem, String hash) {
		intHash.put(Integer.parseInt((String)dataItem), hash);
	}

	@Override
	public void invoke(Program aspProg) {
		for(Integer i : intHash.keySet()) {
			aspProg.addRule("isInteger("+intHash.get(i)+","+i.intValue()+").");
		}
	}
	
}
