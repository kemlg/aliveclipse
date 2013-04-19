/**
 * 
 */
package net.sf.ictalive.rules.swrl.provider.custom;

import org.eclipse.emf.ecore.EObject;

/**
 * Gets the name of the property that a given EObject is contained or referenced by
 * 
 * @author David Corsar
 *
 */
public class ContainingPropertyProvider {

	public String getContainmentFeatureName(EObject obj){
		return obj.eContainmentFeature().getName();
	}
	
}
