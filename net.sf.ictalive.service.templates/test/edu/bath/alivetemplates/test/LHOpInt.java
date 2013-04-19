package edu.bath.alivetemplates.test;

import javax.xml.bind.annotation.XmlType;

import edu.bath.owlsannotations.OwlBean;
import edu.bath.owlsannotations.URINamespace;

@URINamespace(prefix = "num", value = "http://numbers.org/Numbers.owl")
@OwlBean(ontology = "&num;", name = "LHOpInt")
@XmlType(namespace="http://test-simple/")
public class LHOpInt extends ANumber {

}
