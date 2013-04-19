package net.sf.ictalive.service.serviceui;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.sf.ictalive.service.discovery.client.RepositoryFactory;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.svcrepo.HandlerCallBack;
import net.sf.ictalive.svcrepo.RemoteWebserviceRepository;
import net.sf.ictalive.svcrepo.ServiceRepository;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.service.Service;

import arq.update;

import com.google.common.base.Preconditions;

/**
 * Selects a service from the given repository using the given search
 * 
 * @author occ
 * 
 */
public class SelectServicePage extends WizardPage {

	DiscoverySearch search;
	org.eclipse.swt.widgets.List searchList;
	List<Service> services;
	List<Service> selectedServices = new ArrayList<Service>();
	ServiceInfoBox selectedInfo;
	Button reloadButton;
	boolean showReloadButton = true;

	public boolean isShowReloadButton() {
		return showReloadButton;
	}

	public void setShowReloadButton(boolean showReloadButton) {
		this.showReloadButton = showReloadButton;
	}

	RepositoryFactory wscFactory;
	boolean allowMultiple = false;

	public boolean isAllowMultiple() {
		return allowMultiple;
	}

	public void setAllowMultiple(boolean allowMultiple) {
		this.allowMultiple = allowMultiple;
	}

	public SelectServicePage(String title, RepositoryFactory wscf) {
		this(title, wscf, null);
	}

	/**
	 * Creates a service page
	 * 
	 * 
	 * @param title
	 * @param wscf
	 *            a factory returning an appropriate ObjectRepositor
	 * @param search
	 *            a search used to build the list if null will use the default
	 *            service search
	 * 
	 * @see Activator#getRepositoryFactory()
	 */
	public SelectServicePage(String title, RepositoryFactory wscf,
			DiscoverySearch search) {
		super(title);
		Preconditions.checkNotNull(wscf);
		this.search = search;
		this.wscFactory = wscf;
	}

	public void loadSearchWithMontior(final IProgressMonitor monitor,
			boolean forceReload) {

		MonitorableRepoLoadAction mr = new MonitorableRepoLoadAction(
				wscFactory, search, forceReload);
		try {
			mr.run(monitor);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		services = mr.getServices();
		selectedServices.clear();
		getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				updateServiceList();
			}
		});

	}

	public static int[] toIntArray(List<Integer> list) {
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++)
			ret[i] = list.get(i);
		return ret;
	}

	void updateServiceList() {
		searchList.removeAll();
		List<Integer> selIdxs = new LinkedList<Integer>();

		int selIdx = 0;
		for (Service s : services) {
			searchList.add(ServiceDecorationHelper.serviceToShortString(s));
			if (selectedServices.contains(s)) {
				selIdxs.add(selIdx);
			}
			selIdx++;

		}

		searchList.setSelection(toIntArray(selIdxs));
		if (selectedServices.size() > 0) {
			Service s = selectedServices.get(0);
			selectedInfo.setService(s);
		} else {
			selectedInfo.setService(null);
		}

	}

	@Override
	public void createControl(Composite parent) {
		Composite client = new Composite(parent, SWT.NONE);
		client.setLayout(new GridLayout());

		searchList = new org.eclipse.swt.widgets.List(client, SWT.V_SCROLL
				| (allowMultiple ? SWT.MULTI : SWT.NONE));
		GridData listData = new GridData(GridData.FILL_BOTH);
		searchList.setLayoutData(listData);

		searchList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int[] selection = searchList.getSelectionIndices();

				selectedServices.clear();
				for (int selIdx : selection) {
					selectedServices.add(services.get(selIdx));
				}
				int lastSel = searchList.getSelectionIndex();
				if (lastSel >= 0) {
					Service s = services.get(lastSel);
					selectedInfo.setService(s);
				} else {
					selectedInfo.setService(null);
				}
				setPageComplete(validate());
			}

		});

		selectedInfo = new ServiceInfoBox(client, true);
		selectedInfo.getControl().setLayoutData(
				new GridData(GridData.GRAB_HORIZONTAL
						| GridData.FILL_HORIZONTAL));

		if (showReloadButton) {
			reloadButton = new Button(client, SWT.PUSH);
			reloadButton.setText("Reload results");
			reloadButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					try {
						getContainer().run(false, false,
								new IRunnableWithProgress() {
									@Override
									public void run(IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										loadSearchWithMontior(monitor, true);
									}
								});
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			});
			client.addListener(SWT.Show, new Listener() {
				@Override
				public void handleEvent(Event event) {
					if (services == null) {
						getShell().getDisplay().asyncExec(new Runnable() {

							public void run() {
								try {
									getContainer().run(true, false,
											new IRunnableWithProgress() {
												@Override
												public void run(
														IProgressMonitor monitor)
														throws InvocationTargetException,
														InterruptedException {
													loadSearchWithMontior(
															monitor, false);
												}
											});
								} catch (InvocationTargetException e) {
									e.printStackTrace();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							};
						});

					}

				}
			});
			setControl(client);
		}

	}

	public List<Service> getSelectedServices() {
		return selectedServices;
	}

	public boolean validate() {
		return selectedServices.size() > 0;
	}
}
