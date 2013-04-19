package net.sf.ictalive.service.matchmakertab.views;

import java.io.StringWriter;

import net.sf.ictalive.service.matchmakertab.Activator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import agents.ServicePrefs;
import agents.ws.MatchMakerWS.MatchResult;
import edu.bath.matchmaker.ServiceDescriptor;

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

public class MatchMakerTestView extends ViewPart {

	Action doubleClickAction;
	Action doubleClickResultAction;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.ictalive.service.matchmakertab.views.MatchMakerTestView";

	private TableViewer viewer;

	private TableViewer resultViewer;

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
			// this needs to be populated with queries
			// return new String[] { "One", "Two", "Three" };

			boolean useDummy = Activator.getDefault().usingDummyServices();

			ServiceDescriptor[] services;
			if (useDummy) {
				services = new ServiceDescriptor[20];
				for (int i = 0; i < services.length; i++) {
					services[i] = Activator.getDefault().createDummyService();
				}
			} else {
				services = new ServiceDescriptor[] {};
			}
			return services;
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	class ResultViewContentProvider implements IStructuredContentProvider {

		String query;

		public ResultViewContentProvider(String q) {
			query = q;
		}

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			// query the web service to get the results of matches
			// this needs to be updated to use the real matchmaker, not
			// the web service, until that has been updated.
			if (query != null) {
				try {
					return Activator.getDefault().getMatchMakerWebService()
							.performMatch(query, ServicePrefs.DEFAULT, 5);

				} catch (Exception ex) {
					ex.printStackTrace();
					return new Object[] { ex };
				}
			} else {
				return new Object[] { "No Query" };
			}
		}
	}

	class ResultViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			//
			if (obj instanceof MatchResult) {

				MatchResult mr = (MatchResult) obj;
				return mr.getService().toString();

			} else {
				return getText(obj);
			}
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * The constructor.
	 */
	public MatchMakerTestView() {
	}

	public void setQueryServiceDescriptors(ServiceDescriptor[] sd) {

	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// create viewer for results
		resultViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		resultViewer.setContentProvider(new ResultViewContentProvider(null));
		resultViewer.setLabelProvider(new ResultViewLabelProvider());
		resultViewer.setSorter(new NameSorter());
		resultViewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
				"net.sf.ictalive.service.matchmakertab.viewer");
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
				MatchMakerTestView.this.fillContextMenu(manager);
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

		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {

	}

	private void makeActions() {

		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				// showMessage("Double-click detected on "+obj.toString());

				ServiceDescriptor selected = (ServiceDescriptor) obj;

				StringWriter sw = new StringWriter();
				selected.toOwls("").getOntology().write(sw, null);
				String query = sw.toString();
				//System.out.println("QUERY: " + query);
				// update the query data provider with the new query
				resultViewer.setContentProvider(new ResultViewContentProvider(
						query));
			}
		};

		doubleClickResultAction = new Action() {
			public void run() {
				ISelection selection = resultViewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				if (obj instanceof MatchResult) {

					MatchResult mr = (MatchResult) obj;

					showMessage("Match Result: " + mr.getService().toString()
							+ "\nNeed to query URI for more information...");

				}

			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});

		resultViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent arg0) {
				doubleClickResultAction.run();

			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"MatchmakerTestView", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}