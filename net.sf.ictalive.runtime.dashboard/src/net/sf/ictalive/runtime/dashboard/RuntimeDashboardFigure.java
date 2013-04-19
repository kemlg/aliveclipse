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
package net.sf.ictalive.runtime.dashboard;

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
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * @author dstadnik
 */
public class RuntimeDashboardFigure extends RectangleFigure {
	
	private static final int LINE_WIDTH = 3;

	private static final int TEXT_GAP = LINE_WIDTH + 3;

	private static final int ARROW_LENGTH = 8;

	private static final Color DASHBOARD_BG = new Color(null, 113, 104, 209);

	public static final Color DASHBOARD_FG = new Color(null, 169, 164, 227);
	
	public static final Color DASHBOARD_COMPLETED = new Color(null, 80, 80, 80);

	private static final Color MODEL_BG = ColorConstants.white;

	private ImageFigure logoFigure;

	private IFigure statusFigure;

	// Lists of figures, used for calling layout functions automatically on all figures.
	
	protected List<BoxFigure> allBoxFigures = new ArrayList<BoxFigure>();

	protected List<FlowFigure> allFlowFigures = new ArrayList<FlowFigure>();
	
	protected List<FlowActionFigure> allFlowActionFigures = new ArrayList<FlowActionFigure>();

	protected List<DividerFigure> allDividerFigures = new ArrayList<DividerFigure>();
	
	// models

	protected RuntimeModelFigure servicePlatformFigure, agentPlatformFigure, eventBusFigure, eventCollectorFigure, eventLogFigure;
	protected ActionFigure deployServicesFigure, injectMASFigure, inspectAgentPlatformFigure, runtimeMonitoringFigure, offlineAnalysisFigure;
	
	
	public RuntimeDashboardFigure() {
		add(logoFigure = new ImageFigure() {

			@Override
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
	
		// select and edit actions are added in DashboardMediator
		servicePlatformFigure = createModelFigure("Service Platform", false,
				"configure", RuntimeDashboardState.ConfigureServicePlatformId,
				"start", RuntimeDashboardState.StartServicePlatformId,
				"restart", RuntimeDashboardState.RestartServicePlatformId,
				"stop", RuntimeDashboardState.StopServicePlatformId );
		agentPlatformFigure = createModelFigure("Agent Platform", true,
				"configure", RuntimeDashboardState.ConfigureAgentPlatformId,
				"start", RuntimeDashboardState.StartAgentPlatformId,
				"restart", RuntimeDashboardState.RestartAgentPlatformId,
				"stop", RuntimeDashboardState.StopAgentPlatformId );
		eventBusFigure = createModelFigure("Event Bus", true,
				"configure", RuntimeDashboardState.ConfigureEventBusId,
				"start", RuntimeDashboardState.StartEventBusId,
				"restart", RuntimeDashboardState.RestartEventBusId,
				"stop", RuntimeDashboardState.StopEventBusId );
		eventCollectorFigure = createModelFigure("Event Collector", true,
				"configure", RuntimeDashboardState.ConfigureEventCollectorId,
				"start", RuntimeDashboardState.StartEventCollectorId,
				"restart", RuntimeDashboardState.RestartEventCollectorId,
				"stop", RuntimeDashboardState.StopEventCollectorId );
		eventLogFigure = createModelFigure("Event Log", true,
				"configure", RuntimeDashboardState.ConfigureEventLogId,
				"start", RuntimeDashboardState.StartEventLogId,
				"restart", RuntimeDashboardState.RestartEventLogId,
				"stop", RuntimeDashboardState.StopEventLogId );
		


		deployServicesFigure = createActionFigure("Deploy Services", RuntimeDashboardState.DeployServicesId);
		injectMASFigure = createActionFigure("Inject MAS", RuntimeDashboardState.InjectMASId);
		inspectAgentPlatformFigure = createActionFigure("Inspect Agent Platform", RuntimeDashboardState.InspectAgentPlatformId);
		runtimeMonitoringFigure = createActionFigure("Runtime Monitoring", RuntimeDashboardState.RuntimeMonitoringId);
		offlineAnalysisFigure = createActionFigure("Offline Analysis", RuntimeDashboardState.OfflineAnalysisId);
				
		createFlowFigure(1, servicePlatformFigure, FlowFigure.RIGHT, FlowFigure.LEFT, deployServicesFigure);
		createFlowFigure(1, agentPlatformFigure, FlowFigure.RIGHT, FlowFigure.LEFT, injectMASFigure);
		createFlowFigure(1, injectMASFigure, FlowFigure.RIGHT, FlowFigure.LEFT, inspectAgentPlatformFigure);
		createFlowFigure(1, eventBusFigure, FlowFigure.RIGHT, FlowFigure.LEFT, runtimeMonitoringFigure);
		createFlowFigure(1, eventBusFigure, FlowFigure.BOTTOM, FlowFigure.TOP, eventCollectorFigure);
		createFlowFigure(1, eventLogFigure, FlowFigure.TOP, FlowFigure.BOTTOM, eventCollectorFigure);
		createFlowFigure(1, eventLogFigure, FlowFigure.RIGHT, FlowFigure.LEFT, offlineAnalysisFigure);
		
		eventLogFigure.setModelLocation(RuntimeDashboardState.LOCATION_EventLog_Location);
		eventBusFigure.setModelLocation(RuntimeDashboardState.LOCATION_EventBus_Location);
		eventCollectorFigure.setModelLocation(RuntimeDashboardState.LOCATION_EventCollector_location);
		agentPlatformFigure.setModelLocation(RuntimeDashboardState.AGENTSCAPE_LOCATION);
		
/*
		add(organisationLabel = new Label("Runtime dashboard"));
		organisationLabel.setFont(JFaceResources.getBannerFont());
*/		
		add(statusFigure = new Figure());
		statusFigure.setFont(JFaceResources.getBannerFont());
		ToolbarLayout statusLayout = new ToolbarLayout();
		statusLayout.setStretchMinorAxis(false);
		statusFigure.setLayoutManager(statusLayout);
		statusFigure.add(new Label("Runtime"));
		statusFigure.add(new Label());
		statusFigure.add(new Label());

		
		setLayoutManager(new DashboardLayout());
		setBorder(new MarginBorder(10));
		setBackgroundColor(DASHBOARD_BG);
		setForegroundColor(DASHBOARD_FG);
	}

	public Label getStatusLine(int i) {
		return (Label) statusFigure.getChildren().get(i+1); // 0 is the "Design" label
	}

	protected RuntimeModelFigure createModelFigure(String description, boolean hasName) {
		return createModelFigure(description, hasName, null, new ActionSpecification[] {});	
	}
		
	protected RuntimeModelFigure createModelFigure(String description, boolean hasName, String label, String actionId) {
		return createModelFigure(description, hasName, null, new ActionSpecification[] {new ActionSpecification(label, actionId)});	
	}

	protected RuntimeModelFigure createModelFigure(String description, boolean hasName, String label1, String actionId1, String label2, String actionId2) {
		return createModelFigure(description, hasName, null, new ActionSpecification[] {new ActionSpecification(label1, actionId1),new ActionSpecification(label2, actionId2)});	
	}

	protected RuntimeModelFigure createModelFigure(String description, boolean hasName, String label1, String actionId1, String label2, String actionId2,
											String label3, String actionId3, String label4, String actionId4) {
		return createModelFigure(description, hasName, null,
				new ActionSpecification[] { new ActionSpecification(label1, actionId1),
										    new ActionSpecification(label2, actionId2),
										    new ActionSpecification(label3, actionId3),
										    new ActionSpecification(label4, actionId4)});	
	}

	protected RuntimeModelFigure createModelFigure(String description, boolean hasName, String iconKey, ActionSpecification[] labelActionIds) {
		RuntimeModelFigure modelFigure = new RuntimeModelFigure(labelActionIds, hasName);
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
	
	protected FlowFigure createFlowFigure(int directed, BoxFigure fromFigure, int exitSide, int entrySide, BoxFigure toFigure) {
		return createFlowFigure(directed, fromFigure, exitSide, 0, 0, entrySide, toFigure, null);
	}
	
	protected FlowFigure createFlowFigure(int directed, BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure) {
		return createFlowFigure(directed, fromFigure, exitSide, exitTweak, entryTweak, entrySide, toFigure, null);
	}
	
	protected FlowFigure createFlowFigure(int directed, BoxFigure fromFigure, int exitSide, int entrySide, BoxFigure toFigure, FlowActionFigure flowActionFigure) {
		return createFlowFigure(directed, fromFigure, exitSide, 0, 0, entrySide, toFigure, flowActionFigure);
	}
	protected FlowFigure createFlowFigure(int directed, BoxFigure fromFigure, int exitSide, int exitTweak, int entryTweak, int entrySide, BoxFigure toFigure, FlowActionFigure flowActionFigure) {
		FlowFigure flowFigure = new FlowFigure(fromFigure, exitSide, exitTweak, entryTweak, entrySide, toFigure, flowActionFigure);
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

	protected FlowActionFigure createFlowActionFigure(String label, String actionId) {
		return createFlowActionFigure(new ActionSpecification[] {new ActionSpecification(label, actionId)});
	}
	
	protected FlowActionFigure createFlowActionFigure(String label1, String actionId1, String label2, String actionId2) {
		return createFlowActionFigure(new ActionSpecification[] {new ActionSpecification(label1, actionId1),new ActionSpecification(label2, actionId2)});
	}
	
	protected FlowActionFigure createFlowActionFigure(ActionSpecification[] labelActionIds) {
		FlowActionFigure flowActionFigure = new FlowActionFigure(labelActionIds);
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
	
	@Override
	protected void outlineShape(Graphics graphics) {
	}

	private class DashboardLayout extends AbstractLayout {

		private static final int BOX_SPACING = 20;

		@Override
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

			int max = Math.max(deployServicesFigure.width, Math.max(injectMASFigure.width, Math.max(runtimeMonitoringFigure.width, offlineAnalysisFigure.width)));
			deployServicesFigure.width = injectMASFigure.width = runtimeMonitoringFigure.width = offlineAnalysisFigure.width = max;
			
			deployServicesFigure.height = injectMASFigure.height = runtimeMonitoringFigure.height = offlineAnalysisFigure.height = inspectAgentPlatformFigure.height =
				servicePlatformFigure.height;

			
			servicePlatformFigure.x = agentPlatformFigure.x = eventBusFigure.x = eventCollectorFigure.x = eventLogFigure.x = 
				0;
			
			servicePlatformFigure.y = 0;
			agentPlatformFigure.y = servicePlatformFigure.getBottom() + 2*BOX_SPACING;
			eventBusFigure.y = agentPlatformFigure.getBottom() + 2*BOX_SPACING;
			eventCollectorFigure.y = eventBusFigure.getBottom() + 2*BOX_SPACING;
			eventLogFigure.y = eventCollectorFigure.getBottom() + 2*BOX_SPACING;
			
			deployServicesFigure.x = injectMASFigure.x = runtimeMonitoringFigure.x = offlineAnalysisFigure.x = 
				servicePlatformFigure.getRight() + 3*BOX_SPACING;
			
			inspectAgentPlatformFigure.x = deployServicesFigure.getRight() + 3*BOX_SPACING;
			
			deployServicesFigure.y = servicePlatformFigure.y;
			injectMASFigure.y = agentPlatformFigure.y;
			inspectAgentPlatformFigure.y = agentPlatformFigure.y;
			runtimeMonitoringFigure.y = eventBusFigure.y;
			offlineAnalysisFigure.y = eventLogFigure.y;
						
			// logo and status
			
			Dimension logoSize = logoFigure.getPreferredSize();
			data.logoBox = new Rectangle(inspectAgentPlatformFigure.getRight()+ 3*BOX_SPACING, 0, logoSize.width, logoSize.height);
			data.statusBox = new Rectangle(new Point(data.logoBox.x, agentPlatformFigure.y), statusFigure.getPreferredSize());

			
			// labels
			
			//data.label1Box = new Rectangle(new Point(0, data.logoBox.y+data.logoBox.height+BOX_SPACING/2),organisationLabel.getPreferredSize());
			
			
			for (FlowFigure flowFigure : allFlowFigures)
				flowFigure.performLayout();

			for (DividerFigure dividerFigure : allDividerFigures)
				dividerFigure.performLayout(containerSize);
			
			return data;
		}

		
		private class LayoutData {
			
			//public Rectangle label1Box, label2Box, label3Box, label4Box;

			public Rectangle logoBox;

			public Rectangle statusBox;
			
			public void apply(Point offset) {
				statusFigure.setBounds(statusBox.getTranslated(offset));
				logoFigure.setBounds(logoBox.getTranslated(offset));
				
				for (BoxFigure boxFigure : allBoxFigures)
					boxFigure.apply(offset);
											
				for (FlowFigure flowFigure : allFlowFigures)
					flowFigure.apply(offset);
					
				for (DividerFigure dividerFigure : allDividerFigures)
					dividerFigure.apply(offset);
				
				//organisationLabel.setBounds(label1Box.getTranslated(offset));
			}

			public Dimension getSize() {
				Rectangle bounds = statusBox.getCopy();
				bounds.union(logoBox);
				
				for (BoxFigure boxFigure : allBoxFigures)
					bounds.union(boxFigure.getLayoutDimensions());
				
				// No need to take into account flow actions, as they will always lie between bounds

				return bounds.getSize();
			}
		}
	}
}
