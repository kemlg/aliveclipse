package net.sf.ictalive.service.template.ui.tests;

import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.antlr.tool.BuildDependencyGenerator;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.process.Process;
import org.mindswap.utils.URIUtils;

import agents.QualityOfServicePreferences;
import agents.ServicePrefs;

import edu.bath.alivetemplates.TemplateHelper;
import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.Preferences;

import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.RepositoryFactory;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateInfo;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateSlotHolder;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateSlotInstance;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.svcrepo.RemoteWebserviceRepository;

public class TestBuildingMatchMakerSlotStructure {

	WebServiceClientFactory fact = new WebServiceClientFactory();

	public static final String WSDL_LOCATION = "http://k2m118.lsi.upc.edu:8080/repo/ws/ObjectRepo?wsdl";
	RemoteWebserviceRepository wsr;
	BuildTemplateSlotMatcherAction buildSlotAction;

	@Before
	public void setup() throws Exception {
		fact = new WebServiceClientFactory();

		fact.setWsdlLocation(new URL(WSDL_LOCATION));
		Properties p = new Properties();
		p.load(getClass().getClassLoader().getResourceAsStream(
				"log4j.properties"));

		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook.addWebServiceRepositoryEntry(WSDL_LOCATION);

		PropertyConfigurator.configure(p);
		wsr = new RemoteWebserviceRepository(fact.createRepository(),
				OWLFactory.createKB());
		buildSlotAction = null;
	}

	String TEST_SERCIVE_URI = "urn:test-composite-ont#MasterService";

	@Test
	public void testBuildingSlot() {
		Service svc = wsr.getServiceFromURI(URI.create(TEST_SERCIVE_URI));
		Assert.assertNotNull(svc);
		buildSlotAction = new BuildTemplateSlotMatcherAction(new MatchMaker(
				new Preferences.ParamExactnessDecorator(),
				new Preferences.DescriptionSimilarityDecorator(),
				new Preferences.PostconditionSimilarityDecorator(),
				new Preferences.PreconditionSimilarityDecorator()), fact);
		Process slot1 = TemplateHelper.findTemplateSlots(
				svc.getProcess().castTo(CompositeProcess.class)).get(0);
		Assert.assertNotNull(slot1);

		BuildTemplateSlotMatcherAction.TemplateSlotHolder sh = buildSlotAction
				.buildSlotHolder(new TemplateInfo(svc, TemplateHelper
						.findTemplateSlots(svc.getProcess().castTo(
								CompositeProcess.class))), slot1);
		Assert.assertNotNull(sh);
		sh.fakeService.getOntology().write(System.err,
				sh.fakeService.getOntology().getURI());
	}

	@Test
	public void testBuildTemplateSlotInstance() throws Exception {
		buildSlotAction = new BuildTemplateSlotMatcherAction(new MatchMaker(
				new Preferences.ParamExactnessDecorator(),
				new Preferences.DescriptionSimilarityDecorator(),
				new Preferences.PostconditionSimilarityDecorator(),
				new Preferences.PreconditionSimilarityDecorator()), fact);

		buildSlotAction.run(new LoggingProgressMonitor());
		TemplateSlotInstance tsi = buildSlotAction.getInstance();
		Assert.assertNotNull(tsi);
		Assert.assertNotNull(tsi.mm);
		Assert.assertNotNull(tsi.serviceSlotMap);
		Assert.assertTrue(tsi.mm.getServices().size() > 0);
		Assert.assertTrue(tsi.serviceSlotMap.size() > 0);
	}

	@Test
	public void testSlotMatchmakingSingle() throws Exception {
		buildSlotAction = new BuildTemplateSlotMatcherAction(new MatchMaker(
				new Preferences.ParamExactnessDecorator(),
				new Preferences.DescriptionSimilarityDecorator(),
				new Preferences.PostconditionSimilarityDecorator(),
				new Preferences.PreconditionSimilarityDecorator()), fact,
				DiscoverySearch.search()
						.fieldMatches("uri", "urn:test-", false));

		buildSlotAction.run(new LoggingProgressMonitor());
		TemplateSlotInstance instance = buildSlotAction.getInstance();
		Assert.assertEquals(2, instance.serviceSlotMap.size());

		Service s = wsr
				.getServiceFromURI(URI
						.create("http://alivetemplates.bath.edu/MultiplyServiceSimple#MulService"));
		Assert.assertNotNull(s);

		Collection<Match> matches = instance.mm.match(s.getOntology(),
				InputMatcher.SUPERCLASSES, OutputMatcher.SUBCLASSES);

		Assert.assertEquals(2, matches.size());

		List<Match> smatches = ServicePrefs.BEST_INPUTS_AND_OUTPUTS
				.getPreference().sortedCopy(matches);

		Assert.assertEquals(2, smatches.size());
		for (Match m : smatches) {
			TemplateSlotHolder th = instance.serviceSlotMap.get(m.getService()
					.getURI());
			Assert.assertNotNull(th);
			Assert.assertNotNull(th.slot);
			Assert.assertNotNull(th.template);
		}
		System.err.println(matches);

	}

	@Test
	public void testPartialTemplateInstantiation() throws Exception {

	}
}
