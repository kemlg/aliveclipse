package net.sf.ictalive.coordination.wfvv.diagram.custom;

import net.sf.ictalive.coordination.wfvv.EventGroup;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.Node;

/*
 * to make this work add this line of code
 * installEditPolicy(EditPolicyRoles.OPEN_ROLE, new EventOpenEditPolicy());
 * at the end of createDefaultEditPolicies() method of EventEditPart and
 * Event2EditPart
 */

public class EventOpenEditPolicy extends OpenEditPolicy {

	@Override
	protected Command getOpenCommand(Request request) {
		EditPart ep = getTargetEditPart(request);
		Object o = ep.getModel();
		if (o instanceof Node) {
			Node n = (Node) o;
			if (n.getElement() instanceof Event) {
				Event e = (Event) n.getElement();
				EAttribute attr_min=EventPackage.eINSTANCE.getEvent_Minimized();
				Boolean min=e.isMinimized();
				EditingDomain editingDomain = ((IGraphicalEditPart)getTargetEditPart(request)).getEditingDomain();
				MySetPropertyCommand cmd = new MySetPropertyCommand((TransactionalEditingDomain) editingDomain, ep, attr_min, !min, !min);
				if (min){
					CreateMissingShortcuts.createMissingShortcuts(e, n.getDiagram(),(TransactionalEditingDomain) editingDomain);
				}
				return new ICommandProxy(cmd);
				}
			if (n.getElement() instanceof EventGroup) {
				EventGroup e = (EventGroup) n.getElement();
				EAttribute attr_min= WfvvPackage.eINSTANCE.getEventGroup_Minimized();
				Boolean min=e.isMinimized();
				EditingDomain editingDomain = ((IGraphicalEditPart)getTargetEditPart(request)).getEditingDomain();
				MySetPropertyCommand cmd = new MySetPropertyCommand((TransactionalEditingDomain) editingDomain, ep, attr_min, !min, !min);
				return new ICommandProxy(cmd);
				}
		}
		return null;
	}
}
