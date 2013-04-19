package agents;

import java.io.IOException;
import net.sf.ictalive.eventbus.exception.EventBusConnectionException;

import agents.Message.*;
import com.google.common.base.Preconditions;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.OwlsUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.ActionFactory;
import net.sf.ictalive.runtime.action.MatchmakerQuery;
import net.sf.ictalive.runtime.action.MatchmakerResponse;
import net.sf.ictalive.runtime.action.MatchmakerResult;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Cause;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventFactory;
import net.sf.ictalive.runtime.event.Key;
import net.sf.ictalive.runtime.event.PointOfView;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FactFactory;
import net.sf.ictalive.runtime.fact.impl.ContentImpl;
import org.eclipse.emf.common.util.EList;
import org.mindswap.owl.OWLOntology;

class EventManager {
	private final EventBus eventBus;
	private final Executor eventPublisher;
	private final String publisherId;
	private String lastEventKey;

	private static final String EVENTBUS_HOST = "147.83.200.118";

	EventManager(Executor eventPublisher, String publisherId) {
		this.eventPublisher = Preconditions.checkNotNull(eventPublisher);
		this.publisherId = publisherId;
		EventBus tmpEventBus = null;
		try {
			tmpEventBus = new EventBus(EVENTBUS_HOST);
		} catch (EventBusConnectionException ex) {
			System.err.println("Failed to create event bus on " + EVENTBUS_HOST
					+ ", error: " + ex.getMessage()
					+ "\nTrying localhost instead...");
			try {
				tmpEventBus = new EventBus("localhost");
			} catch (EventBusConnectionException ex1) {
				// print and ignore, no quality of service stats
				System.err
						.println("Failed to create event bus locally, error: "
								+ ex.getMessage());
			}
		}
		eventBus = tmpEventBus;
	}

	Event pollEvent() {
		if (eventBus == null)
			return null;
		return eventBus.takeNow();
	}

	boolean isActive() {
		return eventBus != null;
	}

	void publishQueryEvent(ServiceQuery query, OWLOntology queryOnto) {

		if (!isActive())
			return;
		MatchmakerQuery action = ActionFactory.eINSTANCE
				.createMatchmakerQuery();
		action.setQuery(OwlsUtils.toString(queryOnto, queryOnto.getURI()));

		publish(createEventFromAction(action, lastEventKey = query.eventKey));
	}

	void publishResponseEvent(List<Match> matches) {
		if (!isActive())
			return;
		MatchmakerResponse action = ActionFactory.eINSTANCE
				.createMatchmakerResponse();

		EList<MatchmakerResult> results = action.getQueryResult();
		for (Match match : matches) {
			MatchmakerResult result = ActionFactory.eINSTANCE
					.createMatchmakerResult();
			result.setServiceURI(match.getService().getURI().toString());

			double reliability = (Double) match
					.getDecoration(QualityOfServicePreferences.RELIABILITY);
			long performance = (Long) match
					.getDecoration(QualityOfServicePreferences.PERFORMANCE);
			result.setReliability(reliability);
			result.setPerformance(performance);
			results.add(result);
		}

		publish(createEventFromAction(action, lastEventKey));
	}

	private void publish(final Event event) {
		addAsserterAndLocalKey(event);

		eventPublisher.execute(new Runnable() {
			public void run() {
				try {
					eventBus.publish(event);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

	private final AtomicInteger localKeyCounter = new AtomicInteger(0);

	private void addAsserterAndLocalKey(Event event) {
		Actor a = EventFactory.eINSTANCE.createActor();
		a.setName(publisherId);
		event.setAsserter(a);
		Key eventKey = EventFactory.eINSTANCE.createKey();
		eventKey.setId(Integer.toString(localKeyCounter.getAndIncrement()));
		event.setLocalKey(eventKey);
		PointOfView pov = EventFactory.eINSTANCE.createActorView();
		event.setPointOfView(pov);
	}

	private Event createEventFromAction(Action action, String eventKey) {

		Fact fact = FactFactory.eINSTANCE.createExecutedAct();
		fact.setEffect(action);

		Content content = new ContentImpl() {
		};
		content.setFact(fact);

		Event event = EventFactory.eINSTANCE.createEvent();
		event.setContent(content);
		Event causalEvent = EventFactory.eINSTANCE.createEvent();
		Key key = EventFactory.eINSTANCE.createKey();
		key.setId(eventKey);
		causalEvent.setLocalKey(key);
		Cause cause = EventFactory.eINSTANCE.createCause();
		cause.setEvent(causalEvent);
		event.getProvenance().add(cause);
		return event;
	}
}
