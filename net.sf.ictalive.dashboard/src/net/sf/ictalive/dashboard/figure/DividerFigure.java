package net.sf.ictalive.dashboard.figure;

import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

public class DividerFigure extends Polyline {

	public static int HORIZONTAL = 0;

	public static int VERTICAL = 1;

	public int orientation, pos;
	
	private PointList nonTranslatedPoints;

	public DividerFigure (int orientation) {
		setLineStyle(org.eclipse.swt.SWT.LINE_DASH);
		this.orientation = orientation;
	}

	public void performLayout(Dimension containerSize) {
		nonTranslatedPoints = new PointList();
		if (orientation == HORIZONTAL) {
			nonTranslatedPoints.addPoint(0, pos);
			nonTranslatedPoints.addPoint(containerSize.width, pos);
		}
		else {
			nonTranslatedPoints.addPoint(pos, 0);
			nonTranslatedPoints.addPoint(pos, containerSize.height);
		}
	}

	public void apply(Point offset) {
		setPoints(getTranslated(nonTranslatedPoints, offset));
	}
	
	private PointList getTranslated(PointList source, Point offset) {
		PointList target = new PointList(source.size());
		target.addAll(source);
		target.translate(offset);
		return target;
	}
}