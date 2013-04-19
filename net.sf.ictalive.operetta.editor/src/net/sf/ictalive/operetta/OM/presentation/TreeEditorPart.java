package net.sf.ictalive.operetta.OM.presentation;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * This editor part shows how a tree view works.
 *
 */
public class TreeEditorPart extends OMEditorPart {

	/**
	 * The tree viewer used by this editor part.
	 */
	protected TreeViewer viewer;
	
	/**
	 * Default constructor.
	 * @param parent
	 */
	public TreeEditorPart(OMEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI);
		viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));

		// filter out the diagram elements
		ViewerFilter[] outlineFilters = new ViewerFilter[1];
		outlineFilters[0] = new ViewerFilter() {
			@Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
            	return !(element instanceof Diagram);
            }
		};
        viewer.setFilters(outlineFilters);
        viewer.addFilter(new OutlineViewerFilter());//add another filter to remove sub-objectives and sub-formulas from the tree

		
		getEditorSite().setSelectionProvider(viewer);
		new AdapterFactoryTreeEditor(viewer.getTree(), getAdapterFactory());
		createContextMenuFor(viewer);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getTree().setFocus();
	}

	/* (non-Javadoc)
	 * @see org.example.emfgmf.topicmap.presentation.TopicmapEditorPart#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		viewer.setInput(input);
	}

}
