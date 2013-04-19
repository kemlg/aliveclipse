package net.sf.ictalive.service.matchmakertab.tests;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;

import net.sf.ictalive.service.matchmakertab.views.MatchResultDraw2d;

import org.eclipse.swt.widgets.Shell;

import agents.ws.MatchMakerWS.AdaptationEdge;
import agents.ws.MatchMakerWS.AdaptationEdges;
import agents.ws.MatchMakerWS.MatchResult;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.Subsumption;

public class AdaptationTest {

	static URI A = URI.create("A");
	static URI AA = URI.create("AA");
	static URI B = URI.create("B");
	static URI C = URI.create("C");
	static URI D = URI.create("D");
	static URI E = URI.create("E");
	static URI F = URI.create("F");
	static URI G = URI.create("G");
	static URI H = URI.create("H");
	
	static URI S = URI.create("S");
	static URI P1 = URI.create("P1");
	static URI P2 = URI.create("P2");
	static URI O1 = URI.create("O1");
	static URI O2 = URI.create("O2");
	
	static void test(MatchMaker mm) {
		
//		Subsumption<URI> s = mm.getMutableSubsumption();
//		s.subsumedBy().relate( E, A);
		
		mm.registerAdaptation("AA2E", 1, AA, Collections.singleton( E));
		//mm.registerAdaptation("E2A", 1, E, Collections.singleton( A));
		mm.registerAdaptation("F2B", 1, F, Collections.singleton( B));
		mm.registerAdaptation("C2G", 1, C, Collections.singleton( G));
		mm.registerAdaptation("D2H", 1, D, Collections.singleton( H));
		
		ServiceDescriptor sd = ServiceDescriptor.fromInputsOutputs(S, ImmutableMap.of(P1, A, P2, B),  ImmutableMap.of(O1, C, O2, D));
		
		mm.registerService(sd.toOwls("").getOntology());
		
	}
	
	public static ServiceDescriptor getTestServiceDescriptor() {
		return ServiceDescriptor.query(ImmutableSet.of(E ,F), 
				ImmutableSet.of(G,H));
	}
	
	public static MatchResult[] testAdaptations(ServiceDescriptor sd) {
		MatchMaker mm = new MatchMaker();
		test(mm);
		
		Collection<Match> results = mm.match(sd.toOwls("").getOntology(), 
						InputMatcher.SUPERCLASSES,
						OutputMatcher.SUBCLASSES);
				
		
		for(Match m : results) {
		
			
			
			System.out.println(m.toString());
			for(URI servInp : m.getService().getInputTypes()) {
				
				System.out.println("  " + servInp + ", " + m.adaptationForServiceInput(servInp).iterator().next());
			}
			for(URI qOut : m.getQuery().getOutputTypes()) {
				System.out.println("  " + qOut + ", " + m.adaptationForQueryOutput(qOut).iterator().next());
			}
		}
		
		return MatchResult.fromMatches(results);
		
	}
	
	public static void main(String[] args) {
		
		ServiceDescriptor sd = getTestServiceDescriptor();
		MatchResult[] mrs = testAdaptations(sd);
		
		for(int i = 0; i < mrs.length; i++) {
		
			System.out.println("MatchResult " + i);
			
			for(Entry<URI, URI> inp : mrs[i].getServiceInputs().entrySet()) {
				System.out.println("  input " + inp.getKey() + "  :  " + inp.getValue());
				
				AdaptationEdges edges = mrs[i].getServiceInputAdaptations().get(inp.getValue());
				
				if(edges == null) {
					System.out.println("    edges null");
				} else {
					for(AdaptationEdge edge : edges.getList()) {
						System.out.println("    edge: " + edge.getDescription() + " ( " + edge.getFrom() + "  :  " + edge.getTo() + " )");
					}
				}
				
			}
		
			for(Entry<URI, URI> out : mrs[i].getServiceOutputs().entrySet()) {
				System.out.println("  output " + out.getKey() + "  :  " + out.getValue());
				
				AdaptationEdges edges = mrs[i].getQueryOutputAdaptations().get(out.getValue());
				
				if(edges == null) {
					System.out.println("    edges null");
				} else {
					for(AdaptationEdge edge : edges.getList()) {
						System.out.println("    edge: " + edge.getDescription() + " ( " + edge.getFrom() + "  :  " + edge.getTo() + " )");
					}
				}
				
			}
			
			for(Entry<URI, AdaptationEdges> kvp : mrs[i].getQueryOutputAdaptations().entrySet()) {
				System.out.println(kvp.getKey());
				for(AdaptationEdge edge : kvp.getValue().getList()) {
					System.out.println("    edge: " + edge.getDescription() + " ( " + edge.getFrom() + "  :  " + edge.getTo() + " )");
				}
			}
			
			
		}
		
		Shell sh = new Shell();
		MatchResultDraw2d vis = new MatchResultDraw2d(sh);
		
		vis.setMatchResultAndQuery(mrs[0], null);
		
		sh.setSize(800, 800);
		sh.open();
		sh.setText("Matchmaker display test");
		//Display disp = Display.getDefault();
		//while (! sh.isDisposed()) {
		//	if(! disp.readAndDispatch()) {
		//		disp.sleep();
		//	}
		//}
		
	}
	
}
