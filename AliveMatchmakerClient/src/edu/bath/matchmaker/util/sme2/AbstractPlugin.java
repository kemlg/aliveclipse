package edu.bath.matchmaker.util.sme2;

import com.google.common.collect.Maps;
import edu.bath.matchmaker.InputMatchers;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatchers;
import edu.bath.matchmaker.OwlsUtils;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import org.mindswap.owl.OWLOntology;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public abstract class AbstractPlugin implements de.dfki.sme2.IMatchmakerPlugin {
    protected final MatchMaker mm;
    private final Map<URI, URL> serviceToURL = Maps.newHashMap();

    protected AbstractPlugin(MatchMaker mm) {
        this.mm = mm;
    }

    public void input(URL url) {
        OWLOntology onto = parse(url);
        serviceToURL.put(onto.getService().getURI(), url);
        mm.registerService(onto);
    }

    public Hashtable<URL, Vector<URL>> query(URL query) {
        try {
            Vector<URL> results = new Vector<URL>();

            Collection<Match> matches = mm.match(parse(query), InputMatchers.SUPERCLASSES, OutputMatchers.SUBCLASSES);
            matches = postprocess(matches);

            for (Match m : matches) {
                results.add(serviceToURL.get(m.getService().getURI()));
            }

            Hashtable<URL, Vector<URL>> table = new Hashtable<URL, Vector<URL>>(1, 1.0f);
            table.put(query, results);
            return table;
        } catch (Exception e) { throw new RuntimeException(e); }
    }

    private OWLOntology parse(URL url) {
        try {
            return OwlsUtils.parseURL(url, url.toURI());
        } catch (Exception e) { throw new RuntimeException(e); }
    }

    protected Collection<Match> postprocess(Collection<Match> matches) {
        return matches;
    }
}
