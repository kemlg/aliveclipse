/**
 * 
 */
package net.sf.ictalive.rules.swrl.provider.custom;

import net.sf.ictalive.operetta.OM.Concept;

/**
 * Utility class to provide details about {@link Concept}s.
 * 
 * @author David Corsar
 * 
 */
public class ConceptDetailsProvider {

	/**
	 * If c is not null, then either the URI or concept of c is returned;
	 * otherwise (or if c's URI and concept are both null) an empty string is
	 * returned.
	 * 
	 * @param c
	 * @return
	 */
	public static String getConceptDetails(Concept c) {
		String text = "";
		if (c != null) {
			if (c.getURI() != null) {
				text += " " + c.getURI();
			} else if (c.getConcept() != null) {
				text += " " + c.getConcept();
			}
		}
		return text;
	}

}
