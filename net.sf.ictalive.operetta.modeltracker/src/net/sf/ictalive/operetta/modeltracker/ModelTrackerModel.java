package net.sf.ictalive.operetta.modeltracker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;

public class ModelTrackerModel {

	File historyFile;
	IResource workspaceRoot;
	
	private List<String> historySinceLastSave;
	private List<String> savedHistory;
	private String milestone;

	private static ModelTrackerModel currentModel;
	
	private static ModelListener listener;
	
	public interface ModelListener {
		public void refresh();
	}
	
	public static void setListener(ModelListener l) {
		listener = l;
	}

	public ModelTrackerModel() {
		historySinceLastSave = new ArrayList<String>();
		savedHistory = new ArrayList<String>();
		currentModel = this;
		if (listener != null)
			listener.refresh();
		
	}
	
	public void setHistoryFileAndParentResource(File historyFile, IResource workspaceRoot) {
		this.historyFile = historyFile;
		this.workspaceRoot = workspaceRoot;
		
		if (historyFile.exists())
			readFile();
		
		if (listener != null)
			listener.refresh();
	}

	private void writeFile() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(historyFile));
			for (String operation : savedHistory) {
				//System.out.println("writing: "+operation);
				out.write(operation+"\n");
			}
			out.close();
			
			// simply refresh the entire workspace. Getting the containing resource for the file is awkward, since
			// the opera resource does not yet exist when editorInputChanged is called in ModelTracker.
			// TODO: maybe refine this.
			workspaceRoot.refreshLocal(IFolder.DEPTH_INFINITE, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void readFile() {
		savedHistory = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(historyFile));
			String operation;
			while ((operation = in.readLine()) != null)
			  {
			    savedHistory.add(operation);
			  }
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static ModelTrackerModel getCurrentModel() {
		return currentModel;
	}
	
	// set this model tracker as the active one and refresh the view if it wasn't already the active one.
	public void activate() {
		boolean isNewModel = currentModel != this;
		currentModel = this;
		//System.out.println("Tracker activated: "+this+" current:"+currentModel);
		if (listener != null)
			if (isNewModel)
				listener.refresh();
	}
	
	public void close() {
		//System.out.println("closing: "+this+"  current: "+currentModel);
		if (currentModel == this) {
			currentModel = null;
			if (listener != null)
				listener.refresh();
		}
		
	}
	
	public void setOperations(List<String> operations) {
		//System.out.println("set ops "+operations);
		historySinceLastSave = operations;
		
		if (listener != null)
			listener.refresh();
	}
	
	public void saveHistory() {
		//System.out.println("Save history "+historyFile.getAbsolutePath());
		savedHistory.addAll(historySinceLastSave);
		if (milestone != null)
			savedHistory.add( milestone );
		
		writeFile();
		historySinceLastSave = new ArrayList<String>();
		milestone = null;
		currentModel = this;
		if (listener != null)
			listener.refresh(); // always refresh, regardless which model was viewed
	}
	
	public String getMilestone() {
		return this.milestone;
	}
	
	public void setMilestone(String milestone) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat timestampFormat = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");

		this.milestone = "Milestone ("+timestampFormat.format(cal.getTime())+"): "+milestone;

		if (listener != null)
			listener.refresh();
	}
	
	public void clearMilestone() {
		this.milestone = null;
		if (listener != null)
			listener.refresh();
	}
	
	// present the model as a list of strings. This method is called by the contentprovider for the listviewer in ModelTrackerView.
	public static List<String> presentCurrentModel() {
		List<String> presentation = new ArrayList<String>();
		
		presentation.add( "--------- Saved History ---------");
		presentation.addAll( getCurrentModel().savedHistory );
		presentation.add( "");
		presentation.add( "----- History since last save -----");
		presentation.addAll( getCurrentModel().historySinceLastSave );
		
		if (getCurrentModel().milestone != null)
			presentation.add( getCurrentModel().milestone );		

		return presentation;
	}
}
