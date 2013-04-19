package net.sf.ictalive.service.enactment;

import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventFactory;
import net.sf.ictalive.runtime.event.impl.EventFactoryImpl;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Disaster;
import net.sf.ictalive.runtime.fact.ExecutedAct;
import net.sf.ictalive.runtime.fact.impl.ContentImpl;
import net.sf.ictalive.runtime.fact.impl.FactFactoryImpl;

public class ServiceEnactmentEventFactory {
	EventFactory eventFactory = new EventFactoryImpl();
	FactFactoryImpl factFactory = new FactFactoryImpl();

	Event serviceSuccessEvent(Actor myActor, Process svc) {
		Event successEvent;
		successEvent = eventFactory.createEvent();
		successEvent.setAsserter(myActor);
		Content messageContent = factFactory.createContent();
		ExecutedAct executedFact = factFactory.createExecutedAct();

		messageContent.setFact(executedFact);
		successEvent.setContent(messageContent);
		return successEvent;

	}

	Event serviceFailedEvent(Actor myActor, Process svc) {
		Event failedEvent;
		failedEvent = eventFactory.createEvent();
		failedEvent.setAsserter(myActor);
		Content messageContent = factFactory.createContent();
		Disaster failedFact = factFactory.createDisaster();
		messageContent.setFact(failedFact);
		failedEvent.setContent(messageContent);
		return failedEvent;
	}

	Event serviceUnavailableEvent(Actor myActor, Service svc) {
		Event failedEvent;
		failedEvent = eventFactory.createEvent();
		failedEvent.setAsserter(myActor);
		Content messageContent = factFactory.createContent();
		Disaster failedFact = factFactory.createDisaster();
		messageContent.setFact(failedFact);
		failedEvent.setContent(messageContent);
		return failedEvent;
	}
}
