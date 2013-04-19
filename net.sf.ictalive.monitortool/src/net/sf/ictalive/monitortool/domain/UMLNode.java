package net.sf.ictalive.monitortool.domain;

import org.eclipse.draw2d.IFigure;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;

public class UMLNode extends GraphNode {

	public UMLNode(IContainer graphModel, int style, IFigure figure) {
		super(graphModel, style, figure);
	}

	protected IFigure createFigureForModel() {
		return (IFigure) this.getData();
	}
}
