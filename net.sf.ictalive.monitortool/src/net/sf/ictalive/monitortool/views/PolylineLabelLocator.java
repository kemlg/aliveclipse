package net.sf.ictalive.monitortool.views;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.PointList;

/**
 * Locator used to place a {@link PolylineLabelDecoration} on a
 * {@link Connection}.
 * 
 * @since 3.5
 */
public class PolylineLabelLocator implements Locator {

	private Connection connection;

	/**
	 * Constructs a LabelLocator associated with passed connection.
	 * 
	 * @param connection
	 *            The connection associated with the locator
	 */
	public PolylineLabelLocator(Connection connection) {
		this.connection = connection;
	}

	/**
	 * Relocates the passed in figure (which must be a
	 * {@link PolylineLabelDecoration}) at the start of the connection.
	 * 
	 * @param target
	 *            The PolylineLabelDecoration to relocate
	 */
	public void relocate(IFigure target) {

		PointList points = connection.getPoints();
		PolylineLabelDecoration dec = (PolylineLabelDecoration) target;

		dec.setLocation(points.getPoint(1));
		dec.setReferencePoint(points.getPoint(0));
	}
}