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
 * Created on Jan 12, 2004
 */
package org.mindswap.owls.profile;

import org.mindswap.owl.OWLIndividual;

/**
 * Represents OWL-S service parameters.
 * <p>
 * Corresponding OWL-S concept: {@link org.mindswap.owls.vocabulary.OWLS.ServiceParameter#ServiceParameter}.
 *
 * @author unascribed
 * @version $Rev: 2269 $; $Author: thorsten $; $Date: 2009-08-19 17:21:09 +0200 (Mi, 19 Aug 2009) $
 */
public interface ServiceParameter extends OWLIndividual
{
	public String getName();
	public void setName(String name);

	public OWLIndividual getParameter();
	public void setParameter(OWLIndividual value);
}
