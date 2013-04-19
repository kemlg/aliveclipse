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
package net.sf.ictalive.dashboard;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public abstract class InternalDashboardAction<S> {

	DashboardFacade<S> context;

	public void init(DashboardFacade<S> context) {
		this.context = context;
	}

	public abstract String getProblems();

	public void run() {
		String problems = getProblems();
		if (problems!=null) {
			errorDialog(problems);
		}
		else
			unguardedRun();
	}
	
	// guarded run calls the subclass's run only if there are no problems.
	public abstract void unguardedRun();
	
	void errorDialog(String message) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		MessageDialog.openError(workbenchWindow.getShell(), "Error", message);
	}
}
