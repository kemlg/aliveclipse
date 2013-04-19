package impl.owls.grounding;

import java.net.URI;

public class ServiceClassFactory {

	static ThreadLocal<ServiceClassFactory> current = new ThreadLocal<ServiceClassFactory>();

	public static ServiceClassFactory getDefault() {
		ServiceClassFactory dfl = current.get();

		if (dfl == null) {
			current.set(dfl = new ServiceClassFactory());
		}
		return dfl;
	}

	public <T> T getServiceInstance(Class<T> clazz, URI uri)
			throws IllegalAccessException, InstantiationException {
		return clazz.newInstance();
	}

	public static void setDefault(ServiceClassFactory scf) {
		current.set(scf);
	}
}
