package net.sf.ictalive.service.enactment.policy;

import java.util.LinkedList;
import java.util.List;

import org.mindswap.owls.service.Service;

public class ExplicitServicePolicy extends ServicePolicy {

	List<Service> services = new LinkedList<Service>();

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
}
