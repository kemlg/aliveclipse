/**
 * @author Piotr Andruszkiewicz
 * Adapted for this plugin by David Corsar
 */
package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.custom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.BpeldiagCreateShortcutDecorationsCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramEditorPlugin;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

public class CreateMissingShortcuts {

	/**
	 * Adds the missing shortcuts to the diagram.
	 * @param diagram diagram whose missing shortcuts need to be added
	 * @param domain the editing domain
	 */
	public static void createMissingShortcuts(Diagram d,
			TransactionalEditingDomain domain) {
		Set<EObject> contents =
				new HashSet<EObject>(d.getElement().eContents());
		Iterator<EObject> it = getAllReferences(d.getElement()).iterator();
		while (it.hasNext()) {
			EObject eo = it.next();
			if (!contents.contains(eo)) {
				// start of code adapted from gmf generated stuff
				CreateViewRequest.ViewDescriptor viewDescriptor =
						new CreateViewRequest.ViewDescriptor(
								new EObjectAdapter(eo),
								Node.class,
								null,
								BpeldiagDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				ICommand command = new CreateCommand(domain, viewDescriptor, d);
				command =
						command
								.compose(new BpeldiagCreateShortcutDecorationsCommand(
										domain, d, viewDescriptor));
				try {
					OperationHistoryFactory.getOperationHistory().execute(
							command, new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					BpeldiagDiagramEditorPlugin.getInstance().logError(
							"Unable to create shortcut", e); //$NON-NLS-1$
				}
				// end
			}
		}
	}

	/**
	 * Finds all objects referenced directly or indirectly by the given object.
	 * @param o object whose references are to be found
	 * @return set containing all the referenced objects
	 */
	private static Set<EObject> getAllReferences(EObject o) {
		List<EObject> l = o.eCrossReferences();
		Set<EObject> res = new HashSet<EObject>(l);
		l = o.eContents();
		for (int i = 0; i < l.size(); i++) {
			res.addAll(getAllReferences(l.get(i)));
		}
		res.remove(o);
		return res;
	}

}
