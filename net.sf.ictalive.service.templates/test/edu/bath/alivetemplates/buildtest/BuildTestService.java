package edu.bath.alivetemplates.buildtest;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.Sequence;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.profile.Profile;

public class BuildTestService {
	public static final String svcURI = "urn:test-composite-ont";
	public static URI u(String fragment) {
		return URI.create(svcURI+"#"+fragment);
	}
	public static URI u() {
		return URI.create(svcURI);
	}
	
	public static void main(String[] args) throws Exception {
		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook.addLocatorCallback(new FileSystemRepositoryCallbackImpl(new File[]{new File("test/")}));
		
		OWLKnowledgeBase kb = OWLFactory.createKB();
		OWLOntology ont = kb.createOntology(u());
		ont.addImport(kb.read(URI.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl")));
		ont.addImport(kb.read(URI.create("http://numbers.org/Numbers.owl")));
		
		/* Create new composite service */
		Service masterService = ont.createService(u("MasterService"));
		CompositeProcess compositeProcess = ont.createCompositeProcess(u("MasterProcess"));
		masterService.setProcess(compositeProcess);
		compositeProcess.setService(masterService);
		masterService.addProperty(ont.getDataProperty(URI.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspBindings")), "<![CDATA['hasProfile': http://www.daml.org/services/owl-s/1.2/Service.owl#presents\n'svcName': http://www.daml.org/services/owl-s/1.2/Profile.owl#serviceName {subservicename: http://aliveservicewrapper.bath.edu/SubtractServiceSimple#SubServiceProfile}]]>");
		masterService.addProperty(ont.getDataProperty(URI.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspCode")), "<![CDATA[1{selection(Slot, Y): candidateProcess(Slot,Y)}1 :-  slot(Slot).]]>");
				
		/* Build slot process */
		CompositeProcess testSlot1 = ont.createCompositeProcess(u("TestSlot1")); //new AsProcessImpl(ont.createInstance(OWLS.Process.AsProcess, u("TestSlot1")));
		testSlot1.addProperty(ont.getDataProperty(URI.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#isSlot")), "slot1");
		
		Input slotInputLH = testSlot1.createInput(u("slotInputLH"), kb.getType(URI.create("http://numbers.org/Numbers.owl#LHOpInt")));
		Input slotInputRH = testSlot1.createInput(u("slotInputRH"), kb.getType(URI.create("http://numbers.org/Numbers.owl#RHOpInt")));
		Output slotOutput = testSlot1.createOutput(u("slotOutput"), kb.getType(URI.create("http://numbers.org/Numbers.owl#Integer")));
		Sequence slotSequence1 = ont.createSequence(u("slotSequence1"));
		testSlot1.setComposedOf(slotSequence1);
		
		/* Build master composite */
		Sequence seq = ont.createSequence(u("MasterSequence"));
		compositeProcess.setComposedOf(seq);
		Perform slotPerform1 = ont.createPerform(u("Slot1Perform"));
		seq.addComponent(slotPerform1);
		slotPerform1.setProcess(testSlot1);
		Input masterInputLH = compositeProcess.createInput(u("MasterInputLH"), kb.getType(URI.create("http://numbers.org/Numbers.owl#LHOpInt")));
		Input masterInputRH = compositeProcess.createInput(u("MasterInputRH"), kb.getType(URI.create("http://numbers.org/Numbers.owl#RHOpInt")));
		Output masterOutput = compositeProcess.createOutput(u("MasterOutput"), kb.getType(URI.create("http://numbers.org/Numbers.owl#Integer")));
		
		slotPerform1.addBinding(slotInputLH, OWLS.Process.ThisPerform, masterInputLH);
		slotPerform1.addBinding(slotInputRH, OWLS.Process.ThisPerform, masterInputRH);
		Result slotResult1 = compositeProcess.createResult(null);
		slotResult1.addBinding(masterOutput, slotPerform1, slotOutput);
		
		/* Build profile */
		Profile masterProfile = ont.createProfile(u("MasterProfile"));
		masterService.addProfile(masterProfile);
		masterProfile.setServiceName("Master Template Service");
		
		/* Write to file */
		ont.write(new FileOutputStream(new File("/home/adan/compositeout.owl")), u());
	}
}
