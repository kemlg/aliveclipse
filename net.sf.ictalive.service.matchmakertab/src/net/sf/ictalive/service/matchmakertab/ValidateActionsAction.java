package net.sf.ictalive.service.matchmakertab;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.service.Service;

import agents.ServicePrefs;
import agents.ws.MatchMakerWS;
import agents.ws.MatchMakerWS.MatchResult;

public class ValidateActionsAction extends Action {
	IProgressMonitor monitor;
	List<net.sf.ictalive.coordination.actions.Action> actions;

	public ValidateActionsAction(IProgressMonitor monitor,
			List<net.sf.ictalive.coordination.actions.Action> actions) {
		this.monitor = monitor;
		this.actions = actions;
	}

	@Override
	public void run() {

		ActionToOWLS a2owls = new ActionToOWLS();
		MatchMakerWS mmws = Activator.getDefault().getMatchMakerWebService();
		ServicePrefs sp = net.sf.ictalive.service.matchmakertab.Activator
				.getDefault().getCurrentPrefs();
		Map<net.sf.ictalive.coordination.actions.Action, MatchResult[]> results = new HashMap<net.sf.ictalive.coordination.actions.Action, MatchResult[]>();
		monitor.beginTask("Validating plan actions", actions.size());

		OWLKnowledgeBase kb = OWLFactory.createKB();

		for (net.sf.ictalive.coordination.actions.Action a : actions) {

			if (monitor.isCanceled()) {
				monitor.done();
				return;
			}

			Service svc = a2owls.convertActionToService(a);
			StringWriter sw = new StringWriter();
			svc.getOntology().write(sw, svc.getOntology().getURI());

			MatchResult[] result = mmws.performMatch(sw.toString(), sp, 10);
			results.put(a, result);

			for (MatchResult mr : result) {
				try {
					kb.read(mr.getService());
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			monitor.worked(1);
		}
		Activator.getDefault().setMatchMakerResults(results);
		Activator.getDefault().setResultsKB(kb);

		monitor.done();
	}
}
