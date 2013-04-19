package edu.bath.alivetemplates.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import edu.bath.owlsannotations.OwlBean;
import edu.bath.owlsannotations.OwlProp;
import edu.bath.owlsannotations.URINamespace;

@URINamespace(prefix = "num", value = "http://numbers.org/Numbers.owl")
@OwlBean(ontology = "&num;", name = "Integer")
@XmlType(namespace="http://test-simple/")
public class ANumber {
	public String toString() {
		return Integer.toString(value);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ANumber other = (ANumber) obj;
		if (value != other.value)
			return false;
		return true;
	}

	//@XmlElement(namespace="http://test-simple/")
    //@XmlSchemaType(name="value")
	int value;

	@OwlProp("hasValue")
	@XmlElement(name="value", namespace="http://test-simple/")
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
