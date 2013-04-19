package agents;

import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.Preferences;
import edu.bath.matchmaker.Preferences.TextualSimilarity;
import edu.bath.matchmaker.prefs.Preference;
import edu.bath.matchmaker.similarity.Similarity;
import edu.bath.matchmaker.similarity.TextType;

public enum ServicePrefs {
	DEFAULT(Preferences.ParamExactness.INPUTS_OUTPUTS.preference().preferredTo(
			Preference.<Match> consensus(
					QualityOfServicePreferences.PERFORMANCE.preference(),
					QualityOfServicePreferences.RELIABILITY.preference()))),

	BEST_PERFORMANCE(QualityOfServicePreferences.PERFORMANCE.preference()),

	BEST_RELIABILITY(QualityOfServicePreferences.PERFORMANCE.preference()),

	BEST_PERFORMANCE_AND_RELIABILITY(Preference.<Match> consensus(
			QualityOfServicePreferences.PERFORMANCE.preference(),
			QualityOfServicePreferences.RELIABILITY.preference())),

	BEST_INPUTS(Preferences.ParamExactness.INPUTS.preference()),

	BEST_OUTPUTS(Preferences.ParamExactness.OUTPUTS.preference()),

	BEST_INPUTS_AND_OUTPUTS(Preferences.ParamExactness.INPUTS_OUTPUTS
			.preference()),

	BEST_SIMILARITY(new TextualSimilarity(TextType.POSTCONDITIONS,
			Similarity.JACCARD).preference().preferredTo(
			new TextualSimilarity(TextType.DESCRIPTION, Similarity.JACCARD)
					.preference())),

	BEST_INPUTS_AND_OUTPUTS_SIMILARITY(BEST_INPUTS_AND_OUTPUTS.getPreference()
			.preferredTo(BEST_SIMILARITY.getPreference())),

	BEST_INPUTS_AND_OUTPUTS_SIMILARITY_PERF(BEST_INPUTS_AND_OUTPUTS
			.getPreference().preferredTo(
					Preference.<Match> consensus(BEST_SIMILARITY
							.getPreference(), BEST_PERFORMANCE_AND_RELIABILITY
							.getPreference()))),
	BEST_PERF_INPUTS_OUTPUTS(BEST_PERFORMANCE_AND_RELIABILITY.getPreference().preferredTo(BEST_INPUTS_AND_OUTPUTS.getPreference()));;

	
	private final Preference<Match> pref;

	ServicePrefs(Preference<Match> pref) {
		this.pref = pref;
	}

	public Preference<Match> getPreference() {
		return pref;
	}
}
