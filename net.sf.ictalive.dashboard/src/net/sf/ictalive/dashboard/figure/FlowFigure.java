/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package net.sf.ictalive.dashboard.figure;


import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author dstadnik
 */
public class FlowFigure extends Polyline implements Connection {

	private int dashboardViewType;
	
	public static final int TOP = 0;

	public static final int RIGHT = 1;
	
	public static final int BOTTOM = 2;

	public static final int LEFT = 3;

	private RotatableDecoration startArrow, endArrow;

	private BoxFigure fromFigure, toFigure;

	private FlowActionFigure actionFigure;
	
	private int exitSide, entrySide; // describes the sides where the arrow originates and ends

	private int exitTweak, entryTweak; // used to move the arrow when multiple arrows come from or meet in the same point.
	
	private PointList nonTranslatedPoints;

	public FlowFigure(BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure, FlowActionFigure actionFigure) {
		this(0, fromFigure, exitSide, exitTweak, entryTweak, entrySide, toFigure, actionFigure);
		// if left unspecified, dashboardViewType = 0
	}
	
	public FlowFigure(int dashboardViewType, BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure, FlowActionFigure actionFigure) {
	// for horizontal or vertical arrows, only the exit tweak should be specified.
		
		this.dashboardViewType = dashboardViewType;
		setLayoutManager(new DelegatingLayout());
		addPoint(new Point(0, 0));
		addPoint(new Point(100, 100));
		this.fromFigure = fromFigure;
		this.toFigure = toFigure;
		this.entrySide = entrySide;
		this.exitSide = exitSide;
		this.entryTweak = entryTweak;
		this.exitTweak = exitTweak;
		this.actionFigure = actionFigure;
	}
	
	public int getDashboardViewType() {
		return dashboardViewType;
	}
	
	public void performLayout() {
		Rectangle fromBox = fromFigure.getLayoutDimensions();
		Rectangle toBox = toFigure.getLayoutDimensions();


		Point fromPoint = pointOnSide(fromBox, exitSide, exitTweak);
		Point toPoint = pointOnSide(toBox, entrySide, entryTweak);

		Point middlePoint;
		
		if (isHorizontal(exitSide))
			if (isHorizontal(entrySide)) { // both horizontal, ignore entryTweak and entryPoint.y
				middlePoint = new Point( (fromPoint.x + toPoint.x) / 2, fromPoint.y );
			    toPoint.y = fromPoint.y; // make line vertical
			}
			else { // from horizontal, to vertical 
				middlePoint = new Point( toBox.x + toBox.width/2 + entryTweak, fromBox.y+fromBox.height/2 + exitTweak);
			}
		else 
			if (isHorizontal(entrySide)) { // from vertical, to horizontal
				middlePoint = new Point( fromBox.x + fromBox.width/2 + exitTweak, toBox.y+toBox.height/2 + entryTweak);
			}
			else { // both vertical, ignore entryTweak and entryPoint.x
				middlePoint = new Point(  fromPoint.x, (fromPoint.y + toPoint.y) / 2 );
			    toPoint.x = fromPoint.x; // make line horizontal
			}
		
		
		
		nonTranslatedPoints = new PointList();
		nonTranslatedPoints.addPoint(fromPoint);
		nonTranslatedPoints.addPoint(middlePoint);
		nonTranslatedPoints.addPoint(toPoint); 

		if (actionFigure != null)
			actionFigure.performCenteredLayout( middlePoint.x, middlePoint.y );

	}
	
	private boolean isHorizontal(int side) {
		return side == LEFT || side == RIGHT;
	}
	
	private Point pointOnSide(Rectangle box, int side, int tweak) {
		int x, y;
		if (side == LEFT)
			x = box.x;
		else 
			if (side == RIGHT)
				x = box.x + box.width;
			else
				x = box.x + box.width/2 + tweak;

		if (side == TOP)
			y = box.y;
		else 
			if (side == BOTTOM)
				y = box.y + box.height;
			else
				y = box.y + box.height/2 + tweak;
		
		return new Point(x,y);

	}
	public void apply(Point offset) {
		setPoints(getTranslated(nonTranslatedPoints, offset));
		if (actionFigure != null)
			actionFigure.apply(offset);
	}
	
	private PointList getTranslated(PointList source, Point offset) {
		PointList target = new PointList(source.size());
		target.addAll(source);
		target.translate(offset);
		return target;
	}

	/**
	 * Returns the bounds which holds all the points in this polyline connection. Returns any previously existing bounds, else calculates by unioning all the children's dimensions.
	 * 
	 * @return the bounds
	 */
	public Rectangle getBounds() {
		if (bounds == null) {
			super.getBounds();
			for (int i = 0; i < getChildren().size(); i++) {
				IFigure child = (IFigure) getChildren().get(i);
				bounds.union(child.getBounds());
			}
		}
		return bounds;
	}

	/**
	 * @return the source decoration (may be null)
	 */
	protected RotatableDecoration getSourceDecoration() {
		return startArrow;
	}

	/**
	 * @return the target decoration (may be null)
	 */
	protected RotatableDecoration getTargetDecoration() {
		return endArrow;
	}

	public void setPoints(PointList points) {
		super.setPoints(points);
		layout(); // update arrows
	}

	public void layout() {
		Rectangle oldBounds = bounds;
		super.layout();
		bounds = null;
		if (!getBounds().contains(oldBounds)) {
			getParent().translateToParent(oldBounds);
			getUpdateManager().addDirtyRegion(getParent(), oldBounds);
		}
		repaint();
		fireFigureMoved();
	}

	/**
	 * Sets the decoration to be used at the start of the {@link Connection}.
	 * 
	 * @param dec
	 *            the new source decoration
	 */
	public void setSourceDecoration(RotatableDecoration dec) {
		if (startArrow == dec) {
			return;
		}
		if (startArrow != null) {
			remove(startArrow);
		}
		startArrow = dec;
		if (startArrow != null) {
			add(startArrow, new ArrowLocator(this, ConnectionLocator.SOURCE));
		}
	}

	/**
	 * Sets the decoration to be used at the end of the {@link Connection}.
	 * 
	 * @param dec
	 *            the new target decoration
	 */
	public void setTargetDecoration(RotatableDecoration dec) {
		if (endArrow == dec) {
			return;
		}
		if (endArrow != null) {
			remove(endArrow);
		}
		endArrow = dec;
		if (endArrow != null) {
			add(endArrow, new ArrowLocator(this, ConnectionLocator.TARGET));
		}
	}

	// fake connection methods

	public ConnectionRouter getConnectionRouter() {
		return null;
	}

	public void setConnectionRouter(ConnectionRouter router) {
	}

	public Object getRoutingConstraint() {
		return null;
	}

	public void setRoutingConstraint(Object cons) {
	}

	public ConnectionAnchor getSourceAnchor() {
		return null;
	}

	public void setSourceAnchor(ConnectionAnchor anchor) {
	}

	public ConnectionAnchor getTargetAnchor() {
		return null;
	}

	public void setTargetAnchor(ConnectionAnchor anchor) {
	}
}
