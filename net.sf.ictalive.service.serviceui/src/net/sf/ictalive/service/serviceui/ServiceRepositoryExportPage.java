package net.sf.ictalive.service.serviceui;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.client.ClientUtils;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.serviceui.preferences.ServiceSetupPreferencesPage;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.hp.hpl.jena.mem.StoreTripleIterator;

public class ServiceRepositoryExportPage extends WizardPage {

	private ObjectRepository repo;

	private final IFile theFile;

	private Label repoStatusLabel;
	private Label fileNameLabel, objectNameLabel, objectDescriptionLabel,
			objectURILabel;
	private Label searchComboLabel;
	private Text fileNameText, objectNameText, objectDescriptionText,
			objectURIText;
	private Combo searchTypeCombo;

	private Button keepSyncedButton;
	boolean keepSynced = true;
	private final static String ADAPTERS = "adaptors";
	private final static String MODELS = "organisation_models";
	private final static String SERVICES = "semanticservices";
	private final static String TEMPLATES = "templates";
	private static final String ONTOLOGIES = "ontologies";
	//
	private static final String OWLMIMETYPESTRING = "application/rdf+xml";
	private static final String ADAPTORMIMETYPE = "text/plain";

	private static final String GENERICMIMETYPESTRING = "application/xml";
	private static final String OWNERURISTRING = "http://eu.ict-alive.com/services";

	static class SectionInfo {
		final String section;

		public SectionInfo(String section, String name) {
			super();
			this.section = section;
			this.name = name;
		}

		final String name;
	}

	SectionInfo sectionInfos[] = {
			new SectionInfo(SERVICES, "Semantic Services"),
			new SectionInfo(ADAPTERS, "Service Adaptors"),
			new SectionInfo(MODELS, "Organisational Models"),
			new SectionInfo(TEMPLATES, "Templates"),
			new SectionInfo(ONTOLOGIES, "Ontologies") };

	Logger log = LoggerFactory.getLogger(ServiceRepositoryExportPage.class);

	private boolean fileOK = false, repoOK = false;

	private ObjectDescriptor odPublish;
	private String b64Publish;

	private ControlDecoration uriControlDecoration,
			objectNameControlDecoration;

	public ServiceRepositoryExportPage(String pageName, IFile theFile) {
		super(pageName);
		this.theFile = Preconditions.checkNotNull(theFile);

	}

	@Override
	public void createControl(final Composite parent) {
		// TODO Auto-generated method stub
		GridData gd;

		// only enable finish button after successful publish to repo
		// user can cancel out at any time
		this.setPageComplete(false);

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout controlLayout = new GridLayout();
		controlLayout.numColumns = 5;
		composite.setLayout(controlLayout);

		repoStatusLabel = new Label(composite, SWT.NONE);
		gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gd.horizontalSpan = controlLayout.numColumns;
		gd.grabExcessHorizontalSpace = true;
		repoStatusLabel.setLayoutData(gd);

		Link preferencesLink = new Link(composite, SWT.NONE);
		preferencesLink.setText("Configure <a>Repository Preferences</a>");
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
				updateRepo();
				validatePage();

			}
		});
		gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = controlLayout.numColumns;
		preferencesLink.setLayoutData(gd);

		Label spacerLabel = new Label(composite, SWT.NONE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = controlLayout.numColumns;
		spacerLabel.setLayoutData(gd);

		fileNameLabel = new Label(composite, SWT.NONE);
		fileNameLabel.setText("File to publish:");
		gd = new GridData();
		gd.horizontalSpan = 1;
		fileNameLabel.setLayoutData(gd);

		fileNameText = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		fileNameText.setText(theFile.getLocationURI().toString());
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = controlLayout.numColumns - 1;
		fileNameText.setLayoutData(gd);

		objectNameLabel = new Label(composite, SWT.NONE);
		objectNameLabel.setText("Object name:");
		gd = new GridData();
		gd.horizontalSpan = 1;
		objectNameLabel.setLayoutData(gd);

		objectNameText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = controlLayout.numColumns - 1;
		objectNameText.setLayoutData(gd);
		objectNameControlDecoration = new ControlDecoration(objectNameText,
				SWT.LEFT);
		objectNameControlDecoration
				.setDescriptionText("Service must have a name");
		objectNameControlDecoration.setImage(FieldDecorationRegistry
				.getDefault().getFieldDecoration(
						FieldDecorationRegistry.DEC_ERROR).getImage());
		objectNameControlDecoration.hide();

		objectURILabel = new Label(composite, SWT.NONE);
		objectURILabel.setText("Object URI:");
		gd = new GridData();
		gd.horizontalSpan = 1;
		objectURILabel.setLayoutData(gd);

		objectURIText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = controlLayout.numColumns - 1;
		objectURIText.setLayoutData(gd);
		uriControlDecoration = new ControlDecoration(objectURIText, SWT.LEFT);
		uriControlDecoration.setDescriptionText("URI is invalid");
		uriControlDecoration.setImage(FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR)
				.getImage());
		uriControlDecoration.hide();

		objectDescriptionLabel = new Label(composite, SWT.NONE | SWT.READ_ONLY);
		objectDescriptionLabel.setText("Object description:");
		gd = new GridData();
		gd.horizontalSpan = 1;
		objectDescriptionLabel.setLayoutData(gd);

		objectDescriptionText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = controlLayout.numColumns - 1;
		objectDescriptionText.setLayoutData(gd);

		searchComboLabel = new Label(composite, SWT.NONE);
		searchComboLabel.setText("Repository section: ");
		gd = new GridData();
		gd.horizontalSpan = 1;
		searchComboLabel.setLayoutData(gd);

		searchTypeCombo = new Combo(composite, SWT.NONE | SWT.READ_ONLY);

		// searchTypeCombo.setItems((String [])searchMap.keySet().toArray());
		for (SectionInfo type : sectionInfos) {
			searchTypeCombo.add(type.name);

		}
		gd = new GridData();
		gd.horizontalSpan = controlLayout.numColumns - 1;
		searchTypeCombo.setLayoutData(gd);
		searchTypeCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				validatePage();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		keepSyncedButton = new Button(composite, SWT.CHECK);
		keepSyncedButton.setText("Keep synchronized with repository");
		keepSyncedButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				keepSynced = keepSyncedButton.getSelection();
				if (RepositoryConnector.hasDetails(theFile)) {
					try {
						RepositoryConnector.setSync(theFile, keepSynced);
					} catch (CoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		updateRepo();
		ObjectDescriptor existingOD = null;
		try {
			existingOD = RepositoryConnector.getRepoProperties(theFile);
		} catch (CoreException e) {

		}
		if (existingOD != null) { // do we have a previously stored OD?
			objectNameText.setText(existingOD.getLabel());
			objectURIText.setText(existingOD.getUri().toString());
			objectDescriptionText.setText(existingOD.getDescription());

			keepSyncedButton.setSelection(keepSynced = RepositoryConnector
					.isSynced(theFile));
			int idx = 0;
			for (SectionInfo si : sectionInfos) {
				if (si.section.equals(existingOD.getSection())) {
					break;
				}
				idx++;
			}
			if (idx >= sectionInfos.length)
				idx = 0;
			searchTypeCombo.setText(sectionInfos[idx].name);

		} else if (theFile.getFileExtension().contains("owl")) {
			objectNameText.setText("Getting data from file");
			objectURIText.setEnabled(false);
			objectNameText.setEnabled(false);
			objectDescriptionText.setEnabled(false);
			getODFromOWLSFile();
			objectURIText.setEnabled(true);
			objectNameText.setEnabled(true);
			objectDescriptionText.setEnabled(true);
		} else {
			// no need to read file for non-OWL files.
			fileOK = true;
		}

		// ObjectDescriptor od = Activator.getDefault().getResourceMarkerAsOD(
		// theFile);
		// System.err.println("Found resource maker " + od);
		// setup generic listener for controls other than
		// preferences link
		Listener genericListener = new Listener() {

			@Override
			public void handleEvent(Event event) {
				boolean isValid = validatePage();
				log.debug("genericListener event handler fired. Is valid = "
						+ isValid);
				setPageComplete(validatePage());

			}
		};

		objectNameText.addListener(SWT.Modify, genericListener);
		objectURIText.addListener(SWT.Modify, genericListener);
		repoStatusLabel.addListener(SWT.Modify, genericListener);

		validatePage();
		setControl(composite);

	}

	protected boolean validatePage() {
		boolean isValid = true;

		boolean nameOK = (objectNameText.getText().length() > 0);
		if (nameOK) {
			objectNameControlDecoration.hide();
		} else {
			objectNameControlDecoration.show();
		}
		isValid &= nameOK;

		boolean validURI = isURIInputValid();
		if (validURI) {
			uriControlDecoration.hide();
		} else {
			uriControlDecoration.show();
		}
		isValid &= validURI;

		isValid &= (searchTypeCombo.getSelectionIndex() > -1);

		log.debug("Validating page - IsValid: " + isValid + " File: " + fileOK
				+ " Repo: " + repoOK + " Combo: "
				+ (searchTypeCombo.getSelectionIndex() > -1));

		setPageComplete(isValid);
		return isValid;
	}

	public void updateRepo() {
		repoStatusLabel.setText("Trying to connect to repository...");

		Display.getCurrent().asyncExec(new Runnable() {
			public void run() {
				repo = Activator.getDefault().getRepository();
				if (repo != null) {
					repoStatusLabel.setText("Connected to repo at: "
							+ repo.getRepositoryURI());
					repoOK = true;
				} else {
					repoStatusLabel.setText("Cannot connect to repository");
					repoOK = false;
				}
			}

		});

		validatePage();

	}

	public void getODFromOWLSFile() {
		// switch off error decorator while we get info from file
		// will be turned back on by validatePage() when the async
		// job finishes.
		uriControlDecoration.hide();

		Display.getCurrent().asyncExec(new Runnable() {
			public void run() {
				String xmlbase;
				try {
					xmlbase = AliveRepoManagerHook
							.getBaseURIFromOntFile(theFile.getContents());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					xmlbase = null;
					e.printStackTrace();
				}
				log.debug("about to try and set object URI");
				if (xmlbase != null) {
					objectURIText.setText(xmlbase);
				} else {
					objectURIText
							.setText("Can't get ontology base URI from file");
					fileOK = false;
				}

				// try and populate an object descriptor from an
				// owl-s service description
				OWLOntology serviceOnt = null;

				Activator.getDefault().getDefaultOWLKB();
				OWLKnowledgeBase kb = OWLFactory.createKB();

				try {
					serviceOnt = kb.read(theFile.getContents(), URIUtils
							.createURI("http://example.com/services"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					objectURIText.setText("Error reading service description");
					fileOK = false;
					e.printStackTrace();
					return;
				} catch (CoreException e) {
					objectURIText.setText("Error reading service description");
					fileOK = false;
					e.printStackTrace();
					return;
				}

				// String ontologyURI = serviceOnt.getURI().toString();
				// objectURIText.setText(ontologyURI);
				String ontServiceName = null;
				String ontServiceDescription = null;
				URI ontServiceURI = null;

				OWLIndividualList<Service> serviceList = serviceOnt
						.getServices(true);
				log.debug("Service count: " + serviceList.size());
				for (Service aService : serviceList) {
					ontServiceURI = aService.getURI();
					ontServiceDescription = aService.getProfile()
							.getTextDescription();
					ontServiceName = aService.getProfile().getServiceName();
				}

				log.debug("Service URI: " + ontServiceURI.toString());
				log.debug("Service name: " + ontServiceName);
				log.debug("Service description: " + ontServiceDescription);

				if (ontServiceName != null) {
					objectNameText.setText(ontServiceName);
				} else {
					objectNameText.setText(ontServiceURI.getFragment());
				}

				if (ontServiceDescription != null) {
					objectDescriptionText.setText(ontServiceDescription);
				} else {
					objectDescriptionText.setText(ontServiceURI.getFragment());
				}

				log.debug("Finished reading OWL-S file");
				fileOK = true;
				validatePage();
			}

		});
	}

	private boolean isURIInRepo() {
		if (repo == null) {
			repoOK = false;
			return false;
		} else {
			ObjectDescriptor testOD = null;
			try {
				testOD = repo.fetchObjectDescriptor(new URI(objectURIText
						.getText()));
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (javax.xml.ws.soap.SOAPFaultException re) {
				log.debug("URI not found in repo");
				return false;
			}
			if (testOD != null) {
				log.debug("URI exists in Repo - "
						+ testOD.getOwnerURI().toString());
				return true;
			} else if (testOD == null && repo != null) {
				log.debug("URI is not in Repo - "
						+ repo.getRepositoryURI().toString());
				return false;
			}

			return false;
		}
	}

	public ObjectDescriptor gatherObjectData() {
		log.debug("gathering object data");
		ObjectDescriptor newOD = new ObjectDescriptor();
		newOD.setDescription(objectDescriptionText.getText());
		newOD.setLabel(objectNameText.getText());

		try {
			newOD.setUri(new URI(objectURIText.getText()));
			newOD.setOwnerURI(new URI(OWNERURISTRING));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("Malformed object URI in text box / owner URI");
			return null;
		}

		if (theFile.getFileExtension().contains("owl")) {
			newOD.setMimeType(OWLMIMETYPESTRING);
		} else if (theFile.getFileExtension().contains("adaptor")) {
			newOD.setMimeType(ADAPTORMIMETYPE);
		} else {
			newOD.setMimeType(GENERICMIMETYPESTRING);
		}

		newOD
				.setSection(sectionInfos[searchTypeCombo.getSelectionIndex()].section);

		newOD.setRepositoryURI(repo.getRepositoryURI());

		String b64Contents = null;
		// do base-64 encode of file contents
		try {
			b64Contents = encodeFileContents(theFile.getContents());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Base64 encoding failed with CoreException");
			b64Contents = null;
		}
		if (newOD != null && b64Contents != null) {
			log.debug("Created descriptor from file....");
			log.debug("od.label: " + newOD.getLabel());
			log.debug(newOD.getDescription());
			log.debug(newOD.getOwnerURI().toString());
			log.debug(newOD.getRepositoryURI().toString());
			log.debug(newOD.getMimeType());
			log.debug(newOD.getSection());

			// write to class variables

			b64Publish = b64Contents;
		} else {

			log.debug("Failed to gather object descriptor from file");

		}

		return newOD;
	}

	private String encodeFileContents(InputStream inStream) {
		String b64Contents = null;

		b64Contents = ClientUtils.encodeFromStream(inStream);
		log.debug("base64 encoding: " + b64Contents.substring(0, 64));

		// TODO Auto-generated catch block
		b64Publish = b64Contents;
		return b64Contents;
	}

	protected boolean storeInRepo(ObjectDescriptor od, String b64String) {

		URI objectURI = od.getUri();
		URI ownerURI = od.getOwnerURI();
		String section = od.getSection();
		String label = od.getLabel();
		String description = od.getDescription();
		String mimeType = od.getMimeType();
		String dh = b64String;

		ObjectDescriptor returnOD = null;
		try {
			returnOD = repo.storeObject(objectURI, ownerURI, section, label,
					description, mimeType, dh);
		} catch (RuntimeException re) {
			re.printStackTrace();
			throw re;
		}

		log.debug("Attempted to store in repo");
		log.debug(returnOD.getDescription());
		log.debug(returnOD.getOwnerURI().toString());
		log.debug(returnOD.getRepositoryURI().toString());
		log.debug(returnOD.getResourceURL().toString());
		log.debug(returnOD.getUri().toString());
		log.debug(returnOD.getMimeType());
		log.debug(returnOD.getSection());
		log.debug("--------------------------------------------");

		return (returnOD != null);
	}

	private boolean isURIInputValid() {

		String inputText = objectURIText.getText();
		if (inputText == null || inputText.length() == 0)
			return false;

		try {
			URI testURI = new URI(inputText);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	/**
	 * Should this resource be kept in sync
	 * 
	 * @return
	 */
	public boolean keepSynced() {

		return true;
	}

}
