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

import java.util.Iterator;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

/**
 * @author dstadnik
 */
public class DashboardPart extends ViewPart {

	private static final String ACTIVE_PROJECT_KEY = "activeProject"; //$NON-NLS-1$

	private static final String SYNC_SELECTION_KEY = "syncSelection"; //$NON-NLS-1$

	private FigureCanvas canvas;

	private RuntimeDashboardMediator mediator;

	private ISelectionListener projectUpdater;

	/**
	 * Reflects current workbench selection even if synchronization is off.
	 */
	private IProject activeProject;

	private String dashboardInitialProjectName;

	private boolean syncSelection = true;

	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		if (memento != null) {
			dashboardInitialProjectName = memento.getString(ACTIVE_PROJECT_KEY);
			String syncSelectionValue = memento.getString(SYNC_SELECTION_KEY);
			if (syncSelectionValue != null) {
				syncSelection = Boolean.valueOf(syncSelectionValue).booleanValue();
			}
		}
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
		mediator = new RuntimeDashboardMediator(parent.getShell());
		RuntimeDashboardFigure contents = new RuntimeDashboardFigure();
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
	}

	public void saveState(IMemento memento) {
		super.saveState(memento);
		if (mediator != null && mediator.getProject() != null) {
			memento.putString(ACTIVE_PROJECT_KEY, mediator.getProject().getName());
			if (!syncSelection) {
				memento.putString(SYNC_SELECTION_KEY, String.valueOf(syncSelection));
			}
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
		mediator.setProjectAndState(project, new RuntimeDashboardState(project));
	}
}
