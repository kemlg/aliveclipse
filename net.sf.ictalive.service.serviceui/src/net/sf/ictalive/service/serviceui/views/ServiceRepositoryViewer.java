package net.sf.ictalive.service.serviceui.views;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectListResult;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.serviceui.Activator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
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
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

public class ServiceRepositoryViewer extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.ictalive.service.serviceui.views.ServiceView";
	Logger log = LoggerFactory.getLogger(ServiceRepositoryViewer.class);
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action showAction;
	private Action openServiceAction;
	RepoSection rootNode;
	IRunnableWithProgress currentUpdate;

	private Action updateRepositoryAction;

	abstract class ObjectDescription implements IAdaptable {
		private RepoSection parent;

		public ObjectDescription(RepoSection parent) {
			this.parent = parent;
			if (null != parent)
				parent.children.add(this);
		}

		public abstract String getName();

		public void setParent(RepoSection parent) {
			this.parent = parent;
		}

		public RepoSection getParent() {
			return parent;
		}

		public String toString() {
			return getName();
		}

		public Object getAdapter(Class key) {
			return null;
		}
	}

	class RepoSection extends ObjectDescription {

		String section;
		List<ObjectDescription> children = new LinkedList<ObjectDescription>();

		public RepoSection(RepoSection parent, String section) {
			super(parent);
			this.section = section;

		}

		@Override
		public String getName() {
			return section;
		}

		ObjectDescription[] getChildren() {
			if (children == null) {
				List<ObjectDescription> children = new ArrayList<ObjectDescription>();
				for (ObjectDescriptor od : objectDescriptors.get(section)) {
					ObjectDescription childr = new RepoObject(this, od);
					children.add(childr);
				}

				this.children = children;
			}
			return children.toArray(new ObjectDescription[0]);
		}

		boolean hasChildren() {
			return children != null && children.size() > 0;
		}

	}

	class RepoObject extends ObjectDescription implements IAdaptable {
		ObjectDescriptor descriptor;

		public ObjectDescriptor getDescriptor() {
			return descriptor;
		}

		public RepoObject(RepoSection parent, ObjectDescriptor descriptor) {
			super(parent);
			this.descriptor = descriptor;
		}

		@Override
		public String getName() {
			return descriptor.getLabel();
		}

		@Override
		public Object getAdapter(Class key) {
			if (key.equals(ObjectDescriptor.class))
				return descriptor;
			else
				return null;
		}

		@Override
		public String toString() {
			return descriptor.getLabel() + " : " + descriptor.getUri();
		}
	}

	class ViewContentProvider implements IStructuredContentProvider,
			ITreeContentProvider {

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		@Override
		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (rootNode != null)
					return new Object[] { rootNode };
				else
					return new Object[0];
			}
			return getChildren(parent);
		}

		@Override
		public Object getParent(Object child) {
			if (child instanceof ObjectDescription) {
				return ((ObjectDescription) child).getParent();
			}
			return null;
		}

		@Override
		public Object[] getChildren(Object parent) {
			if (parent instanceof RepoSection) {
				return ((RepoSection) parent).getChildren();
			}
			return new Object[0];
		}

		@Override
		public boolean hasChildren(Object parent) {
			if (parent instanceof RepoSection)
				return ((RepoSection) parent).hasChildren();
			return false;
		}

	}

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}

		public Image getImage(Object obj) {

			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			if (obj instanceof RepoSection)
				imageKey = ISharedImages.IMG_OBJ_FOLDER;
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					imageKey);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public ServiceRepositoryViewer() {

	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		viewer.setAutoExpandLevel(1);

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
				"net.sf.ictalive.service.serviceui.viewer");
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
				ServiceRepositoryViewer.this.fillContextMenu(manager);
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
		manager.add(showAction);
		manager.add(new Separator());
		// manager.add(editAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(showAction);
		// manager.add(editAction);
		// manager.add(updateRepositoryAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(showAction);
		// manager.add(editAction);
		manager.add(updateRepositoryAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		showAction = new Action() {
			public void run() {

				ISelection selection = viewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection sel = (IStructuredSelection) selection;
					Object o = sel.getFirstElement();
					if (o instanceof RepoObject) {
						RepoObject ro = (RepoObject) o;
						log.debug("showing repo object {}", ro.getDescriptor());

						ObjectDescriptor od = ro.getDescriptor();
						try {
							Service svc = Activator.getDefault()
									.getDefaultOWLKB().readService(
											od.getResourceURL().toURL()
													.openStream(), od.getUri());

							log.debug("Loaded service {} ", svc);
						} catch (IOException e) {
							log.error("Couldn't load service {} : {} ", ro
									.getDescriptor(), e);
						}
					}
				}
			}
		};
		showAction.setText("Show");
		showAction.setToolTipText("Show entry");
		showAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						ISharedImages.IMG_OBJS_INFO_TSK));

		// editAction = new Action() {
		// public void run() {
		// showMessage("Action 2 executed");
		// }
		// };
		// editAction.setText("Edit entry");
		// editAction.setToolTipText("Edit Service Repository Entry");
		// editAction.setImageDescriptor(PlatformUI.getWorkbench()
		// .getSharedImages().getImageDescriptor(
		// ISharedImages.IMG_OBJS_INFO_TSK));

		updateRepositoryAction = new Action() {
			@Override
			public void run() {
				if (currentUpdate != null)
					return;

				log.debug("starting repo update");
				updateRepository();
				//
				// IRunnableWithProgress prog = new IRunnableWithProgress() {
				//
				// @Override
				// public void run(IProgressMonitor monitor)
				// throws InvocationTargetException,
				// InterruptedException {
				// log.debug("running update");
				// currentUpdate = null;
				// monitor.done();
				// }
				// };
				// try {
				// Activator.getDefault().getWorkbench().getProgressService()
				// .run(true, false, prog);
				// } catch (Exception e) {
				// log.error("Couln't update repo", e);
				// }
				// currentUpdate = prog;
			}
		};
		updateRepositoryAction.setText("Refresh");
		updateRepositoryAction.setToolTipText("Refresh view");
		updateRepositoryAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_TOOL_UP));

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				updateActionEnablement();
			}
		});
	}

	void updateActionEnablement() {
		IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
		if (sel == null || sel.isEmpty()) {
			showAction.setEnabled(false);
		} else {
			showAction.setEnabled(true);
		}
	}

	void updateRepository() {
		log.debug("repository updating");
		ObjectRepository repo = Activator.getDefault().getRepository();
		if (repo == null) {
			log.error("Couldn't get repository");
			return;
		}
		ObjectListResult descriptors = repo.listAll(null);
		if (descriptors != null) {
			log.error("got {} objects from repository ", descriptors
					.getObjects().size());

			setObjectDescriptors(descriptors.getObjects());
		}
	}

	Map<String, SortedSet<ObjectDescriptor>> objectDescriptors = new HashMap<String, SortedSet<ObjectDescriptor>>();

	protected void setObjectDescriptors(List<ObjectDescriptor> objects) {

		Map<String, SortedSet<ObjectDescriptor>> objs = new HashMap<String, SortedSet<ObjectDescriptor>>();
		for (ObjectDescriptor od : objects) {
			SortedSet<ObjectDescriptor> section = objs.get(od.getSection());
			if (null == section)
				objs.put(od.getSection(),
						section = new TreeSet<ObjectDescriptor>(
								new Comparator<ObjectDescriptor>() {
									@Override
									public int compare(ObjectDescriptor o1,
											ObjectDescriptor o2) {
										int cmp = o1.getLabel().compareTo(
												o2.getLabel());
										if (cmp == 0)
											return o1.getUri().compareTo(
													o2.getUri());
										else
											return cmp;
									}
								}));

			section.add(od);

		}
		objectDescriptors = objs;

		RepoSection root = new RepoSection(null, "repo");
		for (Entry<String, SortedSet<ObjectDescriptor>> e : objs.entrySet()) {
			RepoSection reposection = new RepoSection(root, e.getKey());

			for (ObjectDescriptor od : e.getValue()) {
				RepoObject ro = new RepoObject(reposection, od);
			}
		}
		rootNode = root;
		viewer.refresh();
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				showAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Service View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}