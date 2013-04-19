package net.sf.ictalive.svcrepo;

import java.util.Collection;
import java.util.List;

public interface HandlerCallBack<T extends Object> {
	public void gotResults(Collection<T> results, boolean hasMore);
}
