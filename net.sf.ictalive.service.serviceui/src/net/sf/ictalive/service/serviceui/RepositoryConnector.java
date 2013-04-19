package net.sf.ictalive.service.serviceui;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.ClientUtils;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.operation.IRunnableWithProgress;

import com.google.common.base.Preconditions;

public class RepositoryConnector {

	public static final String Q = "net.sf.ictalive.service.serviceui.repo";
	public static final QualifiedName HAS_DETAILS = new QualifiedName(Q,
			"hasDetails");
	public static final QualifiedName SYNC = new QualifiedName(Q, "sync");

	public static final QualifiedName SVC_DESC = new QualifiedName(Q, "svcDesc");
	public static final QualifiedName SVC_LABEL = new QualifiedName(Q, "label");
	public static final QualifiedName SVC_SECTION = new QualifiedName(Q,
			"section");
	public static final QualifiedName SVC_MIMETYPE = new QualifiedName(Q,
			"mimeType");
	public static final QualifiedName SVC_URI = new QualifiedName(Q, "uri");

	public static boolean hasDetails(IResource res) {
		try {
			String inRepo = res.getPersistentProperty(HAS_DETAILS);
			return (inRepo != null && inRepo.equals("true"));
		} catch (CoreException e) {
			return false;

		}

	}

	public static void setSync(IFile theFile, boolean keepSynced)
			throws CoreException {
		theFile.setPersistentProperty(SYNC, keepSynced ? "true" : "false");

	}

	public static boolean isSynced(IResource res) {
		try {
			String dosync = res.getPersistentProperty(SYNC);
			return (dosync != null && dosync.equals("true"));
		} catch (CoreException e) {
			return false;

		}

	}

	public static void clearRepoProperties(IResource res) throws CoreException {
		res.setPersistentProperty(HAS_DETAILS, null);
		res.setPersistentProperty(SYNC, null);
		res.setPersistentProperty(SVC_DESC, null);
		res.setPersistentProperty(SVC_LABEL, null);
		res.setPersistentProperty(SVC_SECTION, null);
		res.setPersistentProperty(SVC_MIMETYPE, null);
		res.setPersistentProperty(SVC_URI, null);
	}

	public static ObjectDescriptor getRepoProperties(IResource res)
			throws CoreException {
		ObjectDescriptor desc = new ObjectDescriptor();

		if (!hasDetails(res)) {
			return null;
		}
		desc.setUri(URI.create(res.getPersistentProperty(SVC_URI)));
		desc.setLabel(res.getPersistentProperty(SVC_LABEL));
		desc.setDescription(res.getPersistentProperty(SVC_DESC));
		desc.setMimeType(res.getPersistentProperty(SVC_MIMETYPE));
		desc.setSection(res.getPersistentProperty(SVC_SECTION));
		return desc;
	}

	public static void saveRepoProperties(IResource res, boolean sync,
			ObjectDescriptor od) throws CoreException {
		res.setPersistentProperty(HAS_DETAILS, "true");
		res.setPersistentProperty(SYNC, sync ? "true" : "false");

		res.setPersistentProperty(SVC_DESC, od.getDescription());
		res.setPersistentProperty(SVC_LABEL, od.getLabel());
		res.setPersistentProperty(SVC_SECTION, od.getSection());
		res.setPersistentProperty(SVC_MIMETYPE, od.getMimeType());
		res.setPersistentProperty(SVC_URI, od.getUri().toString());
	}

	/**
	 * Finds synchronized resources in a container (e.g. workspace)
	 * 
	 * @author occ
	 * 
	 */
	public static class FindSyncedResourcesAction implements
			IRunnableWithProgress {

		List<IFile> resources = new LinkedList<IFile>();

		final IResource initial;

		public FindSyncedResourcesAction(IResource container) {
			this.initial = Preconditions.checkNotNull(container);
		}

		public void visitResource(IResource res, IProgressMonitor monitor) {
			if (res instanceof IFile && isSynced(res)) {
				resources.add((IFile) res);
			}
		}

		public void vistContainer(IContainer container, IProgressMonitor monitor)
				throws CoreException {
			for (IResource member : container.members(false)) {
				if (monitor.isCanceled()) {
					return;
				}
				monitor.worked(10);
				IContainer child;
				if ((member instanceof IContainer && null != (child = (IContainer) member))
						|| null != (child = (IContainer) member
								.getAdapter(IContainer.class))) {
					vistContainer(child, monitor);
				} else {
					visitResource(member, monitor);
				}
			}
		}

		@Override
		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {

			monitor.beginTask("Finding synchronized resources",
					IProgressMonitor.UNKNOWN);
			try {

				IContainer initialContainer;
				if ((initial instanceof IContainer && null != (initialContainer = (IContainer) initial))
						|| null != (initialContainer = (IContainer) initial
								.getAdapter(IContainer.class))) {
					vistContainer(initialContainer, monitor);
				} else {
					visitResource(initial, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			} finally {
				monitor.done();
			}
		}

		public List<IFile> getResources() {
			return resources;
		}
	}

	public static class SynchronizeResources implements IRunnableWithProgress {
		Map<IFile, ObjectDescriptor> resources;
		ObjectRepository wsr;

		public SynchronizeResources(Map<IFile, ObjectDescriptor> resources,
				ObjectRepository wsr) {
			this.resources = Preconditions.checkNotNull(resources);
			this.wsr = Preconditions.checkNotNull(wsr);
		}

		@Override
		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			monitor.beginTask("Uploading Resources", resources.size());
			try {
				for (Entry<IFile, ObjectDescriptor> entry : resources
						.entrySet()) {
					try {
						IFile res = entry.getKey();
						ObjectDescriptor od = entry.getValue();
						monitor.subTask("Uploading " + res.toString() + " to "
								+ od.getUri());
						wsr
								.storeObject(od.getUri(), URI
										.create("urn:alive-workspace"), od
										.getSection(), od.getLabel(), od
										.getDescription(), od.getMimeType(),
										ClientUtils.encodeFromStream(res
												.getContents()));

					} catch (CoreException e) {
						e.printStackTrace();
					}
					monitor.worked(1);
				}
			} finally {
				monitor.done();
			}

			Activator.getDefault().notifyServicesChanged();

		}
	}

}
