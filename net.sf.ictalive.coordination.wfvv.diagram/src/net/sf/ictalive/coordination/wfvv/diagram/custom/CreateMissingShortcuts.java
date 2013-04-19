/**
 * @author Piotr Andruszkiewicz
 * 09/04/10 - DC updated for new (Feb 2010) metamodels and to explicilty import plan elements
 * 
 */
package net.sf.ictalive.coordination.wfvv.diagram.custom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.WfvvCreateShortcutDecorationsCommand;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramEditorPlugin;

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
	public static void createMissingShortcuts(EObject obj, Diagram d,
			TransactionalEditingDomain domain) {
		Set<EObject> contents = //new HashSet<EObject>();
				new HashSet<EObject>(d.getElement().eCrossReferences());
		CreateMissingShortcuts.referencedRetrieved = new LinkedList<EObject>();
		Set<EObject> references = getAllReferences(obj);//d.getElement());
		Iterator<EObject> it = references.iterator();
		while (it.hasNext()) {
			EObject eo = it.next();
			checkPresentInDiagram(d, domain, contents, eo);
		}
	}
	

	private static void checkPresentInDiagram(Diagram d,
			TransactionalEditingDomain domain, Set<EObject> contents, EObject eo) {
		if (!contents.contains(eo)) {
			// start of code adapted from gmf generated stuff
			CreateViewRequest.ViewDescriptor viewDescriptor =
					new CreateViewRequest.ViewDescriptor(
							new EObjectAdapter(eo),
							Node.class,
							null,
							WfvvDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			ICommand command = new CreateCommand(domain, viewDescriptor, d);
			command =
					command
							.compose(new WfvvCreateShortcutDecorationsCommand(
									domain, d, viewDescriptor));
			try {
				OperationHistoryFactory.getOperationHistory().execute(
						command, new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				WfvvDiagramEditorPlugin.getInstance().logError(
						"Unable to create shortcut", e); //$NON-NLS-1$
			}
			contents.add(eo);
			// end
		}
	}

	private static List<EObject> referencedRetrieved;
	
	/**
	 * Finds all objects referenced directly or indirectly by the given object.
	 * @param o object whose references are to be found
	 * @return set containing all the referenced objects
	 */
	private static Set<EObject> getAllReferences(EObject o) {
		if (CreateMissingShortcuts.referencedRetrieved.contains(o)){
			return new HashSet<EObject>();
		}
		List<EObject> l = o.eCrossReferences();
		Set<EObject> res = new HashSet<EObject>(l);
		res.add(o);
		CreateMissingShortcuts.referencedRetrieved.add(o);
		for (int i = 0; i < l.size(); i++) {
			res.addAll(getAllReferences(l.get(i)));
		}
		l = o.eContents();
		for (int i =0;i<l.size();i++){
			res.addAll(getAllReferences(l.get(i)));
		}
		
//		res.remove(o);
		return res;
	}

}
