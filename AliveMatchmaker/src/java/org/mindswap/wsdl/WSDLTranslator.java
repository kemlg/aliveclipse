//The MIT License
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

package org.mindswap.wsdl;

import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLType;
import org.mindswap.owls.grounding.Grounding;
import org.mindswap.owls.grounding.WSDLAtomicGrounding;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;

/**
 *
 * @author unascribed
 * @version $Rev: 2236 $; $Author: thorsten $; $Date: 2009-06-25 16:39:23 +0200 (Do, 25 Jun 2009) $
 */
public class WSDLTranslator {
	private final Service service;
	private final Profile profile;
	private final AtomicProcess process;
	private final WSDLAtomicGrounding wsdlAtomicGrounding;
	private final OWLOntology ont;
	private final URI baseURI;


	public WSDLTranslator(OWLOntology ont, final WSDLOperation op, final String serviceURI, final String prefix) {
        this.ont = ont;

		baseURI = URIUtils.createURI(serviceURI);
		service = ont.createService(URIUtils.createURI(baseURI, prefix + "Service"));
		profile = ont.createProfile(URIUtils.createURI(baseURI, prefix + "Profile"));
		process = ont.createAtomicProcess(URIUtils.createURI(baseURI, prefix + "Process"));
		final Grounding grounding = ont.createGrounding(URIUtils.createURI(baseURI, prefix + "Grounding"));
		wsdlAtomicGrounding = ont.createWSDLAtomicGrounding(URIUtils.createURI(baseURI, prefix + "AtomicProcessGrounding"));

		process.setLabel(process.getURI().getFragment());

		// set the links between structures
		service.setProfile(profile);
		service.setProcess(process);
		service.setGrounding(grounding);

		// add the WSDL details to the atomic grounding
		wsdlAtomicGrounding.setProcess(process);
		wsdlAtomicGrounding.setOperation(URI.create(op.getOperationName()));
		wsdlAtomicGrounding.setWSDL(op.getService().getFileURI());
		wsdlAtomicGrounding.setPortType(URI.create(op.getPortName()));
		wsdlAtomicGrounding.setInputMessage(URI.create(op.getInputMessageName()));
		wsdlAtomicGrounding.setOutputMessage(URI.create(op.getOutputMessageName()));

		// add the atomic process grounding to service grounding
		grounding.addGrounding(wsdlAtomicGrounding);
	}

	public void setServiceName(final String serviceName) {
		profile.setServiceName(serviceName);
	}

	public void setTextDescription(final String textDescription) {
		profile.setTextDescription(textDescription);
	}

	public void addInput(final WSDLParameter param, final String paramName, final URI paramType, final String xsltTransformation) {

		// create process param
		final Input input = ont.createInput(URIUtils.createURI(baseURI, paramName));
		input.setLabel(paramName);

		final OWLType type = ont.getType(paramType);
		input.setParamType(type == null ? ont.createClass(paramType) : type);

		// add the param to process and profile
		process.addInput(input);
		profile.addInput(input);

		// create grounding message map
		wsdlAtomicGrounding.addMessageMap(input, param.getName(), xsltTransformation);
	}

	public void addOutput(final WSDLParameter param, final String paramName, final URI paramType, final String xsltTransformation) {

		// create process param
		final Output output = ont.createOutput(URIUtils.createURI(baseURI, paramName));
		output.setLabel(paramName);

		final OWLType type = ont.getType(paramType);
		output.setParamType(type == null ? ont.createClass(paramType) : type);

		// add the param to process and profile
		process.addOutput(output);
		profile.addOutput(output);

		// create grounding message map
		wsdlAtomicGrounding.addMessageMap(output, param.getName(), xsltTransformation);
	}

	public void writeOWLS(final Writer out) {
		ont.write(out, baseURI);
	}

	public void writeOWLS(final OutputStream out) {
		ont.write(out, baseURI);
	}

	public Service getService() {
		return service;
	}
}
