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

import net.sf.ictalive.dashboard.ActionSpecification;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Image;

public class ActionFigure<S> extends BoxFigure<S> {

	protected ActionSpecification labelActionId;

	private IFigure labelsPlate;


	public ActionFigure(ActionSpecification labelActionId) {
		this.labelActionId = labelActionId;
		
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		setLayoutManager(layout);

		labelsPlate = new Figure();
		ToolbarLayout labelsLayout = new ToolbarLayout();
		labelsLayout.setSpacing(2);
		labelsPlate.setLayoutManager(labelsLayout);
		add(labelsPlate);
		
	//	labelsPlate.add(createLinkFigure(labelActionId.getLabel(), new PluginDashboardAction( labelActionId.getActionId() )));
		
	}

	public void addAction(IFigure actionFigure) {
		actionFigure.setFont(JFaceResources.getBannerFont());
		labelsPlate.add(actionFigure);		
	}

	public void refresh() {
	}

	public ActionSpecification[] getLabelActionIds() {
		return new ActionSpecification[] {labelActionId};
	}
	
	public void setSpacing(int spacing) {
		setBorder(new MarginBorder(spacing, 0, spacing, 0));
		labelsPlate.setBorder(new MarginBorder(0, spacing, 0, spacing));
	}
	
	public void setIcon(Image icon) {
		((Label)labelsPlate.getChildren().get(0)).setIcon(icon);
	}

}
