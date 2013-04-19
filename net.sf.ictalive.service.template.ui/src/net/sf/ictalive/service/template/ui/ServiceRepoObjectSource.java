package net.sf.ictalive.service.template.ui;

import java.util.Collection;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectListResult;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;

public class ServiceRepoObjectSource implements
		MultipleObjectSource<ObjectDescriptor> {
	ObjectRepository repo;
	DiscoverySearch search;

	ServiceRepoObjectSource(ObjectRepository repo, DiscoverySearch search) {
		assert (repo != null);
		assert (search != null);
		this.repo = repo;
		this.search = search;
	}

	@Override
	public Collection<ObjectDescriptor> call() {
		ObjectListResult result = repo.search(search);
		return result.getObjects();
	}
}
