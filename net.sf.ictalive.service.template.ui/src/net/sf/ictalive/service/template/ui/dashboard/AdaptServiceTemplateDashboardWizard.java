package net.sf.ictalive.service.template.ui.dashboard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Callable;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.service.matchmakertab.ActionToOWLS;
import net.sf.ictalive.service.matchmakertab.dashboard.SelectActionsToValidatePage;
import net.sf.ictalive.service.matchmakertab.dashboard.SelectMatchedServicePage;
import net.sf.ictalive.service.serviceui.ControlCreationWizardFirstPage;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agents.ReloadableMatchMaker;

import com.google.common.base.Preconditions;

import edu.bath.alivetemplates.TemplateAnswerSet;
import edu.bath.alivetemplates.TemplateConstructorImpl;
import edu.bath.matchmaker.MatchMaker;

/**
 * Use either this or the DashboardAction, depending on whether you want the
 * dashboard to create and open the wizard windows, or when your own methods do
 * that work.
 * 
 * Remember to edit the plugin.xml net.sf.ictalive.aliveclipse.dashboard.actions
 * extension point to point to the appropriate class
 */
public class AdaptServiceTemplateDashboardWizard extends Wizard implements
		IWorkbenchWizard {
	private IStructuredSelection selection;
	private URI actionURI;
	ActionsCollection actionCollection;
	SelectActionsToValidatePage selectActionsPage;
	SelectMatchedServicePage selectTemplatePage;
	ShowTemplateMatchesPage showTemplateMatchesPage;
	ControlCreationWizardFirstPage servicePropertiesPage;
	WizardNewFileCreationPage selectFilePage;

	Logger log = LoggerFactory
			.getLogger(AdaptServiceTemplateDashboardWizard.class);

	public ShowTemplateMatchesPage getShowTemplateMatchesPage() {
		return showTemplateMatchesPage;
	}

	/**
	 * Constructor for PlanSynthesisComponentNewWizard.
	 */
	public AdaptServiceTemplateDashboardWizard(AliveDashboardState state) {
		super();
		setNeedsProgressMonitor(true);
		actionURI = state.getAction();
	}

	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {

		addPage(selectActionsPage = new SelectActionsToValidatePage(
				"Select Action To Refine", new Callable<List<Action>>() {

					@Override
					public List<Action> call() throws Exception {
						return actionCollection.getActions();
					}
				}));
		selectActionsPage.setMultiple(false);
		selectActionsPage.setTitle("Select an action to match");

		addPage(selectTemplatePage = new SelectMatchedServicePage(
				"Select matching template", false, new Callable<Service>() {
					@Override
					public Service call() throws Exception {
						List<Action> actions = selectActionsPage
								.getSelectedActions();
						if (0 == actions.size())
							return null;
						Action action = actions.get(0);
						ActionToOWLS a2owls = new ActionToOWLS();
						return a2owls.convertActionToService(action);
					}
				}, new Callable<ReloadableMatchMaker>() {
					@Override
					public ReloadableMatchMaker call() throws Exception {
						return new ReloadableMatchMaker() {

							@Override
							public void reload() {
								net.sf.ictalive.service.matchmakertab.Activator
										.getDefault()
										.refreshTemplateMatchmakerWithProgressDialog();

							}

							@Override
							public MatchMaker getMatchMaker() {
								return net.sf.ictalive.service.matchmakertab.Activator
										.getDefault().getTemplateMatchmaker();
							}
						};

					}
				}));
		selectTemplatePage.setTitle("Select a matching template to apply");

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
		this.selection = selection;
		URI actionURI = this.actionURI;
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(TasksPackage.eNS_URI,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(TasksPackage.eNS_PREFIX,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(ActionsPackage.eNS_URI,
				ActionsPackage.eINSTANCE);
		rs.getPackageRegistry().put(ActionsPackage.eNS_PREFIX,
				ActionsPackage.eINSTANCE);

		Resource r = rs.getResource(actionURI, true);
		for (EObject obj : r.getContents()) {

			if (obj instanceof ActionsCollection) {
				ActionsCollection col = (ActionsCollection) obj;
				actionCollection = col;
			}
		}

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
