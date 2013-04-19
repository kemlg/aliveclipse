package net.sf.ictalive.service.serviceui.views;

import impl.jena.OWLKnowledgeBaseImpl;

import java.util.ArrayList;

import net.sf.ictalive.service.serviceui.Activator;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.expression.Condition;
import org.mindswap.owls.grounding.Grounding;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;

import com.hp.hpl.jena.rdf.listeners.ObjectListener;

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

public class KBView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.ictalive.service.serviceui.views.KBView";

	TreeSection ontologies;
	TreeSection services;
	TreeSection individuals;

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action refreshViewAction;
	private Action openServiceAction;

	class ServiceProcessNode extends TreeBase<ServiceObjectNode, TreeBase>
			implements IAdaptable {
		Process proc;

		public ServiceProcessNode(ServiceObjectNode parent, Process proc) {
			super(parent);
			this.proc = proc;
		}

		@Override
		public String getName() {
			return proc.getLocalName();
		}

		@Override
		public Object getAdapter(Class adapter) {
			if (adapter.equals(Process.class))
				return proc;
			if (adapter.equals(Service.class))
				return proc.getService();
			return null;
		}

	}

	class ServiceParameterNode extends TreeBase<TreeBase, TreeBase> {
		Parameter param;

		public ServiceParameterNode(TreeBase parent, Parameter param) {
			super(parent);
			this.param = param;
		}

		@Override
		public String getName() {
			return param.getLocalName() + " : " + param.getParamType();
		}

		boolean isInput() {
			return param.canCastTo(Input.class);
		}

	}

	class ServicePreconditionNode extends TreeBase<TreeBase, TreeBase> {
		Condition cond;

		public ServicePreconditionNode(TreeBase parent, Condition condition) {
			super(parent);
			this.cond = condition;
		}

		@Override
		public String getName() {
			return cond.toPrettyString();
		}

	}

	class ServiceGrounding extends TreeBase<ServiceObjectNode, TreeBase> {
		Grounding gnd;

		public ServiceGrounding(ServiceObjectNode parent, Grounding gnd) {
			super(parent);
			this.gnd = gnd;
		}

		@Override
		public String getName() {
			return gnd.getLocalName();
		}

	}

	class ServiceProfile extends TreeBase<ServiceObjectNode, TreeBase> {
		Profile prof;

		public ServiceProfile(ServiceObjectNode parent, Profile prof) {
			super(parent);
			this.prof = prof;
		}

		@Override
		public String getName() {
			return prof.getLocalName();
		}

	}

	class ServiceObjectNode extends TreeBase<TreeSection, TreeBase> implements
			IAdaptable {
		Service service;

		public ServiceObjectNode(TreeSection parent, Service service) {
			super(parent);
			this.service = service;
			assert (service != null);
		}

		@Override
		public String getName() {
			return service.getLocalName();
		}

		@Override
		public Object getAdapter(Class adapter) {
			if (adapter.equals(Service.class))
				return service;

			return null;
		}

	}

	class OntologyObject extends TreeBase<TreeSection, TreeBase> {
		OWLOntology ont;

		public OntologyObject(TreeSection parent, OWLOntology ont) {
			super(parent);
			this.ont = ont;
		}

		@Override
		public String getName() {
			return ont == null ? "" : ont.getURI().toString();
		}
	}

	abstract class TreeBase<Parent extends TreeBase, Child extends TreeBase> {
		ArrayList<Child> children;
		private Parent parent;

		public Parent getParent() {
			return parent;
		}

		public abstract String getName();

		public TreeBase(Parent parent) {
			children = new ArrayList();
			if (parent != null)
				parent.addChild(this);
		}

		public String toString() {
			return getName();
		}

		public void removeAll() {
			children.clear();

		}

		public void addChild(Child child) {
			children.add(child);
			child.setParent(this);
		}

		public void removeChild(Child child) {
			children.remove(child);
			child.setParent(null);
		}

		void setParent(Parent object) {
			this.parent = object;
		}

		public Child[] getChildren() {
			return (Child[]) children.toArray(new TreeBase[children.size()]);
		}

		public boolean hasChildren() {
			return children.size() > 0;
		}
	}

	class TreeSection extends TreeBase<TreeSection, TreeBase> {
		String name;

		public TreeSection(TreeSection parent, String name) {
			super(parent);
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}
	}

	class ViewContentProvider implements IStructuredContentProvider,
			ITreeContentProvider {
		private TreeSection invisibleRoot;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot == null)
					initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}

		public Object getParent(Object child) {
			if (child instanceof TreeBase) {
				return ((TreeBase) child).getParent();
			}
			return null;
		}

		public Object[] getChildren(Object parent) {
			if (parent instanceof TreeBase) {
				return ((TreeBase) parent).getChildren();
			}
			return new Object[0];
		}

		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeBase)
				return ((TreeBase) parent).hasChildren();
			return false;
		}

		/*
		 * We will set up a dummy model to initialize tree heararchy. In a real
		 * code, you will connect to a real model and expose its hierarchy.
		 */
		private void initialize() {
			invisibleRoot = new TreeSection(null, "");
			services = new TreeSection(invisibleRoot, "Services");
			ontologies = new TreeSection(invisibleRoot, "Ontologies");
			refreshContent();
			((OWLKnowledgeBaseImpl) getOWLKB()).getImplementation().register(
					new ObjectListener() {
						@Override
						public void added(Object x) {
							refreshContent();
						}

						@Override
						public void removed(Object x) {
							refreshContent();
						}
					});
		}
	}

	void refreshContent() {

		OWLKnowledgeBase owlKB = getOWLKB();
		ontologies.removeAll();
		for (OWLOntology o : owlKB.getOntologies(true)) {
			OntologyObject oo = new OntologyObject(ontologies, o);
		}
		services.removeAll();
		for (Service svc : owlKB.getServices(false)) {
			ServiceObjectNode svci = new ServiceObjectNode(services, svc);
			Process proc;
			if ((proc = svc.getProcess()) != null) {
				ServiceProcessNode sp = new ServiceProcessNode(svci, proc);
				for (Input i : proc.getInputs()) {
					ServiceParameterNode param = new ServiceParameterNode(sp, i);
				}
				for (Condition cond : proc.getConditions()) {
					ServicePreconditionNode prec = new ServicePreconditionNode(
							sp, cond);
				}
			}
			Profile prof;

			if (null != (prof = svc.getProfile())) {
				ServiceProfile profnode = new ServiceProfile(svci, prof);
				for (Input i : prof.getInputs()) {
					ServiceParameterNode param = new ServiceParameterNode(
							profnode, i);
				}
				for (Condition cond : prof.getConditions()) {
					ServicePreconditionNode prec = new ServicePreconditionNode(
							profnode, cond);
				}
			}

			for (Grounding g : svc.getGroundings()) {
				ServiceGrounding sg = new ServiceGrounding(svci, g);
			}
		}
		viewer.refresh();
	}

	OWLKnowledgeBase getOWLKB() {
		return Activator.getDefault().getDefaultOWLKB();
	}

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}

		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			if (obj instanceof TreeSection)
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
	public KBView() {
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
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		getSite().setSelectionProvider(viewer);

	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				KBView.this.fillContextMenu(manager);
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
		manager.add(refreshViewAction);
		manager.add(openServiceAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(refreshViewAction);
		manager.add(openServiceAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(refreshViewAction);
		manager.add(openServiceAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		openServiceAction = new Action() {
			public void run() {
			}
		};
		openServiceAction.setText("Open Service");
		openServiceAction.setToolTipText("Open Service");
		openServiceAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

		refreshViewAction = new Action() {
			public void run() {
				refreshContent();
			}
		};
		refreshViewAction.setText("Refresh");
		refreshViewAction.setToolTipText("Refreshes service view");
		refreshViewAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						ISharedImages.IMG_ELCL_SYNCED));

	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"KnowledgeBaseView", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}