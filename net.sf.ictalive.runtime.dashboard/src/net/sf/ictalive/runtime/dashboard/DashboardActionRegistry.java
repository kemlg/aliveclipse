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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


import net.sf.ictalive.dashboard.DashboardFacade;
import net.sf.ictalive.dashboard.InternalDashboardAction;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.dynamichelpers.ExtensionTracker;
import org.eclipse.core.runtime.dynamichelpers.IExtensionChangeHandler;
import org.eclipse.core.runtime.dynamichelpers.IExtensionTracker;
import org.eclipse.ui.PlatformUI;

/**
 * @author dstadnik
 */
public class DashboardActionRegistry implements IExtensionChangeHandler {

	private static String EXTENSIONPOINT_UNIQUE_ID = "net.sf.ictalive.aliveclipse.dashboard.actions"; //$NON-NLS-1$
    // This is not where ALIVE dashboard actions are handled, this is done in DashboardMediator.
	
	
	private Set<RuntimeDashboardMediator> mediators;

	private Set<DashboardActionDescriptor> descriptors;

	public DashboardActionRegistry() {
		mediators = new HashSet<RuntimeDashboardMediator>();
		descriptors = new HashSet<DashboardActionDescriptor>();
		PlatformUI.getWorkbench().getExtensionTracker().registerHandler(this, ExtensionTracker.createExtensionPointFilter(getExtensionPointFilter()));
		IExtensionPoint point = Platform.getExtensionRegistry().getExtensionPoint(EXTENSIONPOINT_UNIQUE_ID);
		if (point != null) {
			IExtension[] extensions = point.getExtensions();
			extensions = orderExtensions(extensions);
			for (IExtension extension : extensions) {
				addDescriptors(extension);
			}
		}
	}

	public void dispose() {
		PlatformUI.getWorkbench().getExtensionTracker().unregisterHandler(this);
	}

	private IExtensionPoint getExtensionPointFilter() {
		return Platform.getExtensionRegistry().getExtensionPoint(EXTENSIONPOINT_UNIQUE_ID);
	}

	void registerMediator(RuntimeDashboardMediator mediator) {
		mediators.add(mediator);
	}

	void unregisterMediator(RuntimeDashboardMediator mediator) {
		mediators.remove(mediator);
	}

	public void addExtension(IExtensionTracker tracker, IExtension addedExtension) {
		addDescriptors(addedExtension);
	}

	public void removeExtension(IExtension extension, Object[] objects) {
		for (Object object : objects) {
			if (object instanceof DashboardActionDescriptor) {
				DashboardActionDescriptor descriptor = (DashboardActionDescriptor) object;
				descriptors.remove(descriptor);
				for (RuntimeDashboardMediator mediator : mediators) {
					mediator.removeDashboardAction(descriptor);
				}
			}
		}
	}

	public void addDescriptors(IExtension extension) {
		for (IConfigurationElement element : extension.getConfigurationElements()) {
			if (element.getName().equals("action")) { //$NON-NLS-1$
				DashboardActionDescriptor desc = new DashboardActionDescriptor(element);
				descriptors.add(desc);
				PlatformUI.getWorkbench().getExtensionTracker().registerObject(element.getDeclaringExtension(), desc, IExtensionTracker.REF_STRONG);
				for (RuntimeDashboardMediator mediator : mediators) {
					mediator.addDashboardAction(desc);
				}
			}
		}
	}

	public static IExtension[] orderExtensions(IExtension[] extensions) {
		// By default, the order is based on plugin id sorted
		// in ascending order. The order for a plugin providing
		// more than one extension for an extension point is
		// dependent in the order listed in the XML file.
		IExtension[] sortedExtension = new IExtension[extensions.length];
		System.arraycopy(extensions, 0, sortedExtension, 0, extensions.length);
		Comparator<IExtension> comparer = new Comparator<IExtension>() {

			public int compare(IExtension arg0, IExtension arg1) {
				String s1 = arg0.getNamespaceIdentifier();
				String s2 = arg1.getNamespaceIdentifier();
				return s1.compareToIgnoreCase(s2);
			}
		};
		Collections.sort(Arrays.asList(sortedExtension), comparer);
		return sortedExtension;
	}

	public DashboardActionDescriptor[] getDescriptors() {
		return descriptors.toArray(new DashboardActionDescriptor[descriptors.size()]);
	}

	public static class DashboardActionDescriptor {

		private final IConfigurationElement element;

		private final String label;

		private final String location;

		private final boolean standard;

		public DashboardActionDescriptor(IConfigurationElement element) {
			this.element = element;
			label = element.getAttribute("label"); //$NON-NLS-1$
			location = element.getAttribute("location"); //$NON-NLS-1$
			standard = Boolean.valueOf(element.getAttribute("standard")).booleanValue(); //$NON-NLS-1$
		}

		public IConfigurationElement getElement() {
			return element;
		}

		public String getLabel() {
			return label;
		}

		public InternalDashboardAction<RuntimeDashboardState> createDashboardAction() {
			return new Proxy();
		}

		public InternalDashboardAction<RuntimeDashboardState> createContributedDashboardAction() {
			try {
				return (InternalDashboardAction<RuntimeDashboardState>) element.createExecutableExtension("class"); //$NON-NLS-1$
			} catch (Exception e) {
				Plugin.getDefault().getLog().log(Plugin.createError("Unable to create ALIVE Dashboard action", e)); //$NON-NLS-1$
			}
			return null;
		}

		public String getLocation() {
			return location;
		}

		public boolean isStandard() {
			return standard;
		}

		private class Proxy extends InternalDashboardAction<RuntimeDashboardState> {

			private DashboardFacade<RuntimeDashboardState> context;

			private boolean inited;

			private InternalDashboardAction<RuntimeDashboardState> delegate;

			private boolean notAvailable;

			public void init(DashboardFacade<RuntimeDashboardState> context) {
				this.context = context;
				inited = true;
			}

			public String getProblems() {
				if (delegate != null) {
					return delegate.getProblems();
				}
				if (notAvailable) {
					return "Plugin not available.";
				}
				return null;
			}

			public void unguardedRun() {
				if (notAvailable) {
					return;
				}
				if (delegate == null) {
					delegate = createContributedDashboardAction();
					if (delegate == null) {
						notAvailable = true;
						return;
					}
					if (inited) {
						delegate.init(context);
					}
				}
				if (delegate.getProblems()==null) {
					delegate.run();
				}
			}
		}
	}
}
