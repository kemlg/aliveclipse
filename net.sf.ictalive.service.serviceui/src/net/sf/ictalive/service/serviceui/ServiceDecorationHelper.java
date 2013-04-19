package net.sf.ictalive.service.serviceui;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataType;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLType;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceDecorationHelper {
	static Logger log = LoggerFactory.getLogger(ServiceDecorationHelper.class);

	public static String serviceToShortString(Service svc) {
		String label;
		if ((label = svc.getLabel(null)) != null)
			return label;
		else
			return svc.getURI().toString();
	}

	public static String paramListToString(
			OWLIndividualList<? extends Parameter> params) {

		if (params.size() == 0) {
			return "none";
		}

		StringBuffer sb = new StringBuffer();
		for (Parameter p : params) {
			String name = p.getName();
			OWLType type = p.getParamType();

			String typeName = null;
			if (type == null) {
				typeName = "???";
			} else if (type.canCastTo(OWLClass.class)) {
				OWLClass clazz = type.castTo(OWLClass.class);
				typeName = "Class(";
				if (clazz.getLocalName() != null) {
					typeName += clazz.getLocalName();
				} else {

					typeName += clazz.getURI().toString();
				}
				typeName += ")";

			} else if (type.canCastTo(OWLDataType.class)) {
				OWLDataType clazz = type.castTo(OWLDataType.class);
				typeName = "Data(";
				String fragment;
				if ((fragment = clazz.getURI().getFragment()) != null) {
					typeName += fragment;
				} else {
					typeName += clazz.getURI().toString();
				}

				typeName += ")";

			}

			if (typeName == null) // fallback
				typeName = type.getURI().toString();

			sb.append(typeName + " : " + name);
			sb.append("\n");
		}

		return sb.toString();
	}

	public static String processsToShortString(
			org.mindswap.owls.process.Process proc) {
		String label;
		if ((label = proc.getLocalName()) != null) {
			return label;
		} else {
			return proc.getURI().toString();
		}
	}
}
