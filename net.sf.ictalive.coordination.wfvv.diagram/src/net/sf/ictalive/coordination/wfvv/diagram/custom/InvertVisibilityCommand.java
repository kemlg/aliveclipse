package net.sf.ictalive.coordination.wfvv.diagram.custom;

import org.eclipse.gmf.runtime.notation.Node;

public class InvertVisibilityCommand extends org.eclipse.emf.common.command.AbstractCommand {

	Node node;
	public InvertVisibilityCommand(Node node) {
		this.node=node;
	}
	public void execute() {
		node.setVisible(!node.isVisible());
	}

	public void redo() {
		node.setVisible(!node.isVisible());
	}
	
	public boolean prepare(){
		return true;
	}
}
