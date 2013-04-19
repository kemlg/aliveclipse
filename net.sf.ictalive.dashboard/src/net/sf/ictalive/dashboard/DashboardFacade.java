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
package net.sf.ictalive.dashboard;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public interface DashboardFacade<S> {

	public S getState();

	public IProject getProject();
	
	public void updateStatus();

	public Map<String, PluggedInDashboardAction<S>> getPluggedInDashboardActions();
	
	public boolean isStrict();

	public Shell getShell();
}
