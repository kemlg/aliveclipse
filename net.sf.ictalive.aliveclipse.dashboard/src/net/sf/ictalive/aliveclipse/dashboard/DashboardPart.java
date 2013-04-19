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

import java.util.Iterator;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * @author dstadnik
 */
public class DashboardPart extends ViewPart {

	private static final String ACTIVE_PROJECT_KEY = "activeProject"; //$NON-NLS-1$

	private static final String SYNC_SELECTION_KEY = "syncSelection"; //$NON-NLS-1$

	private static final String DASHBOARD_VIEW_TYPE_KEY = "dashboardViewType"; //$NON-NLS-1$

	private FigureCanvas canvas;

	private AliveDashboardMediator mediator;

	private ISelectionListener projectUpdater;

	/**
	 * Reflects current workbench selection even if synchronization is off.
	 */
	private IProject activeProject;

	private String dashboardInitialProjectName;

	private boolean syncSelection = true;
	
	private int dashboardViewType = 0;

	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		if (memento != null) {
			dashboardInitialProjectName = memento.getString(ACTIVE_PROJECT_KEY);
			String syncSelectionValue = memento.getString(SYNC_SELECTION_KEY);
			if (syncSelectionValue != null) {
				syncSelection = Boolean.valueOf(syncSelectionValue).booleanValue();
			}
			String dashboardViewValue = memento.getString(DASHBOARD_VIEW_TYPE_KEY);
			if (dashboardViewValue != null) {
				dashboardViewType = Integer.valueOf(dashboardViewValue).intValue();
			}
		}
		
		// TODO: put clear in Box figure, and factorize clear in AliveModelFigure, and maybe add icon.
		IAction clearAction = new Action("Clear dashboard", IAction.AS_PUSH_BUTTON) {
			public void run() {
				if (MessageDialog.openQuestion(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Clear dashboard?", "Do you want to clear the dashboard?")) 
					mediator.clearModelURIs();
			}
		};
		clearAction.setToolTipText("Clear the current selection of model files");
		site.getActionBars().getToolBarManager().add(clearAction);
		
		IAction syncSelectionAction = new Action(Messages.DashboardPart_Synchronize, IAction.AS_CHECK_BOX) {
		};
		syncSelectionAction.setToolTipText(Messages.DashboardPart_SynchronizeSelection);
		ImageDescriptor synchImage = Plugin.getDefault().getImageRegistry().getDescriptor(Plugin.SYNC_ICON);
		if (synchImage != null) {
			syncSelectionAction.setImageDescriptor(synchImage);
		}
		syncSelectionAction.setChecked(syncSelection);
		syncSelectionAction.addPropertyChangeListener(new IPropertyChangeListener() {

			public void propertyChange(PropertyChangeEvent event) {
				if (IAction.CHECKED.equals(event.getProperty())) {
					syncSelection = ((Boolean) event.getNewValue()).booleanValue();
					if (syncSelection && mediator != null && activeProject != mediator.getProject()) {
						updateDashboardProject(activeProject);
					}
				}
			}
		});
		site.getActionBars().getToolBarManager().add(syncSelectionAction);
	}

	public void createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent);
		mediator = new AliveDashboardMediator(parent.getShell(), this);
		AliveDashboardFigure contents = new AliveDashboardFigure();
		mediator.setView(contents);
		canvas.setContents(contents);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(projectUpdater = new ISelectionListener() {

			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				updateActiveProject(selection);
			}
		});
		updateActiveProject(getSite().getWorkbenchWindow().getSelectionService().getSelection());
		if (mediator.getProject() == null && dashboardInitialProjectName != null) {
			IProject dashboardProject = ResourcesPlugin.getWorkspace().getRoot().getProject(dashboardInitialProjectName);
			if (dashboardProject.exists()) {
				updateDashboardProject(dashboardProject);
			}
		}
		Plugin.getDefault().getDashboardActionRegistry().registerMediator(mediator);

		mediator.setDashboardViewType(dashboardViewType);
		
		addViewSelectionActions();
	}

	public void addViewSelectionActions() {
		ChangeDashboardViewAction lCustomAction = new ChangeDashboardViewAction(ChangeDashboardViewAction.TOP_DOWN, mediator, this);  		    
		lCustomAction.setText("Top-down");
		if (dashboardViewType == ChangeDashboardViewAction.TOP_DOWN)
			lCustomAction.setChecked(true);
		getViewSite().getActionBars().getMenuManager().add(lCustomAction);  
//
//		ChangeDashboardViewAction lCustomAction2 = new ChangeDashboardViewAction(ChangeDashboardViewAction.MIDDLE_OUT, mediator, this);  		    
//		lCustomAction2.setText("Middle-out");  
//		if (dashboardViewType == ChangeDashboardViewAction.MIDDLE_OUT)
//			lCustomAction2.setChecked(true);
//		getViewSite().getActionBars().getMenuManager().add(lCustomAction2);  

		ChangeDashboardViewAction lCustomAction3 = new ChangeDashboardViewAction(ChangeDashboardViewAction.BOTTOM_UP, mediator, this);
		lCustomAction3.setText("Bottom-up");  
		if (dashboardViewType == ChangeDashboardViewAction.BOTTOM_UP)
			lCustomAction3.setChecked(true);
		getViewSite().getActionBars().getMenuManager().add(lCustomAction3);  	
	}
	
	// is used by ChangeDashboardViewAction
	public void setDashboardView(int dashboardViewType) {
		this.dashboardViewType = dashboardViewType;
		getViewSite().getActionBars().getMenuManager().removeAll(); // refresh doesn't set the checkmarks, so we remove all actions and add them again.
		addViewSelectionActions();
	}
	
	public void saveState(IMemento memento) {
		super.saveState(memento);
		if (mediator != null && mediator.getProject() != null) {
			memento.putString(ACTIVE_PROJECT_KEY, mediator.getProject().getName());
			if (!syncSelection) {
				memento.putString(SYNC_SELECTION_KEY, String.valueOf(syncSelection));
			}
			memento.putString(DASHBOARD_VIEW_TYPE_KEY, String.valueOf(dashboardViewType));
		}
	}

	public void dispose() {
		if (mediator != null) {
			Plugin.getDefault().getDashboardActionRegistry().unregisterMediator(mediator);
			mediator = null;
		}
		if (projectUpdater != null) {
			getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(projectUpdater);
			projectUpdater = null;
		}
		super.dispose();
	}

	public void setFocus() {
		if (canvas != null) {
			canvas.setFocus();
		}
	}

	protected void updateActiveProject(ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		IProject newActiveProject = null;
		for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
			Object element = it.next();
			IProject project = null;
			if (element instanceof IResource) {
				project = ((IResource) element).getProject();
			} else if (element instanceof IAdaptable) {
				IResource resource = (IResource) ((IAdaptable) element).getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
				}
			}
			if (project == null) {
				continue;
			}
			if (project.equals(activeProject)) {
				// if current active project is selected do not change it
				return;
			}
			if (newActiveProject == null) {
				// new active project is the first selected project
				newActiveProject = project;
			}
		}
		if (newActiveProject != null) {
			activeProject = newActiveProject;
			if (syncSelection && mediator != null) {
				updateDashboardProject(newActiveProject);
			}
		}
	}

	protected void updateDashboardProject(IProject project) {
		mediator.setProjectAndState(project, new AliveDashboardState(project));
	}
}
