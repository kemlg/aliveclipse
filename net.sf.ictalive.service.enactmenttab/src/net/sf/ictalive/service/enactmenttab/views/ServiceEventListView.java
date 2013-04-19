package net.sf.ictalive.service.enactmenttab.views;

import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.ictalive.service.enactment.simpleevents.ServiceFailedEvent;
import net.sf.ictalive.service.enactment.simpleevents.ServiceSuccessEvent;
import net.sf.ictalive.service.enactment.simpleevents.SimpleEnactmentEvent;
import net.sf.ictalive.service.enactmenttab.Activator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.service.Service;


/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class ServiceEventListView extends ViewPart {

	Action refreshAction;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "eu.istalive.serviceide.enactment.views.ServiceEventListView";

	private TableViewer viewer;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return Activator.getDefault().getServiceEventProvider()
					.getAllEnactmentEvents().toArray();
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			SimpleEnactmentEvent see = (SimpleEnactmentEvent) obj;
			switch (index) {
			case STATUS_COL:
				break;
			case DATE_COL:
				return see.getDateStarted().toString();
			case SERVICE_COL: {
				Service svc = Activator.getDefault().getServiceRepository()
						.getServiceFromURI(see.getService());
				if (svc != null) {
					return svc.getName();
				} else {
					return see.getService().toString();
				}
			}
			case PROCESS_COL: {
				Process proc = Activator.getDefault().getOwlKB().getProcess(
						see.getProcess());

				if (proc != null) {
					return proc.getName();
				} else {
					return see.getProcess().toString();
				}
			}
			case STATUSTXT_COL: {
				Service svc = Activator.getDefault().getServiceRepository()
						.getServiceFromURI(see.getService());
				if (svc != null) {
					return see.getStatusMessage();
				}
			}

			case INPUTS_COL: {
				Map<URI, String> inputs = see.getInputs();

				if (inputs != null) {
					Process proc = Activator.getDefault().getOwlKB()
							.getProcess(see.getProcess());
					if (proc != null)
						return paramListToString(proc, inputs);
					else {
						return inputs.toString();
					}
				} else {
					return "<none>";

				}

			}
			case OUTPUTS_COL:
				if (see instanceof ServiceSuccessEvent) {
					Map<URI, String> outputs = ((ServiceSuccessEvent) see)
							.getOutputs();
					if (outputs != null) {
						Process proc = Activator.getDefault().getOwlKB()
								.getProcess(see.getProcess());
						if (proc != null)
							return paramListToString(proc, outputs);
						else
							return outputs.toString();

					} else
						return "<none>";
				} else if (see instanceof ServiceFailedEvent) {
					return ((ServiceFailedEvent) see).getStatusMessage();

				}
			default:
				return getText(obj);
			}
			return "";
		}

		public String paramListToString(Process process, Map<URI, String> params) {
			Iterator<Entry<URI, String>> iterator = params.entrySet()
					.iterator();
			String paramValues = "";
			while (iterator.hasNext()) {
				Entry<URI, String> value = iterator.next();
				String paramName;
				Parameter param = process.getInput(value.getKey().toString());
				if (param == null)
					param = process.getOutput(value.getKey().toString());
				if (param != null) {
					paramName = param.getLocalName();
				} else {
					paramName = value.getKey().toString();
				}
				paramValues += paramName + "=> " + value.getValue() + "\n";

			}
			return paramValues;
		}

		public Image getColumnImage(Object obj, int index) {
			SimpleEnactmentEvent see = (SimpleEnactmentEvent) obj;
			if (index == STATUS_COL) {
				if (see instanceof ServiceSuccessEvent) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_INFO_TSK);
				} else if (see instanceof ServiceFailedEvent) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				} else {
					return null;
				}
			} else
				return null;
		}

	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public ServiceEventListView() {
	}

	public static final int STATUS_COL = 0;
	public static final int DATE_COL = 1;
	public static final int SERVICE_COL = 2;
	public static final int PROCESS_COL = 3;
	public static final int STATUSTXT_COL = 4;
	public static final int INPUTS_COL = 5;
	public static final int OUTPUTS_COL = 6;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);

		TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("!");
		col.getColumn().setWidth(40);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Date");
		col.getColumn().setWidth(200);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Service");
		col.getColumn().setWidth(150);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Process");
		col.getColumn().setWidth(150);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Status");
		col.getColumn().setWidth(200);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Inputs");
		col.getColumn().setWidth(200);
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setText("Outputs");
		col.getColumn().setWidth(200);

		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);

		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
				"alive_service_enactment_tab.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ServiceEventListView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());

		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {

	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(refreshAction);
	}

	private void fillLocalToolBar(IToolBarManager manager) {

	}

	private void makeActions() {
		refreshAction = new Action() {
			public void run() {
				Activator.getDefault().loadEvents();

				showMessage("Refreshed event list, found "
						+ Activator.getDefault().getServiceEventProvider()
								.getEvents().size() + " events");
			}
		};
		refreshAction.setText("Refresh Event List");
		refreshAction.setToolTipText("Action 1 tooltip");
		refreshAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						ISharedImages.IMG_OBJS_INFO_TSK));

	}

	private void hookDoubleClickAction() {

	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Service Event List", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public TableViewer getServiceViewer() {
		return viewer;
	}
}