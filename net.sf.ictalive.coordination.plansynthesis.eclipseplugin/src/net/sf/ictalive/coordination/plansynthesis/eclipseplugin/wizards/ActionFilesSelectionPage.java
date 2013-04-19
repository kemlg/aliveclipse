/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.internal.ide.misc.CheckboxTreeAndListGroup;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author David Corsar
 * 
 */
public class ActionFilesSelectionPage extends WizardPage {

	private CheckboxTreeAndListGroup selectionGroup;

	private IStructuredSelection selection;

	protected ActionFilesSelectionPage(IStructuredSelection selection) {
		super("Select Action File(s)");
		this.selection = selection;
		setDescription("Select the \".action\" file(s) containing the actions that will be used as the planning domain by the planner (all other selected files will be ignored):");
	}

	public void setSelection(IStructuredSelection selection){
		this.selection = selection;
	}
	
	public ArrayList<IResource> getSelectedActionFiles() {
		ArrayList<IResource> resources = new ArrayList<IResource>();
		for (Iterator it = selectionGroup.getAllCheckedListItems(); it
				.hasNext();) {
			IResource next = (IResource) it.next();
			resources.add(next);
		}
		return resources;
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Action files:");

		ArrayList input = new ArrayList();
		input.add(ResourcesPlugin.getWorkspace().getRoot());

		selectionGroup = new CheckboxTreeAndListGroup(container, input,
				getResourceProvider(IResource.FOLDER | IResource.PROJECT
						| IResource.ROOT), WorkbenchLabelProvider
						.getDecoratingWorkbenchLabelProvider(),
				getResourceProvider(IResource.FILE), WorkbenchLabelProvider
						.getDecoratingWorkbenchLabelProvider(), SWT.NONE,
				// since this page has no other significantly-sized
				// widgets we need to hardcode the combined widget's
				// size, otherwise it will open too small
				400, 300);

		selectionGroup.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				for (Iterator it = selectionGroup.getAllCheckedListItems(); it
						.hasNext();) {
					IResource next = (IResource) it.next();
					if (next.getType() == IResource.FILE
							&& next.getName().endsWith(".actions")) {
						updateStatus(null);
						return;
					}
				}
				updateStatus("Please select at least one \".actions\" file which provides actions to be used by the planner.");
			}
		});
		// selectionGroup.setRoot(ResourcesPlugin.getWorkspace().getRoot());
		setControl(container);
		setPageComplete(false);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * Returns a content provider for <code>IResource</code>s that returns only
	 * children of the given resource type.
	 */
	private ITreeContentProvider getResourceProvider(final int resourceType) {
		return new WorkbenchContentProvider() {
			public Object[] getChildren(Object o) {
				if (o instanceof IContainer) {
					IResource[] members = null;
					try {
						members = ((IContainer) o).members();
					} catch (CoreException e) {
						// just return an empty set of children
						return new Object[0];
					}

					// filter out the desired resource types
					ArrayList results = new ArrayList();
					for (int i = 0; i < members.length; i++) {
						// And the test bits with the resource types to see if
						// they are what we want
						// if ((members[i].getType() & resourceType) > 0) {
						if (members[i].getType() == IResource.FILE
								&& members[i].getName().endsWith(".actions")) {
							results.add(members[i]);
						}
						 else if (members[i].getType() == IResource.ROOT
						 || members[i].getType() == IResource.PROJECT
						 || members[i].getType() == IResource.FOLDER)
						 results.add(members[i]);

//						 }
					}
					return results.toArray();
				}
				// input element case
				if (o instanceof ArrayList) {
					return ((ArrayList) o).toArray();
				}
				return new Object[0];
			}
		};
	}

}
