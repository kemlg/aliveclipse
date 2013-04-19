package net.sf.ictalive.dashboard.figure;

import net.sf.ictalive.dashboard.ActionSpecification;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class BoxFigure<S> extends RectangleFigure {

	public static final int MAX_BOX_WIDTH = 300;
	
	public int x, y, width, height;

	public abstract ActionSpecification[] getLabelActionIds();

	public abstract void addAction(IFigure actionFigure);

	public abstract void refresh();
	
	public void initializeSize() {
		Dimension size = getPreferredSize();
		this.width = Math.min(size.width, MAX_BOX_WIDTH);
		this.height = size.height;
	}
	
	// shorthands for during layout. Left and Top are x and y;
	public int getRight() {
		return x + width;
	}
	
	public int getBottom() {
		return y + height;
	}
	
	public Rectangle getLayoutDimensions() {
		return new Rectangle(x, y, width, height);
	}

	public void apply(Point offset) {
		setBounds( getLayoutDimensions().getTranslated(offset));
	}

}
