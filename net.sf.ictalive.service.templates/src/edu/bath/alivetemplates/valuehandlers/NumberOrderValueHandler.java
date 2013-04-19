package edu.bath.alivetemplates.valuehandlers;

import jaspwrapper.exec.Program;

import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.bath.alivetemplates.ASPValueHandler;

public class NumberOrderValueHandler implements ASPValueHandler {
	List<Double> floatList = new LinkedList<Double>();
	Map<Double, String> floatHash = new HashMap<Double, String>();

	@Override
	public Collection<URI> typeHandled() {
		List<URI> types = new LinkedList<URI>();
		types.add(URI.create("http://www.w3.org/2001/XMLSchema#int"));
		types.add(URI.create("http://www.w3.org/2001/XMLSchema#float"));
		types.add(URI.create("http://www.w3.org/2001/XMLSchema#double"));
		return types;
	}

	@Override
	public void registerData(Object dataItem, String hash) {
		double val = Double.parseDouble((String)dataItem);
		Double f = new Double(val);
		floatList.add(f);
		floatHash.put(f, hash);
	}

	@Override
	public void invoke(Program aspProg) {
		Double[] floatArray = floatList.toArray(new Double[floatList.size()]);
		Arrays.sort(floatArray);
		
		// Make assertions: NOTE: can never be equal to, because two of the same value are hashed to the 
		// same name, so equals is implied by having the same name. Therefore, no need to handle that here
		for(int i = 0 ; i < floatArray.length-1 ; i++) {
			aspProg.addRule("lessThan("+floatHash.get(floatArray[i])+","+floatHash.get(floatArray[i+1])+").");
		}
	}

}
