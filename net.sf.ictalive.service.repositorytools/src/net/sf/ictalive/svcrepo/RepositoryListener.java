package net.sf.ictalive.svcrepo;


public interface RepositoryListener<T extends Object> {

	public void onServiceRegistered(T svc);

	public void onServiceUnregistered(T svc);
}
