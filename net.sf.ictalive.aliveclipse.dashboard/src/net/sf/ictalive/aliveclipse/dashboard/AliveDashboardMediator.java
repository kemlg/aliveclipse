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
package net.sf.ictalive.aliveclipse.dashboard;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

//import net.sf.ictalive.operetta.OM.presentation.OMModelWizard;
import net.sf.ictalive.aliveclipse.dashboard.DashboardActionRegistry.DashboardActionDescriptor;
import net.sf.ictalive.dashboard.ActionContainer;
import net.sf.ictalive.dashboard.ActionSpecification;
import net.sf.ictalive.dashboard.DashboardFacade;
import net.sf.ictalive.dashboard.EditFileDashboardAction;
import net.sf.ictalive.dashboard.InternalDashboardAction;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.dashboard.PluginDashboardAction;
import net.sf.ictalive.dashboard.SelectFileDashboardAction;
import net.sf.ictalive.dashboard.figure.BoxFigure;
import net.sf.ictalive.dashboard.figure.FlowActionFigure;
import net.sf.ictalive.dashboard.figure.HyperlinkFigure;
import net.sf.ictalive.dashboard.figure.ModelFigure;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

/**
 * @author dstadnik
 */
public class AliveDashboardMediator implements DashboardFacade<AliveDashboardState> {

	private static final boolean STRICT = true;

	private AliveDashboardFigure view;

	private DashboardPart dashboardPart; // its menu needs to be updated when the view changes.
	
	private Shell shell;

	private IProject project;

	private AliveDashboardState state;

	private Map<String, ActionContainer> locations;

	private Map<DashboardActionDescriptor, IFigure> contributions;

	// all plugged in dashboard actions are kept in a map, indexed by their dashboardActionId
	Map<String, PluggedInDashboardAction<AliveDashboardState>> pluggedInActions = 
		new HashMap<String, PluggedInDashboardAction<AliveDashboardState>>();
	
	public Map<String, PluggedInDashboardAction<AliveDashboardState>> getPluggedInDashboardActions() {
		return pluggedInActions;
	}
	
	public AliveDashboardMediator(Shell shell, DashboardPart dashboardPart) {
		this.dashboardPart = dashboardPart;
		state = new AliveDashboardState();
		locations = new HashMap<String, ActionContainer>();
		contributions = new HashMap<DashboardActionDescriptor, IFigure>();
		this.shell = shell;
		
	    IConfigurationElement[] config = Platform.getExtensionRegistry()
		.getConfigurationElementsFor("net.sf.ictalive.aliveclipse.dashboard.actions");
	    for (IConfigurationElement ce : config)
	    	try {

	    		Object o = ce.createExecutableExtension("class");
	    		if (o instanceof PluggedInDashboardAction<?>) {
	    			PluggedInDashboardAction<AliveDashboardState> pluggedInAction =(PluggedInDashboardAction<AliveDashboardState>)o;
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

	public void setView(AliveDashboardFigure view) {
		this.view = view;
		
		view.viewSelectionButtonFigure.addMouseListener(new MouseListener() {

			public void mouseDoubleClicked(MouseEvent me) {
			}

			public void mousePressed(MouseEvent me) {
			}

			public void mouseReleased(MouseEvent me) {
				ViewSelectionDialog viewSelectionDialog = new ViewSelectionDialog();
				viewSelectionDialog.open(AliveDashboardMediator.this, AliveDashboardMediator.this.dashboardPart);
			}});

		
		view.organisationFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectOrganisationAction()));
		view.ontologyFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectOntologyAction()));
		view.taskFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectTaskAction()));
		view.actionFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectActionAction()));
		view.masFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectMASAction()));
		view.planFigure.addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectPlanAction()));
		view.organisationFigure.addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditFileDashboardAction<AliveDashboardState>(){@Override
		protected URI getURI() {return state.getOrganisation(); }}));
		view.taskFigure.addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditFileDashboardAction<AliveDashboardState>(){@Override
		protected URI getURI() {return state.getTask(); }}));
		view.actionFigure.addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditFileDashboardAction<AliveDashboardState>(){@Override
		protected URI getURI() {return state.getAction(); }}));
		view.masFigure.addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditFileDashboardAction<AliveDashboardState>(){@Override
		protected URI getURI() {return state.getMAS(); }}));
		view.planFigure.addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditFileDashboardAction<AliveDashboardState>(){@Override
		protected URI getURI() {return state.getPlan(); }}));
		
		view.organisationFigure.setMediator(this);
		view.ontologyFigure.setMediator(this);
		view.taskFigure.setMediator(this);
		view.actionFigure.setMediator(this);
		view.masFigure.setMediator(this);
		view.agentsFigure.setMediator(this);
		view.planFigure.setMediator(this);
		
		// for modelFigures, the label and actionId are specified in the figure itself on creation.
		for (BoxFigure<AliveDashboardState> boxFigure : view.allBoxFigures)
			for (ActionSpecification labelActionId : boxFigure.getLabelActionIds())
				boxFigure.addAction(createLinkFigure(labelActionId.getLabel(), new PluginDashboardAction<AliveDashboardState>( labelActionId.getActionId(), false ))); // box actions do not prompt a resource save
		
		for (FlowActionFigure flowActionFigure : view.allFlowActionFigures)
			for (ActionSpecification labelActionId : flowActionFigure.getLabelActionIds())
				flowActionFigure.addAction(createLinkFigure(labelActionId.getLabel(), new PluginDashboardAction<AliveDashboardState>( labelActionId.getActionId(), true ))); // flow actions do prompt a resource save

		for (DashboardActionDescriptor descriptor : Plugin.getDefault().getDashboardActionRegistry().getDescriptors()) {
			addDashboardAction(descriptor);
		}
		
		Image logoImage = Plugin.getDefault().getImageRegistry().get(Plugin.PLAY_BUTTON_IMAGE);
		if (logoImage != null) {
			view.enactmentFigure.setIcon(logoImage);
			view.enactmentFigureBU.setIcon(logoImage);
		}

		updateStatus();
	}
	
	public void setDashboardViewType(int dashboardViewType) {
		this.view.setDashboardViewType(dashboardViewType);
	}
	
	public int getDashboardViewType() {
		return this.view.getDashboardViewType();
	}
	
	public void clearModelURIs() {
		state.setOrganisation((URI)null);
		state.setOntology(null);
		state.setTask(null);
		state.setAction(null);
		state.setMAS(null);
		state.setAgents(null);
		state.setPlan(null);
		updateStatus();
	}
	
	// GMF action plugins, not used by Alive
	public void addDashboardAction(DashboardActionDescriptor descriptor) {
		ActionContainer location = locations.get(descriptor.getLocation());
		if (location == null) {
			Plugin.getDefault().getLog().log(Plugin.createError("Unknown ALIVE Dashboard location: " + descriptor.getLocation(), null)); //$NON-NLS-1$
			return;
		}
		InternalDashboardAction<AliveDashboardState> action = descriptor.createDashboardAction();
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
	protected IFigure createLinkFigure(String text, InternalDashboardAction<AliveDashboardState> action) {
		action.init(this);
		HyperlinkFigure<AliveDashboardState> linkFigure = new HyperlinkFigure<AliveDashboardState>(action);
		linkFigure.setText(text);
		return linkFigure;
	}

	public IProject getProject() {
		return project;
	}

	public AliveDashboardState getState() {
		return state;
	}

	public void setProjectAndState(IProject project, AliveDashboardState state) {
		this.project = project;
		this.state = state;
		if (this.state == null) {
			this.state = new AliveDashboardState();
		}
		updateStatus();
	}

	public void updateStatus() {
		if (project == null) {
			view.getStatusLine(0).setText(Messages.DashboardMediator_SelectProject);
			view.getStatusLine(1).setText(""); //$NON-NLS-1$
		} else {
			boolean isAliveProject = false;
			try {
				if (project.getNature("net.sf.ictalive.aliveclipse.projectNature") != null)
					isAliveProject = true;
			} catch (CoreException e) {
			}
			
			if (isAliveProject) {
				view.getStatusLine(0).setText(MessageFormat.format(Messages.DashboardMediator_Project, new Object[] { project.getName() }));
				double done = (double) state.getSpecifiedModelsCount() / state.getModelsCount();
				view.getStatusLine(1).setText(MessageFormat.format(Messages.DashboardMediator_Progress, new Object[] { new Double(done) }));
			}
			else {
				view.getStatusLine(0).setText(MessageFormat.format(Messages.DashboardMediator_Project, new Object[] { project.getName() }));
				view.getStatusLine(1).setText("Not an ALIVE project"); //$NON-NLS-1$				
			}
		}
		for (BoxFigure<AliveDashboardState> boxFigure : view.allBoxFigures)
			boxFigure.refresh();
				
		view.repaint(); // update hyperlinks
	}

	protected void setModelName(ModelFigure figure, URI uri) {
		figure.setName(uri == null ? null : uri.lastSegment());
		figure.setFullName(uri == null ? null : uri.toString());
		figure.setForegroundColor(uri == null ? AliveDashboardFigure.DASHBOARD_FG : AliveDashboardFigure.DASHBOARD_COMPLETED);
	}

	private class SelectOrganisationAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.organisationFigure;
		}

		@Override
		protected URI getURI() {
			return state.getOrganisation();
		}

		@Override
		protected void setURI(URI uri) {
			state.setOrganisation(uri);
		}

		@Override
		protected String getFileExtension() {
			return "opera"; //$NON-NLS-1$
		}
	}

	private class SelectOntologyAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.ontologyFigure;
		}

		@Override
		protected URI getURI() {
			return state.getOntology();
		}

		@Override
		protected void setURI(URI uri) {
			state.setOntology(uri);
		}

		@Override
		protected String getFileExtension() {
			return "owl"; //$NON-NLS-1$
		}
	}

	private class SelectTaskAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.taskFigure;
		}

		@Override
		protected URI getURI() {
			return state.getTask();
		}

		@Override
		protected void setURI(URI uri) {
			state.setTask(uri);
		}

		@Override
		protected String getFileExtension() {
			return "tasks"; //$NON-NLS-1$
		}
	}

	private class SelectActionAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.actionFigure;
		}

		@Override
		protected URI getURI() {
			return state.getAction();
		}

		@Override
		protected void setURI(URI uri) {
			state.setAction(uri);
		}

		@Override
		protected String getFileExtension() {
			return "actions"; //$NON-NLS-1$
		}
	}
	
	private class SelectMASAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.masFigure;
		}

		@Override
		protected URI getURI() {
			return state.getMAS();
		}

		@Override
		protected void setURI(URI uri) {
			state.setMAS(uri);
		}

		@Override
		protected String getFileExtension() {
			return "mas"; //$NON-NLS-1$
		}
	}

	private class SelectPlanAction extends SelectFileDashboardAction<AliveDashboardState> {

		@Override
		protected ModelFigure getFigure() {
			return AliveDashboardMediator.this.view.planFigure;
		}

		@Override
		protected URI getURI() {
			return state.getPlan();
		}

		@Override
		protected void setURI(URI uri) {
			state.setPlan(uri);
		}

		@Override
		protected String getFileExtension() {
			return "plans"; //$NON-NLS-1$
		}
	}
}
