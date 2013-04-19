package net.sf.ictalive.operetta.OM.diagram.ss.sheet;

import java.util.ArrayList;
import java.util.Iterator;

import net.sf.ictalive.operetta.OM.Dependency;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.operetta.psdeditor.CustomizedPropertySource;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * @generated
 */
public class OperAObjectivesPropertySection extends AdvancedPropertySection
		implements IPropertySourceProvider {

	//ui elements
	private TreeViewer objectivesViewer;
	private Button addObjectivesButton, destroyObjectivesButton,
			addChildButton;
	private IWorkbenchPart workbenchPart = null;
	private Object selectedInput = null;

	/**
	 * @generated and Modified
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new CustomizedPropertySource(object, ips); // Use the CustomizedPropertySource from net.sf.ictalive.psdeditor for editing PSD's as the properties
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated NOT
	 * Modified to only show the relevant properties of the selected item.
	 */
	protected Object transformSelection(Object selected) {
		//set selection as selected object
		if (selected instanceof Objective) {
			return ((IStructuredSelection) objectivesViewer.getSelection())
					.getFirstElement();
		}
		//it was not an objective that was selected so clear the selection in the viewer.
		objectivesViewer.setSelection(null);
		//old unwrap part
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	@Override
	protected EObject unwrap(Object object) {
		if (object instanceof SS) {
			selectedInput = (SS) object;
			objectivesViewer.setInput(((SS) object).getObjectives().toArray());
			objectivesViewer.refresh();
			return (EObject) object;
		}
		if (object instanceof Role) {
			selectedInput = (Role) object;
			objectivesViewer
					.setInput(((Role) object).getObjectives().toArray());
			objectivesViewer.refresh();
			return (EObject) object;
		}
		if (object instanceof Dependency) {
			selectedInput = (Dependency) object;
			objectivesViewer.setInput(((Dependency) object)
					.getObjectOfDependency().toArray());
			objectivesViewer.refresh();
			return (EObject) object;
		}

		if (object instanceof EditPart) {
			Object model = ((EditPart) object).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (object instanceof IAdaptable) {
			View view = (View) ((IAdaptable) object).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (workbenchPart == null) { //only addition
			workbenchPart = part;
		}
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(structuredSelection
				.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain())
					.getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}
		return null;
	}

	/**
	 * Overriding parent's page constructor to add our own elements.
	 */
	@Override
	public void createControls(final Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		//Create a properties view for the left hand side
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createComposite(parent,
				SWT.FILL);

		GridLayout gridLayout = new GridLayout(3, true);
		composite.setLayout(gridLayout);

		addObjectivesButton = new Button(composite, SWT.PUSH);
		addObjectivesButton.setText("Add objective");
		addChildButton = new Button(composite, SWT.PUSH);
		addChildButton.setText("Add subObjective");
		addChildButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				false, false));
		destroyObjectivesButton = new Button(composite, SWT.PUSH);
		destroyObjectivesButton.setText("Destroy objective");
		destroyObjectivesButton.setLayoutData(new GridData(SWT.END, SWT.CENTER,
				true, false));

		Group group = getWidgetFactory().createGroup(composite, "");
		GridData groupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		groupData.horizontalSpan = 3;
		group.setLayoutData(groupData);
		group.setLayout(new FillLayout());

		objectivesViewer = new TreeViewer(group, SWT.SINGLE | SWT.V_SCROLL);
		objectivesViewer.setLabelProvider(new ObjectivesLabelProvider());
		objectivesViewer.setContentProvider(new ObjectivesContentProvider());
		objectivesViewer.setSorter(new ViewerSorter());
		objectivesViewer.addFilter(new ObjectivesViewerFilter());

		//event handlers:
		//objectivesViewer.addDragSupport(int, Transfer[], DragSourceListener)
		//objectivesViewer.addDropSupport(int, Transfer[], DropTargetListener)
		objectivesViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();

						setInput(workbenchPart, selection);
						objectivesViewer.refresh();
					}

				});

		addObjectivesButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					TransactionalEditingDomain editingDomain = getEditingDomain();
					Objective objective = OMFactory.eINSTANCE.createObjective();

					SS ss;
					if (selectedInput instanceof SS) {
						ss = (SS) selectedInput;
					} else if (selectedInput instanceof Role) {
						ss = (SS) ((Role) selectedInput).eContainer();
					} else if (selectedInput instanceof Dependency) {
						ss = (SS) ((Dependency) selectedInput).eContainer();
					} else
						break;

					editingDomain.getCommandStack().execute(
							AddCommand.create(editingDomain, ss, ss
									.getObjectives(), objective));
					if (selectedInput instanceof Role) {
						//set child command
						editingDomain.getCommandStack().execute(
								AddCommand.create(editingDomain,
										(Role) selectedInput,
										((Role) selectedInput).getObjectives(),
										objective));
					}
					//all done, set the selection to the newly created objective.
					if (selectedInput instanceof SS)
						objectivesViewer.setInput(((SS) selectedInput)
								.getObjectives().toArray());
					else if (selectedInput instanceof Role)
						objectivesViewer.setInput(((Role) selectedInput)
								.getObjectives().toArray());
					else if (selectedInput instanceof Dependency)
						objectivesViewer
								.setInput(((SS) ((Dependency) selectedInput)
										.eContainer()).getObjectives()
										.toArray());

					ArrayList selection = new ArrayList(1);
					selection.add(objective);
					objectivesViewer.setSelection(new StructuredSelection(
							selection));
					break;
				}
			}
		});

		destroyObjectivesButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					if (!objectivesViewer.getSelection().isEmpty()) {
						TransactionalEditingDomain editingDomain = getEditingDomain();
						Objective objective = (Objective) ((IStructuredSelection) objectivesViewer
								.getSelection()).getFirstElement();
						editingDomain.getCommandStack().execute(
								DeleteCommand.create(editingDomain, objective));

						//set input back to the correct element.
						if (selectedInput instanceof SS)
							objectivesViewer.setInput(((SS) selectedInput)
									.getObjectives().toArray());
						else if (selectedInput instanceof Role)
							objectivesViewer.setInput(((Role) selectedInput)
									.getObjectives().toArray());
						else if (selectedInput instanceof Dependency)
							objectivesViewer
									.setInput(((Dependency) selectedInput)
											.getObjectOfDependency().toArray());
					}

					break;
				}
			}
		});

		addChildButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					if (!objectivesViewer.getSelection().isEmpty()) {
						TransactionalEditingDomain editingDomain = getEditingDomain();
						Objective objective = OMFactory.eINSTANCE
								.createObjective();
						Objective parent = (Objective) ((IStructuredSelection) objectivesViewer
								.getSelection()).getFirstElement();

						editingDomain.getCommandStack().execute(
								AddCommand.create(editingDomain, parent
										.eContainer(), ((SS) parent
										.eContainer()).getObjectives(),
										objective));
						editingDomain.getCommandStack().execute(
								AddCommand.create(editingDomain, parent, parent
										.getSubObjectives(), objective));

						//set input back to the correct element.
						if (selectedInput instanceof SS)
							objectivesViewer.setInput(((SS) selectedInput)
									.getObjectives().toArray());
						else if (selectedInput instanceof Role)
							objectivesViewer.setInput(((Role) selectedInput)
									.getObjectives().toArray());
						else if (selectedInput instanceof Dependency)
							objectivesViewer
									.setInput(((Dependency) selectedInput)
											.getObjectOfDependency().toArray());

						//expand the parent objective to show the new subobjective
						objectivesViewer.expandToLevel(parent, 1);

						//set selection
						ArrayList selection = new ArrayList(1);
						selection.add(objective);
						objectivesViewer.setSelection(new StructuredSelection(
								selection));
					}

					break;
				}
			}
		});

	}

	/**
	 * Overriding parent function to catch notifcations of changes to objectives.
	 * We need this in order to catch the name-changes of objectives and refresh the list.
	 */
	@Override
	public void update(final Notification notification, final EObject element) {

		if (element instanceof Objective) {
			//something done with a objective; refresh the list
			objectivesViewer.refresh();
		}
		//let the parent handle the rest :)
		super.update(notification, element);
	}
}