/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import net.sf.ictalive.coordination.actions.provider.CoordinationEditPlugin;

import net.sf.ictalive.operetta.OM.provider.OperAEditPlugin;

import net.sf.ictalive.owls.expr.provider.OwlsEditPlugin;

import net.sf.ictalive.rules.swrl.provider.RulesEditPlugin;

import net.sf.ictalive.runtime.NormInstances.provider.NormInstanceEditPlugin;

import net.sf.ictalive.runtime.action.provider.RuntimeEditPlugin;

import net.sf.ictalive.schema.provider.SchemaEditPlugin;

import net.sf.ictalive.service.provider.ServicesEditPlugin;

import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Wfvv editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WfvvEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WfvvEditorPlugin INSTANCE = new WfvvEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfvvEditorPlugin() {
		super
			(new ResourceLocator [] {
				CoordinationEditPlugin.INSTANCE,
				NormInstanceEditPlugin.INSTANCE,
				OperAEditPlugin.INSTANCE,
				OwlsEditPlugin.INSTANCE,
				RulesEditPlugin.INSTANCE,
				RuntimeEditPlugin.INSTANCE,
				SchemaEditPlugin.INSTANCE,
				ServicesEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}
	

}
