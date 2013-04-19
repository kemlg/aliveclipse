/**
 * 
 */
package net.sf.ictalive.service.matchmakertab.dashboard;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.service.matchmakertab.ActionToOWLS;
import net.sf.ictalive.service.serviceui.ProcessInfoBox;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.mindswap.owls.service.Service;

public class SelectActionsToValidatePage extends WizardPage {
	Callable<List<Action>> actionCollectionSource;

	ProcessInfoBox processInfo;
	boolean isMultiple = true;

	public SelectActionsToValidatePage(String pageName,
			Callable<List<Action>> actionCollectionSource) {
		super(pageName);
		this.actionCollectionSource = actionCollectionSource;
	}

	public List<Action> getInActions() {
		try {
			return actionCollectionSource.call();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	org.eclipse.swt.widgets.List actionList;

	public List<Action> getSelectedActions() {
		assert (actionList != null);
		LinkedList<Action> actions = new LinkedList<Action>();
		List<Action> actionsin = getInActions();
		for (int i : actionList.getSelectionIndices()) {
			actions.add(actionsin.get(i));
		}
		return actions;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 12;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.grabExcessVerticalSpace = true;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);
		Label label = new Label(composite, SWT.NONE);
		label.setText("Select actions to validate");
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		actionList = new org.eclipse.swt.widgets.List(composite,
				isMultiple ? SWT.MULTI : SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL);
		GridData listData = new GridData(GridData.FILL_BOTH);

		// listData.heightHint = 300;

		actionList.setLayoutData(listData);

		// actionList.setSize(new Point(200, 400));
		actionList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				setPageComplete(validatePage());
			}
		});
		// actionList.setSize(200, 400);
		for (Action action : getInActions()) {
			actionList.add(action.getName() == null ? action.toString()
					: action.getName());

		}

		if (isMultiple) {
			Button selectAll = new Button(composite, SWT.NONE);
			selectAll
					.setLayoutData(new GridData(SWT.END, SWT.END, true, false));
			selectAll.setText("Select all/none");
			selectAll.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					if (actionList.getSelectionCount() == 0) {
						actionList.selectAll();
					} else {
						actionList.deselectAll();
					}
					setPageComplete(validatePage());
				}
			});
		}
		actionList.selectAll();
		actionList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				try {
					if (event.widget == actionList) {
						int lastIndex = actionList.getSelectionIndex();
						if (lastIndex >= 0) {
							Action a = actionCollectionSource.call().get(
									lastIndex);
							ActionToOWLS a2o = new ActionToOWLS();
							Service s = a2o.convertActionToService(a);
							processInfo.setProcess(s.getProcess());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		processInfo = new ProcessInfoBox(composite, false, true);
		processInfo.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL
						| GridData.GRAB_HORIZONTAL));

		processInfo.setText("Action details");
		setPageComplete(validatePage());

		setControl(composite);

	}

	public boolean validatePage() {
		int selected = actionList.getSelectionCount();

		return selected > 0;
	}

	public void setMultiple(boolean isMultiple) {
		this.isMultiple = isMultiple;
	}
}