package net.sf.ictalive.service.template.ui.dashboard;

import jaspwrapper.exec.Program;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import net.sf.ictalive.service.serviceui.ProcessInfoBox;
import net.sf.ictalive.service.serviceui.ServiceDecorationHelper;
import net.sf.ictalive.service.serviceui.ServiceInfoBox;
import net.sf.ictalive.service.serviceui.preferences.ServiceSetupPreferencesPage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agents.ReloadableMatchMaker;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import edu.bath.alivetemplates.TemplateAnswerSet;
import edu.bath.alivetemplates.TemplateConstructorImpl;
import edu.bath.alivetemplates.TemplateHelper;
import edu.bath.matchmaker.Match;

/***
 * Shows template matches for a given template process
 * 
 * @author occ
 * 
 */
public class ShowTemplateMatchesPage extends WizardPage {
	Logger log = LoggerFactory.getLogger(ShowTemplateMatchesPage.class);
	boolean showRefreshButton = true;
	// Table templateMatchTable;
	org.eclipse.swt.widgets.List templateMatchList;
	org.eclipse.swt.widgets.List slotBindingList;
	java.util.List<TemplateAnswerSet> templateMatches;
	java.util.List<org.mindswap.owls.process.Process> templateSlots;

	ServiceInfoBox templateInfo;
	ProcessInfoBox currentSlotInfo;
	ServiceInfoBox currentProcessInfo;

	Button runMatcherButton;

	final Callable<Service> templateSource;
	final Callable<ReloadableMatchMaker> mmSource;
	TemplateConstructorImpl builder;

	public TemplateConstructorImpl getBuilder() {
		return builder;
	}

	Process currentSlot;
	Process currentServiceProcess;
	Service templateService;

	TemplateAnswerSet currentMatch;

	public ShowTemplateMatchesPage(String name,
			Callable<Service> templateSource,
			Callable<ReloadableMatchMaker> mmSource) {
		super(name);
		Preconditions.checkNotNull(mmSource);
		Preconditions.checkNotNull(templateSource);

		this.mmSource = mmSource;
		this.templateSource = templateSource;
		setTitle("Find candidate matches for template");
	}

	/**
	 * Updates the template info (after template set or after a match)
	 */
	public void updateTemplateUIInfoInfo() {

		Preconditions.checkNotNull(templateSlots);
		Preconditions.checkNotNull(templateService);
		if (runMatcherButton != null)
			runMatcherButton.setEnabled(true);
		templateInfo.setService(templateService);
		templateMatchList.removeAll();

		if (templateMatches != null) {
			int matchno = 0;

			for (TemplateAnswerSet tm : templateMatches) {
				// TableItem ti = new TableItem(templateMatchTable, SWT.NONE);
				templateMatchList.add("Match " + matchno++);
			}
			if (templateMatches.size() > 0) {
				templateMatchList.setSelection(0);
				currentMatch = templateMatches.get(0);
			} else {
				currentMatch = null;
				currentSlot = null;
			}
		} else {
			currentMatch = null;
			currentSlot = null;
		}
		updateSelectedMatchUI();

	}

	/**
	 * Updates following a selection of a match
	 */
	private void updateSelectedMatchUI() {
		slotBindingList.removeAll();

		if (currentMatch != null) {
			Preconditions.checkNotNull(templateSlots);
			Map<Process, Process> curBindings = currentMatch.getMapping();

			for (Process slot : templateSlots) {
				Process matchedProc = curBindings.get(slot);
				String procDesc = " NONE ";

				if (matchedProc != null) {
					procDesc = ServiceDecorationHelper
							.processsToShortString(matchedProc);
				}
				String desc = TemplateHelper.getSlotName(slot) + "=>"
						+ procDesc;
				slotBindingList.add(desc);

			}

			if (templateSlots.size() > 0) {
				currentSlot = templateSlots.get(0);
				currentServiceProcess = curBindings.get(currentSlot);
				slotBindingList.setSelection(0);
			} else {
				currentServiceProcess = currentSlot = null;
			}
		} else {
			currentServiceProcess = currentSlot = null;
		}
		setPageComplete(validatePage());
		updateSlotSelectionUI();
	}

	/**
	 * Updates following a slot selection
	 */
	private void updateSlotSelectionUI() {

		currentSlotInfo.setProcess(currentSlot);
		if (currentServiceProcess != null) {
			currentProcessInfo.setService(currentServiceProcess.getService());
		} else {
			currentProcessInfo.setService(null);
		}
	}

	/**
	 * Initializes the current tempalate builder
	 */
	public void setupTemplates() {
		try {
			Service templateService = templateSource.call();

			Preconditions.checkNotNull(templateService);

			java.util.List<org.mindswap.owls.process.Process> templateSlots = TemplateHelper
					.findTemplateSlots(templateService.getProcess().castTo(
							CompositeProcess.class));

			this.templateSlots = templateSlots;
			this.templateService = templateService;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static interface SlotMatchFilter {
		boolean includeMatch(Process slot, Match m);
	}

	public static final SlotMatchFilter DEFAULT_FILTER = new SlotMatchFilter() {

		@Override
		public boolean includeMatch(Process slot, Match m) {
			return true;
		}
	};

	SlotMatchFilter slotMatchFilter = DEFAULT_FILTER;

	public SlotMatchFilter getSlotMatchFilter() {
		return slotMatchFilter;
	}

	public void setSlotMatchFilter(SlotMatchFilter slotMatchFilter) {
		this.slotMatchFilter = slotMatchFilter;
	}

	public void runTemplateMatchmakerWithProgress(IProgressMonitor monitor) {
		Preconditions.checkNotNull(templateService);
		Preconditions.checkNotNull(templateSlots);

		try {
			ReloadableMatchMaker slotMatchMaker = mmSource.call();
			Preconditions.checkNotNull(slotMatchMaker,
					"Matchmaker must not be null");
			monitor.beginTask("Running template matchmaker", templateSlots
					.size() * 100 + 1000 + 400);
			monitor.subTask("Matching Slots");

			TemplateConstructorImpl builder = new TemplateConstructorImpl(
					templateService, slotMatchMaker.getMatchMaker(),
					net.sf.ictalive.service.template.ui.Activator.getDefault()
							.getTemplateMMProps(), templateService.getKB());

			Map<Process, Collection<Match>> allMatches = new HashMap<Process, Collection<Match>>();

			for (final Process slot : templateSlots) {
				monitor.subTask("Matching services for slot "
						+ TemplateHelper.getSlotName(slot));
				Map<Process, Collection<Match>> cur_slot = builder
						.getCandidates(Collections.singletonList(slot));

				// Filter out slots
				Collection<Match> slotMatches = Collections2.filter(cur_slot
						.get(slot), new Predicate<Match>() {
					@Override
					public boolean apply(Match match) {
						return slotMatchFilter.includeMatch(slot, match);
					}
				});

				if (slotMatches.size() == 0) {
					getShell().getDisplay().asyncExec(new Runnable() {

						@Override
						public void run() {
							setErrorMessage("Slot "
									+ TemplateHelper.getSlotName(slot)
									+ " has no candidate services");

						}
					});
					monitor.done();
					return;

				}
				;
				allMatches.put(slot, slotMatches);
				monitor.worked(100);

			}
			monitor.subTask("Building Program from template matches");
			Program prog = builder.getGeneratedASP(allMatches);
			monitor.worked(400);

			monitor.subTask("Solving answer set program");
			List<TemplateAnswerSet> answerSets = builder.getAnswerSets(prog);
			final int numAnswerSets = answerSets.size();
			monitor.worked(1000);
			templateMatches = answerSets;
			log.debug("Got {} matches", templateMatches.size());
			if (answerSets.size() == 0) {
				getShell().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						setErrorMessage("No answers found which satisfy this template");

					}
				});
			} else {
				this.builder = builder;
			}

			getShell().getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					updateTemplateUIInfoInfo();
					if (numAnswerSets > 0) {
						setMessage("Found " + numAnswerSets + " matches");
					} else {
						setMessage(null);
					}
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			monitor.done();
		}
	}

	/**
	 * Updates the detailed view for a specific match
	 */
	// public void updateSelectionDetails() {
	// . matchDetailsTable.removeAll();
	// if (currentMatch != null) {
	// TableColumn slotColumn = new TableColumn(matchDetailsTable,
	// SWT.NONE);
	// slotColumn.setText("Slot");
	// TableColumn matchColumn = new TableColumn(matchDetailsTable,
	// SWT.NONE);
	// matchColumn.setText("Match");
	//
	// for (org.mindswap.owls.process.Process slot : currentMatch
	// .getSlots()) {
	// org.mindswap.owls.process.Process match = currentMatch
	// .getTemplateAssignments().get(slot);
	// assert (match != null);
	// TableItem slotItem = new TableItem(matchDetailsTable, SWT.NONE);
	// slotItem.setText(0, slot.getLocalName());
	// slotItem.setText(1, match.getURI().toString());
	// }
	// }
	// }

	@Override
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new GridLayout());

		Link preferencesLink = new Link(comp, SWT.NONE);
		preferencesLink.setText("Configure <a> Template Preferences</a>");
		preferencesLink.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event arg0) {
				ServiceSetupPreferencesPage page = new ServiceSetupPreferencesPage();
				page.setTitle("Service Preferences");
				PreferenceManager mgr = new PreferenceManager();
				IPreferenceNode node = new PreferenceNode("1", page);
				mgr.addToRoot(node);
				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				PreferenceDialog dialog = new PreferenceDialog(win.getShell(),
						mgr);
				dialog.create();
				dialog.setMessage(page.getTitle());
				dialog.open();

			}
		});

		templateInfo = new ServiceInfoBox(comp, false);
		templateInfo.setText("Template Description");
		templateInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));

		if (showRefreshButton) {
			runMatcherButton = new Button(comp, SWT.PUSH);
			runMatcherButton.setEnabled(false);
			runMatcherButton.setText("Run Template Matcher");
			runMatcherButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					try {
						getContainer().run(true, false,
								new IRunnableWithProgress() {

									@Override
									public void run(IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										runTemplateMatchmakerWithProgress(monitor);
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
			});
		}
		Label matches = new Label(comp, SWT.NONE);
		matches
				.setText("Select a template match from the list below to instantiate the template as a service");
		matches.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite slotComp = new Composite(comp, SWT.BORDER);
		GridLayout fd;
		slotComp.setLayout(fd = new GridLayout());
		fd.numColumns = 2;

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.minimumHeight = 200;
		gd.heightHint = 200;

		slotComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		templateMatchList = new org.eclipse.swt.widgets.List(slotComp,
				SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);
		templateMatchList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int sel;
				if ((sel = templateMatchList.getSelectionIndex()) >= 0) {
					currentMatch = templateMatches.get(sel);

				} else {
					currentMatch = null;
				}
				updateSelectedMatchUI();
			}
		});
		templateMatchList.setLayoutData(gd);
		// templateMatchList.setLayoutData(new RowData(200, 100));
		slotBindingList = new org.eclipse.swt.widgets.List(slotComp, SWT.SINGLE
				| SWT.V_SCROLL | SWT.BORDER);
		slotBindingList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int sel;
				if ((sel = slotBindingList.getSelectionIndex()) >= 0) {
					currentSlot = templateSlots.get(sel);
					currentServiceProcess = currentMatch.getMapping().get(
							currentSlot);
				} else {
					currentSlot = null;
					currentServiceProcess = null;
				}
				updateSlotSelectionUI();

			}
		});
		slotBindingList.setLayoutData(gd);

		currentSlotInfo = new ProcessInfoBox(slotComp);
		currentSlotInfo.setText("Selected Slot");
		currentSlotInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));
		
		currentProcessInfo = new ServiceInfoBox(slotComp, true);
		currentProcessInfo.setText("Selected Service");
		currentProcessInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));
		comp.pack();
		setControl(comp);
		log.debug("**** Temaplate Page createed");
		comp.addListener(SWT.Show, new Listener() {

			@Override
			public void handleEvent(Event event) {
				if (templateService == null) { // first time
					setupTemplates();
					try {
						getContainer().run(false, false,
								new IRunnableWithProgress() {

									@Override
									public void run(IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										runTemplateMatchmakerWithProgress(monitor);
									}
								});
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					updateTemplateUIInfoInfo();

				}

			}
		});
		setPageComplete(validatePage());
	}

	boolean validatePage() {
		return currentMatch != null;
	}

	public TemplateAnswerSet getCurrentMatch() {
		return currentMatch;
	}
}
