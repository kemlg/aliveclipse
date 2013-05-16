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
public class Alive_MatchingParams extends AbstractPlugin {
    private final Preference<Match> po;{
        Preference<Match> po1 = Preferences.ParamExactness.INPUTS_OUTPUTS.preference();
        Preference<Match> po2 = new Preferences.TextualSimilarity(
            TextType.DESCRIPTION, Similarity.COSINE).preference();

        this.po = po1.preferredTo(po2);
    }

    public Alive_MatchingParams() {
        super(new MatchMaker(
                new Preferences.DescriptionSimilarityDecorator(),
                new Preferences.ParamExactnessDecorator()));
    }

    @Override
    protected Collection<Match> postprocess(Collection<Match> matches) {
        return po.sortedCopy(matches);
    }
}
