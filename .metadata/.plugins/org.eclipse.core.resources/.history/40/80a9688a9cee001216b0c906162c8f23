package net.sf.ictalive.service.enactment;

import java.io.IOException;

import net.sf.ictalive.eventbus.EventBus;

import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.DefaultProcessMonitor;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.query.ValueMap;

import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventFactory;
import net.sf.ictalive.runtime.event.impl.EventFactoryImpl;


public class EventBusEnactmentListener extends DefaultProcessMonitor {
	EventBus eventBus;
	EventFactory eventFactory = new EventFactoryImpl();
	Actor myActor = eventFactory.createActor();
	ServiceEnactmentEventFactory svcFactory = new ServiceEnactmentEventFactory();

	public EventBus getEventBus() {
		return eventBus;
	}

	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void executionFailed(ExecutionException e) {

		Event failedEvent = svcFactory.serviceFailedEvent(myActor, e
				.getProcess());
		net.sf.ictalive.runtime.event.Event runtimeEvent;
		try {
			eventBus.publish(failedEvent);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}

	}

	@Override
	public void executionFinished(Process arg0, ValueMap<Input, OWLValue> arg1,
			ValueMap<Output, OWLValue> arg2) {
		Event failedEvent = svcFactory.serviceSuccessEvent(myActor, arg0);
		try {
			eventBus.publish(failedEvent);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}

	}

	@Override
	public void executionStarted(Process arg0, ValueMap<Input, OWLValue> arg1) {
		// TODO Auto-generated method stub
		super.executionStarted(arg0, arg1);
	}

	@Override
	public void executionContinued(Process process) {
		// TODO Auto-generated method stub
		super.executionContinued(process);
	}

	@Override
	public void executionInterrupted(Process process, AtomicProcess lastProcess) {
		// TODO Auto-generated method stub
		super.executionInterrupted(process, lastProcess);
	}

	@Override
	public void intermediateResultsReceived(ValueMap<Parameter, OWLValue> values) {
		// TODO Auto-generated method stub
		super.intermediateResultsReceived(values);
	}
}
