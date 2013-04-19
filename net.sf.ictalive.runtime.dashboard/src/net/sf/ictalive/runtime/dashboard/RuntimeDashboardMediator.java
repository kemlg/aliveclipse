/*
 * Copyright (c) 2006, 2007 Eclipse.org
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

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

//import net.sf.ictalive.operetta.OM.presentation.OMModelWizard;
import net.sf.ictalive.dashboard.ActionContainer;
import net.sf.ictalive.dashboard.ActionSpecification;
import net.sf.ictalive.dashboard.DashboardFacade;
import net.sf.ictalive.dashboard.InternalDashboardAction;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.dashboard.PluginDashboardAction;
import net.sf.ictalive.dashboard.figure.BoxFigure;
import net.sf.ictalive.dashboard.figure.FlowActionFigure;
import net.sf.ictalive.dashboard.figure.HyperlinkFigure;
import net.sf.ictalive.dashboard.figure.ModelFigure;
import net.sf.ictalive.runtime.dashboard.DashboardActionRegistry.DashboardActionDescriptor;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

/**
 * @author dstadnik
 */
public class RuntimeDashboardMediator implements DashboardFacade<RuntimeDashboardState> {

	private static final boolean STRICT = true;

	private RuntimeDashboardFigure view;

	private Shell shell;

	private IProject project;

	private RuntimeDashboardState state;

	private Map<String, ActionContainer> locations;

	private Map<DashboardActionDescriptor, IFigure> contributions;

	// all plugged in dashboard actions are kept in a map, indexed by their dashboardActionId
	Map<String, PluggedInDashboardAction<RuntimeDashboardState>> pluggedInActions = 
		new HashMap<String, PluggedInDashboardAction<RuntimeDashboardState>>();
	
	public Map<String, PluggedInDashboardAction<RuntimeDashboardState>> getPluggedInDashboardActions() {
		return pluggedInActions;
	}

	public RuntimeDashboardMediator(Shell shell) {
		state = new RuntimeDashboardState();
		locations = new HashMap<String, ActionContainer>();
		contributions = new HashMap<DashboardActionDescriptor, IFigure>();
		this.shell = shell;
		
		
	    IConfigurationElement[] config = Platform.getExtensionRegistry()
		.getConfigurationElementsFor("net.sf.ictalive.runtime.dashboard.actions");
	    for (IConfigurationElement ce : config)
	    	try {
	    		Object o = ce.createExecutableExtension("class");
	    		if (o instanceof PluggedInDashboardAction<?>) {
	    			PluggedInDashboardAction<RuntimeDashboardState> pluggedInAction =(PluggedInDashboardAction<RuntimeDashboardState>)o;
	    			if (pluggedInAction.dashboardActionId() == null)
	    				Plugin.getDefault().getLog().log(Plugin.createError("IDashboardAction plugin has null dashboardActionId.", null));
	    			else
	    				pluggedInActions.put(pluggedInAction.dashboardActionId(), pluggedInAction);
	    		}
	    	} catch (CoreException e1) {
				e1.printStackTrace();
	    	}
	}

	public boolean isStrict() {
		return STRICT;
	}

	public Shell getShell() {
		return shell;
	}

	public void setView(RuntimeDashboardFigure view) {
		this.view = view;
//		locations.put(LOCATION_ServicePlatform, view.servicePlatformFigure);		// not used by ALIVE
	
		view.agentPlatformFigure.setMediator(this);
		view.eventBusFigure.setMediator(this);
		view.eventCollectorFigure.setMediator(this);
		view.eventLogFigure.setMediator(this);
		view.servicePlatformFigure.setMediator(this);

		// for boxFigures, the label and actionId are specified in the figure itself on creation.
		for (BoxFigure boxFigure : view.allBoxFigures)
			for (ActionSpecification labelActionId : boxFigure.getLabelActionIds())
				boxFigure.addAction(createLinkFigure(labelActionId.getLabel(), new PluginDashboardAction<RuntimeDashboardState>( labelActionId.getActionId(), false ))); // box actions do not prompt a resource save

		for (FlowActionFigure flowActionFigure : view.allFlowActionFigures)
			for (ActionSpecification labelActionId : flowActionFigure.getLabelActionIds())
				flowActionFigure.addAction(createLinkFigure(labelActionId.getLabel(), new PluginDashboardAction<RuntimeDashboardState>( labelActionId.getActionId(), true ))); // flow actions do prompt a resource save

		for (DashboardActionDescriptor descriptor : Plugin.getDefault().getDashboardActionRegistry().getDescriptors()) {
			addDashboardAction(descriptor);
		}
		updateStatus();
	}
	// GMF action plugins, not used by Alive
	public void addDashboardAction(DashboardActionDescriptor descriptor) {
		ActionContainer location = locations.get(descriptor.getLocation());
		if (location == null) {
			Plugin.getDefault().getLog().log(Plugin.createError("Unknown ALIVE Dashboard location: " + descriptor.getLocation(), null)); //$NON-NLS-1$
			return;
		}
		InternalDashboardAction<RuntimeDashboardState> action = descriptor.createDashboardAction();
		if (action == null) {
			return;
		}
		IFigure actionFigure = createLinkFigure(descriptor.getLabel(), action);
		location.addAction(actionFigure, descriptor.isStandard());
		contributions.put(descriptor, actionFigure);
	}

	// GMF action plugins, not used by Alive
	public void removeDashboardAction(DashboardActionDescriptor descriptor) {
		IFigure actionFigure = contributions.remove(descriptor);
		if (actionFigure == null) {
			return; // not contributed; just ignore
		}
		ActionContainer location = locations.get(descriptor.getLocation());
		if (location == null) {
			Plugin.getDefault().getLog().log(Plugin.createError("Unknown ALIVE Dashboard location: " + descriptor.getLocation(), null)); //$NON-NLS-1$
			return;
		}
		location.removeAction(actionFigure, descriptor.isStandard());
	}

	/**
	 * Also initializes the action.
	 */
	protected IFigure createLinkFigure(String text, InternalDashboardAction<RuntimeDashboardState> action) {
		action.init(this);
		HyperlinkFigure<RuntimeDashboardState> linkFigure = new HyperlinkFigure<RuntimeDashboardState>(action);
		linkFigure.setText(text);
		return linkFigure;
	}

	public IProject getProject() {
		return project;
	}

	public RuntimeDashboardState getState() {
		return state;
	}

	public void setProjectAndState(IProject project, RuntimeDashboardState state) {
		this.project = project;
		this.state = state;
		if (this.state == null) {
			this.state = new RuntimeDashboardState();
		}
		updateStatus();
	}

	public void updateStatus() {
		if (project == null) {
			view.getStatusLine(0).setText(Messages.DashboardMediator_SelectProject);
			view.getStatusLine(1).setText(""); //$NON-NLS-1$
		} else {
			view.getStatusLine(0).setText(MessageFormat.format(Messages.DashboardMediator_Project, new Object[] { project.getName() }));
			// no percentage for this dashboard
			//double done = 0.0; // (double) state.getSpecifiedModelsCount() / state.getModelsCount();
			//view.getStatusLine(1).setText(MessageFormat.format(Messages.DashboardMediator_Progress, new Object[] { new Double(done) }));
		}
		
		setModelIcon(view.servicePlatformFigure, state.getServicePlatformStatus());
		setModelIcon(view.agentPlatformFigure, state.getAgentPlatformStatus());
		setModelIcon(view.eventBusFigure, state.getEventBusStatus());
		setModelIcon(view.eventCollectorFigure, state.getEventCollectorStatus());
		setModelIcon(view.eventLogFigure, state.getEventLogStatus());
		
		for (BoxFigure<RuntimeDashboardState> boxFigure : view.allBoxFigures)
			boxFigure.refresh();
		
		view.repaint(); // update hyperlinks
	}

	protected void setModelName(ModelFigure figure, URI uri) {
		figure.setName(uri == null ? null : uri.lastSegment());
		figure.setFullName(uri == null ? null : uri.toString());
	}

	protected void setModelIcon(ModelFigure figure, String status) {
		String imageKey;
		if (status != null && status.equals("StatusGreen")) 
			imageKey = Plugin.STATUS_GREEN_ICON;
		else if (status != null && status.equals("StatusRed")) 
			imageKey = Plugin.STATUS_RED_ICON;
		else
			imageKey = Plugin.STATUS_GREY_ICON;
		
		Image image = Plugin.getDefault().getImageRegistry().get(imageKey);
		if (image != null) {
			figure.setIcon(image);
		}
	}
}
