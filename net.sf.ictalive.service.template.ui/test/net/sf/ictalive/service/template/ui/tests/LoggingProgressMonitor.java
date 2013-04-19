package net.sf.ictalive.service.template.ui.tests;

import org.eclipse.core.runtime.IProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProgressMonitor implements IProgressMonitor {
	Logger log = LoggerFactory.getLogger(LoggingProgressMonitor.class);

	@Override
	public void beginTask(String name, int totalWork) {
		log.debug("Beginning task {}  {} ", name, totalWork);
	}

	@Override
	public void done() {
		// TODO Auto-generated method stub

	}

	@Override
	public void internalWorked(double work) {
		log.debug("internal worked {} ", work);

	}

	@Override
	public boolean isCanceled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCanceled(boolean value) {
		log.debug("Cancelled");

	}

	@Override
	public void setTaskName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subTask(String name) {
		log.debug("SubTask: {}", name);

	}

	@Override
	public void worked(int work) {
		// TODO Auto-generated method stub

	}

}
