package net.sf.ictalive.service.enactment;

import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.execution.DefaultProcessMonitor;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;

public class ServiceEnactorFactory {

	String eventBusHost;
	int eventBusPort;

	public ProcessExecutionEngine getProcessExecutionEngine() {
		// create an execution engine
		ProcessExecutionEngine exec = OWLSFactory.createExecutionEngine();
		
		// Attach a listener to the execution engine
		exec.addMonitor(new DefaultProcessMonitor());
		return exec;
		
		

	}
}
