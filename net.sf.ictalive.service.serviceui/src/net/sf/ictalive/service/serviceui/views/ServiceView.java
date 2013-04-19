package net.sf.ictalive.service.serviceui.views;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLWriter;
import org.mindswap.owls.grounding.Grounding;
import org.mindswap.owls.grounding.WSDLAtomicGrounding;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.service.Service;

/**
 * View part for showing details of a service
 * 
 * @author occ
 * 
 */
public class ServiceView extends ViewPart implements ISelectionListener {

	CTabFolder topTab;
	Text textWidget;
	Text sourceWidget;
	Label serviceNameLabel;
	Label serviceURILabel;

	TableViewer inputsList;
	TableViewer outputsList;
	TableViewer precondList;
	TableViewer resultList;

	Action openWSDLAction;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "eu.istalive.serviceide.enactment.views.ServiceView";

	public ServiceView() {
	}

	Service selectedService;

	public Service getSelectedService() {
		return selectedService;
	}

	public void setSelectedService(Service selectedService) {
		this.selectedService = selectedService;
		updateServiceSelection();
		if (topTab == null)
			return; // don't run if view not initialized

		if (selectedService != null) {
			openWSDLAction.setEnabled(true);
		} else {
			openWSDLAction.setEnabled(false);

		}

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			Service svc = null;
			if (first instanceof Service) {
				svc = (Service) first;
			} else if (first instanceof IAdaptable) {
				svc = (Service) ((IAdaptable) first).getAdapter(Service.class);
			}
			if (svc != null) {
				setSelectedService(svc);

			}
		}

	}

	public class OWLSInputsContentProvider implements
			IStructuredContentProvider {
		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getElements(Object arg0) {
			System.out.println("Updating service elements");
			if (selectedService != null) {
				return selectedService.getProcess().getInputs().toArray();
			}
			return new Object[] {};
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

	}

	public static final int COL_PARAM_NAME = 0;
	public static final int COL_PARAM_TYPE = 1;

	public class OWLSParamLabelProvder extends LabelProvider implements
			ITableLabelProvider {

		@Override
		public Image getColumnImage(Object arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getColumnText(Object input, int column) {
			if (input != null && input instanceof Parameter) {
				Parameter p = (Parameter) input;
				if (column == COL_PARAM_NAME)
					return p.getLocalName();
				else if (column == COL_PARAM_TYPE) {
					return p.getParamType().getURI().toString();
				}
			}
			return null;
		}

	}

	public class OWLIndividualLabelProvder extends LabelProvider implements
			ITableLabelProvider {

		@Override
		public Image getColumnImage(Object arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getColumnText(Object input, int column) {
			if (input != null && input instanceof OWLIndividual) {
				return ((OWLIndividual) input).toString();
			}
			return "";
		}

	}

	public class OWLSOutputsContentProvider implements
			IStructuredContentProvider {
		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getElements(Object arg0) {
			System.out.println("Updating service elements");
			if (selectedService != null) {
				return selectedService.getProcess().getOutputs().toArray();
			}
			return new Object[] {};
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

	}

	public class ConditionContentProvider implements IStructuredContentProvider {
		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getElements(Object parent) {
			if (selectedService != null) {
				System.out.println("Updating preconditions");
				Process proc = selectedService.getProcess();
				if (proc != null) {
					return selectedService.getProfile().getConditions()
							.toArray(new OWLIndividual[] {});
				}
			}
			return new OWLIndividual[] {};
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

	}

	public class ResultContentProvider implements IStructuredContentProvider {
		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getElements(Object parent) {
			if (selectedService != null) {
				Process proc = selectedService.getProcess();
				if (proc != null) {
					return new OWLIndividual[] { proc.getResult() };

				}
			}
			return new Object[] {};
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

	}

	public void updateServiceSelection() {
		if (selectedService == null) {
		} else {
			OWLWriter owlw = selectedService.getOntology().getWriter();
			StringWriter sw = new StringWriter();
			selectedService.getOntology().write(sw, selectedService.getURI());

			sourceWidget.setText(sw.toString());
			inputsList.refresh(true, true);
			outputsList.refresh(true, true);
			precondList.refresh();
			resultList.refresh(true, true);

			Process proc = selectedService.getProcess();
			if (proc != null) {
				if (proc.getInputs() != null && proc.getInputs().size() > 0) {
					inputsItem.setExpanded(true);
				} else {
					inputsItem.setExpanded(false);

				}
				if (proc.getOutputs() != null && proc.getOutputs().size() > 0) {
					outputsItem.setExpanded(true);
				} else {
					outputsItem.setExpanded(false);
				}

				if (proc.getConditions() != null
						&& proc.getConditions().size() > 0) {
					precondItem.setExpanded(true);
				} else {
					precondItem.setExpanded(false);
				}
				if (proc.getResults() != null && proc.getResults().size() > 0) {
					resultItem.setExpanded(true);
				} else {
					resultItem.setExpanded(false);
				}
			}
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		makeActions();

		topTab = new CTabFolder(parent, SWT.TOP);
		topTab.setBorderVisible(true);
		topTab.setLayoutData(new GridData(GridData.FILL_BOTH));
		topTab.setSize(640, 480);

		// topTab.setSimple(false);
		topTab.setTabPosition(SWT.BOTTOM);

		CTabItem serviceInfoTab = new CTabItem(topTab, SWT.NULL);
		serviceInfoTab.setText("Service Info");

		ScrolledComposite sc = new ScrolledComposite(topTab, SWT.V_SCROLL
				| SWT.BORDER);
		// sc.setLayout(new FillLayout());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		Composite serviceInfoComp = new Composite(sc, SWT.NONE);
		serviceInfoComp.setLayout(new FillLayout(SWT.VERTICAL));
		// Label text = new Label(serviceInfoComp, SWT.NULL);
		// text.setText("Service information goes here");
		ExpandBar iopes = new ExpandBar(serviceInfoComp, SWT.NULL);

		serviceInfoTab.setControl(sc);
		sc.setContent(serviceInfoComp);

		// /**** INPUTS
		inputsList = new TableViewer(iopes);

		TableViewerColumn col = new TableViewerColumn(inputsList, SWT.NONE);
		col.getColumn().setText("Name");
		col.getColumn().setWidth(100);

		col = new TableViewerColumn(inputsList, SWT.NONE);
		col.getColumn().setText("Type");
		col.getColumn().setWidth(150);

		inputsList.setContentProvider(new OWLSInputsContentProvider());
		inputsList.setLabelProvider(new OWLSParamLabelProvder());
		inputsList.getTable().setHeaderVisible(true);
		inputsList.getTable().setLinesVisible(true);
		inputsList.setInput(getViewSite());

		inputsItem = new ExpandItem(iopes, SWT.NULL);
		inputsItem.setHeight(75);
		inputsItem.setText("Inputs");
		inputsItem.setExpanded(true);
		inputsItem.setControl(inputsList.getControl());

		// **** OUTPUTS
		outputsList = new TableViewer(iopes);
		col = new TableViewerColumn(outputsList, SWT.NONE);
		col.getColumn().setText("Name");
		col.getColumn().setWidth(100);

		col = new TableViewerColumn(outputsList, SWT.NONE);
		col.getColumn().setText("Type");
		col.getColumn().setWidth(150);

		outputsList.setContentProvider(new OWLSOutputsContentProvider());
		outputsList.setLabelProvider(new OWLSParamLabelProvder());
		outputsList.getTable().setHeaderVisible(true);
		outputsList.getTable().setLinesVisible(true);
		outputsList.setInput(getViewSite());

		outputsItem = new ExpandItem(iopes, SWT.NULL);
		outputsItem.setHeight(75);
		outputsItem.setText("Outputs");
		outputsItem.setExpanded(true);
		outputsItem.setControl(outputsList.getControl());

		precondList = new TableViewer(iopes);
		precondList.setContentProvider(new ConditionContentProvider());
		precondList.setLabelProvider(new OWLIndividualLabelProvder());
		precondList.setInput(getViewSite());

		precondItem = new ExpandItem(iopes, SWT.NULL);
		precondItem.setHeight(75);
		precondItem.setText("Preconditions");
		precondItem.setExpanded(true);
		precondItem.setControl(precondList.getControl());

		resultList = new TableViewer(iopes);
		resultList.setContentProvider(new ResultContentProvider());
		resultList.setLabelProvider(new OWLIndividualLabelProvder());
		resultList.setInput(getViewSite());
		resultItem = new ExpandItem(iopes, SWT.NULL);
		resultItem.setHeight(75);
		resultItem.setText("Results");
		resultItem.setExpanded(true);
		resultItem.setControl(resultList.getControl());

		// Source
		Composite serviceSource = new Composite(topTab, SWT.NULL);
		serviceSource.setLayout(new FillLayout());
		CTabItem serviceSourceTab = new CTabItem(topTab, SWT.NULL);
		serviceSourceTab.setText("Service Source");
		serviceSourceTab.setControl(serviceSource);
		sourceWidget = new Text(serviceSource, SWT.MULTI);
		sourceWidget.setText("Source goes here");
		sourceWidget.setEditable(false);
		serviceInfoComp.pack();
		sc.setMinSize(serviceInfoComp.getSize());

		hookContextMenu();
		contributeToActionBars();

		updateServiceSelection();
		hookSelectionListener();
		getViewSite().getPage().addSelectionListener(this);

	}

	ISelectionListener serviceSelectionListener;
	private ExpandItem inputsItem;
	private ExpandItem outputsItem;
	private ExpandItem resultItem;
	private ExpandItem precondItem;

	private void hookSelectionListener() {
		serviceSelectionListener = new ISelectionListener() {
			@Override
			public void selectionChanged(IWorkbenchPart source, ISelection sel) {
				if (source != ServiceView.this
						&& sel instanceof IStructuredSelection) {
					IStructuredSelection isel = (IStructuredSelection) sel;
					Object obj = isel.getFirstElement();
					if (obj != null && obj instanceof Service) {
						setSelectedService((Service) obj);
					}
				}
			}
		};
		getSite().getPage().addPostSelectionListener(serviceSelectionListener);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ServiceView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(inputsList.getControl());

		inputsList.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, inputsList);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {

	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(openWSDLAction);

	}

	private void fillLocalToolBar(IToolBarManager manager) {
	}

	private void makeActions() {
		openWSDLAction = new Action() {
			@Override
			public void run() {
				System.err.println("starting");
				if (selectedService == null) {
					System.err.println("no selection");
					return;
				}
				Grounding gnd = selectedService.getGrounding();
				if (gnd == null) {
					System.err.println("no grounding");
					return;

				}
				if (!(selectedService.getProcess() instanceof AtomicProcess)) {
					System.err.println("core process is not atomic");
				}
				AtomicProcess ap = (AtomicProcess) selectedService.getProcess();
				if (!(ap.getGrounding() instanceof WSDLAtomicGrounding)) {
					System.err.println("grounding not WSDL");

				}
				WSDLAtomicGrounding wsdlgrounding = (WSDLAtomicGrounding) ap
						.getGrounding();
				URI wsdlURI = wsdlgrounding.getWSDL();
				if (wsdlURI == null)
					return;
				try {
					System.err.println("opening " + wsdlURI);
					File tmpfile = File.createTempFile("wsdl-alive", ".wsdl");
					URLConnection conn = new URL(wsdlURI.toString())
							.openConnection();
					DataInputStream dis = new DataInputStream(conn
							.getInputStream());
					PrintWriter pw = new PrintWriter(tmpfile);
					String line;
					while (null != (line = dis.readLine())) {
						pw.println(line);
					}

					pw.flush();
					pw.close();
					IFileStore fileStore = EFS.getLocalFileSystem().getStore(
							tmpfile.toURI());
					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IDE.openEditorOnFileStore(page, fileStore);

				} catch (IOException ioe) {
					System.err.print(ioe);
				}

				catch (PartInitException e) {
					// Put your exception handler here if you wish to
				}

			}
		};
		openWSDLAction.setText("Open WSDL");

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}

}