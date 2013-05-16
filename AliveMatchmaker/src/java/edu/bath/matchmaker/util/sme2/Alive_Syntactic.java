package edu.bath.matchmaker.util.sme2;

import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.Preferences;
import edu.bath.matchmaker.prefs.Preference;
import edu.bath.matchmaker.similarity.Similarity;
import edu.bath.matchmaker.similarity.TextType;
import java.util.Collection;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class Alive_Syntactic extends AbstractPlugin {
    private final Preference<Match> po = new Preferences.TextualSimilarity(
            TextType.DESCRIPTION, Similarity.COSINE).preference();

    public Alive_Syntactic() {
        super(new MatchMaker(new Preferences.DescriptionSimilarityDecorator()));
    }

    @Override
    protected Collection<Match> postprocess(Collection<Match> matches) {
        return po.sortedCopy(matches);
    }
}
