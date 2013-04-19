package net.sf.ictalive.service.matchmakertab;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class UpdateMatchmakerJob extends Job {

	public UpdateMatchmakerJob() {
		super("Update matchmaker");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			Activator.getDefault().getRefreshMatchMakerRunnable().run(monitor);
			return Status.OK_STATUS;
		} catch (Exception e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, e.toString());
		} finally {
			monitor.done();
		}
	}
}
