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
package net.sf.ictalive.aliveclipse.dashboard;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.dashboard.ActionSpecification;
import net.sf.ictalive.dashboard.figure.ActionFigure;
import net.sf.ictalive.dashboard.figure.BoxFigure;
import net.sf.ictalive.dashboard.figure.DividerFigure;
import net.sf.ictalive.dashboard.figure.FlowActionFigure;
import net.sf.ictalive.dashboard.figure.FlowFigure;
import net.sf.ictalive.dashboard.figure.ModelFigure;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

/**
 * @author dstadnik
 */
public class AliveDashboardFigure extends RectangleFigure {

	private int dashboardViewType = TOP_DOWN;
	
	public static final int TOP_DOWN = 0;

//	public static final int MIDDLE_OUT = 1;
	
	public static final int BOTTOM_UP = 1;
	
	private static final int LINE_WIDTH = 3;

	private static final int TEXT_GAP = LINE_WIDTH + 3;

	private static final int ARROW_LENGTH = 8;

	public static final Color DASHBOARD_BG = new Color(null, 113, 104, 209);

	public static final Color DASHBOARD_FG = new Color(null, 169, 164, 227);

	public static final Color DASHBOARD_COMPLETED = new Color(null, 80, 80, 80);

	private static final Color MODEL_BG = ColorConstants.white;

	private ImageFigure logoFigure;
		
	private IFigure statusFigure;
	
	protected ImageFigure viewSelectionButtonFigure; // the triangle for selecting the current view (Top-down, Middle-out, Botton-up)

	// Lists of figures, used for calling layout functions automatically on all figures.
	
	protected List<BoxFigure> allBoxFigures = new ArrayList<BoxFigure>();
	
	protected List<FlowFigure> allFlowFigures = new ArrayList<FlowFigure>();
	
	protected List<FlowActionFigure> allFlowActionFigures = new ArrayList<FlowActionFigure>();

	protected List<DividerFigure> allDividerFigures = new ArrayList<DividerFigure>();
	
	// models

	protected AliveModelFigure organisationFigure;
	
	protected AliveModelFigure ontologyFigure;
	
	protected AliveModelFigure taskFigure;

	protected AliveModelFigure actionFigure;
	
	protected AliveModelFigure masFigure;

	protected AliveModelFigure agentsFigure;

	protected AliveModelFigure planFigure;

	protected AliveModelFigure serviceFigure;

	protected AliveModelFigure descriptionsFigure;
	
	protected AliveModelFigure descriptionsFigureBU;
	
	protected AliveModelFigure repositoryFigure;

	protected ActionFigure enactmentFigure;
	
	protected ActionFigure enactmentFigureBU;

	private Label organisationLabel, coordinationLabel, serviceLabel;
	
	private DividerFigure divider1, divider2;
	
	public AliveDashboardFigure() {
		add(logoFigure = new ImageFigure() {

			protected void paintFigure(Graphics graphics) {
				if (getImage() != null) {
					graphics.drawImage(getImage(), new Rectangle(getImage().getBounds()), getBounds());
				}
			}
		});
		Image logoImage = Plugin.getDefault().getImageRegistry().get(Plugin.ALIVE_LOGO_IMAGE);
		if (logoImage != null) {
			logoFigure.setImage(logoImage);
		}
	
		add(viewSelectionButtonFigure = new ImageFigure() {

			protected void paintFigure(Graphics graphics) {
				if (getImage() != null) {
					graphics.drawImage(getImage(), new Rectangle(getImage().getBounds()), getBounds());
				}
			}
		});
		Image viewSelectionButtonImage = Plugin.getDefault().getImageRegistry().get(Plugin.VIEW_SELECTION_BUTTON_IMAGE);
		if (viewSelectionButtonImage != null) {
			viewSelectionButtonFigure.setImage(viewSelectionButtonImage);
		}
		
		// select and edit actions are added in DashboardMediator
		organisationFigure = createModelFigure(Messages.DashboardFigure_Organisation, true,
				Messages.DashboardFigure_Create, AliveDashboardState.CreateOrganisationId);
		ontologyFigure = createModelFigure(Messages.DashboardFigure_Ontology, true);
		taskFigure = createModelFigure(Messages.DashboardFigure_Task, true,
				Messages.DashboardFigure_Create, AliveDashboardState.CreateTaskId);
		
		actionFigure = createModelFigure(Messages.DashboardFigure_Action, true,
				Messages.DashboardFigure_Create, AliveDashboardState.CreateActionId);
		
		masFigure = createModelFigure(Messages.DashboardFigure_MAS, true,
				Messages.DashboardFigure_Create, AliveDashboardState.CreateMASId);
		
		agentsFigure = createModelFigure(Messages.DashboardFigure_Agents, true);
		
		planFigure = createModelFigure(Messages.DashboardFigure_Plan, true,
				Messages.DashboardFigure_Create, AliveDashboardState.CreatePlanId);
		
		serviceFigure = createModelFigure(Messages.DashboardFigure_Service, false,
				Messages.DashboardFigure_Configure, AliveDashboardState.ConfigureMatchmakerId);
		
		descriptionsFigure = createModelFigure(Messages.DashboardFigure_Descriptions, false,
				Messages.DashboardFigure_DefineTemplate, AliveDashboardState.DefineTemplateId,
				Messages.DashboardFigure_ApplyTemplate, AliveDashboardState.ApplyTemplateId,
				Messages.DashboardFigure_DeriveTemplate, AliveDashboardState.DeriveTemplateId);
		
		descriptionsFigureBU = createModelFigure(Messages.DashboardFigure_Descriptions, false,
				Messages.DashboardFigure_DefineTemplate, AliveDashboardState.DefineTemplateId,
				Messages.DashboardFigure_RefineTemplate, AliveDashboardState.RefineTemplateId,
				Messages.DashboardFigure_DeriveTemplate, AliveDashboardState.DeriveTemplateId);
		
		repositoryFigure = createModelFigure("Repository", false,
				Messages.DashboardFigure_ImportService, AliveDashboardState.ImportServiceId,
				Messages.DashboardFigure_ImportServiceOntology, AliveDashboardState.ImportServiceOntologyId);

		enactmentFigure = createActionFigure(
				"", AliveDashboardState.ConfigureEnactmentId);
		
		enactmentFigureBU = createActionFigure(
				"", AliveDashboardState.ConfigureEnactmentId);

		organisationFigure.setModelURILocation(AliveDashboardState.LOCATION_Organisation);
		ontologyFigure.setModelURILocation(AliveDashboardState.LOCATION_Ontology);
		taskFigure.setModelURILocation(AliveDashboardState.LOCATION_Task);
		actionFigure.setModelURILocation(AliveDashboardState.LOCATION_Action);
		masFigure.setModelURILocation(AliveDashboardState.LOCATION_MAS);
		agentsFigure.setModelURILocation(AliveDashboardState.LOCATION_Agents);
		planFigure.setModelURILocation(AliveDashboardState.LOCATION_Plan);
		
		/******** Top-down flow and flow action figures ********/ 
		
		createFlowFigure(TOP_DOWN, 1, organisationFigure, FlowFigure.RIGHT, FlowFigure.BOTTOM, ontologyFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Export, AliveDashboardState.ExportOntologyId));

		createFlowFigure(TOP_DOWN, 1, ontologyFigure, FlowFigure.LEFT, FlowFigure.TOP, organisationFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Import, AliveDashboardState.ImportOntologyId));

		createFlowFigure(TOP_DOWN, 1, organisationFigure, FlowFigure.LEFT, FlowFigure.TOP, actionFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveActionFromOrganisationId));
		
		createFlowFigure(TOP_DOWN, 0, actionFigure, FlowFigure.RIGHT, -15, 0, FlowFigure.BOTTOM, organisationFigure);
		createFlowFigure(TOP_DOWN, 1, organisationFigure, FlowFigure.BOTTOM, FlowFigure.LEFT, masFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveMASFromOrganisationAndActionId));
				
		createFlowFigure(TOP_DOWN, 1, actionFigure, FlowFigure.LEFT, FlowFigure.RIGHT, taskFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveTaskFromActionId));
		
		createFlowFigure(TOP_DOWN, 1, masFigure, FlowFigure.RIGHT, FlowFigure.LEFT, agentsFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveAgentsFromMASId));

		createFlowFigure(TOP_DOWN, 1, taskFigure, FlowFigure.BOTTOM, 10, 0, FlowFigure.LEFT, planFigure);
		createFlowFigure(TOP_DOWN, 1, actionFigure, FlowFigure.BOTTOM, FlowFigure.LEFT, planFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_Combine, AliveDashboardState.CombinePlanId));
		
		createFlowFigure(TOP_DOWN, 1, taskFigure, FlowFigure.BOTTOM, -10, 0, FlowFigure.LEFT, serviceFigure,
				createFlowActionFigure(TOP_DOWN, Messages.DashboardFigure_VerifyServiceAvailability, AliveDashboardState.VerifyServiceId));

		createFlowFigure(TOP_DOWN, 0, serviceFigure, FlowFigure.RIGHT, 10, 0, FlowFigure.LEFT, descriptionsFigure);
		createFlowFigure(TOP_DOWN, 1, descriptionsFigure, FlowFigure.LEFT, 10, 0, FlowFigure.BOTTOM, serviceFigure);
		
		dashLine(createFlowFigure(TOP_DOWN, 1, agentsFigure, FlowFigure.BOTTOM, FlowFigure.TOP, enactmentFigure));
		
		dashLine(createFlowFigure(TOP_DOWN, 1, serviceFigure, FlowFigure.RIGHT, -10, 0, FlowFigure.LEFT, enactmentFigure));
		

		
		/******** Middle-out flow and flow action figures ********/ 
		/*
		createFlowFigure(MIDDLE_OUT, 1, organisationFigure, FlowFigure.RIGHT, FlowFigure.BOTTOM, ontologyFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Export, AliveDashboardState.ExportOntologyId));

		createFlowFigure(MIDDLE_OUT, 1, ontologyFigure, FlowFigure.LEFT, FlowFigure.TOP, organisationFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Import, AliveDashboardState.ImportOntologyId));

		createFlowFigure(MIDDLE_OUT, 1, actionFigure, FlowFigure.TOP, 0, 0, FlowFigure.LEFT, organisationFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveOrganisationFromActionId));		
		
		createFlowFigure(MIDDLE_OUT, 1, planFigure, FlowFigure.TOP, FlowFigure.LEFT, masFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveMASFromPlanId));
			
		createFlowFigure(MIDDLE_OUT, 1, masFigure, FlowFigure.RIGHT, FlowFigure.LEFT, agentsFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveAgentsFromMASId));

		createFlowFigure(MIDDLE_OUT, 1, planFigure, FlowFigure.LEFT, 15, 20, FlowFigure.BOTTOM, taskFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveTaskFromPlanId));

		createFlowFigure(MIDDLE_OUT, 1, planFigure, FlowFigure.LEFT, -5, 0, FlowFigure.BOTTOM, actionFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveActionFromPlanId));

		createFlowFigure(MIDDLE_OUT, 1, taskFigure, FlowFigure.BOTTOM, -10, 0, FlowFigure.LEFT, serviceFigure,
				createFlowActionFigure(MIDDLE_OUT, Messages.DashboardFigure_VerifyServiceAvailability, AliveDashboardState.VerifyServiceId));

		createFlowFigure(MIDDLE_OUT, 0, serviceFigure, FlowFigure.RIGHT, 10, 0, FlowFigure.LEFT, descriptionsFigure);
		createFlowFigure(MIDDLE_OUT, 1, descriptionsFigure, FlowFigure.LEFT, 10, 0, FlowFigure.BOTTOM, serviceFigure);
				
		dashLine(createFlowFigure(MIDDLE_OUT, 1, agentsFigure, FlowFigure.BOTTOM, FlowFigure.TOP, enactmentFigure));
		
		dashLine(createFlowFigure(MIDDLE_OUT, 1, serviceFigure, FlowFigure.RIGHT, -10, 0, FlowFigure.LEFT, enactmentFigure));

		
		
		/******** Bottom-up flow and flow action figures ********/ 
		
		createFlowFigure(BOTTOM_UP, 1, organisationFigure, FlowFigure.RIGHT, FlowFigure.BOTTOM, ontologyFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Export, AliveDashboardState.ExportOntologyId));

		createFlowFigure(BOTTOM_UP, 1, ontologyFigure, FlowFigure.LEFT, FlowFigure.TOP, organisationFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Import, AliveDashboardState.ImportOntologyId));

		createFlowFigure(BOTTOM_UP, 1, actionFigure, FlowFigure.TOP, 0, 0, FlowFigure.LEFT, organisationFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveOrganisationFromActionId));
		
		createFlowFigure(BOTTOM_UP, 0, actionFigure, FlowFigure.RIGHT, -15, 0, FlowFigure.BOTTOM, organisationFigure);
		createFlowFigure(BOTTOM_UP, 1, organisationFigure, FlowFigure.BOTTOM, FlowFigure.LEFT, masFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveMASFromOrganisationAndActionId));
		
		createFlowFigure(BOTTOM_UP, 1, actionFigure, FlowFigure.LEFT, FlowFigure.RIGHT, taskFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveTaskFromActionId));

		createFlowFigure(BOTTOM_UP, 1, taskFigure, FlowFigure.BOTTOM, 10, 0, FlowFigure.LEFT, planFigure);
		createFlowFigure(BOTTOM_UP, 1, actionFigure, FlowFigure.BOTTOM, FlowFigure.LEFT, planFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Combine, AliveDashboardState.CombinePlanId));
			
		createFlowFigure(BOTTOM_UP, 1, masFigure, FlowFigure.RIGHT, FlowFigure.LEFT, agentsFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveAgentsFromMASId));

		createFlowFigure(BOTTOM_UP, 1, descriptionsFigureBU, FlowFigure.TOP, 75, 15, FlowFigure.RIGHT, actionFigure,
			createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_Derive, AliveDashboardState.DeriveActionsFromServiceId));
		
		createFlowFigure(BOTTOM_UP, 1, repositoryFigure, FlowFigure.LEFT, 0, 0, FlowFigure.RIGHT, descriptionsFigureBU);
		
		dashLine(createFlowFigure(BOTTOM_UP, 1, taskFigure, FlowFigure.BOTTOM, -10, 0, FlowFigure.LEFT, serviceFigure,
				createFlowActionFigure(BOTTOM_UP, Messages.DashboardFigure_VerifyServiceAvailability, AliveDashboardState.VerifyServiceId)));

		dashLine(createFlowFigure(BOTTOM_UP, 0, serviceFigure, FlowFigure.RIGHT, 10, 0, FlowFigure.LEFT, descriptionsFigureBU));
		dashLine(createFlowFigure(BOTTOM_UP, 1, descriptionsFigureBU, FlowFigure.LEFT, 10, 0, FlowFigure.BOTTOM, serviceFigure));
				
		dashLine(createFlowFigure(BOTTOM_UP, 1, agentsFigure, FlowFigure.BOTTOM, FlowFigure.TOP, enactmentFigureBU));
	
//		dashLine(createFlowFigure(BOTTOM_UP, 1, serviceFigure, FlowFigure.RIGHT, -10, 0, FlowFigure.LEFT, enactmentFigure));		
		
		//
		
		add(organisationLabel = new Label(Messages.DashboardFigure_OrganisationLayer));
		organisationLabel.setFont(JFaceResources.getBannerFont());
		add(coordinationLabel = new Label(Messages.DashboardFigure_CoordinationLayer));
		coordinationLabel.setFont(JFaceResources.getBannerFont());
		add(serviceLabel = new Label(Messages.DashboardFigure_ServiceLayer));
		serviceLabel.setFont(JFaceResources.getBannerFont());
		
		add(statusFigure = new Figure());
		statusFigure.setFont(JFaceResources.getBannerFont());
		ToolbarLayout statusLayout = new ToolbarLayout();
		statusLayout.setStretchMinorAxis(false);
		statusFigure.setLayoutManager(statusLayout);
		statusFigure.add(new Label()); // Design label, value is set by refreshDashboardView
		statusFigure.add(new Label()); // project name, value is set by mediator
		statusFigure.add(new Label()); // percentage, value is set by mediator

		add(divider1 = createDividerFigure(DividerFigure.HORIZONTAL));
		add(divider2 = createDividerFigure(DividerFigure.HORIZONTAL));
		
		setLayoutManager(new DashboardLayout());
		setBorder(new MarginBorder(10));
		setBackgroundColor(DASHBOARD_BG);
		setForegroundColor(DASHBOARD_FG);
		
		refreshDashboardViewType();
	}

	public void refreshDashboardViewType() {
		((Label)statusFigure.getChildren().get(0)) // 0 is the "Design" label
			.setText("Design  ("+getDashboardViewTypeName(dashboardViewType)+")"); 

		for (FlowFigure flowFigure : allFlowFigures)
			flowFigure.setVisible(flowFigure.getDashboardViewType() == dashboardViewType);
		for (FlowActionFigure flowActionFigure : allFlowActionFigures)
			flowActionFigure.setVisible(flowActionFigure.getDashboardViewType() == dashboardViewType);
		
		// eventFigure is the only model figure that changes for different views, so we handle it explicitly.
		repositoryFigure.setVisible(dashboardViewType == BOTTOM_UP);
		//change the enactmentFigure visibility between views 0&1 and 2;
		enactmentFigure.setVisible(dashboardViewType == TOP_DOWN);
		enactmentFigureBU.setVisible(dashboardViewType == BOTTOM_UP);
		descriptionsFigure.setVisible(dashboardViewType == TOP_DOWN);
		descriptionsFigureBU.setVisible(dashboardViewType == BOTTOM_UP);
	}

	public void setDashboardViewType(int dashboardViewType) {
		this.dashboardViewType = dashboardViewType;
		refreshDashboardViewType();
	}
	
	public int getDashboardViewType() {
		return dashboardViewType;
	}
	
	// static so we can also use it in other classes, even when there is no dashboard view yet. (e.g. for creating menu items)
	public static String getDashboardViewTypeName(int dashboardViewType) {
		String name;
		
		switch (dashboardViewType) {
		case TOP_DOWN:
			name = "Top-down";
			break;
//		case MIDDLE_OUT:
//			name = "Middle-out";
//			break;
		case BOTTOM_UP:
			name = "Bottom-up";
			break;
		default:
			name = "<ERROR: UNDEFINED VIEW>";
		}
		
		return name;
	}
	
	public Label getStatusLine(int i) {
		return (Label) statusFigure.getChildren().get(i+1); // 0 is the "Design" label
	}

	protected AliveModelFigure createModelFigure(String description, boolean hasName) {
		return createModelFigure(description, null, hasName, new ActionSpecification[] {});	
	}
		
	protected AliveModelFigure createModelFigure(String description, boolean hasName, String label, String actionId) {
		return createModelFigure(description, null, hasName, new ActionSpecification[] {new ActionSpecification(label, actionId)});	
	}

	protected AliveModelFigure createModelFigure(String description, boolean hasName, String label1, String actionId1, String label2, String actionId2) {
		return createModelFigure(description, null, hasName, new ActionSpecification[] {new ActionSpecification(label1, actionId1),new ActionSpecification(label2, actionId2)});	
	}

	protected AliveModelFigure createModelFigure(String description, boolean hasName, String label1, String actionId1, String label2, String actionId2,
			String label3, String actionId3) {
		return createModelFigure(description, null, hasName, 
			new ActionSpecification[] { new ActionSpecification(label1, actionId1),
										new ActionSpecification(label2, actionId2),
										new ActionSpecification(label3, actionId3)});	
}

	protected AliveModelFigure createModelFigure(String description, String iconKey, boolean hasName, ActionSpecification[] labelActionIds) {
		AliveModelFigure modelFigure = new AliveModelFigure(labelActionIds, hasName);
		modelFigure.setDescription(description);
		Image image = Plugin.getDefault().getImageRegistry().get(iconKey);
		if (image != null) {
			modelFigure.setIcon(image);
		}
		modelFigure.setBackgroundColor(MODEL_BG);
		modelFigure.setForegroundColor(DASHBOARD_FG);
		modelFigure.setLineWidth(LINE_WIDTH*3/2);
		modelFigure.setSpacing(TEXT_GAP);
		add(modelFigure);
		
		allBoxFigures.add(modelFigure);
		return modelFigure;
	}
	
	protected ActionFigure createActionFigure(String label, String actionId) {
		ActionFigure actionFigure = new ActionFigure(new ActionSpecification(label, actionId));
		actionFigure.setBackgroundColor(MODEL_BG);
		actionFigure.setForegroundColor(DASHBOARD_FG);
		actionFigure.setLineWidth(LINE_WIDTH*3/2);
		actionFigure.setSpacing(TEXT_GAP);
		add(actionFigure);
		
		allBoxFigures.add(actionFigure);
		return actionFigure;
	}

	public void dashLine(FlowFigure flowFigure) {
		flowFigure.setLineStyle(org.eclipse.swt.SWT.LINE_DASH);
		
	}

	protected FlowFigure createFlowFigure(int dashboardViewType, int directed, BoxFigure fromFigure, int exitSide, int entrySide, BoxFigure toFigure) {
		return createFlowFigure(dashboardViewType, directed, fromFigure, exitSide, 0, 0, entrySide, toFigure, null);
	}
	
	protected FlowFigure createFlowFigure(int dashboardViewType, int directed, BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure) {
		return createFlowFigure(dashboardViewType, directed, fromFigure, exitSide, exitTweak, entryTweak, entrySide, toFigure, null);
	}
	
	protected FlowFigure createFlowFigure(int dashboardViewType, int directed, BoxFigure fromFigure, int exitSide, int entrySide, BoxFigure toFigure, FlowActionFigure flowActionFigure) {
		return createFlowFigure(dashboardViewType, directed, fromFigure, exitSide, 0, 0, entrySide, toFigure, flowActionFigure);
	}
	protected FlowFigure createFlowFigure(int dashboardViewType, int directed, BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure, FlowActionFigure flowActionFigure) {
		FlowFigure flowFigure = new FlowFigure(dashboardViewType, fromFigure, exitSide, exitTweak, entryTweak, entrySide, toFigure, flowActionFigure);
		flowFigure.setVisible(false);
		if (directed!=0) {
			PolygonDecoration decoration = new PolygonDecoration();
			PointList template = new PointList();
			template.addPoint(0, -LINE_WIDTH / 2);
			template.addPoint(0, LINE_WIDTH / 2);
			template.addPoint(-ARROW_LENGTH, LINE_WIDTH / 2 + 5);
			template.addPoint(-ARROW_LENGTH, -(LINE_WIDTH / 2 + 5));
			decoration.setTemplate(template);
			decoration.setScale(1, 1);
			flowFigure.setTargetDecoration(decoration);
		}
		if (directed==2) {
			PolygonDecoration decoration = new PolygonDecoration();
			PointList template = new PointList();
			template.addPoint(0, -LINE_WIDTH / 2);
			template.addPoint(0, LINE_WIDTH / 2);
			template.addPoint(-ARROW_LENGTH, LINE_WIDTH / 2 + 5);
			template.addPoint(-ARROW_LENGTH, -(LINE_WIDTH / 2 + 5));
			decoration.setTemplate(template);
			decoration.setScale(1, 1);
			flowFigure.setSourceDecoration(decoration);
		}
		flowFigure.setForegroundColor(DASHBOARD_FG);
		flowFigure.setLineWidth(LINE_WIDTH);
		add(flowFigure);
		
		if (flowActionFigure != null)
			add(flowActionFigure); // the flowActionFigure is added here so it appears in front of the flow arrow. 
		
		allFlowFigures.add(flowFigure);
		return flowFigure;
	}

	protected FlowActionFigure createFlowActionFigure(int dashboardViewType, String label, String actionId) {
		return createFlowActionFigure(dashboardViewType, new ActionSpecification[] {new ActionSpecification(label, actionId)});
	}
	
	protected FlowActionFigure createFlowActionFigure(int dashboardViewType, String label1, String actionId1, String label2, String actionId2) {
		return createFlowActionFigure(dashboardViewType, new ActionSpecification[] {new ActionSpecification(label1, actionId1),new ActionSpecification(label2, actionId2)});
	}
	
	protected FlowActionFigure createFlowActionFigure(int dashboardViewType, ActionSpecification[] labelActionIds) {
		FlowActionFigure flowActionFigure = new FlowActionFigure(dashboardViewType, labelActionIds);
		flowActionFigure.setVisible(false);
		ToolbarLayout flowActionLayout = new ToolbarLayout();
		flowActionLayout.setStretchMinorAxis(false);
		flowActionLayout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		flowActionFigure.setLayoutManager(flowActionLayout);
		flowActionFigure.setBackgroundColor(MODEL_BG);
		flowActionFigure.setForegroundColor(DASHBOARD_FG);
		flowActionFigure.setLineWidth(LINE_WIDTH);
		flowActionFigure.setBorder(new MarginBorder(TEXT_GAP / 2));
		// flow action figures are not added to the view in createFlowActionFigure, but in createFlowFigure. Otherwise they are
		// shown behind the flow arrow.
		
		allFlowActionFigures.add(flowActionFigure);
		return flowActionFigure;
	}

	protected DividerFigure createDividerFigure(int orientation) {
		DividerFigure dividerFigure = new DividerFigure(orientation);
		dividerFigure.setBackgroundColor(MODEL_BG);
		dividerFigure.setForegroundColor(DASHBOARD_FG);
		dividerFigure.setLineWidth(LINE_WIDTH);
		add(dividerFigure);
		
		allDividerFigures.add(dividerFigure);
		return dividerFigure;
	}
	
	protected void outlineShape(Graphics graphics) {
	}

	private class DashboardLayout extends AbstractLayout {

		private static final int BOX_SPACING = 20;

		protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
			Dimension d = getLayoutData(container.getClientArea().getSize()).getSize();
			Insets insets = container.getInsets();
			d = new Dimension(d.width + insets.getWidth(), d.height + insets.getHeight());
			return d.union(getBorderPreferredSize(container));
		}

		public void layout(IFigure container) {
			getLayoutData(container.getClientArea().getSize()).apply(container.getClientArea().getLocation());
		}

		protected LayoutData getLayoutData(Dimension containerSize) {
			LayoutData data = new LayoutData();
			
			for (BoxFigure boxFigure : allBoxFigures)
				boxFigure.initializeSize();
			
			// Note: take care that x and y (and getRight and getBottom) are used only after x and y are computed.
			taskFigure.x = 2*BOX_SPACING;
			actionFigure.x = serviceFigure.x = taskFigure.getRight() + 5*BOX_SPACING;
			organisationFigure.x = actionFigure.getRight() + BOX_SPACING;
			planFigure.x = organisationFigure.x + 3*BOX_SPACING/2;
			ontologyFigure.x = organisationFigure.getRight() + BOX_SPACING;
			masFigure.x = ontologyFigure.x;
			descriptionsFigure.x = descriptionsFigureBU.x = serviceFigure.getRight() + 5*BOX_SPACING/2;
			repositoryFigure.x = descriptionsFigure.getRight() + 5*BOX_SPACING/2;
			agentsFigure.x = enactmentFigure.x = enactmentFigureBU.x = masFigure.getRight() + 5*BOX_SPACING;
				
			ontologyFigure.y = 0;
			organisationFigure.y = ontologyFigure.getBottom();
			taskFigure.y = actionFigure.y = organisationFigure.getBottom() + 3*BOX_SPACING;
			masFigure.y = taskFigure.y - 2*BOX_SPACING; 
			agentsFigure.y = masFigure.y + BOX_SPACING/2;
			planFigure.y = enactmentFigureBU.y = taskFigure.getBottom();
			serviceFigure.y = enactmentFigure.y = planFigure.getBottom() + 2*BOX_SPACING;	
			descriptionsFigure.y = descriptionsFigureBU.y = repositoryFigure.y = serviceFigure.y + 3*BOX_SPACING/2;
				
			divider1.pos = organisationFigure.getBottom() + BOX_SPACING / 2;
			divider2.pos = planFigure.getBottom() + BOX_SPACING / 2;
			
			
			// logo and status
			
			Dimension logoSize = logoFigure.getPreferredSize();
			data.logoBox = new Rectangle(0, 0, logoSize.width, logoSize.height);
			
			data.statusBox = new Rectangle(new Point(agentsFigure.x, 0), statusFigure.getPreferredSize());

			data.viewSelectionButtonBox = new Rectangle(new Point(data.statusBox.x + data.statusBox.width+5, -1) , viewSelectionButtonFigure.getPreferredSize());
			
			// labels
			
			data.label1Box = new Rectangle(new Point(0, data.logoBox.y+data.logoBox.height+BOX_SPACING/2),organisationLabel.getPreferredSize());
			data.label2Box = new Rectangle(new Point(0,divider1.pos+BOX_SPACING/2),coordinationLabel.getPreferredSize());
			data.label3Box = new Rectangle(new Point(0,divider2.pos+BOX_SPACING/2),serviceLabel.getPreferredSize());

			
			for (FlowFigure flowFigure : allFlowFigures)
				flowFigure.performLayout();
		
			for (DividerFigure dividerFigure : allDividerFigures)
				dividerFigure.performLayout(containerSize);
			
			return data;
		}

		
		private class LayoutData {
			
			public Rectangle label1Box, label2Box, label3Box;

			public Rectangle logoBox;

			public Rectangle statusBox;

			public Rectangle viewSelectionButtonBox;
			
			public void apply(Point offset) {
				logoFigure.setBounds(logoBox.getTranslated(offset));
				viewSelectionButtonFigure.setBounds(viewSelectionButtonBox.getTranslated(offset));
				statusFigure.setBounds(statusBox.getTranslated(offset));
				
				for (BoxFigure boxFigure : allBoxFigures)
					boxFigure.apply(offset);
											
				for (FlowFigure flowFigure : allFlowFigures)
					flowFigure.apply(offset);
					
				for (DividerFigure dividerFigure : allDividerFigures)
					dividerFigure.apply(offset);
				
				organisationLabel.setBounds(label1Box.getTranslated(offset));
				coordinationLabel.setBounds(label2Box.getTranslated(offset));
				serviceLabel.setBounds(label3Box.getTranslated(offset));
			}

			public Dimension getSize() {
				Rectangle bounds = logoBox.getCopy();
				bounds.union(viewSelectionButtonBox);
				bounds.union(statusBox);

				
				for (BoxFigure boxFigure : allBoxFigures)
					bounds.union(boxFigure.getLayoutDimensions());
				// No need to take into account flow actions, as they will always lie between bounds

				return bounds.getSize();
			}
		}
	}
}
