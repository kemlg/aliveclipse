package net.sf.ictalive.service.matchmakertab.views;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.service.matchmakertab.ActionToOWLS;
import net.sf.ictalive.service.matchmakertab.Activator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import agents.ws.MatchMakerWS.MatchDecoration;
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

public class ValidateActionsResultView extends ViewPart {

	Action doubleClickAction;
	Action doubleClickResultAction;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.ictalive.service.matchmakertab.views.ValidateActionsResultView";

	private TreeViewer tviewer;

	private ScrolledComposite matchResultScroll;
	private Canvas matchResultCanvas;
	private MatchResultDraw2d matchResultDiagram;

	private SashForm sash;

	// simple class to hold things that go in the tree
	class TreeEntry {
		private Object obj;
		private TreeEntry parent;
		private TreeEntry[] children;

		public TreeEntry(Object o, TreeEntry parent) {
			obj = o;
			this.parent = parent;
			this.children = new TreeEntry[] {};
		}

		public Object getObject() {
			return obj;
		}

		public TreeEntry getParent() {
			return parent;
		}

		public TreeEntry[] getChildren() {
			return children;
		}

		public void setChildren(TreeEntry[] children) {
			this.children = children;
		}
	}

	// content provider for tree view
	class TreeViewContentProvider implements ITreeContentProvider {

		@Override
		public Object[] getChildren(Object obj) {
			return ((TreeEntry) obj).getChildren();
		}

		@Override
		public Object getParent(Object obj) {
			return ((TreeEntry) obj).getParent();
		}

		@Override
		public boolean hasChildren(Object obj) {
			return getChildren(obj).length > 0;
		}

		@Override
		public Object[] getElements(Object obj) {
			return getChildren(obj);
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		}

	}

	// labels for tree view
	class TreeViewLabelProvider implements ILabelProvider {

		@Override
		public Image getImage(Object obj) {

			TreeEntry te = (TreeEntry) obj;

			if (te.getObject() instanceof net.sf.ictalive.coordination.actions.Action) {
				if (te.getChildren().length == 0) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				} else {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJ_ELEMENT);
				}
			}

			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_FILE);
		}

		@Override
		public String getText(Object obj) {
			TreeEntry te = (TreeEntry) obj;

			if (te.getObject() instanceof MatchResult) {
				MatchResult mr = (MatchResult) te.getObject();
				String ret = mr.getService().getFragment();
				if (ret == null || ret.length() == 0) {
					ret = mr.getService().toString();
				}
				return ret;
			} else if (te.getObject() instanceof net.sf.ictalive.coordination.actions.Action) {
				return ((net.sf.ictalive.coordination.actions.Action) te
						.getObject()).getName();
			}

			return te.getObject().toString();

		}

		@Override
		public void addListener(ILabelProviderListener arg0) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object arg0, String arg1) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener arg0) {
		}

	}

	/**
	 * The constructor.
	 */
	public ValidateActionsResultView() {
	}

	public void UpdateResults() {

		// create new data structure for tree

		TreeEntry root = new TreeEntry("Actions", null);

		ArrayList<TreeEntry> acts = new ArrayList<TreeEntry>();

		for (Entry<Action, MatchResult[]> entry : Activator.getDefault()
				.getMatchMakerResults().entrySet()) {

			TreeEntry act = new TreeEntry(entry.getKey(), root);

			TreeEntry[] children = new TreeEntry[entry.getValue().length];
			for (int i = 0; i < children.length; i++) {
				children[i] = new TreeEntry(entry.getValue()[i], act);
			}
			act.setChildren(children);

			acts.add(act);
		}

		root.setChildren(acts.toArray(new TreeEntry[] {}));

		// update viewer
		tviewer.setInput(root);
		tviewer.expandAll();

	}

	Table matchDetailsLabel;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		sash = new SashForm(parent, SWT.HORIZONTAL);
		SashForm leftHolder = new SashForm(sash, SWT.VERTICAL | SWT.BORDER);
		leftHolder.setSashWidth(5);

		tviewer = new TreeViewer(leftHolder, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		tviewer.setContentProvider(new TreeViewContentProvider());
		tviewer.setLabelProvider(new TreeViewLabelProvider());
		tviewer.setInput(new TreeEntry("Actions", null));

		tviewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

		ScrolledComposite sc = new ScrolledComposite(leftHolder, SWT.NONE);
		sc.setLayout(new FillLayout());
		matchDetailsLabel = new Table(sc, SWT.BORDER);
		sc.setContent(matchDetailsLabel);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(false);
		sc.setMinHeight(150);

		TableColumn tc = new TableColumn(matchDetailsLabel, SWT.NONE);
		tc.setText("Decoration");
		tc.setWidth(250);
		matchDetailsLabel.setHeaderVisible(true);
		tc = new TableColumn(matchDetailsLabel, SWT.NONE);
		tc.setText("Value");
		tc.setWidth(150);

		GridData gd;
		sc.setLayoutData(gd = new GridData(GridData.FILL_HORIZONTAL));
		gd.heightHint = 150;

		matchResultScroll = new ScrolledComposite(sash, SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);

		matchResultCanvas = new Canvas(matchResultScroll, SWT.NONE);
		matchResultCanvas.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_WHITE));
		matchResultCanvas.setLayoutData(new GridData(GridData.FILL_BOTH));

		matchResultDiagram = new MatchResultDraw2d(matchResultCanvas);

		matchResultScroll.setContent(matchResultCanvas);
		matchResultScroll.setExpandHorizontal(true);
		matchResultScroll.setExpandVertical(true);
		matchResultScroll.setMinWidth(600);
		matchResultScroll.setMinHeight(580);

		// for testing
		// ServiceDescriptor sd = AdaptationTest.getTestServiceDescriptor();
		// matchResultDiagram.setMatchResultAndQuery(AdaptationTest.testAdaptations(sd)[0],sd);

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(tviewer.getControl(),
				"net.sf.ictalive.service.matchmakertab.tviewer");

		tviewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				TreeEntry selected = (TreeEntry) ((IStructuredSelection) tviewer
						.getSelection()).getFirstElement();

				if (selected != null
						&& selected.getObject() instanceof MatchResult) {
					MatchResult mr = (MatchResult) selected.getObject();

					ActionToOWLS ato = new ActionToOWLS();
					ServiceDescriptor sd = null;

					sd = ato
							.convertActionToServiceDescriptor((net.sf.ictalive.coordination.actions.Action) selected
									.getParent().getObject());
					fillDetailsTree(matchDetailsLabel, mr);
					matchResultDiagram.setMatchResultAndQuery(mr, sd);
				}

			}

		});

		UpdateResults();

	}

	protected void fillDetailsTree(Table tree, MatchResult mr) {
		StringBuffer sb = new StringBuffer();
		sb.append("Decorations:\n");

		ArrayList<MatchDecoration> list = new ArrayList<MatchDecoration>();
		list.addAll(mr.getDecorations());
		tree.removeAll();

		// matchDetailsLabel.setLinesVisible(true);
		// matchDetailsLabel.setHeaderVisible(true);

		Collections.sort(list, new Comparator<MatchDecoration>() {
			@Override
			public int compare(MatchDecoration o1, MatchDecoration o2) {

				return o1.getDecoration().compareTo(o2.getDecoration());
			}
		});

		for (MatchDecoration md : list) {

			TableItem ti = new TableItem(tree, SWT.NONE);
			ti.setText(new String[] { md.getDecoration(), md.getValue() });

		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		tviewer.getControl().setFocus();
	}

}