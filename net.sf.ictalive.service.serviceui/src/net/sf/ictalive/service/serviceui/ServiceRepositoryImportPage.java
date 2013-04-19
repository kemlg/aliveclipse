package net.sf.ictalive.service.serviceui;

import java.util.LinkedList;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectListResult;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.serviceui.preferences.ServiceSetupPreferencesPage;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferenceLinkArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple wizard page which selects an object from the serice repository based
 * on a given repository search;
 * 
 * @author occ
 * 
 */
public class ServiceRepositoryImportPage extends WizardPage {

	Logger log = LoggerFactory.getLogger(ServiceRepositoryImportPage.class);
	DiscoverySearch search;
	List objectList;

	public static DiscoverySearch SERVICES = DiscoverySearch.search()
	.inSection("semanticservices");
	public static DiscoverySearch TEMPLATES = DiscoverySearch.search()
	.inSection("templates");
	public static DiscoverySearch ONTOLOGIES = DiscoverySearch.search()
	.inSection("ontologies");
	java.util.List<ObjectDescriptor> objects;
	Label instructionLabel;
	Label objectName;
	Label objectDescription;
	Label objectURI;

	public void updateListContents() {
		assert (search != null);
		ObjectRepository repo = Activator.getDefault().getRepository();
		if (repo == null) {
			log.debug("Repository is not defined, cannot update");
			objectList.removeAll();
			return;
		}
		objectList.removeAll();
		ObjectListResult result = repo.search(search);
		objects = result.getObjects();
		for (ObjectDescriptor od : objects) {
			objectList.add(od.getLabel());
		}

	}

	public boolean validatePage() {
		ObjectRepository repo = Activator.getDefault().getRepository();
		if (repo == null) {
			setErrorMessage("Repository is not configured");
			return false;
		} else {
			setErrorMessage(null);
		}
		if (objectList.getSelectionIndex() != -1) {
			return true;
		}
		return false;
	}

	public ObjectDescriptor getSelectedObjectDescriptor() {
		if (objectList.getSelectionCount() < 1) {
			return null;
		}
		ObjectDescriptor od = objects.get(objectList.getSelectionIndex());
		return od;
	}

	public java.util.List<ObjectDescriptor> getSelectedObjectDescriptors() {
		java.util.List<ObjectDescriptor> resultList = new LinkedList<ObjectDescriptor>();
		for (int i : objectList.getSelectionIndices()) {
			resultList.add(objects.get(i));
		}
		return resultList;
	}

	public void updateObjectDesc() {
		ObjectDescriptor od = getSelectedObjectDescriptor();
		if (od == null) {
			objectName.setText("No Object Selected");
			objectDescription.setText("");
			objectURI.setText("");
		} else {
			objectName.setText(od.getLabel());
			objectDescription.setText(od.getDescription());
			objectURI.setText(od.getUri().toString());
			log.debug("Selected object resource URL: " + od.getResourceURL().toString());
		}
	}

	public ServiceRepositoryImportPage(String pageName, DiscoverySearch search) {
		super(pageName);
		this.search = search;
	}

	public void setText(String text) {
		setText(text);
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());

		// PreferenceLinkArea preferenceLinkArea = new PreferenceLinkArea(
		// composite,
		// SWT.NONE,
		//				"net.sf.ictalive.service.serviceui.preferences.ServiceSetupPreferencesPage", "Configure <a>repository preferences</a>", null, null); //$NON-NLS-1$
		// preferenceLinkArea.getControl().setLayoutData(
		// new GridData(GridData.FILL_HORIZONTAL
		// | GridData.GRAB_HORIZONTAL));

		Link preferencesLink = new Link(composite, SWT.NONE);
		preferencesLink.setText("Configure <a> Repository Preferences</a>");
		preferencesLink.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event arg0) {
				ServiceSetupPreferencesPage page = new ServiceSetupPreferencesPage();
				page.setTitle("Service Setup");
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
				
				Display.getCurrent().asyncExec(new Runnable() {
					public void run() {
						updateListContents();
						setPageComplete(validatePage());	
					}
				});


			}
		});
		preferencesLink.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));

		instructionLabel = new Label(composite, SWT.NONE);
		instructionLabel
		.setText("Select a repository object from the list below:");
		instructionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		objectList = new org.eclipse.swt.widgets.List(composite, SWT.BORDER
				| SWT.V_SCROLL | SWT.SINGLE);
		GridData listData = new GridData(GridData.FILL_BOTH);

		objectList.setLayoutData(listData);
		// actionList.setSize(new Point(200, 400));
		objectList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				setPageComplete(validatePage());
				updateObjectDesc();
			}
		});

		Button updateButton = new Button(composite, SWT.NONE);
		updateButton.setText("Refresh Contents");

		updateButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event arg0) {
				log.debug("Refreshing repo page contents");
				updateListContents();
			}
		});
		objectName = new Label(composite, SWT.NONE);
		objectName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		objectDescription = new Label(composite, SWT.NONE);
		objectDescription.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		objectURI = new Label(composite, SWT.NONE);
		objectURI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		updateObjectDesc();
		updateListContents();
		setControl(composite);
	}
}
