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

import java.util.ArrayList;
import java.util.List;


import net.sf.ictalive.dashboard.ActionContainer;
import net.sf.ictalive.dashboard.ActionSpecification;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Image;

/**
 * @author dstadnik
 */
public class ModelFigure<S> extends BoxFigure<S> implements ActionContainer {
	
	protected ActionSpecification[] labelActionIds;

	private IFigure labelsPlate;

	private IFigure actionsPlate;

	private IFigure stdActionsPlate;

	private Label nameLabel;
	
	private List<SeparatorFigure> separators;

	private boolean hasName; // the name of the model below the name of the box

	
	public ModelFigure(ActionSpecification[] labelActionIds) {
		this(labelActionIds, true); // default ModelFigure has a name
	}
	
	public ModelFigure(ActionSpecification[] labelActionIds, boolean hasName) {
		this.labelActionIds = labelActionIds;
		this.hasName = hasName;
		
		separators = new ArrayList<SeparatorFigure>();
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		setLayoutManager(layout);

		labelsPlate = new Figure();
		ToolbarLayout labelsLayout = new ToolbarLayout();
		labelsPlate.setLayoutManager(labelsLayout);
		add(labelsPlate);

		SeparatorFigure s1 = new SeparatorFigure();
		separators.add(s1);
		add(s1);

		actionsPlate = new Figure();
		ToolbarLayout actionsLayout = new ToolbarLayout();
		actionsLayout.setStretchMinorAxis(false);
		actionsPlate.setLayoutManager(actionsLayout);
		add(actionsPlate);

		stdActionsPlate = new Figure();
		ToolbarLayout stdActionsLayout = new ToolbarLayout(true);
		stdActionsLayout.setSpacing(2);
		stdActionsPlate.setLayoutManager(stdActionsLayout);
		actionsPlate.add(stdActionsPlate);

		Label descriptionFigure = new Label();
		descriptionFigure.setFont(JFaceResources.getBannerFont());
		addLabel(descriptionFigure);
		if (hasName) {
			nameLabel = new Label();
			addLabel(nameLabel);
			nameLabel.setTextPlacement(PositionConstants.WEST);
			nameLabel.setIconTextGap(6);
			setName(null); // init		
		}
	}
	
	public ActionSpecification[] getLabelActionIds() {
		return labelActionIds;
	}
		
	public void setSpacing(int spacing) {
		setBorder(new MarginBorder(spacing, 0, spacing, 0));
		for (SeparatorFigure separator : separators) {
			separator.setPreferredSize(new Dimension(0, spacing + separator.getLineWidth()));
		}
		labelsPlate.setBorder(new MarginBorder(0, spacing, 0, spacing));
		actionsPlate.setBorder(new MarginBorder(0, spacing, 0, spacing));
	}

	public void addLabel(IFigure labelFigure) {
		labelsPlate.add(labelFigure);
	}

	public void removeLabel(IFigure labelFigure) {
		labelsPlate.remove(labelFigure);
	}

	public final void addAction(IFigure actionFigure) {
		addAction(actionFigure, true);
	}

	public void addAction(IFigure actionFigure, boolean std) {
		Label bullet = new Label();
		// bullet.setText("-");
		if (std) {
			if (!stdActionsPlate.getChildren().isEmpty()) {
				bullet.setText("/"); //$NON-NLS-1$
			}
			stdActionsPlate.add(bullet);
			stdActionsPlate.add(actionFigure);
		} else {
			IFigure plate = new Figure();
			ToolbarLayout layout = new ToolbarLayout(true);
			layout.setSpacing(3);
			plate.setLayoutManager(layout);
			plate.add(bullet);
			plate.add(actionFigure);
			actionsPlate.add(plate);
		}
	}

	public void removeAction(IFigure actionFigure, boolean std) {
		if (std) {
			int ix = stdActionsPlate.getChildren().indexOf(actionFigure);
			IFigure bullet = (IFigure) stdActionsPlate.getChildren().get(ix);
			stdActionsPlate.remove(actionFigure);
			stdActionsPlate.remove(bullet);
		} else {
			actionsPlate.remove(actionFigure.getParent());
		}
	}

	protected Label getLabel(int i) {
		return (Label) labelsPlate.getChildren().get(i);
	}

	public String getDescription() {
		return getLabel(0).getText();
	}

	public void setDescription(String description) {
		getLabel(0).setText(description);
	}

	// TODO: figure out how to access this icon from here, instead of letting the actual dashboard set it.
	public void setNameIcon(Image icon) {
		if (hasName) 
			nameLabel.setIcon(icon);
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public void setIcon(Image icon) {
		getLabel(0).setIcon(icon);
	}

	public void setName(String name) {
		if (hasName) {
			if (name == null || name.trim().length() == 0) {
			name = "<not specified>";
			}
			getLabel(1).setText(name);
		}
	}

	public void setFullName(String name) {
		if (name == null || name.trim().length() == 0) {
			setToolTip(null);
		} else {
			Label tooltip = new Label(name);
			setToolTip(tooltip);
		}
	}
	
	public void refresh() {
	}
}
