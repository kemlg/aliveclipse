package net.sf.ictalive.service.template.ui.dashboard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Callable;

import javax.management.RuntimeErrorException;

import net.sf.ictalive.service.matchmakertab.dashboard.SelectMatchedServicePage;
import net.sf.ictalive.service.matchmakertab.dashboard.SelectMatchedServicePage.ServiceHandler;
import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.service.serviceui.ControlCreationWizardFirstPage;
import net.sf.ictalive.service.serviceui.SelectServicePage;
import net.sf.ictalive.service.serviceui.ServiceDecorationHelper;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateInfo;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateSlotHolder;
import net.sf.ictalive.service.template.ui.dashboard.BuildTemplateSlotMatcherAction.TemplateSlotInstance;
import net.sf.ictalive.service.template.ui.dashboard.ShowTemplateMatchesPage.SlotMatchFilter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agents.ReloadableMatchMaker;
import agents.ServicePrefs;

import com.google.common.base.Preconditions;

import edu.bath.alivetemplates.TemplateAnswerSet;
import edu.bath.alivetemplates.TemplateConstructorImpl;
import edu.bath.alivetemplates.TemplateHelper;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.Preferences;

/**
 * Performs a "bottom-up" adaptation of service to a new service using templates
 */
public class RefineServiceWithTemplateWizard extends Wizard implements
		IWorkbenchWizard {
	private IStructuredSelection selection;
	private URI actionURI;

	SelectServicePage selectServicePage;
	SelectMatchedServicePage selectTemplatePage;
	ShowTemplateMatchesPage showTemplateMatchesPage;
	ControlCreationWizardFirstPage servicePropertiesPage;
	WizardNewFileCreationPage selectFilePage;

	TemplateSlotInstance slotMatcherInstance;

	Logger log = LoggerFactory.getLogger(RefineServiceWithTemplateWizard.class);

	public ShowTemplateMatchesPage getShowTemplateMatchesPage() {
		return showTemplateMatchesPage;
	}

	/**
	 * Constructor for PlanSynthesisComponentNewWizard.
	 */
	public RefineServiceWithTemplateWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void buildTempalateMatchMakerWithProgress(Service inputService,
			IProgressMonitor monitor) {
		BuildTemplateSlotMatcherAction build_template_action = new BuildTemplateSlotMatcherAction(
				net.sf.ictalive.service.matchmakertab.Activator.getDefault()
						.createEmptyMatchmaker(), Activator.getDefault()
						.getRepositoryFactory());
		try {
			build_template_action.run(monitor);
			this.slotMatcherInstance = build_template_action.getInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	Callable<Service> serviceSource = new Callable<Service>() {
		@Override
		public Service call() throws Exception {
			Preconditions.checkNotNull(selectServicePage.getSelectedServices()
					.size() > 0);
			Service s = selectServicePage.getSelectedServices().get(0);
			OWLOntology owlo = s.getKB().createOntology(
					java.net.URI.create("urn:template-ont-internal"));

			Service news = owlo.createService(s.getURI());
			
			news.setProcess(s.getProcess());
			if (s.getProfile() != null) {
				news.addProfile(s.getProfile());
			}
			return news;
		}
	};

	Callable<ReloadableMatchMaker> mmSource = new Callable<ReloadableMatchMaker>() {
		@Override
		public ReloadableMatchMaker call() throws Exception {
			return new ReloadableMatchMaker() {

				@Override
				public void reload() {
					slotMatcherInstance = null;

				}

				@Override
				public MatchMaker getMatchMaker() {
					TemplateSlotInstance instance = slotMatcherInstance;
					if (instance == null) {
						try {
							getContainer().run(false, false,
									new IRunnableWithProgress() {

										@Override
										public void run(IProgressMonitor monitor)
												throws InvocationTargetException,
												InterruptedException {
											try {
												buildTempalateMatchMakerWithProgress(
														serviceSource.call(),
														monitor);
											} catch (Exception e) {
												throw new RuntimeException(e);
											}
										}
									});

							Preconditions.checkNotNull(slotMatcherInstance);
							return slotMatcherInstance.mm;
						} catch (Exception e) {
							throw new RuntimeException(e);
						}
					} else {
						return instance.mm;
					}
				}
			};

		}
	};

	/**
	 * Local handler which delegates resolving fake services back to their
	 * templates for {@link SelectMatchedServicePage}.
	 * 
	 * @author occ
	 * 
	 */
	class LocalTempalateServiceHandler implements ServiceHandler {

		@Override
		public Service getServiceInfo(Match match) {
			Preconditions.checkNotNull(slotMatcherInstance);
			java.net.URI serviceURI = match.getService().getURI();
			TemplateSlotHolder slotHolder = slotMatcherInstance.serviceSlotMap
					.get(serviceURI);
			return slotHolder.template.template;

		}

		@Override
		public boolean gotMatch(Match m, IProgressMonitor monitor) {
			monitor.beginTask("", 1);
			monitor.done();
			return true;
		}

		@Override
		public String nameMatchInList(Match match) {
			Preconditions.checkNotNull(slotMatcherInstance);

			java.net.URI serviceURI = match.getService().getURI();
			TemplateSlotHolder slotHolder = slotMatcherInstance.serviceSlotMap
					.get(serviceURI);
			TemplateInfo ti = slotHolder.template;

			Service template = slotHolder.template.template;
			org.mindswap.owls.process.Process slot = slotHolder.slot;

			String name = "Template "
					+ ServiceDecorationHelper.serviceToShortString(template)
					+ " Slot "
					+ ServiceDecorationHelper.processsToShortString(slot)
					+ "(1/" + ti.slots.size() + ")";
			return name;
		}

		@Override
		public void reset() {

		}

	}

	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {
		addPage(selectServicePage = new SelectServicePage(
				"Select a service to refine",
				net.sf.ictalive.service.serviceui.Activator.getDefault()
						.getRepositoryFactory()));
		selectServicePage
				.setTitle("Select a service to refine using a template");

		selectServicePage.setAllowMultiple(false);

		addPage(selectTemplatePage = new SelectMatchedServicePage(
				"Select matching template", false, serviceSource, mmSource));

		selectTemplatePage.setTitle("Select a matching template to apply");
		selectTemplatePage
				.setSortPreference(ServicePrefs.BEST_INPUTS_AND_OUTPUTS
						.getPreference());
		selectTemplatePage
				.setServiceHandler(new LocalTempalateServiceHandler());
		addPage(showTemplateMatchesPage = new ShowTemplateMatchesPage(
				"Template Matches", new Callable<Service>() {
					@Override
					public Service call() throws Exception {
						List<Service> services = selectTemplatePage
								.getSelectedServices();
						if (0 == services.size())
							return null;
						return services.get(0);
					}
				}, new Callable<ReloadableMatchMaker>() {
					@Override
					public ReloadableMatchMaker call() throws Exception {
						ReloadableMatchMaker mm = new ReloadableMatchMaker() {

							@Override
							public void reload() {
								net.sf.ictalive.service.matchmakertab.Activator
										.getDefault()
										.refreshLocalMatchmakerWithProgressDialog();

							}

							@Override
							public MatchMaker getMatchMaker() {
								MatchMaker mm = net.sf.ictalive.service.matchmakertab.Activator
										.getDefault()
										.getLocalMatchmakerInstance();
								Preconditions.checkNotNull(mm);
								return mm;
							}
						};
						return mm;
					}
				}));

		// / Sets a filter on the template matcher which only considers matches
		// where the picked service is the only choice for the given slot
		showTemplateMatchesPage.setSlotMatchFilter(new SlotMatchFilter() {

			@Override
			public boolean includeMatch(Process slot, Match m) {
				// this is the selected match which corresponds to the fake
				// template slot
				Match matchedSlot = selectTemplatePage.getSelectedMatches()
						.get(0);

				// get the solt holder for that slot
				TemplateSlotHolder tsh = slotMatcherInstance.serviceSlotMap
						.get(matchedSlot.getService().getURI());
				Service pickedService = selectServicePage.getSelectedServices()
						.get(0);

				log.debug("comparing {} with {} for slot {} ", new Object[] {
						m.getService().getURI(), pickedService.getURI(),
						TemplateHelper.getSlotName(slot) });
				// is the test slot the same as the other slot
				if (slot.equals(tsh.slot)
						&& !m.getService().getURI().equals(
								pickedService.getURI())) {
					log.debug("rejected {} for slot {} ", m.getService()
							.getURI(), TemplateHelper.getSlotName(slot));
					return false;
				} else
					return true;

			}
		});

		addPage(servicePropertiesPage = new ControlCreationWizardFirstPage(
				"Set new service properties"));

		addPage(selectFilePage = new WizardNewFileCreationPage(
				"Select destination OWLS template file",
				new StructuredSelection()));

		selectFilePage.setDescription("Select a destination OWLS file");
		selectFilePage.setFileExtension("owl");
		selectFilePage.setFileName("new_service.owl");

	}

	@Override
	public boolean canFinish() {
		return selectFilePage.isPageComplete();
	}

	@Override
	public boolean performFinish() {

		final TemplateConstructorImpl builder = showTemplateMatchesPage
				.getBuilder();
		final TemplateAnswerSet selectedMatch = showTemplateMatchesPage
				.getCurrentMatch();
		final IFile targetFile = selectFilePage.createNewFile();
		final String serviceName = servicePropertiesPage.getNameString();
		final String serviceOntologyURI = servicePropertiesPage.getURIString();
		final String serviceDesc = servicePropertiesPage.getServiceDesc();
		// final String serviceLabel =
		// servicePropertiesPage.getServiceDesc()Label();

		GroundTemplateAction gta = new GroundTemplateAction(targetFile,
				builder, serviceOntologyURI, serviceName, selectedMatch, "",
				serviceDesc);

		try {
			getContainer().run(false, true, gta);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		// PlansModelWizard w = new PlansModelWizard();
		// w.init(Activator.getDefault().getWorkbench(), selection);
		// this.newPlanPage = w.new PlansModelWizardNewFileCreationPage(
		// "SelectPlan", selection);
		// this.planDetailsPage = new PlanDetailsPage(selection, false);
		// this.taskSelectionPage = new TaskSelectionPage("whatever3");
		// this.taskSelectionPage.setTaskFileUri(state.getTask());
		log.info("Created wizard");
	}
}
