/**
 * 
 */
package net.sf.ictalive.coordination.wfannotation.mapping.diagram.custom;

import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;

/**
 * @author David Corsar
 *
 */
public class CommandMappingContainerFinder {

	
	/**
	 * Attempts to find the {@link MappingContainer} associated with an {@link EditElementCommand},
	 * based on generated EMF code.
	 * 
	 * @param source
	 * @param target
	 * @param obj 
	 */
	public static MappingContainer deduceContainer(EObject source,
			EObject target, EditElementCommand obj) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				return (MappingContainer) element;
			}
		}
		

		EObject o = obj.getEditingDomain().getResourceSet().getResources().get(1).getContents().get(0);
		if (o instanceof MappingContainer){
			return (MappingContainer) o;
		}

		return null;
	}
}
