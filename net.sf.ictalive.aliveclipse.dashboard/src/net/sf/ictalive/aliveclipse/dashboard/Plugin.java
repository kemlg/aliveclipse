/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
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


import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author dstadnik
 */
public class Plugin extends AbstractUIPlugin {

	public static final String ALIVE_LOGO_IMAGE = "/icons/viewban/logo.png"; //$NON-NLS-1$
	
	public static final String SYNC_ICON = "/icons/cview16/synced.gif"; //$NON-NLS-1$

	public static final String DELETE_ICON = "/icons/cview16/Delete.png"; //$NON-NLS-1$

	public static final String PLAY_BUTTON_IMAGE = "/icons/viewban/PlayButton.png"; //$NON-NLS-1$
	
	public static final String VIEW_SELECTION_BUTTON_IMAGE = "/icons/viewban/ViewSelectionButton.png"; //$NON-NLS-1$

	// note: when adding images, remember to add them to initializeImageRegistry(..) as well.
	
	private static Plugin plugin;

	private DashboardActionRegistry daRegistry;

	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
	}

	public void stop(BundleContext context) throws Exception {
		if (daRegistry != null) {
			daRegistry.dispose();
			daRegistry = null;
		}
		super.stop(context);
		plugin = null;
	}

	public static Plugin getDefault() {
		return plugin;
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		loadImage(reg, ALIVE_LOGO_IMAGE);
		loadImage(reg, SYNC_ICON);
		loadImage(reg, PLAY_BUTTON_IMAGE);
		loadImage(reg, VIEW_SELECTION_BUTTON_IMAGE);
		loadImage(reg, SYNC_ICON);
		loadImage(reg, DELETE_ICON);
	}

	protected void loadImage(ImageRegistry registry, String id) {
		loadImage(registry, id, getBundle().getSymbolicName());
	}

	protected void loadImage(ImageRegistry registry, String id, String bundleId) {
		ImageDescriptor descriptor = imageDescriptorFromPlugin(bundleId, id);
		if (descriptor != null) {
			registry.put(id, descriptor);
		}
	}

	public static String getBundleString(String key) {
		return Platform.getResourceBundle(getDefault().getBundle()).getString(key);
	}

	public static String getBundleString(String key, Object[] args) {
		String val = getBundleString(key);
		if (val == null) {
			return key;
		}
		return MessageFormat.format(val, args);
	}

	public DashboardActionRegistry getDashboardActionRegistry() {
		if (daRegistry == null) {
			daRegistry = new DashboardActionRegistry();
		}
		return daRegistry;
	}

	public static IStatus createStatus(int statusCode, String message, Exception ex) {
		return new Status(statusCode, getPluginID(), 0, message, ex);
	}

	public static IStatus createError(String message, Exception ex) {
		return createStatus(IStatus.ERROR, message, ex);
	}

	public static IStatus createWarning(String message) {
		return createStatus(IStatus.WARNING, message, null);
	}

	public static IStatus createInfo(String message) {
		return createStatus(IStatus.INFO, message, null);
	}

	public static String getPluginID() {
		return getDefault().getBundle().getSymbolicName();
	}
}
