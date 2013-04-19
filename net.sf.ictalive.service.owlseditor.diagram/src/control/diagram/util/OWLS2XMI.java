package control.diagram.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.service.tool.AliveOntRepoCallback;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.RemoteWebServiceRepositoryCallback;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Sequence;
import org.mindswap.owls.process.variable.Binding;
import org.mindswap.owls.process.variable.InputBinding;
import org.mindswap.owls.process.variable.OutputBinding;
import org.mindswap.owls.service.Service;

import control.CompositeProcess;
import control.ControlConstruct;
import control.ControlFactory;

public class OWLS2XMI {


	public OWLS2XMI() {

	}

	public control.OuterProcess convertFile(String _fileURIString) {

//		WebServiceClientFactory wscFactory = new WebServiceClientFactory();
//		try {
//			wscFactory.setWsdlLocation(new URL("http://147.83.200.118:8080/repo/ws/ObjectRepo?wsdl"));
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		RemoteWebServiceRepositoryCallback rwsrCB = new RemoteWebServiceRepositoryCallback(wscFactory);
//
//		AliveRepoManagerHook.setup(true);
//		AliveRepoManagerHook.addLocatorCallback(rwsrCB);
		
		

		OWLKnowledgeBase serviceKB = OWLFactory.createKB();
		OWLOntology serviceOnt = null;
		java.net.URI fileURI = java.net.URI.create(_fileURIString);
		org.mindswap.owls.process.CompositeProcess parentProcess = null;
		Service baseService ;
		java.net.URI fileBaseURI = null;
		try {
			fileBaseURI = java.net.URI.create(AliveRepoManagerHook.getBaseURIFromOntFile(fileURI.toURL().openStream()));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new RuntimeException(e1);
		}
		try {
			serviceOnt = serviceKB.read(fileURI.toURL().openStream(), fileBaseURI);
			List<Service> serviceList = serviceOnt.getServices(false);
			// find candidates to be outer composite process
			// i.e. services with a composite process (which isn't an empty dummy i.e. slot services)
			List<Service> candidateServices = new LinkedList<Service>();
			for(Service aService : serviceList) {
				OWLOntology o = aService.getOntology();
				System.out.println(o.getImports(false).toString());
				System.out.println("Service: " + aService.getURI());
				if(aService.getProcess()!=null && aService.getProcess().canCastTo(org.mindswap.owls.process.CompositeProcess.class)) {
					org.mindswap.owls.process.CompositeProcess testComposite = aService.getProcess().castTo(org.mindswap.owls.process.CompositeProcess.class);
					if(testComposite.getComposedOf()!=null) {
						candidateServices.add(aService);
					}

				}
			}
			for(Service candidateService : candidateServices) {
				System.out.println("Candidate service: " + candidateService.getURI());
			}

			 baseService= candidateServices.get(0);


			if(baseService.getProcess().getPerform() == null) {
				System.out.println("Parent process: " + baseService.getProcess().getURI().toString());
				if((baseService.getProcess()).canCastTo(org.mindswap.owls.process.CompositeProcess.class)) {
					System.out.println("Outer process is composite");
					parentProcess = baseService.getProcess().castTo(org.mindswap.owls.process.CompositeProcess.class);
				}
			} else {
				System.out.println("Service " + baseService.getURI().toString() + " within perform: " + baseService.getProcess().getPerform().getURI().toString());
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		if(parentProcess != null) {
			System.out.println("Outer process: " + parentProcess.getURI().toString());
		}
		
//		for(org.mindswap.owls.process.Process theProcess : serviceKB.getProcesses(org.mindswap.owls.process.Process.ANY, false)) {
	//		System.out.println("Process " + theProcess.getLocalName() + " has " + theProcess.getPerform().getAllBindings().size() + " bindings");
//			for(Binding<?> aBinding : theProcess.getPerform().getAllBindings()) {
//				System.out.println(aBinding.toString());
//				//InputBinding inBinding = aBinding.castTo(InputBinding.class);
//
//			}
//		}
		
		

		OWLSTreeWalker walker = new OWLSTreeWalker();
		// populate outer process of new XMI model - also adds ontology imports
		// by querying knowledge base of parentProcess
		walker.populateOuterProcess(baseService,parentProcess, serviceOnt);
		// start recursive walk of OWL-S control constructs
		walker.visitNode(parentProcess.getComposedOf());

		// now that we've built the whole tree, add bindings
		for(Binding aBinding : parentProcess.getAllBindings()) {
			System.out.println("Binding: " + aBinding.getProcessVar().toPrettyString());
			if(aBinding.canCastTo(InputBinding.class)) {
				walker.makeInputBinding(aBinding.castTo(InputBinding.class));
			}
			if(aBinding.canCastTo(OutputBinding.class)) {
				walker.makeOutputBinding(aBinding.castTo(OutputBinding.class));
			}
		}

		
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().
		getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());


		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		Resource resource = resourceSet.createResource(URI.createFileURI("test.xmi"));
		resource.getContents().add(walker.getOuterProcess());
		
		TreeIterator<EObject> modelTree = resource.getAllContents();
		while(modelTree.hasNext()) {
			System.out.println(modelTree.next().toString());
		}
		System.out.println("Test resource getContents: " + resource.getContents().get(0).toString());
		return walker.getOuterProcess();
	}
}
