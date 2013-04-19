package net.sf.ictalive.log.analysis_v2.pages;

import net.sf.ictalive.log.analysis_v2.AnalyseLogWizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class AnalyseLogMainPage extends WizardPage implements Listener{

	IWorkbench workbench;
	IStructuredSelection selection;
//	AnalyseLogModel model;
	// widgets on this page 
	Text text;
	Combo list;
//	Combo normList;
	Combo process;
/*	Combo dateFrom, dateTo;
	Combo fromDate;
	Combo fromMonth;
	Combo fromYear;
	Combo toDate;
	Combo toMonth;
	Combo toYear;*/

	String dataLocation = "";
	final static String[] choices ={"Role-task Matrix", "Plans and actions results",/* "Service Invocation",*/ 
		"Deadline Violation", "Task Violation", "Norms Violated","Norms Activated","Norms Deactivated",
		"Norms Never Being Activated", "Norms Never Being Deactivated", 
		"Agents violated norms" ,/* "Agent violated rights",*/ "Landmarks fulfilled" , "Landmarks order not being obeyed", 
			};
	
/*	final static String[] normChoices = {"arrive_scene", "evacuate_places", "save_people", 
		"clear_scene", "report_case", "control_traffic", "deploy_transport"};*/
	
	//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
	
	// status variable for the possible errors on this page
	// timeStatus holds an error if the return date is before the departure date
	IStatus timeStatus;
			
/*	final static String[] dates ={ "1", "2", "3", "4", "5", "6", "7", "8", "9",
		"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
		"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	final static String[] months= {"January", "February", "March", "April", "May",
		"June", "July", "August", "September", "October", "November", "December" };*/

//	final static String[] years;
//	final static int startingYear;
	
/*	static {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		startingYear = cal.get(Calendar.YEAR);
		years = new String[3];
		years[0] = "2007";
		years[1] = "2008";
		years[2] = "2009";
		/*for (int i = -1; i < 2; i++) {
			years[i+1] = String.valueOf(startingYear + i);
		}*
	}*/
	
	public AnalyseLogMainPage(IWorkbench workbench, IStructuredSelection selection, String loc){
		super("Page1");
		setTitle("Analyse Log");
		setDescription("Select a function to analyse the event log");
		this.workbench = workbench;
		this.selection = selection;
//		this.model = model;
		timeStatus = new Status(IStatus.OK, "not_used", 0, "", null);	
		dataLocation = loc;
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		GridData gd;
		Composite composite =  new Composite(parent, SWT.NULL);

	    // create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 4;
		gl.numColumns = ncol;
		composite.setLayout(gl);
		
		// Date of travel
/*		new Label (composite, SWT.NONE).setText("Date From:");						
		fromDate = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		fromDate.setLayoutData(gd);
		fromDate.setItems(dates);		
//		toDate.setText(toDate.getItem(dayOfMonth -1)); // 0 based indexes

		fromMonth = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		fromMonth.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fromMonth.setItems(months);
//		toMonth.setText(toMonth.getItem(month));

		fromYear = new Combo(composite,  SWT.BORDER | SWT.READ_ONLY);
		fromYear.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fromYear.setItems(years);
//		toYear.setText(toYear.getItem(year - startingYear));

		// Date of return		
		new Label (composite, SWT.NONE).setText("Date To:");		
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;	
		toDate = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		toDate.setLayoutData(gd);
		toDate.setItems(dates);

		toMonth = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		toMonth.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		toMonth.setItems(months);

		toYear = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		toYear.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		toYear.setItems(years); */

		createLine(composite, ncol);
		
		new Label (composite, SWT.NONE).setText("Analysis Function:");						
		list = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		list.setLayoutData(gd);
		list.setItems(choices);		
//		list.setText(list.getItem(0));
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 2;
		list.setLayoutData(gd);
		new Label (composite, SWT.NONE).setText(" ");		
		
/*		new Label (composite, SWT.NONE).setText("Norm:");						
		normList = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		normList.setLayoutData(gd);
		normList.setItems(normChoices);	
		//normList.select(1);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 2;
		normList.setLayoutData(gd);
		new Label (composite, SWT.NONE).setText(" ");*/
		
		
/*		String[] enactList = model.queryAllEnactment();
		new Label (composite, SWT.NONE).setText("Enactment:");
		process = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		process.setLayoutData(gd);
		process.setItems(enactList);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 2;
		process.setLayoutData(gd);*/
		
		
		new Label (composite, SWT.NONE).setText("Analysis Result:");
		text = new Text(composite, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		text.setEditable(false);
		text.setText("Please select one item above");
	    GridData data = new GridData();
/*	    data.grabExcessHorizontalSpace = true;
	    data.grabExcessVerticalSpace = true;
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;*/
        data.widthHint = 400;
        data.heightHint = 500;
        text.setLayoutData(data); 
/*		
		String[] fromDates = model.queryStartDates();
		new Label (composite, SWT.NONE).setText("Date From:");
		dateFrom = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		dateFrom.setLayoutData(gd);
		dateFrom.setItems(fromDates);
		
		String[] toDates = model.queryFinishDates();
		new Label (composite, SWT.NONE).setText("Date To:");
		dateTo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		dateTo.setLayoutData(gd);
		dateTo.setItems(toDates);*/
		
		
		addListeners();
		// set the composite as the control for this page
		setControl(composite);		
				
	}
	
	private void addListeners()
	{
		list.addListener(SWT.Selection, this);
/*		toDate.addListener(SWT.Selection, this);
		toMonth.addListener(SWT.Selection, this);
		toYear.addListener(SWT.Selection, this);
		fromDate.addListener(SWT.Selection, this);
		fromMonth.addListener(SWT.Selection, this);
		fromYear.addListener(SWT.Selection, this);*/
//		normList.addListener(SWT.Selection, this);
	}
	
	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
	    Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		
	    if (event.widget == list){
			text.setText(""); // clear the original text
			// update the results from J48
			text.append(J48Function(list.getText()));
			text.update();
			
		}

		
		// If the event is triggered by any of the date fields  set
	    // corresponding status variable to the right value
/*	    if ((event.widget == toDate) || (event.widget == toMonth)
	    	|| (event.widget == toYear) || (event.widget == fromDate)
	    	|| (event.widget == fromMonth) || (event.widget == fromYear)) {
			if	(isDatePeriodSet() && !validDates()) 
	            status = new Status(IStatus.ERROR, "not_used", 0, 
	                "Date To cannot be before the Date From", null);	                
	        timeStatus = status;
	    }*/
	    applyToStatusLine(timeStatus);
		getWizard().getContainer().updateButtons();
	}
	

	private String J48Function(String choice){
		
		try{
			DataSource source = null;
			if(choice.equals("Deadline Violation")){
				source = new DataSource(dataLocation + "/logs/deadlineNorm.arff");
			}else if (choice.equals("Task Violation")){
				source = new DataSource(dataLocation + "/logs/taskViolation.arff");
			}else if (choice.equals("Norms Violated")){
				source = new DataSource(dataLocation + "/logs/normsViolatedCrisis.arff");
			}else if (choice.equals("Norms Activated")){
				source = new DataSource(dataLocation + "/logs/normsActivated.arff");
			}else if (choice.equals("Norms Deactivated")){
				source = new DataSource(dataLocation + "/logs/normsDeactivated.arff");
			}else if (choice.equals("Norms Never Being Activated")){
				source = new DataSource(dataLocation + "/logs/normsNeverActivated.arff");
			}else if (choice.equals("Norms Never Being Deactivated")){
				source = new DataSource(dataLocation + "/logs/normsNeverDeactivated.arff");
			}else if(choice.equals("Service Invocation") || choice.equals("Plans and actions results")
					|| choice.equals("Role-task Matrix") || choice.equals("Agents violated norms"))
				return "Go to the next page.";
			if (source == null){
				return "no data";
			}
			
			Instances train = source.getDataSet();
			 // setting class attribute if the data format does not provide this information
			 // E.g., the XRFF format saves the class attribute information as well
			 if (train.classIndex() == -1)
			   train.setClassIndex(train.numAttributes() - 1);
			 
			 Instances test = source.getDataSet();
			 if (test.classIndex() == -1)
				   test.setClassIndex(train.numAttributes() - 1);
			 
			// Remove rm = new Remove();
		//	 rm.setAttributeIndices("1");  // remove 1st attribute

			 Classifier cls = new J48();
			 cls.buildClassifier(train);
			 // evaluate classifier and print some statistics
			 Evaluation eval = new Evaluation(train);
			 eval.evaluateModel(cls, test);
			 /*
			 
			 // classifier
			 J48 j48 = new J48();
			 j48.setUnpruned(false);        // using an unpruned J48
			 

			 // meta-classifier
			 FilteredClassifier fc = new FilteredClassifier();
		//	 fc.setFilter(rm);
			 fc.setClassifier(j48);
			 
			 // train and make predictions
			 fc.buildClassifier(train);*/
			 
			 StringBuffer outBuff = new StringBuffer();
			 outBuff.append("======== Data Analysis Information ========\n\n");
			 outBuff.append("Relation:     " + train.relationName() + '\n');
			 outBuff.append("Instances:    " + train.numInstances() + '\n');
			 outBuff.append("Attributes:   " + train.numAttributes() + '\n');
			 if (train.numAttributes() < 100) {
			      for (int i = 0; i < train.numAttributes(); i++) {
				outBuff.append("              " + train.attribute(i).name()
					       + '\n');
			      }
			    } else {
			      outBuff.append("              [list of attributes omitted]\n");
			    }   
			// String s = eval.toSummaryString("\nEvaluation on training set (Summary)\n======\n", false);
			 outBuff.append("\n");
			 outBuff.append(cls.toString());
			 outBuff.append("\n======== Summary ======== \n");
			 outBuff.append(eval.toSummaryString());
			 return outBuff.toString(); //cls.toString();
			 
		}catch(Exception e)
		{e.printStackTrace();}

		return "no data";
	}
	/*
	 * Returns the next page.
	 * Saves the values from this page in the model associated 
	 * with the wizard. Initializes the widgets on the next page.
	 */
	
	public IWizardPage getNextPage()
	{  
		if(list.getText().equals("Plans and actions results")) {
			ThroughputPage page = ((AnalyseLogWizard)getWizard()).throughPage;
		//	page.onEnterPage();
			return page;
		}else if (list.getText().equals("Service Invocation")){
			ServiceInvocationPage page = ((AnalyseLogWizard)getWizard()).service;
		//	page.onEnterPage();
			return page;
		}else if (list.getText().equals("Role-task Matrix")){
			RoleTaskMatrixPage page = ((AnalyseLogWizard)getWizard()).rolePage;
			return page;
		}
		else if (list.getText().equals("Agents violated norms")){
			AgentViolatedNormsPage page = ((AnalyseLogWizard)getWizard()).agentViolatedPage;
			//	page.onEnterPage();
				return page;
		}
	/*	}else if (list.getText().equals("social network analysis")){
			TestPage page = ((AnalyseLogWizard)getWizard()).testPage;
			//	page.onEnterPage();
				return page;
		}else if (list.getText().equals("quality of service")){
			QoSPage page = ((AnalyseLogWizard)getWizard()).qosPage;
			//	page.onEnterPage();
				return page;
		}*/
		
		return null;
	}
	/**
	 * @see IWizardPage#canFlipToNextPage()
	 */
	public boolean canFlipToNextPage()
	{
		if (getErrorMessage() != null) return false;
		if(!list.getText().equals("")) return true;
		return false;
	}
	/*
	private boolean validDates()
	{
		if (isDatePeriodSet()) {
			// compare the years first, if not equal, we have an answer		
			int i = Integer.parseInt(toYear.getText());
			int j = Integer.parseInt(fromYear.getText());
			if (i>j) return true;
			if (i<j) return false;
			
			// if the years are equal, look at the month
			i = toMonth.getSelectionIndex();
			j = fromMonth.getSelectionIndex();
			if (j== -1) {						
				// if the travel month still contains the initial value the selection index is still -1
				// we need to find the index of the current month
				String month1 = fromMonth.getText();
				for (int k = 0; k<12;k++)
					if (months[k].equals(month1)) { j= k; break;}
			}
			if (i>j) return true;
			if (i<j) return false;

			// if the months are also equal, comparing the ddays we have the answer			
			i = Integer.parseInt(toDate.getText());
			j = Integer.parseInt(fromDate.getText());
			if (i<j) return false;
			return true;
		}
		return false;
	}*/
	/**
	 * @return true iff all fields of the return dates are set
	 *
	private boolean isDatePeriodSet()
	{
		if ((toDate.getSelectionIndex() >=0)
			&& (toMonth.getSelectionIndex()>=0)
			&& (toYear.getSelectionIndex()>=0)) return true;
		return false;
	}*/
	
	/**
	 * Applies the status to the status line of a dialog page.
	 */
	private void applyToStatusLine(IStatus status) {
		String message= status.getMessage();
		if (message.length() == 0) message= null;
		switch (status.getSeverity()) {
			case IStatus.OK:
				setErrorMessage(null);
				setMessage(message);
				break;
			case IStatus.WARNING:
				setErrorMessage(null);
				setMessage(message, WizardPage.WARNING);
				break;				
			case IStatus.INFO:
				setErrorMessage(null);
				setMessage(message, WizardPage.INFORMATION);
				break;			
			default:
				setErrorMessage(message);
				setMessage(null);
				break;		
		}
	}
	
	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}
}
