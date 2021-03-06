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
 * Created on Aug 30, 2004
 */
package impl.owls.process.constructs;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.Iterate;
import org.mindswap.owls.process.Process;

/**
 *
 * @author unascribed
 * @version $Rev: 2319 $; $Author: thorsten $; $Date: 2009-09-23 17:30:19 +0200 (Mi, 23 Sep 2009) $
 */
public abstract class IterateImpl<C extends IterateImpl<C>> extends ControlConstructImpl<C> implements Iterate
{
	/**
	 * @see impl.owl.WrappedIndividual#WrappedIndividual(OWLIndividual)
	 */
	public IterateImpl(final OWLIndividual ind) {
		super(ind);
	}

	/* @see org.mindswap.owls.process.ControlConstruct#getConstructs() */
	public OWLIndividualList<ControlConstruct> getConstructs() {
		final OWLIndividualList<ControlConstruct> list = OWLFactory.createIndividualList(1);
		list.add(getComponent());
		return list;
	}

	/* @see org.mindswap.owls.process.ControlConstruct#getAllProcesses(boolean) */
	public OWLIndividualList<Process> getAllProcesses(final boolean recursive) {
		return getComponent().getAllProcesses(recursive);
	}

	/* @see impl.owls.process.constructs.ControlConstructImpl#removeConstruct(org.mindswap.owls.process.ControlConstruct) */
	@Override
	public boolean removeConstruct(final ControlConstruct CC) {
		if (getComponent().equals(CC)) setComponent(null);
		return true;
	}

	/* @see org.mindswap.owls.process.Iterate#deleteComponent() */
	public void deleteComponent() {
		final ControlConstruct cc = getComponent();
		removeComponent();
		cc.delete();
	}
}
