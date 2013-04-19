/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.dashboard.FileUtils;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.tasks.util.TasksAdapterFactory;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredList;

/**
 * @author David Corsar
 * 
 */
public class TaskSelectionPage extends WizardPage {

	private ResourceSet rs;


	
	public TaskSelectionPage(String pageName) {
		super(pageName);
		setTitle("Select a Task");
		setDescription("Select a task");
		setMessage("Select a task");
		rs = PlanSynthesisUtils.createResourceSet();
		updateStatus(null);
	}

	private URI taskFileUri;

	private FilteredList list;

	private Task selection;

	public void setTaskFileUri(URI uri) {
		this.taskFileUri = uri;
		displayElements();
	}

	public Task getSelectedTask() {
		return selection;
	}

	@Override
	protected boolean isControlCreated() {
		// TODO Auto-generated method stub
		return super.isControlCreated();
	}

	@Override
	public void createControl(Composite parent) {

		Composite plate = new Composite(parent, SWT.NULL);
		setControl(plate);
		GridLayout layout = new GridLayout();
		plate.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 1;

		int flags = SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE;

		List factories = new ArrayList();
		factories.add(new TasksAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		ComposedAdapterFactory factory = new ComposedAdapterFactory(factories);

		ILabelProvider provider = new AdapterFactoryLabelProvider(factory);
		// TaskDiagramEditorPlugin.getInstance()
		// .getItemProvidersAdapterFactory());
		list = new FilteredList(plate, flags, provider, true, false, true);
		GridData gd = new GridData(GridData.FILL_BOTH);
		list.setLayoutData(gd);
		list.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setSelectedTask();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				setSelectedTask();
			}
		});
		displayElements();
	}

	private void displayElements() {
		if (list != null && this.taskFileUri != null) {
			Resource r = rs.getResource(URI.createFileURI(FileUtils
					.getFilePath(this.taskFileUri)), true);
			List<Task> tasks = new ArrayList<Task>();
			for (EObject obj : r.getContents()) {
				if (obj instanceof TasksCollection) {
					TasksCollection col = (TasksCollection) obj;
					tasks.addAll(col.getTasks());
				} else if (obj instanceof Task) {
					tasks.add((Task) obj);
				}
			}
			list.setElements(tasks.toArray());
		}
	}

	private void setSelectedTask() {
		Assert.isNotNull(list);
		Object[] obj = list.getSelection();
		if (obj.length == 1 && obj[0] instanceof Task) {
			selection = (Task) obj[0];
			updateStatus(null);
		} else {
			selection = null;
			updateStatus("Select a Task");
		}
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(isPageComplete());
	}

	@Override
	public boolean isPageComplete() {
		boolean b = getSelectedTask()!=null;
		return getSelectedTask() != null;
	}

	
	
}
