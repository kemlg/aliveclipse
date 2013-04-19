package agents.ws;

import agents.ServicePrefs;
import com.google.common.collect.Maps;
import edu.bath.matchmaker.CompositeAdaptation;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchDecorator;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
@WebService(targetNamespace = MatchMakerWS.TARGET_NAMESPACE, portName = MatchMakerWS.PORT_NAME)
public interface MatchMakerWS {
	String TARGET_NAMESPACE = "http://www.cs.bath.ac.uk/alive";
	String SERVICE_NAME = "MatchMaker";
	String PORT_NAME = "MatchMakerPort";

	@WebMethod
	MatchResult[] performMatch(@WebParam(name = "queryOwls") String queryOwls,
			@WebParam(name = "preference") ServicePrefs preference,
			@WebParam(name = "maxResults") Integer maxResults);

	@WebMethod
	void registerService(@WebParam(name = "serviceOwls") String serviceOwls);

	@WebMethod
	void registerServiceByURL(
			@WebParam(name = "serviceOwlsURL") String serviceOwlsURL);

	public static class MatchDecoration {
		String decoration;

		public MatchDecoration() {
		}

		public MatchDecoration(String decorationKey, String value) {
			this.decoration = decorationKey;
			this.value = value;
		}

		public String getDecoration() {
			return decoration;
		}

		public void setDecoration(String decoration) {
			this.decoration = decoration;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		String value;
	}

	@XmlSeeAlso(AdaptationEdge.class)
	public static class MatchResult {
		private URI serviceURI;
		private HashMap<URI, AdaptationEdges> serviceInputAdaptations;
		private HashMap<URI, AdaptationEdges> queryOutputAdaptations;
		List<MatchDecoration> decorations;

		public List<MatchDecoration> getDecorations() {
			return decorations;
		}

		public void setDecorations(List<MatchDecoration> decorations) {
			this.decorations = decorations;
		}

		private HashMap<URI, URI> serviceInputs;
		private HashMap<URI, URI> serviceOutputs;

		public MatchResult() {
		}

		public MatchResult(URI serviceURI) {
			this.serviceURI = serviceURI;
		}

		public HashMap<URI, AdaptationEdges> getQueryOutputAdaptations() {
			return queryOutputAdaptations;
		}

		public void setQueryOutputAdaptations(
				HashMap<URI, AdaptationEdges> queryOutputAdaptations) {
			this.queryOutputAdaptations = queryOutputAdaptations;
		}

		public HashMap<URI, AdaptationEdges> getServiceInputAdaptations() {
			return serviceInputAdaptations;
		}

		public void setServiceInputAdaptations(
				HashMap<URI, AdaptationEdges> serviceInputAdaptations) {
			this.serviceInputAdaptations = serviceInputAdaptations;
		}

		public URI getService() {
			return serviceURI;
		}

		public void setService(URI serviceURI) {
			this.serviceURI = serviceURI;
		}

		/**
		 * Returns the matched service inputs, represented in a Map from
		 * parameter names to parameter types.
		 */
		public HashMap<URI, URI> getServiceInputs() {
			return serviceInputs;
		}

		public void setServiceInputs(HashMap<URI, URI> serviceInputs) {
			this.serviceInputs = serviceInputs;
		}

		/**
		 * Returns the matched service outputs, represented in a Map from
		 * parameter names to parameter types.
		 */
		public HashMap<URI, URI> getServiceOutputs() {
			return serviceOutputs;
		}

		public void setServiceOutputs(HashMap<URI, URI> serviceOutputs) {
			this.serviceOutputs = serviceOutputs;
		}

		public static MatchResult fromMatch(Match match) {
			MatchResult result = new MatchResult(match.getService().getURI());
			{
				HashMap<URI, AdaptationEdges> serviceInputAdaptations = Maps
						.newHashMap();
				for (URI serviceInput : match.getService().getInputTypes()) {
					CompositeAdaptation ca = match.adaptationForServiceInput(
							serviceInput).iterator().next();
					serviceInputAdaptations.put(serviceInput,
							new AdaptationEdges(toAdaptationEdgeList(ca)));
				}
				result.setServiceInputAdaptations(serviceInputAdaptations);
				result.setServiceInputs(Maps.newHashMap(match.getService()
						.getInputs()));
			}
			{
				HashMap<URI, AdaptationEdges> queryOutputAdaptations = Maps
						.newHashMap();
				for (URI queryOutput : match.getQuery().getOutputTypes()) {
					CompositeAdaptation ca = match.adaptationForQueryOutput(
							queryOutput).iterator().next();
					queryOutputAdaptations.put(queryOutput,
							new AdaptationEdges(toAdaptationEdgeList(ca)));
				}
				result.setQueryOutputAdaptations(queryOutputAdaptations);
				result.setServiceOutputs(Maps.newHashMap(match.getService()
						.getOutputs()));
			}

			List<MatchDecoration> mds = new LinkedList<MatchDecoration>();
			for (Entry<MatchDecorator.Decoration<? extends Object>, Object> entry : match
					.getDecorations().entrySet()) {
				MatchDecoration md = new MatchDecoration();
				md.setDecoration(entry.getKey().toString());
				md.setValue(entry.getValue().toString());
				mds.add(md);
			}
			result.setDecorations(mds);
			return result;
		}

		public static MatchResult[] fromMatches(Collection<Match> matches) {
			MatchResult[] array = new MatchResult[matches.size()];
			int pos = 0;
			for (Match m : matches) {
				array[pos++] = fromMatch(m);
			}
			return array;
		}

		private static ArrayList<AdaptationEdge> toAdaptationEdgeList(
				CompositeAdaptation ca) {
			ArrayList<AdaptationEdge> list = new ArrayList<AdaptationEdge>();
			for (int i = 0; i < ca.size(); i++) {
				Object key = ca.key(i);
				list.add(new AdaptationEdge(ca.from(i), ca.to(i),
						key != null ? key.toString() : "(cast)"));
			}
			return list;
		}
	}

	public static class AdaptationEdges {
		private ArrayList<AdaptationEdge> list;

		public AdaptationEdges() {
		}

		public AdaptationEdges(ArrayList<AdaptationEdge> list) {
			this.list = list;
		}

		public ArrayList<AdaptationEdge> getList() {
			return list;
		}

		public void setList(ArrayList<AdaptationEdge> list) {
			this.list = list;
		}

		public String toString() {
			return String.valueOf(list);
		}
	}

	public static class AdaptationEdge {
		private URI from;
		private URI to;
		private String description;

		public AdaptationEdge() {
		}

		public AdaptationEdge(URI from, URI to, String description) {
			setFrom(from);
			setTo(to);
			setDescription(description);
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public URI getFrom() {
			return from;
		}

		public void setFrom(URI from) {
			this.from = from;
		}

		public URI getTo() {
			return to;
		}

		public void setTo(URI to) {
			this.to = to;
		}

		public String toString() {
			return description;
		}
	}
}
