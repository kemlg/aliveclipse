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

import net.sf.ictalive.dashboard.ActionContainer;
import net.sf.ictalive.dashboard.ActionSpecification;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author dstadnik
 */
public class FlowActionFigure extends RectangleFigure implements ActionContainer {

	private int dashboardViewType;
	
	private Rectangle layoutDimensions;

	private Figure actionsPlate;
	
	protected ActionSpecification[] labelActionIds;
	
	public FlowActionFigure(ActionSpecification[] labelActionIds) {
		this(0, labelActionIds); // if left unspecified, dashboardViewType = 0
	}
		
	public FlowActionFigure(int dashboardViewType, ActionSpecification[] labelActionIds) {
		this.dashboardViewType = dashboardViewType;
		this.labelActionIds = labelActionIds;
		
		
		actionsPlate = new Figure();
		ToolbarLayout actionsLayout = new ToolbarLayout(true);
		actionsLayout.setSpacing(2);
		actionsPlate.setLayoutManager(actionsLayout);
		add(actionsPlate);
		//setLayoutManager(new ToolbarLayout(true)); // TODO: why is this not horizontal?
		//stdActionsLayout.setSpacing(2);
		
	}
	
	public int getDashboardViewType() {
		return dashboardViewType;
	}	

	public ActionSpecification[] getLabelActionIds() {
		return labelActionIds;
	}

	// instead of top-left corner, we place the center at (x,y)
	public void performCenteredLayout(int x, int y) {
		Dimension size = getPreferredSize();
		setLayoutDimensions( new Rectangle(x - size.width/2 , y - size.height/2, size.width, size.height) );
		
	}
	
	public void setLayoutDimensions(Rectangle layoutDimensions) {
		this.layoutDimensions = layoutDimensions;
	}

	public Rectangle getLayoutDimensions() {
		return layoutDimensions;
	}

	public void apply(Point offset) {
		setBounds(layoutDimensions.getTranslated(offset));
	}
	
	
	public void addAction(IFigure actionFigure) {
		Label bullet = new Label("/");
		if (!actionsPlate.getChildren().isEmpty()) {
			actionsPlate.add(bullet);
		}
		actionsPlate.add(actionFigure);
	}

	public void addAction(IFigure actionFigure, boolean std) {
		actionsPlate.add(actionFigure);
	}

	public void removeAction(IFigure actionFigure, boolean std) {
		actionsPlate.remove(actionFigure);
	}
}
