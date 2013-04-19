package net.sf.ictalive.service.matchmakertab.dashboard;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Callable;

import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.service.serviceui.ProcessInfoBox;
import net.sf.ictalive.service.serviceui.ServiceDecorationHelper;
import net.sf.ictalive.service.serviceui.ServiceInfoBox;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ProgressBar;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agents.ReloadableMatchMaker;
import agents.ServicePrefs;

import com.google.common.base.Preconditions;

import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.Preferences;
import edu.bath.matchmaker.prefs.Preference;

/***
 * Given a query source and a matchmaker source, executes a query and shows the
 * resulting service infor in a list
 * 
 * allows the user to select (optionally) one or more services which are passed
 * on to another process
 * 
 * @author occ
 * 
 */
public class SelectMatchedServicePage extends WizardPage {

	List serviceMatchList;
	Logger log = LoggerFactory.getLogger(SelectMatchedServicePage.class);
	boolean showReloadButtons = true;
	java.util.List<Match> serviceMatches = null;
	java.util.List<Match> selectedMatches = new LinkedList<Match>();

	Match currentSelection;
	ProcessInfoBox queryInfo;
	ServiceInfoBox selectedMatchInfo;
	Button runMatcherButton;
	Button reloadMatcherButton;

	transient boolean running;

	boolean allowMultiple = false;
	// Set internally when matching is done
	Service query;
	Callable<Service> querySource;
	Callable<ReloadableMatchMaker> mmSource;

	Preference<Match> sortPreference = ServicePrefs.DEFAULT.getPreference();
	ServiceHandler serviceHandler = DEFAULT_LOADING_HANDLER;

	/**
	 * Callback handler for mapping matches to output
	 * 
	 * @author occ
	 * 
	 */
	public static interface ServiceHandler {

		/**
		 * Notification that a match was found
		 * 
		 * @param m
		 * @param monitor
		 * @return true if the match should be considered, false if otherwise
		 */
		public boolean gotMatch(Match m, IProgressMonitor monitor);

		/**
		 * Produces the name of a given match in the list
		 * 
		 * @param m
		 * @return
		 */
		public String nameMatchInList(Match m);

		/**
		 * Returns the service to show in the information box
		 * 
		 * @param match
		 * @return
		 */
		public Service getServiceInfo(Match match);

		/**
		 * # Resets the handler vbefore a match
		 */
		public void reset();
	}

	/**
	 * the standard deligate - this lo
	 */
	public static final ServiceHandler DEFAULT_LOADING_HANDLER = new ServiceHandler() {
		Map<URI, Service> loadedServices = new HashMap<URI, Service>();

		@Override
		public String nameMatchInList(Match match) {
			Preconditions.checkNotNull(match, "match must not be null");
			Service s = loadedServices.get(match.getService().getURI());
			if (s != null) {
				return ServiceDecorationHelper.serviceToShortString(s);
			}
			return "";
		}

		@Override
		public Service getServiceInfo(Match match) {
			Preconditions.checkNotNull(match, "match must not be null");
			return loadedServices.get(match.getService().getURI());
		}

		@Override
		public boolean gotMatch(Match match, IProgressMonitor monitor) {
			Preconditions.checkNotNull(match, "match must not be null");
			Preconditions.checkNotNull(monitor, "monitor must not be null");
			monitor.beginTask("Loading service " + match.getService().getURI(),
					100);
			Service s = Activator.getDefault().loadServiceFromURI(
					match.getService().getURI());
			if (s == null) {

				return false;
			}
			loadedServices.put(match.getService().getURI(), s);
			monitor.worked(100);
			monitor.done();
			return true;

		}

		public void reset() {
			loadedServices = new HashMap<URI, Service>();

		};

	};

	public ServiceHandler getServiceHandler() {
		return serviceHandler;
	}

	/**
	 * Specifis which service handler to use to deal with service match results
	 * - this allows a degree of customization for different behaviours
	 * 
	 * The default handler loads the target service for the result and displays
	 * its name as per usual
	 * 
	 * @param serviceHandler
	 */
	public void setServiceHandler(ServiceHandler serviceHandler) {
		this.serviceHandler = serviceHandler;
	}

	public Preference<Match> getSortPreference() {
		return sortPreference;
	}

	/**
	 * Sets the source preference for elements in the matchmaker list
	 * 
	 * This <b>must</b> be consistent with the decorators configured in the
	 * matchmaker
	 * 
	 * @param sortPreference
	 */
	public void setSortPreference(Preference<Match> sortPreference) {
		this.sortPreference = sortPreference;
	}

	public SelectMatchedServicePage(String name, boolean allowMultiple,
			Callable<Service> querySource,
			Callable<ReloadableMatchMaker> mmSource) {
		super(name);
		setTitle("Select a matched service");
		this.querySource = querySource;
		this.mmSource = mmSource;
	}

	/**
	 * invokes the matchmaker and then retrieves/instantiates all of the
	 * returned service results - when a service cannot be instantiated it
	 * excluded from the list
	 * 
	 * @param monitor
	 * @throws Exception
	 */
	public void runMatchMakerWithProgress(IProgressMonitor monitor)
			throws Exception {

		try {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					if (runMatcherButton != null)
						runMatcherButton.setEnabled(false);
				}
			});
			query = querySource.call();
			assert (query != null);
			org.mindswap.owls.process.Process proc = query.getProcess();
			queryInfo.setProcess(proc);
			assert mmSource != null;
			MatchMaker mm = mmSource.call().getMatchMaker();
			Preconditions.checkNotNull(query);
			Preconditions.checkNotNull(mm);
			log.debug("Starting matchmaker process");
			monitor.beginTask("Matching services", IProgressMonitor.UNKNOWN);
			int numServices = mm.getServices().size();
			monitor.worked(1);
			java.util.List<Match> matches = sortPreference.sortedCopy(mm.match(
					query.getOntology(), InputMatcher.SUPERCLASSES,
					OutputMatcher.SUBCLASSES));
			log.debug("got {} matches: {} ", matches.size(), matches);

			monitor.worked(5);
			log.debug("Instantiating services");

			monitor.subTask("Instantiating Service descriptions");
			java.util.List<Service> services = new LinkedList<Service>();

			setMessage("Matched " + matches.size() + " out of " + numServices);
			for (final Match match : matches) {
				monitor.subTask("Instantiating Service "
						+ match.getService().getURI());
				log.debug("Instantiating service {} ", match.getService()
						.getURI());
				monitor.subTask("Instantiating service "
						+ match.getService().getURI());

				serviceHandler.gotMatch(match, new SubProgressMonitor(monitor,
						10));
				monitor.worked(1);
			}
			monitor.done();
			log.debug("Matchmaking process complete");
			serviceMatches = matches;
			updateServiceList();
		} finally {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					if (runMatcherButton != null)
						runMatcherButton.setEnabled(true);
				}
			});
		}
	}

	public void updateServiceList() {
		serviceMatchList.removeAll();
		for (Match svc : serviceMatches) {

			serviceMatchList.add(serviceHandler.nameMatchInList(svc));
		}
		if (serviceMatches.size() > 0)
			serviceMatchList.setSelection(0);
		updateSelectionDetails();
	}

	public void updateSelectionDetails() {
		queryInfo.setProcess(query.getProcess());
		if (currentSelection == null) {
			selectedMatchInfo.setService(null);
		} else {
			selectedMatchInfo.setService(serviceHandler
					.getServiceInfo(currentSelection));
		}
	}

	@Override
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new GridLayout());
		queryInfo = new ProcessInfoBox(comp, false,false);
		queryInfo.setText("Query details");
		queryInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));

		Label matches = new Label(comp, SWT.NONE);

		matches.setText("Select a match from the list below ");
		matches.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		if (showReloadButtons) {
			Composite buttonCont = new Composite(comp, SWT.NONE);
			buttonCont.setLayout(new RowLayout(SWT.HORIZONTAL));
			runMatcherButton = new Button(buttonCont, SWT.PUSH);
			runMatcherButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {

					try {
						getContainer().run(false, false,
								new IRunnableWithProgress() {

									@Override
									public void run(IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										try {
											runMatchMakerWithProgress(monitor);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});
					} catch (Exception e) {
						e.printStackTrace();

					}

				}
			});
			runMatcherButton.setText("Run Matchmaker");

			reloadMatcherButton = new Button(buttonCont, SWT.PUSH);
			reloadMatcherButton.addListener(SWT.Selection, new Listener() {
				@Override
				public void handleEvent(Event event) {

					ReloadableMatchMaker rlm;
					try {
						rlm = mmSource.call();
						rlm.reload();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
					rlm.reload();
				}
			});
			reloadMatcherButton.setText("Reload Matchmaker services");
		}
		serviceMatchList = new org.eclipse.swt.widgets.List(comp,
				allowMultiple ? SWT.MULTI : SWT.SINGLE | SWT.BORDER
						| SWT.V_SCROLL);

		GridData listData = new GridData(GridData.FILL_BOTH);
		// listData.minimumHeight = 400;

		serviceMatchList.setLayoutData(listData);
		serviceMatchList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event arg0) {
				int selIdx;
				if ((selIdx = serviceMatchList.getSelectionIndex()) >= 0) {
					currentSelection = serviceMatches.get(selIdx);
				} else {
					currentSelection = null;
				}
				updateSelectionDetails();
				setPageComplete(validatePage());
			}
		});

		serviceMatchList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				java.util.List<Match> selected_matches = new LinkedList<Match>();
				for (int i : serviceMatchList.getSelectionIndices()) {
					selected_matches.add(serviceMatches.get(i));
				}
				selectedMatches = selected_matches;
			}
		});
		selectedMatchInfo = new ServiceInfoBox(comp,true);
		selectedMatchInfo.setText("Selected Match");
		selectedMatchInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));
		comp.pack();
		setControl(comp);
		setPageComplete(validatePage());

		comp.addListener(SWT.Show, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (serviceMatches == null) {
					try {
						getContainer().run(false, false,
								new IRunnableWithProgress() {

									@Override
									public void run(IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										try {
											runMatchMakerWithProgress(monitor);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
	}

	boolean validatePage() {
		return serviceMatchList.getSelectionCount() > 0;
	}

	/**
	 * Returns all selected matches from the page
	 * 
	 * @return
	 */
	public java.util.List<Match> getSelectedMatches() {

		return selectedMatches;
	}

	/**
	 * returns the selected matches mapped into services using the currently
	 * configured handler
	 * 
	 * @return
	 */
	public java.util.List<Service> getSelectedServices() {
		java.util.List<Service> selected_services = new LinkedList<Service>();
		for (Match match : getSelectedMatches()) {
			selected_services.add(serviceHandler.getServiceInfo(match));
		}
		return selected_services;
	}
}
