package net.sf.ictalive.operetta.psdeditor;

// TODO:
// - cleanup class & document tracking and creation stuff (especially binary creation)
// - remove psd editor testing stuff in OMEditor (and remove dependency from Manifest)

// - null handling in pretty printer?
// - parsing a formula containing null?
// - change message <EOF> to end of line.

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.operetta.OM.Constant;
import net.sf.ictalive.operetta.OM.Function;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.PathFormula;
import net.sf.ictalive.operetta.OM.StateFormula;
import net.sf.ictalive.operetta.OM.Variable;
import net.sf.ictalive.operetta.OM.provider.OMItemProviderAdapterFactory;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.antlr.runtime.Token;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.*;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import net.sf.ictalive.operetta.psdeditor.antlr.PSDParser;
import net.sf.ictalive.operetta.psdeditor.antlr.ParseException;
import net.sf.ictalive.operetta.psdeditor.antlr.PSDParser.Range;
import net.sf.ictalive.operetta.psdeditor.antlr.PSDParser.ParseResult;

/**
 * 
 */
public class PSDEditor extends Dialog {

	// syntax colors
	static final int STATE_COLOR = SWT.COLOR_BLUE;
	static final int PATH_COLOR = SWT.COLOR_DARK_GREEN;
	static final int CONSTANT_COLOR = SWT.COLOR_DARK_GRAY;
	static final int VARIABLE_COLOR = SWT.COLOR_DARK_MAGENTA;
	static final int FUNCTION_COLOR = SWT.COLOR_DARK_MAGENTA;
	static final int DEFAULT_COLOR = SWT.COLOR_BLACK;

	// color for the parse error marker
	static final int ERROR_COLOR = SWT.COLOR_RED;

	// colors for the parserOutput label that shows either the parsed PSD or the error
	static final int PARSE_RESULT_COLOR = SWT.COLOR_BLACK;
	static final int ERROR_MESSAGE_COLOR = SWT.COLOR_RED;

	
	static final int MAX_UNDO_HISTORY = 10;

	static final int WINDOW_WIDTH = 800;
	static final int WINDOW_HEIGHT = 400;
	
	
	private ParseResult parseResult;
	private int errorMarkerPos = -2; // -2 means no error (-1 is end of line)
	
	private PartialStateDescription oldPSD;
	private EObject eObject;
	private TransactionalEditingDomain editingDomain;
	private List<Concept> modelConcepts;
	
	private boolean disableInputModifiedHandler = false; // to prevent system updates to the text from firing events
	private StyledText formulaInputField;
	private org.eclipse.swt.widgets.List modelConceptsList;
	private org.eclipse.swt.widgets.List newConceptsList;
	
	private Label parserOutput;
	private Button okButton;
	private TreeViewer formulaViewer;
		
	private Button undoButton, redoButton;
	
	private boolean closedByEditor; // denotes whether the window was closed by the editor (or by the window manager)
	
	public PSDEditor(PartialStateDescription oldPSD, EObject eObject, TransactionalEditingDomain editingDomain, Shell parent) {
		// Pass the default styles here
		this(oldPSD, eObject, editingDomain, parent, SWT.RESIZE |  SWT.MIN  | SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
	}

	public PSDEditor(PartialStateDescription oldPSD, EObject eObject, TransactionalEditingDomain editingDomain, Shell parent, int style) {
		super(parent, style);
		setText("Partial State Description Editor");
		
		this.oldPSD = oldPSD;
		this.eObject = eObject; // eObject is the parent that contains the edited PSD as a property.
		this.editingDomain = editingDomain;
		
		modelConcepts = new ArrayList<Concept>();
		if (eObject != null) { // this check is to allow testing the editor without a valid eObject, in which case we create the required structures.
			Resource resource = eObject.eResource();
			OM modelOm = ((OperAModel)resource.getContents().get(0)).getOm();

			for (Ontology ontology : modelOm.getCs().getOntology() ) {
				modelConcepts.addAll( ontology.getClasses() );
			}
		}
		else {
			for (int i = 0; i<100; i++) {
				Concept c = OMFactory.eINSTANCE.createConcept();
				c.setConcept("concept_"+i);
				modelConcepts.add( c );
			}
		}
	}


	/**
	 * Opens the dialog and returns the input
	 * 
	 * @return String
	 */
	public PartialStateDescription open() {

		// Create the dialog window
		Shell shell = new Shell(getParent(), getStyle());
		shell.setText(getText());
		createContents(shell);
//		shell.pack();   // pack causes window to get too big when concept lists have many elements
		
		closedByEditor = false;
		
		shell.open();
		Display display = getParent().getDisplay();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		// closedByEditor means that the ok or cancel button was pressed
		// parseResult == null means the dialog was canceled
		return closedByEditor && parseResult != null ? parseResult.psd : oldPSD;
	}
	
	// insert on StyledText does not move the caret, so if no selection is set we need to increase the caret with the length of the inserted text
	private void smartInsert( StyledText t, final String text) {
		int selectionLength = t.getSelectionRange().y;
			t.insert(text);
			if (selectionLength == 0)
				t.setCaretOffset( t.getCaretOffset()+text.length() );
	}
	
	private void setTextAndHandler( Button b, final String text, final String tooltipText) {
		b.setText(text);
		b.setToolTipText(tooltipText);
		b.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				smartInsert(formulaInputField, text);
				formulaInputField.setFocus();
			}
		});
	}
	/**
	 * Creates the dialog's contents
	 * 
	 * @param shell the dialog window
	 */
	private void createContents(final Shell shell) {
		Rectangle parentWindow = getParent().getBounds();
		shell.setLocation(parentWindow.x + (parentWindow.width - WINDOW_WIDTH)/2,
			              parentWindow.y + (parentWindow.height -WINDOW_HEIGHT)/2);		

		shell.setLayout(new GridLayout(2, true));
		
		shell.addShellListener(new ShellAdapter() {
			public void shellClosed(ShellEvent event) {
				// if the editor was closed through the window manager or the cancel button, we ask for a confirmation if the formula has been edited.
				if ((!closedByEditor || parseResult == null) && (undoIndex > 0 || !undoHistoryIsComplete)) 
					// undoHistoryIsComplete is for  the unlikely event that the user performed more than 1000 edits and undid a 1000..
					if (!MessageDialog.openQuestion(shell, "Discard changes?", "The formula has been edited. Are you sure you wish to close the editor and discard your changes?")) {
						event.doit = false;
						parseInput(); // might have been set to null by cancel
						closedByEditor = false; // might have been set to true by ok or cancel
					}
			}});
		
		// prevent escape from closing window.
        shell.addListener(SWT.Traverse, new Listener() {
            public void handleEvent(Event e) {
              if (e.detail == SWT.TRAVERSE_ESCAPE) {
                e.doit = false;
              }
            }
          });

		
		formulaInputField = new StyledText(shell, SWT.BORDER | SWT.SINGLE);
		
		formulaInputField.addListener(SWT.Paint, new Listener() {
	        public void handleEvent(Event event) {
	        	if (errorMarkerPos !=-2) {
		            int errorOffset = errorMarkerPos == -1 ? formulaInputField.getText().length() :	errorMarkerPos;
	        		GC gc = event.gc;
		            int x = formulaInputField.getLocationAtOffset(errorOffset).x;
		            int y = formulaInputField.getBaseline()+4;
		            gc.setForeground(mkColor(ERROR_COLOR));
		            gc.drawPolyline(new int[] {x-2,y+2, x,y, x+2,y+2});
	        	}
	        }
	    });


		formulaInputField.setText("x\u2227"); // Temporarily set input to 'x' and conjunction symbol, to get correct layout.
		                                      // (otherwise text containing conjunctions or disjunctions jumps up and down during cursor movement)
		
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 2;
		formulaInputField.setLayoutData(data);
		if (oldPSD != null)
			formulaInputField.setText(PrettyPrint.prettyPrintPSD(oldPSD));
		else
			formulaInputField.setText("");
		
		
		formulaInputField.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (! disableInputModifiedHandler) {
					performDo();
					parseInput();
				}
			}});
		formulaInputField.setDoubleClickEnabled(false);
		formulaInputField.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				selectSubtreeAtPos(formulaInputField.getCaretOffset());				
			}

			public void mouseDown(MouseEvent e) {
			}

			public void mouseUp(MouseEvent e) {
			}});
		initUndoHandler();
		
		
		Composite inputButtons = new Composite( shell, SWT.FILL );
		data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		data.horizontalSpan = 1;
		inputButtons.setLayoutData(data);
		
		RowLayout inputButtonsLayout = new RowLayout();
		inputButtonsLayout.marginTop = 0;
		inputButtonsLayout.marginLeft = 0;
		inputButtons.setLayout( inputButtonsLayout );
		Button inputButton1 = new Button( inputButtons, SWT.PUSH );
		setTextAndHandler( inputButton1, "\u00ac","Keyboard alternative is '~'");
		Button inputButton2 = new Button( inputButtons, SWT.PUSH );
		setTextAndHandler( inputButton2, "\u2227", "Keyboard alternative is '^' or '&&'");
		Button inputButton3 = new Button( inputButtons, SWT.PUSH );
		setTextAndHandler( inputButton3, "\u2228", "Keyboard alternative is '|'");
		Button inputButton4 = new Button( inputButtons, SWT.PUSH );
		setTextAndHandler( inputButton4, "\u2192", "Keyboard alternative is '->'");

		Composite undoRedoButtons = new Composite( shell, SWT.FILL );
		data = new GridData(GridData.HORIZONTAL_ALIGN_END);
		data.horizontalSpan = 1;
		undoRedoButtons.setLayoutData(data);
		
		RowLayout undoRedoButtonsLayout = new RowLayout();
		undoRedoButtonsLayout.marginTop = 0;
		undoRedoButtonsLayout.marginLeft = 0;
		undoRedoButtons.setLayout( undoRedoButtonsLayout );
		undoButton = new Button( undoRedoButtons, SWT.PUSH );
		undoButton.setText("Undo");		
		undoButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				performUndo();
			}
		});
		redoButton = new Button( undoRedoButtons, SWT.PUSH );
		redoButton.setText("Redo");
		redoButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				performRedo();
			}
		});
		disenableUndoRedoButtons();
		
	    if (System.getProperty("os.name").toLowerCase().indexOf( "mac" ) >= 0) {  
	    	undoButton.setToolTipText("Cmd-z");
	    	redoButton.setToolTipText("Shift-Cmd-z");
	    }
	    else {
	    	undoButton.setToolTipText("Ctrl-z");
	    	redoButton.setToolTipText("Ctrl-y");
	    }
	
		
		Label l1 = new Label(shell, SWT.NONE);
		data = new GridData(GridData.FILL_HORIZONTAL);
		l1.setLayoutData(data);
		l1.setText("Concepts already in model:");
		
		Label l2 = new Label(shell, SWT.NONE);
		data = new GridData(GridData.FILL_HORIZONTAL);
		l2.setLayoutData(data);
		l2.setText("Concepts that will be added:");

		modelConceptsList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
		data = new GridData(GridData.FILL_BOTH);
		data.minimumHeight = 100;
		data.heightHint = 100;
		modelConceptsList.setLayoutData(data);
		modelConceptsList.setToolTipText("Click to insert into Partial State Description");
		
		for (Concept c : modelConcepts) {
			modelConceptsList.add(c.getConcept());
		}
		modelConceptsList.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) { // for double click, override widgetDefaultSelected
				if (modelConceptsList.getSelectionIndex()>=0) {
					smartInsert(formulaInputField, modelConceptsList.getItems()[modelConceptsList.getSelectionIndex()]);
					modelConceptsList.deselectAll();
					formulaInputField.setFocus();
				}
			}});
		
		newConceptsList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
		data = new GridData(GridData.FILL_BOTH);
		data.minimumHeight = 100;
		data.heightHint = 100;
		newConceptsList.setLayoutData(data);
		newConceptsList.setToolTipText("Click to insert into Partial State Description");
		newConceptsList.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) { // for double click, override widgetDefaultSelected
				if (newConceptsList.getSelectionIndex()>=0) {
					String selectedConcept = newConceptsList.getItems()[newConceptsList.getSelectionIndex()];
					newConceptsList.deselectAll(); // tricky. selection needs to be cleared, or insert will cause a second selection event.
					// only a problem for newConcepts since this list may change on insert
					smartInsert(formulaInputField, selectedConcept);
					formulaInputField.setFocus();
				}
			}});
		
		parserOutput = new Label(shell, SWT.NONE);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 2;
		parserOutput.setLayoutData(data);
		
		formulaViewer = new TreeViewer(shell, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);
		data = new GridData(GridData.FILL_BOTH);
		data.heightHint = 100;
		data.minimumHeight = 100;
		data.horizontalSpan = 2;
		formulaViewer.getTree().setLayoutData(data);
		formulaViewer.getTree().setToolTipText("Click to select corresponding subformula in input");
		OMItemProviderAdapterFactory adapterFactory = new OMItemProviderAdapterFactory();
		formulaViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory){
			 @Override
			 public Object[] getElements(Object arg0) {
				return parseResult == null ? new Object[] {} : new Object[] { parseResult.psd };  
			 }
		});
	
		formulaViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));			
		
		formulaViewer.setInput(new Object()); // Formula viewer needs a dummy input, otherwise it doesn't respond to later input changes.
		formulaViewer.addSelectionChangedListener( new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				TreeSelection sel = (TreeSelection)event.getSelection();
	    		Object selectedObject = sel.getFirstElement();
	    		if (parseResult != null)
	    			for (Range range : parseResult.ranges) 
	    				if (selectedObject == range.object ) {
	    					formulaInputField.setSelection(range.startPos, range.endPos);
	    					formulaInputField.setFocus();
	    					break;
	    				}
			}});		
		
		Button cancelButton = new Button(shell, SWT.PUSH);
		cancelButton.setText("Cancel");
		cancelButton.setLayoutData(new GridData());
		cancelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				parseResult = null;
				closedByEditor = true; // to signal that the shell was closed by the editor
				shell.close();
			}
		});

		okButton = new Button(shell, SWT.PUSH);
		okButton.setText("OK");
		okButton.setLayoutData(new GridData());
		okButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				Resource resource = eObject.eResource();
				OM om = ((OperAModel)resource.getContents().get(0)).getOm();
					
				try {
					parseResult = PSDParser.parse(editingDomain, om, formulaInputField.getText());
					closedByEditor = true; // to signal that the shell was closed by the editor
					shell.close();				
				} catch (ParseException e ) {
					parseResult = null; // This may happen if the user presses return, in which case we don't close the window on a parse error
										// The button itself is disabled when there is a parse error.
				}
			}
		});

		shell.setDefaultButton(okButton);
		parseInput();
		shell.setMinimumSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		shell.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	int tokenEndPos(Token t) {
		return t.getCharPositionInLine()+t.getText().length();
	}
	
	void replaceOperatorCharsByUnicode(StyledText inputField) {
		String text = inputField.getText();
		disableInputModifiedHandler = true;
		
		for (int i=0; i<text.length(); i++) {
			switch (text.charAt(i)) {
				case '~':
					inputField.replaceTextRange(i, 1, "\u00ac");
					break;
				case '&':
					inputField.replaceTextRange(i, 1, "\u2227");
					break;
				case '^':
					inputField.replaceTextRange(i, 1, "\u2227");
					break;
				case '|':
					inputField.replaceTextRange(i, 1, "\u2228");
					break;
				case '-':
					if (i < text.length()-1 && text.charAt(i+1) == '>') {
						inputField.replaceTextRange(i, 2, "\u2192");
						i++;
						break;
					}
			}
		}
	
		disableInputModifiedHandler = false;
	}
	
	void parseInput() {
		replaceOperatorCharsByUnicode(formulaInputField);
		String inputText = formulaInputField.getText();		
		parseString(inputText);
		okButton.setEnabled( parseResult != null ); 
	}
	
	// Parsing with editing domain null causes the parser to use direct set operations rather than the editing domain.
	// If the editing domain is used while the widget is active, somehow the ... button in the property view is disposed.
	// Furthermore, it causes the document to be marked as dirty even when nothing is modified.
	ParseResult parseString(String inputStr) {
		OM om = OMFactory.eINSTANCE.createOM();
		CS cs = OMFactory.eINSTANCE.createCS();
		om.setCs(cs);
		Ontology defaultOntology = OMFactory.eINSTANCE.createOntology();
		defaultOntology.setOntologyID("Default");
		cs.getOntology().add(defaultOntology);

		return parseString(inputStr, om, null);
	}
		
	ParseResult parseString(String inputStr, OM om, TransactionalEditingDomain editingDomain) {
		try {
			parseResult = PSDParser.parse(editingDomain, om, inputStr);
			errorMarkerPos = -2;
			formulaInputField.redraw();
			parserOutput.setText("Partial State Description: "+PrettyPrint.prettyPrintPSD(parseResult.psd));
			parserOutput.setForeground(mkColor(PARSE_RESULT_COLOR));
			
			formulaViewer.refresh();
			formulaViewer.expandAll();


			//System.out.println("Tracked ranges");
    		// need to set the entire range to PATH color, because if there is only a StateFormula, it will not have a PathFormula as its parent, and
			// the [] will be black.
			applyColorAndStyle(formulaInputField, 0,formulaInputField.getText().length(), mkColor(PATH_COLOR), SWT.NORMAL);
    		for (Range range : parseResult.ranges) {
    			//System.out.println(range.object + ": " + range.startPos + ", " + range.endPos);
    			applyColorAndStyle(formulaInputField, range.startPos, range.endPos, getSyntaxColor(range.object), getSyntaxStyle(range.object));
    		}
			
			List<Concept> formulaConcepts = new ArrayList<Concept>();
			for (Ontology ontology : om.getCs().getOntology() ) { // there will only be one Ontology ("Default")
				formulaConcepts.addAll( ontology.getClasses() );
			}
					
			for (Concept modelConcept : modelConcepts) {
				for (Concept formulaConcept : formulaConcepts) {
					if (formulaConcept.getConcept().equals( modelConcept.getConcept() )) {
						formulaConcepts.remove( formulaConcept );
						break;
					}
				}
			}

			newConceptsList.removeAll();
			for (Concept c : formulaConcepts) {
				newConceptsList.add( c.getConcept() );
			}
			
			return parseResult;

		} catch (ParseException e)  {
    		errorMarkerPos = e.getPosition();    	
    		formulaInputField.redraw();
			parseResult = null;
			newConceptsList.removeAll();
			formulaViewer.refresh();
			
			parserOutput.setText( "Parse error: " + e.getMessage() +".");
			parserOutput.setForeground(mkColor(ERROR_MESSAGE_COLOR));
			return null;
		}
	}
	
	public void clearStyles(StyledText styledText) {
		StyleRange styleRange = new StyleRange(0, styledText.getText().length(), null, null, 0);
		formulaInputField.setStyleRange(styleRange);
	}

	public void applyColorAndStyle(StyledText styledText, int start, int end, Color fgColor, int fontStyle) {
		StyleRange styleRange = new StyleRange(start, end-start, fgColor, null, fontStyle);
		formulaInputField.setStyleRange(styleRange);
	}

	public void markFGColor(StyledText styledText, int start, int end, Color fgColor) {
		StyleRange styleRange = new StyleRange(start, end-start, fgColor, null, 0);
		formulaInputField.setStyleRange(styleRange);
	}

	public void markBGColor(StyledText styledText, int start, int end, Color bgColor) {
		StyleRange styleRange = new StyleRange(start, end-start, null, bgColor, 0);
		formulaInputField.setStyleRange(styleRange);
	}

	public Color getSyntaxColor(Object o) {
		if (o instanceof StateFormula)
			return mkColor(STATE_COLOR);
		else if (o instanceof PathFormula)
			return mkColor(PATH_COLOR);
		else  if (o instanceof Constant)
			return mkColor(CONSTANT_COLOR);
		else  if (o instanceof Variable)
			return mkColor(VARIABLE_COLOR);
		else  if (o instanceof Function)
			return mkColor(FUNCTION_COLOR);
		else
			return mkColor(DEFAULT_COLOR);
	}
	public int getSyntaxStyle(Object o) {
		if (o instanceof Variable)
			return SWT.BOLD;
		else
			return SWT.NORMAL;
	}
	
	private Color mkColor( int col ) {
		return getParent().getDisplay().getSystemColor( col );
	}
	
	// Select the subtree to which the character at pos belongs in the formula viewer. This in turn causes the subtree to be selected in the formulaInputField as well.
	private void selectSubtreeAtPos(int pos) {
		if (parseResult != null) {
				Range r = null;
		
			for (Range range : parseResult.ranges) // go through entire list, so we get the smallest range that contains this position
				if (pos >= range.startPos && pos < range.endPos) {
					r = range;
				}

			if (r != null) {
				formulaViewer.setSelection(new StructuredSelection(r.object));
			}
		}
	}


	private class UndoRecord {
		public String inputText;
		public int caretOffset;
		
		public UndoRecord(String inputText, int caretOffset) {
			this.inputText = inputText;
			this.caretOffset = caretOffset;
		}
	}
	
	private ArrayList<UndoRecord> undoHistory = new ArrayList<UndoRecord>();
	private int undoIndex;
	private boolean undoHistoryIsComplete; // if the undo buffer is full, the oldest entries are discarded. In that case undoIndex == 0 does not denote an unmodified psd anymore.
	
	private boolean unOrRedoing = false;
	
	private void initUndoHandler() {
		undoHistory.add(new UndoRecord(formulaInputField.getText(), formulaInputField.getCaretOffset()));
		undoIndex = 0;
		undoHistoryIsComplete = true;
		
		formulaInputField.addKeyListener(new KeyListener() {
			// Undo: Ctrl/Command z
			// Redo: Ctrl/Command y or Shift + Command z
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.stateMask == SWT.CONTROL && e.keyCode == 122)
					performUndo();
				else if (e.stateMask == SWT.CONTROL && e.keyCode == 121)
					performRedo();						
				else if (e.stateMask == SWT.COMMAND && e.keyCode == 122)
					performUndo();
				else if (e.stateMask == SWT.COMMAND && e.keyCode == 121)
					performRedo();						
				else if (e.stateMask == (SWT.COMMAND | SWT.SHIFT) && e.keyCode == 122)
					performRedo();						
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}});
	}
	
	private void performDo() {
		if (!unOrRedoing) {
			//System.out.println("Doing "+formulaInputField.getText());
			String newText = formulaInputField.getText();
			if (undoHistory.get( undoIndex ).inputText != newText) {
				if (undoHistory.size() >= MAX_UNDO_HISTORY) {
					undoHistory.remove(0);
					undoHistoryIsComplete = false;
					undoIndex--;
				}
				while (undoHistory.size() > undoIndex+1)
					undoHistory.remove(undoIndex+1);
				undoHistory.add(new UndoRecord( newText, formulaInputField.getCaretOffset()));
				undoIndex ++;
			}
			disenableUndoRedoButtons();
			//for (int i=0; i<undoHistory.size(); i++)
			//	System.out.print((i==undoIndex?">\"":"\"")+ undoHistory.get(i).inputText + (i==undoIndex?"\"<":"\"")+"  ");
			//System.out.println("\n"+undoHistory.size()+" and "+ undoIndex);
		}
	}
	
	private void performUndo() {
		//System.out.println("Undo");
		
		if (undoIndex > 0) {
			unOrRedoing = true;
			undoIndex--;
			UndoRecord undoRec = undoHistory.get( undoIndex );
			formulaInputField.setText( undoRec.inputText );
			formulaInputField.setCaretOffset( undoRec.caretOffset );
			unOrRedoing = false;
			disenableUndoRedoButtons();
		}
	}

	private void performRedo() {
		//System.out.println("Redo");

		if (undoIndex < undoHistory.size()-1) {
			unOrRedoing = true;
			undoIndex++;
			UndoRecord undoRec = undoHistory.get( undoIndex );
			formulaInputField.setText( undoRec.inputText );
			formulaInputField.setCaretOffset( undoRec.caretOffset );
			unOrRedoing = false;
			disenableUndoRedoButtons();
		}
	}
	
	private void disenableUndoRedoButtons() {
		undoButton.setEnabled(undoIndex > 0);
		redoButton.setEnabled(undoIndex < undoHistory.size()-1);
	}

}