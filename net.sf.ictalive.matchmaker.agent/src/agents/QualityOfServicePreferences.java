package agents;

import agents.QualityOfServiceAggregator.Stats;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchDecorator;
import edu.bath.matchmaker.MatchDecorator.Decoration;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.Subsumption;
import edu.bath.matchmaker.prefs.Preference;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import org.mindswap.owls.service.Service;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class QualityOfServicePreferences {
    static final Decoration<Long> PERFORMANCE = new Decoration<Long>() { //average time (long), less is better, so relying on natural order
        public Preference<Match> preference() {
            return Preference.natural().onResultOf(new Function<Match, Long>() {
                public Long apply(Match match) {
                    return (Long)match.getDecoration(PERFORMANCE);
                }
            });
        }
        @Override public String toString() { return "PERFORMANCE"; }
    };
    static final Decoration<Double> RELIABILITY = new Decoration<Double>() { //success ratio (double), more is better, so reversing the natural order
        public Preference<Match> preference() {
            return Preference.natural().reverse().onResultOf(new Function<Match, Double>() {
                public Double apply(Match match) {
                    return (Double)match.getDecoration(RELIABILITY);
                }
            });
        }
        @Override public String toString() { return "RELIABILITY"; }
    };

     public static MatchDecorator createMatchDecorator(final QualityOfServiceAggregator aggr) {
        Preconditions.checkNotNull(aggr);
        return new MatchDecorator() {
            public void decorate(MatchMaker matchMaker, Subsumption<URI> subsumption, ServiceDescriptor queryDescr, Service query,
                    List<? extends Match> match) {
                for (Match m : match) {
                    Stats stats = aggr.getServiceMetrics(m.getService().getURI());
                    m.putDecoration(PERFORMANCE, stats.avgTime());
                    m.putDecoration(RELIABILITY, stats.successRatio());
                }
            }

            public void onRegistration(MatchMaker matchMaker, ServiceDescriptor serviceDescr, Service service) { }
            public void onDeregistration(MatchMaker matchMaker, ServiceDescriptor serviceDescr) { }
            public Collection<? extends Decoration<?>> providedDecorations() { return ImmutableList.of(PERFORMANCE, RELIABILITY); }
        };
    }
}
