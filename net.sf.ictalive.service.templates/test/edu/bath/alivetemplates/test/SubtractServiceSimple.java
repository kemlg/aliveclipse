package edu.bath.alivetemplates.test;

import java.lang.reflect.Method;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import edu.bath.owlsannotations.*;

@WebService(targetNamespace = "http://test-simple/")
@URINamespace(prefix = "num1", value = "http://numbers.org/Numbers.owl")
@OwlsImport(prefix = "num", value = "&num1;")
@OwlsClass(defaultOntology = "&num;#")
public class SubtractServiceSimple {

	Method serviceMethod;
	{
		try {
			serviceMethod = getClass().getMethod("subtract", ANumber.class, ANumber.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@OwlsService(name = "SubService", label = "Subtraction Service")
	@OwlsOutParam(name = "rv", owlType = "#Integer", bindings = { @OwlsBinding(from = "value", to = "hasValue") })
	@WebMethod
	public ANumber subtract(
			@WebParam(name = "x", targetNamespace="http://test-simple/") @OwlsInParam(name = "x", owlType = "#Integer", bindings = { @OwlsBinding(from = "value", to = "hasValue") }) ANumber x,
			@WebParam(name = "y", targetNamespace="http://test-simple/") @OwlsInParam(name = "y", owlType = "#Integer", bindings = { @OwlsBinding(from = "value", to = "hasValue") }) ANumber y) {

		ANumber val = new ANumber();
		val.value = x.value - y.value;
		return val;
	}
}