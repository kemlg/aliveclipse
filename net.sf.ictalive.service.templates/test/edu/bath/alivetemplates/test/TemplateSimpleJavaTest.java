package edu.bath.alivetemplates.test;

import jaspwrapper.exec.Program;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.DefaultProcessMonitor;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;

import edu.bath.alivetemplates.TemplateAnswerSet;
import edu.bath.alivetemplates.TemplateConstructor;
import edu.bath.alivetemplates.TemplateConstructorImpl;
import edu.bath.alivetemplates.TemplateHelper;
import edu.bath.alivetemplates.valuehandlers.IntegerValueHandler;
import edu.bath.alivetemplates.valuehandlers.NumberOrderValueHandler;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.owlsbuilder.owlbinding.OWLAnnotationBindingContext;
import edu.bath.owlsbuilder.owlbinding.OWLAnnotationBindingContextFactory;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;

/**
 * Example of using templates API to ground a template, and invoke it once
 * grounded.
 * 
 * @author adan
 * 
 */
public class TemplateSimpleJavaTest {
	public static void main(String[] args) throws Exception {
		TemplateSimpleJavaTest testObject = new TemplateSimpleJavaTest();
		testObject.MultiplyTest();
		testObject.ValueHandlerTest();
	}

	public MatchMaker commonSetup() throws Exception {
		// Tell the API where to find test ontologies
		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook
				.addLocatorCallback(new FileSystemRepositoryCallbackImpl(
						new File[] { new File("test/") }));

		// Register test services with matchmaker
		MatchMaker matchMaker = new MatchMaker();

		File service2 = new File("test/MultiplyServiceSimple.owl");
		File service3 = new File("test/SubtractServiceSimple.owl");

		matchMaker
				.registerService(OwlsUtils
						.parseStream(
								new ByteArrayInputStream(
										getFileAsBytes(service2)),
								URI
										.create("http://alivetemplates.bath.edu/MultiplyServiceSimple")));
		matchMaker
				.registerService(OwlsUtils
						.parseStream(
								new ByteArrayInputStream(
										getFileAsBytes(service3)),
								URI
										.create("http://alivetemplates.bath.edu/SubtractServiceSimple")));

		return matchMaker;
	}

	@Test
	public void MultiplyTest() throws Exception {
		MatchMaker matchMaker = commonSetup();

		// Load template
		TemplateConstructor builder = new TemplateConstructorImpl(new File(
				"test/TestTemplate1.owl").toURI(), URI
				.create("urn:test-composite-ont#MasterService"), matchMaker);

		// Run template
		List<Process> slotList = TemplateHelper.findTemplateSlots(builder
				.getTemplateProcess());
		Map<Process, Collection<Match>> candidateMap = builder
				.getCandidates(slotList);
		Program aspProg = builder.getGeneratedASP(candidateMap); // Use
		// aspProg.addFromFile("filename")
		// if you
		// want
		System.out.println(aspProg);
		List<TemplateAnswerSet> selectionMaps = builder.getAnswerSets(aspProg);
		OWLOntology ont = builder.performReplacement(selectionMaps.get(1)
				.getMapping(), // get(1)==mulsvc
				URI.create("urn:test-composite-ont#GroundedMasterService"));
		// Store result
		ont.write(new FileOutputStream(new File("groundedTemplate.owl")), URI
				.create("urn:alive-templates"));

		// ********* Invoke a the grounded template we have just created
		// ********* //
		invoker(ont,
				URI.create("urn:test-composite-ont#GroundedMasterService"), 56);
	}

	@Test
	public void ValueHandlerTest() throws Exception {
		MatchMaker matchMaker = commonSetup();

		// Load template
		TemplateConstructor builder = new TemplateConstructorImpl(new File(
				"test/TestTemplate2.owl").toURI(), URI
				.create("urn:test-template-floatconstraint#MasterService"),
				matchMaker);

		// Run template
		List<Process> slotList = TemplateHelper.findTemplateSlots(builder
				.getTemplateProcess());
		Map<Process, Collection<Match>> candidateMap = builder
				.getCandidates(slotList);
		builder.addValueHandler(new NumberOrderValueHandler());
		builder.addValueHandler(new IntegerValueHandler());
		Program aspProg = builder.getGeneratedASP(candidateMap); // Use
		// aspProg.addFromFile("filename")
		// if you
		// want
		System.out.println(aspProg);
		List<TemplateAnswerSet> selectionMaps = builder.getAnswerSets(aspProg);
		OWLOntology ont = builder
				.performReplacement(
						selectionMaps.get(0).getMapping(), // get(0)==subsvc
						URI
								.create("urn:test-template-floatconstraint#GroundedMasterService"));
		// Store result
		ont.write(new FileOutputStream(new File("groundedTemplate.owl")), URI
				.create("urn:alive-templates"));

		// ********* Invoke a the grounded template we have just created
		// ********* //
		invoker(
				ont,
				URI
						.create("urn:test-template-floatconstraint#GroundedMasterService"),
				-1);
	}

	public void invoker(OWLOntology ont, URI svcu, int val) throws Exception {
		// Test execute
		OWLKnowledgeBase kb = ont.getKB();
		Service svc = ont.getService(svcu);
		ProcessExecutionEngine exec = OWLSFactory.createExecutionEngine();
		exec.addMonitor(new DefaultProcessMonitor());
		ValueMap<Input, OWLValue> inputs = new ValueMap<Input, OWLValue>();

		// Create ANumber individuals and assign values to them as inputs
		OWLIndividual individual = kb.createInstance((OWLClass) svc
				.getProcess().getInput("MasterInputLH").getParamType(), URI
				.create("urn:ind1"));
		if (individual == null)
			System.out.println("Could not create individual!");
		OWLDataValue dv1 = kb.createDataValue(7, URI
				.create("http://www.w3.org/2001/XMLSchema#int"));
		individual.addProperty(kb.getDataProperty(URI
				.create("http://numbers.org/Numbers.owl#hasValue")), dv1);

		OWLIndividual individual2 = kb.createInstance((OWLClass) svc
				.getProcess().getInput("MasterInputRH").getParamType(), URI
				.create("urn:ind2"));
		if (individual2 == null)
			System.out.println("Could not create individual2!");
		OWLDataValue dv2 = kb.createDataValue(8, URI
				.create("http://www.w3.org/2001/XMLSchema#int"));
		individual2.addProperty(kb.getDataProperty(URI
				.create("http://numbers.org/Numbers.owl#hasValue")), dv2);

		// Associate individuals with inputs
		Input compInput1 = svc.getProcess().getInput("MasterInputLH");
		Input compInput2 = svc.getProcess().getInput("MasterInputRH");
		inputs.setValue(compInput1, (OWLValue) individual);
		inputs.setValue(compInput2, (OWLValue) individual2);

		// Set up OWLSBuilder binding context for Java grounded test service
		OWLAnnotationBindingContextFactory
				.setContext(OWLAnnotationBindingContext.createContext(
						ClassLoader.getSystemClassLoader(),
						"edu.bath.alivetemplates.test", kb));

		// Invoke service
		ValueMap<Output, OWLValue> outputs = exec.execute(svc.getProcess(),
				inputs, kb);
		// Display output in a human readable format
		String value = displayOutput(outputs);
		int intValue = Integer.parseInt(value);
		assertTrue(intValue == val);
	}

	/**
	 * Displays output in a human-readable way
	 * 
	 * @param outputs
	 */
	static private String displayOutput(ValueMap<Output, OWLValue> outputs) {
		String value = null;
		for (Output o : outputs.getVariables()) {
			OWLValue val = outputs.getValue(o);
			if (val.isDataValue())
				System.out.println("Output '" + o.getURI() + "' is: "
						+ val.castTo(OWLDataValue.class).getLexicalValue());
			else if (val.isIndividual()) {
				OWLIndividual ind = val.castTo(OWLIndividual.class);
				System.out.println("Output '" + o.getURI() + "': ");
				Map<OWLProperty, List<OWLValue>> propVals = ind.getProperties();
				for (OWLProperty property : propVals.keySet()) {
					System.out
							.println("  Property '" + property.getURI() + "'");
					for (OWLValue propertyValue : propVals.get(property)) {
						if (propertyValue.isDataValue()) {
							value = propertyValue.castTo(OWLDataValue.class)
									.getLexicalValue();
							System.out.println("    " + value);
						} else if (propertyValue.isIndividual())
							System.out.println("    "
									+ propertyValue.castTo(OWLIndividual.class)
											.getURI());
					}
				}
			} else
				System.out.println("Output '" + o.getURI()
						+ "' is of unknown type.");
		}
		return value;
	}

	/**
	 * Fetches the contents of a file, and returns it as a byte array.
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	static private final byte[] getFileAsBytes(final File file)
			throws IOException {
		final BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		final byte[] bytes = new byte[(int) file.length()];
		bis.read(bytes);
		bis.close();
		return bytes;
	}
}
