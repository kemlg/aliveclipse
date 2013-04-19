package agents;

import edu.bath.matchmaker.MatchMaker;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public abstract class ReloadableMatchMaker {
    public abstract MatchMaker getMatchMaker();
    public abstract void reload();

    public static ReloadableMatchMaker createSimple() {
        return new SimpleReloadableMatchMaker();
    }

    private static class SimpleReloadableMatchMaker extends ReloadableMatchMaker {
        private volatile MatchMaker mm = new MatchMaker();

        @Override
        public MatchMaker getMatchMaker() {
            return mm;
        }

        @Override
        public void reload() {
            mm = new MatchMaker();
        }

    }
}
