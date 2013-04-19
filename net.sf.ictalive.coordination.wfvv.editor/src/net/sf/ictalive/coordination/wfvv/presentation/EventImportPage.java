/**
 * 
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import net.sf.ictalive.coordination.wfvv.EventModelContainer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Prompts the user to select the source of events to be included in the model:
 * - Agent generated files - Event log - Previously imported agent generated
 * files
 * 
 * @author David Corsar
 * 
 */
public class EventImportPage extends WizardPage {

	public static final String PAGE_ID = "Import From Page";
	private EventImporter[] importers;
	private EventImporter selectedImporter;
	private Composite mainComposite;
	private Composite[] importerComposites;
	private Button[] radioButtons;

	protected EventImportPage(EventImporter[] importers) {
		super(PAGE_ID);
		this.importers = importers;
		this.importerComposites = new Composite[this.importers.length];
		setTitle("Event Source Selection");
		setDescription("Select the source of events");
	}

	@Override
	public boolean isPageComplete() {
		return selectedImporter == null ? true : selectedImporter.isComplete();
	}
	
	public boolean importEvents(EventModelContainer to){
		if (selectedImporter==null)
			return true;
		return selectedImporter.importEvents(to);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		mainComposite = new Composite(parent, SWT.NULL);

		RowLayout layout = new RowLayout(SWT.VERTICAL);
		layout.pack = true;
		mainComposite.setLayout(layout);
		
		
		// add title label
		Label label = new Label(mainComposite, SWT.NULL);
		label.setText("&Select source of events to be included in new model");

		// add radio buttons
		this.radioButtons = new Button[this.importers.length];
		for (int i = 0; i < this.importers.length; i++) {
			radioButtons[i] = createRadioButton(mainComposite,
					this.importers[i], i);
		}

		setControl(mainComposite);
		setPageComplete(true);
	}

	/**
	 * Creates a radio button within parent, with text text, and option as the
	 * value for selectedOption
	 * 
	 * @param parent
	 * @param text
	 * @param option
	 */
	private Button createRadioButton(final Composite parent,
			final EventImporter importer, final int index) {
		Button radioButton = new Button(parent, SWT.RADIO);
		radioButton.setText(importer.getOptionText());
		radioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean selected = ((Button)e.getSource()).getSelection();
				if (selected){
//				if (selectedImporter == null
//						|| (!((Button) e.getSource()).getText()
//								.equals(selectedImporter.getOptionText()))) {
					selectedImporter = importer;
					if (importerComposites[index] == null){
						importerComposites[index] = importer.getControl(parent);
						importerComposites[index].setLayoutData(new RowData());
					}
				}
					
					((RowData)importerComposites[index].getLayoutData()).exclude = !selected;
					importerComposites[index].setVisible(selected);
					
					parent.layout();
					parent.pack();
			}
		});
		return radioButton;
	}
}
