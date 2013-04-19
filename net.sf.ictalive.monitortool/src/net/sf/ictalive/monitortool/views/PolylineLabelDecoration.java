/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	   Manuel Selva - initial API and implementation
 *******************************************************************************/
package net.sf.ictalive.monitortool.views;

import org.eclipse.swt.graphics.Image;

import org.eclipse.draw2d.AbstractBackground;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A decorative label Figure intended to be placed on a {@link PolylineConnection}.
 * 
 * @since 3.5
 */
public class PolylineLabelDecoration extends Label implements
		RotatableDecoration {

	private double angle;
	private Point location = new Point();
	private Point refPoint = new Point();

	public PolylineLabelDecoration() {
		super();
	}
	
	public PolylineLabelDecoration(Image i) {
		super(i);
	}

	public PolylineLabelDecoration(String s) {
		super(s);
	}

	public PolylineLabelDecoration(String s, Image i) {
		super(s, i);
	}

	public Rectangle getBounds() {
		if (bounds == null) {
			int xDiff = refPoint.x - location.x;
			int yDiff = refPoint.y - location.y;
			int x, y, width, height;
			if (xDiff >= 0) {
				width = xDiff;
				x = refPoint.x;
			} else {
				width = -xDiff;
				x = refPoint.x;
			}
			if (yDiff >= 0) {
				height = yDiff;
				y = location.y;
			} else {
				height = -yDiff;
				y = refPoint.y;
			}
			bounds = new Rectangle(x, y, width, height);
			System.out.println(bounds);
		}
		return bounds;
	}

	public void setLocation(Point p) {
		bounds = null;
		location.setLocation(p);
	}

	public void setReferencePoint(Point ref) {
		Point pt = Point.SINGLETON;
		refPoint.setLocation(ref);
		pt.setLocation(ref);
		pt.negate().translate(location);
		setRotation(Math.atan2(pt.y, pt.x));
	}

	private void setRotation(double angle) {
		bounds = null;
		this.angle = Math.toDegrees(angle);
	}

	protected Point getIconLocation() {
		double linkLength = Math.sqrt(bounds.width * bounds.width
				+ bounds.height * bounds.height);
		int y = 0;//-getIconSize().height;
		int x;
		switch (getTextAlignment()) {
		case LEFT:
			x = 0;
			break;
		case RIGHT:
			x = (int) (linkLength - getIconSize().width);
			break;
		default:
			x = (int) (linkLength / 2 - getIconSize().width / 2);
		}
		if (x < 0) {
			x = 0;
		}
		return new Point(x, y);
	}
	
	protected Point getTextLocation() {
		Dimension textDimension = getTextSize();
		double linkLength = Math.sqrt((bounds.width + getIconSize().width) * 2
				+ (bounds.height + getIconSize().height) * 2);
		int y = -textDimension.height;
		int x;
		switch (getTextAlignment()) {
		case LEFT:
			x = 0;
			break;
		case RIGHT:
			x = (int) (linkLength - textDimension.width);
			break;
		default:
			x = (int) (linkLength / 2 - textDimension.width / 2);
		}
		if (x <  getIconSize().width + 5) {
			x =  getIconSize().width + 5;
		}
		return new Point(x, y);
	}

	protected void paintFigure(Graphics graphics) {
		int xDiff = refPoint.x - location.x;
		
		// Draws the text
		graphics.pushState();
		graphics.setClip(graphics.getClip(new Rectangle()).expand(50, 50));
		graphics.translate(bounds.x, bounds.y);
		if (angle < 0) {
			graphics.translate(0, getBounds().height);
		}
		graphics.rotate((float) angle);

		if (isOpaque())
			graphics.fillRectangle(getBounds());
		if (getBorder() instanceof AbstractBackground)
			((AbstractBackground) getBorder()).paintBackground(this, graphics,
					NO_INSETS);
		if (getIcon() != null)
			graphics.drawImage(getIcon(), getIconLocation());
		if (!isEnabled()) {
			graphics.translate(1, 1);
			graphics.setForegroundColor(ColorConstants.buttonLightest);
			graphics.drawText(getText(), getTextLocation());
			graphics.translate(-1, -1);
			graphics.setForegroundColor(ColorConstants.buttonDarker);
		}
		graphics.drawText(getText(), getTextLocation());
		graphics.popState();
	}
}
