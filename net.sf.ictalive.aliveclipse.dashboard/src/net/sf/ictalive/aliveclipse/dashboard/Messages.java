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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "net.sf.ictalive.aliveclipse.dashboard.messages"; //$NON-NLS-1$

	public static String DashboardFigure_Organisation;
	
	public static String DashboardFigure_Ontology;

	public static String DashboardFigure_Task;

	public static String DashboardFigure_Action;

	public static String DashboardFigure_MAS;

	public static String DashboardFigure_Agents;

	public static String DashboardFigure_Plan;

	public static String DashboardFigure_Service;

	public static String DashboardFigure_Descriptions;

	public static String DashboardFigure_Enactment;

	public static String DashboardFigure_OrganisationLayer;
	
	public static String DashboardFigure_CoordinationLayer;
	
	public static String DashboardFigure_ServiceLayer;

	public static String DashboardFigure_Create;

	public static String DashboardFigure_Derive;

	public static String DashboardFigure_Export;

	public static String DashboardFigure_Import;

	public static String DashboardFigure_Combine;

	public static String DashboardFigure_Adapt;

	public static String DashboardFigure_VerifyServiceAvailability;

	public static String DashboardFigure_Configure;

	public static String DashboardFigure_DefineTemplate;
	
	public static String DashboardFigure_ApplyTemplate;
	
	public static String DashboardFigure_DeriveTemplate;
	
	public static String DashboardFigure_RefineTemplate;
	
	public static String DashboardFigure_ImportService;
	
	public static String DashboardFigure_ImportServiceOntology;

	public static String DashboardMediator_Project;

	public static String DashboardMediator_Progress;

	public static String DashboardMediator_Select;

	public static String DashboardMediator_Edit;

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
