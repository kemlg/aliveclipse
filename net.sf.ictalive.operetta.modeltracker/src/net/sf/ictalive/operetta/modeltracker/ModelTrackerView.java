package net.sf.ictalive.operetta.modeltracker;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.*;
import org.eclipse.ui.part.ViewPart;

/**
 * View that listens to the changes of the current static ModelTrackerModel.
 */
public class ModelTrackerView extends ViewPart implements ModelTrackerModel.ModelListener 
{	
	ListViewer viewer;
		
	private Text milestoneInputField;
	private Button enterMilestoneButton;
	
	/**
	 * @see IWorkbenchPart#createPartControl(Composite)
	 */
	public void createPartControl(Composite parent) {
		// Create viewer.
		GridLayout layout = new GridLayout(1, true);
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 0;
		layout.marginLeft = 0;
		parent.setLayout(layout);
				
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.horizontalIndent = 0;
		viewer = new ListViewer(parent, SWT.FILL | SWT.BORDER | SWT.V_SCROLL);
		viewer.getList().setLayoutData(layoutData);
		viewer.setContentProvider(new IStructuredContentProvider(){

			@Override
			public Object[] getElements(Object inputElement) {
				// return all elements from the current ModelTrackerModel
				
				List<String> viewElts = new ArrayList<String>();
				if (ModelTrackerModel.getCurrentModel() == null)
					viewElts.add( "No active OperettA editor." );
				else {
					viewElts.addAll( ModelTrackerModel.presentCurrentModel() );
				}
				return viewElts.toArray();
			}

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				disenableMilestoneEntryPanel();
			}});
		
		viewer.setLabelProvider(new LabelProvider());
		getSite().setSelectionProvider(viewer);
		ModelTrackerModel.setListener(this);
		
		layoutData = new GridData(GridData.FILL_HORIZONTAL);
		Composite milestonePanel = new Composite( parent, SWT.FILL );
		milestonePanel.setLayoutData(layoutData);
		
		GridLayout inputMilestoneLayout = new GridLayout(2,false);
		inputMilestoneLayout.marginTop = 0;
		inputMilestoneLayout.marginLeft = 0;
		milestonePanel.setLayout( inputMilestoneLayout );
		
		layoutData = new GridData(GridData.FILL_HORIZONTAL);
		milestoneInputField = new Text(milestonePanel, SWT.BORDER);
		milestoneInputField.setLayoutData(layoutData);
		milestoneInputField.addListener (SWT.DefaultSelection, new Listener () {
			public void handleEvent (Event e) {
				enterMilestone();			}
		});
		milestoneInputField.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				disenableMilestoneEntryPanel();
			}});

		enterMilestoneButton = new Button(milestonePanel, SWT.PUSH );
		enterMilestoneButton.setText("Clear milestone"); // set it to the largest string, so we don't have to re-layout when the button text changes
		enterMilestoneButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				milestoneButtonPushed();
			}
		});
		parent.pack();
		refresh();
	}
	
	private void milestoneButtonPushed() {
		if ( ModelTrackerModel.getCurrentModel() != null && ModelTrackerModel.getCurrentModel().getMilestone() != null ) {
			ModelTrackerModel.getCurrentModel().clearMilestone();
		}
		else
			enterMilestone();
		disenableMilestoneEntryPanel();
	}
	
	private void enterMilestone() {
		if (ModelTrackerModel.getCurrentModel() != null) {
			ModelTrackerModel.getCurrentModel().setMilestone( milestoneInputField.getText() );
			
			milestoneInputField.setText("");
		}
		disenableMilestoneEntryPanel();
	}
	
	private void disenableMilestoneEntryPanel() {
		if (ModelTrackerModel.getCurrentModel() != null && ModelTrackerModel.getCurrentModel().getMilestone() != null ) {
			enterMilestoneButton.setText("Clear milestone");
			enterMilestoneButton.setEnabled( true );
			milestoneInputField.setEnabled( false );
		}
		else {
			enterMilestoneButton.setText("Set milestone");
			enterMilestoneButton.setEnabled( ModelTrackerModel.getCurrentModel() != null && !milestoneInputField.getText().equals("") );
			milestoneInputField.setEnabled( ModelTrackerModel.getCurrentModel() != null );
		}
	}
	
	/**
	 * @see WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * @see ModelTrackerModel.ModelListener#refresh()
	 */
	public void refresh() {
		if (viewer != null) {
			viewer.setInput( new Object() );  // this seems the only way to have viewer compute its elements (refresh doesn't work)	

			if ( ModelTrackerModel.getCurrentModel() != null ) {
				// and this seems to be the only way to reveal the last element in the viewer. Maybe a listviewer is not ideal for this task.
				int nrOfListElts = ModelTrackerModel.presentCurrentModel().size();
				if ( nrOfListElts > 0)
					viewer.reveal( viewer.getElementAt(nrOfListElts - 1));
			}
		}
	}
}
