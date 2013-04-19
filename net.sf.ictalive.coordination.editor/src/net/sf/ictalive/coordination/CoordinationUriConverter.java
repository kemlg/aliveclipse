/**
 * 
 */
package net.sf.ictalive.coordination;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

/**
 * @author dcorsar
 *
 */
public class CoordinationUriConverter extends URIConverterImpl{
	@Override
	public URI normalize(URI uri) {
		//System.out.println("Normalising " + uri.toString() + " file is " + URI.createURI(uri.toFileString()));
		return super.normalize(uri);
	}

}
