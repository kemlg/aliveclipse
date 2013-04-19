package net.sf.ictalive.coordination.wfvv.diagram.custom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramEditor;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.gef.Tool;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;

public class WorkflowPaletteFactory extends PaletteFactory.Adapter {

	/*
	 * instance of this class is shared between all open diagrams and persists
	 * even if all the diagrams of that type get closed
	 */

	private Tool tool = new SelectionTool();

	private int windowSize = 3;

	public Tool createTool(String toolId) {
		WfvvDiagramEditor wfDiagEdit = (WfvvDiagramEditor) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		Diagram d = wfDiagEdit.getDiagram();
		List nodes = new ArrayList(wfDiagEdit.getDiagram()
				.getPersistedChildren());
		if (toolId != null) {
			if (toolId.equals("next")) {
				moveWindowForward(nodes, wfDiagEdit);
			}
			if (toolId.equals("previous")) {
				moveWindowBack(nodes, wfDiagEdit);
			}
			if (toolId.equals("changeWindowSize")) {
				ChangeWindowSizeDialog c = new ChangeWindowSizeDialog(
						PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getShell());
				if (c.open() == Dialog.OK) {
					int newSize = c.getSelectedValue();
					if (newSize > 0) {
						changeWindowSize(nodes, newSize, wfDiagEdit);
					}
				}
			}
			if (toolId.equals("reset")) {
				// get all the nodes
				if (nodes.size() == 0)
					nodes
							.addAll(wfDiagEdit.getDiagram()
									.getTransientChildren());

				// find the first node, ensure it is visible, then do the same
				// for the next windowSize-1 nodes
				Node first = getFirst(nodes, null);
				if (first != null) {
					if (!(first.isVisible())) {
						invertVisibility(first, wfDiagEdit);
					}
					nodes.remove(first);
					for (int i = 0, j = this.windowSize - 1; i < j; i++) {
						Node next = getFirst(nodes, (Event)first.getElement());
						if (next == null)
							return null;
						if (!(next.isVisible())){
							invertVisibility(next, wfDiagEdit);
						}
						nodes.remove(next);
						first = next;
					}
				}

				// make the remainder of the nodes not visible
				for (Node next = getFirst(nodes, (Event)first.getElement()); next!=null;next = getFirst(nodes, (Event)first.getElement())){
					if (next == null){
						return null;
					}
					if (next.isVisible()){
						invertVisibility(next, wfDiagEdit);
					}
					nodes.remove(next);
					first = next;
				}
				
				// Node first = getFirst(nodes, null, true);
				// Node second = getFirst(nodes, (Event)first.getElement(),
				// true);
				// for (Object obj : nodes){
				// if (obj != first && obj != second)
				// invertVisibility((Node)obj, wfDiagEdit);
				// }
			}
		}
		return tool;
	}

	private void changeWindowSize(List nodes, int windowSize,
			WfvvDiagramEditor wfDiagEdit) {
		int count = getEventCount(nodes, true);
		this.windowSize = windowSize;
		if (count > windowSize) {
			for (int i = 0; i < count - windowSize; i++) {
				Node n = getLast(nodes, null, true);
				invertVisibility(n, wfDiagEdit);
			}
		} else {
			Node lastVisible = getLast(nodes, null, true);
			Event e = null;
			if (lastVisible != null) {
				e = (Event) lastVisible.getElement();
			}
			for (int i = 0; i < windowSize - count; i++) {
				Node n = getFirst(nodes, e, false);
				invertVisibility(n, wfDiagEdit);
			}
		}

	}

	private void moveWindowForward(List nodes, WfvvDiagramEditor wfDiagEdit) {
		Node lastVisible = getLast(nodes, null, true);
		Node nextInvisible = null;
		if (lastVisible != null) {
			nextInvisible = getFirst(nodes, (Event) lastVisible.getElement(),
					false);
			invertVisibility(nextInvisible, wfDiagEdit);
		}
		if (getEventCount(nodes, true) > windowSize) {
			nodes.remove(nextInvisible);
			Node firstVisible = getFirst(nodes, null, true);
			invertVisibility(firstVisible, wfDiagEdit);
		}
	}

	private void moveWindowBack(List nodes, WfvvDiagramEditor wfDiagEdit) {
		Node firstVisible = getFirst(nodes, null, true);
		Node previousInvisible = null;
		if (firstVisible != null) {
			previousInvisible = getLast(nodes, (Event) firstVisible
					.getElement(), false);
			invertVisibility(previousInvisible, wfDiagEdit);
		}
		if (getEventCount(nodes, true) > windowSize) {
			nodes.remove(previousInvisible);
			Node lastVisible = getLast(nodes, null, true);
			invertVisibility(lastVisible, wfDiagEdit);
		}
	}

	private int getEventCount(List nodes, boolean visible) {
		int res = 0;
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i) instanceof Node) {
				Node n = (Node) nodes.get(i);
				if (n.isVisible() == visible && n.getElement() instanceof Event) {
					res++;
				}
			}
		}
		return res;
	}

	private Node getFirst(List<Node> nodes, Event min) {
		Node res = null;
		long first = Long.MAX_VALUE;
		long minTimestamp = Long.MIN_VALUE;
		if (min != null && min.getTimestamp() != null) {
			minTimestamp = min.getTimestamp().getTime();
		}
		for (int i = 0; i < nodes.size(); i++) {
			Node n = (Node) nodes.get(i);
			if (n.getElement() instanceof Event) {
				Event e = (Event) n.getElement();
				if (!e.equals(min)) {
					Date t = e.getTimestamp();
					if (t != null && t.getTime() < first
							&& t.getTime() >= minTimestamp) {
						first = t.getTime();
						res = n;
					} 
//					else if (first == Long.MAX_VALUE) {
//						res = n;
//					}
				}
			}
		}
		return res;
	}

	private Node getFirst(List<Node> nodes, Event min, boolean visible) {
		Node res = null;
		long first = Long.MAX_VALUE;
		long minTimestamp = Long.MIN_VALUE;
		if (min != null && min.getTimestamp() != null) {
			minTimestamp = min.getTimestamp().getTime();
		}
		for (int i = 0; i < nodes.size(); i++) {
			Node n = (Node) nodes.get(i);
			if (n.isVisible() == visible && n.getElement() instanceof Event) {
				Event e = (Event) n.getElement();
				if (!e.equals(min)) {
					Date t = e.getTimestamp();
					if (t != null && t.getTime() < first
							&& t.getTime() >= minTimestamp) {
						first = t.getTime();
						res = n;
					} 
//					else if (first == Long.MAX_VALUE) {
//						res = n;
//					}
				}
			}
		}
		return res;
	}

	private Node getLast(List<Node> nodes, Event max, boolean visible) {
		Node res = null;
		long last = Long.MIN_VALUE;
		long maxTimestamp = Long.MAX_VALUE;
		if (max != null && max.getTimestamp() != null) {
			maxTimestamp = max.getTimestamp().getTime();
		}
		for (int i = 0; i < nodes.size(); i++) {
			Node n = (Node) nodes.get(i);
			if (n.isVisible() == visible && n.getElement() instanceof Event) {
				Event e = (Event) n.getElement();
				if (!e.equals(max)) {
					Date t = e.getTimestamp();
					if (t != null && t.getTime() > last
							&& t.getTime() <= maxTimestamp) {
						last = t.getTime();
						res = n;
					} 
//					else if (last == Long.MIN_VALUE) {
//						res = n;
//					}
				}
			}
		}
		return res;
	}

	private void invertVisibility(Node n, WfvvDiagramEditor wfDiagEdit) {
		if (n != null) {
			InvertVisibilityCommand c = new InvertVisibilityCommand(n);
			wfDiagEdit.getEditingDomain().getCommandStack().execute(c);
		}
	}

}
