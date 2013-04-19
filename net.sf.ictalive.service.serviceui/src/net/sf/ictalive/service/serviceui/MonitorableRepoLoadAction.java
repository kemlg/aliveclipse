package net.sf.ictalive.service.serviceui;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.sf.ictalive.service.discovery.client.RepositoryFactory;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.svcrepo.HandlerCallBack;
import net.sf.ictalive.svcrepo.RemoteWebserviceRepository;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.service.Service;

import com.google.common.base.Preconditions;

/**
 * Action which loads a servics repostiory search
 * 
 * @author occ
 * 
 */
public class MonitorableRepoLoadAction implements IRunnableWithProgress {

	private RepositoryFactory wscFactory;
	boolean forceReload = true;

	public MonitorableRepoLoadAction(RepositoryFactory wscFactory,
			DiscoverySearch search, boolean forceReload) {

		this.forceReload = forceReload;
		Preconditions.checkNotNull(wscFactory);
		this.wscFactory = wscFactory;
		this.search = search;
	}

	DiscoverySearch search;

	private List<Service> services;

	public List<Service> getServices() {
		return services;
	}

	@Override
	public void run(final IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException {
		OWLKnowledgeBase owlKB = OWLFactory.createKB();

		if (!forceReload) {
			List<Service> cached = Activator.getDefault()
					.getServiceSearchCache().get(search);
			if (cached != null) {
				services = cached;
				return;
			}
		}

		monitor.beginTask("Loading services", IProgressMonitor.UNKNOWN);
		RemoteWebserviceRepository rwsc = new RemoteWebserviceRepository(
				wscFactory.createRepository(), search, owlKB);

		monitor.subTask("Searching for services");
		final List<Service> target = new LinkedList<Service>();
		rwsc.getAllServices(new HandlerCallBack<Service>() {
			@Override
			public void gotResults(Collection<Service> results, boolean hasMore) {
				if (results.size() > 0) {
					Service s = results.iterator().next();
					monitor.subTask("Loaded service " + s.getURI()
							+ " from repository");
					target.addAll(results);
				}
				//monitor.worked(100);
			}
		});

		services = target;
		Activator.getDefault().getServiceSearchCache().put(search, services);

	}

}
