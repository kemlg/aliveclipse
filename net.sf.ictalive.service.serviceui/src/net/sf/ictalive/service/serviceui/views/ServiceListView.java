package net.sf.ictalive.service.serviceui.views;

import java.util.Collection;

import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.svcrepo.RepositoryListener;
import net.sf.ictalive.svcrepo.ServiceRepository;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.mindswap.owls.service.Service;

/**
 * Lists known services in the alive project
 */

public class ServiceListView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "eu.istalive.serviceide.enactment.views.ServiceEventListView";

	Collection<Service> services;

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);

	}

	private TableViewer serviceViewer;

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
			return services.toArray(new Object[] {});
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			switch (index) {
			case 0:
				return ((Service) obj).getURI().toASCIIString();
			case 1:
				return ((Service) obj).getName();
			default:
				return "?";
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

	class NameSorter extends ViewerSorter {

	}

	/**
	 * The constructor.
	 */
	public ServiceListView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		serviceViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		serviceViewer.setContentProvider(new ViewContentProvider());
		serviceViewer.setLabelProvider(new ViewLabelProvider());
		serviceViewer.setSorter(new NameSorter());
		serviceViewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(
				serviceViewer.getControl(),
				"alive_service_enactment_tab.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		getSite().setSelectionProvider(serviceViewer);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ServiceListView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(serviceViewer.getControl());
		serviceViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, serviceViewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(new Separator());
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
	}

	private void makeActions() {
	}

	private void hookDoubleClickAction() {
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(serviceViewer.getControl().getShell(),
				"Service View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		serviceViewer.getControl().setFocus();
	}

	public TableViewer getServiceViewer() {
		return serviceViewer;
	}
}