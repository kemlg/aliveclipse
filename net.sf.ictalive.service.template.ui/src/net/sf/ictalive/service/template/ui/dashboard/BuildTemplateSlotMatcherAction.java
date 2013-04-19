package net.sf.ictalive.service.template.ui.dashboard;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.sf.ictalive.service.discovery.client.RepositoryFactory;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.serviceui.MonitorableRepoLoadAction;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;

import edu.bath.alivetemplates.TemplateHelper;
import edu.bath.matchmaker.MatchMaker;

public class BuildTemplateSlotMatcherAction implements IRunnableWithProgress {
	RepositoryFactory repoFactory;
	DiscoverySearch search = DiscoverySearch.search().inSection("templates");
	Random r = new Random();
	MatchMaker matchMaker;
	TemplateSlotInstance instance;

	Logger log = LoggerFactory.getLogger(BuildTemplateSlotMatcherAction.class);

	public static class TemplateSlotInstance {
		public final MatchMaker mm;

		public TemplateSlotInstance(MatchMaker mm,
				Map<URI, TemplateSlotHolder> serviceSlotMap) {
			super();
			this.mm = mm;
			this.serviceSlotMap = serviceSlotMap;
		}

		public final Map<java.net.URI, BuildTemplateSlotMatcherAction.TemplateSlotHolder> serviceSlotMap;
	}

	public static class TemplateInfo {
		public final Service template;
		public final List<Process> slots;

		public TemplateInfo(Service template, List<Process> slots) {
			super();
			this.template = template;
			this.slots = slots;
		}

	}

	public static class TemplateSlotHolder {
		// The source template
		public final TemplateInfo template;
		// The source slot
		public final Process slot;
		// The generated service URI
		public final URI genServiceURI;

		// / The Fake Service
		public final Service fakeService;

		public TemplateSlotHolder(TemplateInfo template, Process slot,
				URI genURI, Service fakeService) {
			super();
			this.template = template;
			this.slot = slot;
			this.genServiceURI = genURI;
			this.fakeService = fakeService;
		}

	}

	public BuildTemplateSlotMatcherAction(MatchMaker mm,
			RepositoryFactory repoFactory) {

		Preconditions.checkNotNull(repoFactory);
		Preconditions.checkNotNull(mm);
		this.repoFactory = repoFactory;
		this.matchMaker = mm;

	}

	public BuildTemplateSlotMatcherAction(MatchMaker mm,
			RepositoryFactory repoFactory, DiscoverySearch search) {
		this(mm, repoFactory);

		if (search != null)
			this.search = search;
	}

	public TemplateSlotInstance getInstance() {
		return instance;
	}

	URI randomDocumentURI() {
		long rv = Math.abs(r.nextLong());
		return URI.create("urn:dummy_" + String.format("%d", rv));
	}

	/**
	 * Translates a given slot into a "Fake" service for the purposes of
	 * matchmaking with the same signature
	 * 
	 * @param template
	 * @param slot
	 * @return
	 */
	public BuildTemplateSlotMatcherAction.TemplateSlotHolder buildSlotHolder(
			TemplateInfo template, Process slot) {

		URI ontURI = randomDocumentURI();

		OWLKnowledgeBase owlKB = OWLFactory.createKB();
		OWLOntology owlo = owlKB.createOntology(ontURI);
		for (OWLOntology o : template.template.getOntology().getImports(false)) {
			owlo.addImport(o);
		}

		Service dummy_svc = owlo.createService(URIUtils.createURI(ontURI,
				"dummy_slot"));
		Process proc = owlo.createAtomicProcess(URIUtils.createURI(ontURI,
				"dummy_process"));
		Profile prof = owlo.createProfile(URIUtils.createURI(ontURI,
				"dummy_profile"));
		dummy_svc.setProcess(proc);
		dummy_svc.addProfile(prof);
		prof.setService(dummy_svc);
		proc.setService(dummy_svc);

		int incount = 0;
		for (Input in : slot.getInputs()) {
			Input newIn = owlo.createInput(URIUtils.createURI(ontURI,
					"dummy_in_" + incount++));

			newIn.setParamType(in.getParamType());
			proc.addInput(newIn);
			prof.addInput(newIn);
		}

		int outcount = 0;
		for (Output out : slot.getOutputs()) {
			Output newOut = owlo.createOutput(URIUtils.createURI(ontURI,
					"dummy_out_" + outcount++));

			newOut.setParamType(out.getParamType());
			proc.addOutput(newOut);
			prof.addOutput(newOut);
		}
		return new TemplateSlotHolder(template, slot, dummy_svc.getURI(),
				dummy_svc);
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		try {

			Preconditions.checkNotNull(search);
			Preconditions.checkNotNull(repoFactory);
			monitor.beginTask("Building template slot matchmaker",
					IProgressMonitor.UNKNOWN);

			monitor.subTask("Loading template services");
			// TODO: Explicit reference to repo section
			MonitorableRepoLoadAction mra = new MonitorableRepoLoadAction(
					repoFactory, search, false);
			try {
				mra.run(new SubProgressMonitor(monitor, 1000));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			List<Service> allTemplates = mra.getServices();
			monitor.subTask("Extracting template Services");

			TemplateSlotInstance instance = new TemplateSlotInstance(
					matchMaker,
					new HashMap<java.net.URI, BuildTemplateSlotMatcherAction.TemplateSlotHolder>());

			for (Service template : allTemplates) {

				TemplateInfo templateInfo = new TemplateInfo(template,
						TemplateHelper.findTemplateSlots(template.getProcess()
								.castTo(CompositeProcess.class)));
				monitor.subTask("Extracting slots from " + template.getURI());
				if (template.getProcess() == null
						|| !template.getProcess().canCastTo(
								CompositeProcess.class)) {
					log.debug("template " + template.getURI()
							+ " does not have a valid composite process body");
					continue;
				}
				CompositeProcess proc = template.getProcess().castTo(
						CompositeProcess.class);
				List<Process> allSlots = TemplateHelper.findTemplateSlots(proc);
				for (Process slot : allSlots) {
					String slotName = TemplateHelper.getSlotName(slot);
					monitor.subTask("Extracting slot " + slotName);
					BuildTemplateSlotMatcherAction.TemplateSlotHolder holder = buildSlotHolder(
							templateInfo, slot);
					instance.serviceSlotMap.put(holder.genServiceURI, holder);
					monitor.worked(100);
				}
			}

			monitor.subTask("Registering slots with matchmaker");
			for (TemplateSlotHolder slotHolder : instance.serviceSlotMap
					.values()) {
				monitor.subTask("registering " + slotHolder.genServiceURI);
				instance.mm.registerService(slotHolder.fakeService
						.getOntology());
				monitor.worked(100);
			}
			this.instance = instance;

		} finally {
			monitor.done();
		}

	}
}
