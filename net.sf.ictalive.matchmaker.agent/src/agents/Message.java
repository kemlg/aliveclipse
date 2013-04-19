package agents;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Messages of the communication of coordination agent and matchmaker agent.
 * 
 * <p>
 * Whenever a collection parameter is required in any message constructor, it is
 * assumed that this is given as a hand-off, i.e. no modification of the
 * collection is allowed by the user after it has been handed off to a message
 * constructor.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public interface Message extends Serializable {

	/**
	 * Returns the performative to use when sending this message.
	 * 
	 * @return the performative to use when sending this message
	 */
	String getPerformative();

	/**
	 * Sent by matchmaker when receiving a MoreResultsQuery message with an
	 * expired session id.
	 */
	public enum SessionTimeout implements Message {
		INSTANCE;

		public String getPerformative() {
			return "inform";
		}
	}

	/**
	 * Sent by coordination agent when it is done with a query.
	 */
	public static class SessionDone implements Message {
		public final String sessionId;

		private static final long serialVersionUID = 2381943861641476311L;

		public SessionDone(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getPerformative() {
			return "inform";
		}

		@Override
		public String toString() {
			return "SessionDone[sessionId=" + sessionId + "]";
		}
	}

	/**
	 * A request to the matchmaker asking for services matching the provided
	 * description.
	 */
	public static class ServiceQuery implements Message {
		public final QueryType queryType;
		public final List<String> inputTypes;
		public final List<String> outputTypes;
		public final int maxResults;
		public final String eventKey;

		private static final long serialVersionUID = 8005328407306937490L;

		public ServiceQuery(QueryType queryType, List<String> inputTypes,
				List<String> outputTypes, int maxResults, String eventKey) {
			this.queryType = Preconditions.checkNotNull(queryType);
			this.inputTypes = ImmutableList.copyOf(inputTypes);
			this.outputTypes = ImmutableList.copyOf(outputTypes);
			this.maxResults = maxResults;
			this.eventKey = eventKey;
		}

		public String getPerformative() {
			return "query";
		}

		@Override
		public String toString() {
			return "ServiceQuery[inputs=" + inputTypes + ", outputs="
					+ outputTypes + ", sessionID =" + eventKey + "]";
		}

		/**
		 * Represents the kind of the request - whether it should be answered by
		 * direct matching services or by adapted services.
		 */
		public enum QueryType {
			/**
			 * Requests directly matching services.
			 */
			NORMAL,

			/**
			 * Requests services that match via adaptation (may yield more
			 * results than {@link #NORMAL})
			 */
			ADAPTED;
		}
	}

	/**
	 * A request to the matchmaker asking for a different number of matches
	 * (typically more), for the same query that was associated with the
	 * specified session ID, assuming the session hasn't expired.
	 */
	public static class MoreResultsQuery implements Message {
		public final String sessionID;
		public final int maxResults;
		private static final long serialVersionUID = -2440044959767859970L;
		public final String eventKey;

		public MoreResultsQuery(String sessionID, int maxResults,
				String eventKey) {
			this.sessionID = Preconditions.checkNotNull(sessionID);
			this.maxResults = maxResults;
			this.eventKey = Preconditions.checkNotNull(eventKey);
		}

		public String getPerformative() {
			return "request";
		}

		@Override
		public String toString() {
			return "MoreResultsQuery[sessionId=" + sessionID + "]";
		}
	}

	/**
	 * Superclass of the kinds of responses of the matchmaker agent.
	 */
	public abstract static class Response implements Message {
		public final String sessionID;

		private static final long serialVersionUID = 8863057534598043124L;

		public Response(String sessionID) {
			this.sessionID = Preconditions.checkNotNull(sessionID);
		}

		public String getPerformative() {
			return "inform";
		}
	}

	/**
	 * The result of a service query, comprising several specific matches.
	 */
	public final static class ServiceResponse extends Response {
		public final List<URI> matches;

		private static final long serialVersionUID = -6880382150671014903L;

		public ServiceResponse(String sessionID, List<URI> matches) {
			super(sessionID);
			this.matches = Collections.unmodifiableList(matches);
		}

		@Override
		public String toString() {
			return "ServiceResponse[sessionId=" + sessionID + ", matches="
					+ matches + "]";
		}
	}

	/**
	 * The result of a service query, comprising several specific
	 * <em>adapted</em> matches.
	 */
	public final static class AdaptedServiceResponse extends Response {
		public final List<AdaptedService> adaptedServices;

		private static final long serialVersionUID = 6239508606890110654L;

		public AdaptedServiceResponse(String sessionID,
				List<AdaptedService> adaptedServices) {
			super(sessionID);
			this.adaptedServices = Collections
					.unmodifiableList(adaptedServices);
		}

		@Override
		public String toString() {
			return "AdaptedServiceResponse[sessionId=" + sessionID
					+ ", adaptedServices=" + adaptedServices + "]";
		}

		public final static class AdaptedService implements Serializable {
			public final URI adaptedServiceURI;
			public final String adaptedServiceOWLS;

			private static final long serialVersionUID = 2575504471210666250L;

			public AdaptedService(URI adaptedServiceURI,
					String adaptedServiceOWLS) {
				this.adaptedServiceURI = adaptedServiceURI;
				this.adaptedServiceOWLS = adaptedServiceOWLS;
			}

			@Override
			public String toString() {
				return String.valueOf(adaptedServiceURI);
			}
		}
	}
}
