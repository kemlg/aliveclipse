// The MIT License
//
// Copyright (c) 2004 Evren Sirin
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/*
 * Created on Dec 28, 2003
 *
 */
package org.mindswap.owl.vocabulary;

import java.net.URI;

/**
 *
 * @author unascribed
 * @see <a href="http://www.w3.org/TR/rdf-schema/">RDF Schema</a>
 * @version $Rev: 2091 $; $Author: thorsten $; $Date: 2008-11-08 19:41:18 +0100 (Sa, 08 Nov 2008) $
 */
public class RDFS {
	public final static String ns = "http://www.w3.org/2000/01/rdf-schema#";

	public final static URI getURI() { return URI.create(ns); }

	public final static URI Class = URI.create(ns + "Class");
	public final static URI Datatype = URI.create(ns + "Datatype");
	public final static URI Literal = URI.create(ns + "Literal");

	public final static URI subClassOf = URI.create(ns + "subClassOf");
	public final static URI subPropertyOf = URI.create(ns + "subPropertyOf");
	public final static URI domain = URI.create(ns + "domain");
	public final static URI range = URI.create(ns + "range");

	public final static URI label       = URI.create(ns + "label");
	public final static URI comment     = URI.create(ns + "comment");
	public final static URI seeAlso     = URI.create(ns + "seeAlso");
	public final static URI isDefinedBy = URI.create(ns + "isDefinedBy");
	public final static URI versionInfo = URI.create(ns + "versionInfo");

}
