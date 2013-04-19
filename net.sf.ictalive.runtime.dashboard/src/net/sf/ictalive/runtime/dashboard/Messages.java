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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "net.sf.ictalive.runtime.dashboard.messages"; //$NON-NLS-1$

	public static String DashboardMediator_Project;

	public static String DashboardMediator_SelectProject;

	public static String DashboardPart_Synchronize;

	public static String DashboardPart_SynchronizeSelection;

	public static String ModelFigure_NoName;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
