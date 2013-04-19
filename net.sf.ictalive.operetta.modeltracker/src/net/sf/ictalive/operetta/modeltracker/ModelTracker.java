package net.sf.ictalive.operetta.modeltracker;

import java.io.File;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;

import net.sf.ictalive.operetta.OM.Arc;
import net.sf.ictalive.operetta.OM.DeonticStatement;
import net.sf.ictalive.operetta.OM.Dependency;
import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.IndividualDeonticStatement;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.MarketDependency;
import net.sf.ictalive.operetta.OM.NetworkDependency;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Player;
import net.sf.ictalive.operetta.OM.Right;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.RoleDeonticStatement;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionNorm;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;
import net.sf.ictalive.operetta.editor.modeltracker.IModelTracker;

/*
 * TODO: 
 * - The commandWasPerformed method is called too often (three times on a property change), see how we can prevent this.
 * - Deleting Opera should delete history as well. Maybe store id in history file to check whether it is the right one?
 * - Same thing for renaming Opera file.
 * - Model can only be saved when .opera has been edited. So in order to save the initial addScene(start..) and addScene(end..) history
 *   a dummy edit operation must be performed. The same thing holds if we want to save an added milestone.
 * - Check whether a ListViewer is actually the best way to view the history, or maybe if we should use it differently.
 * - Optimization: currently, the entire saved and current history is sent to the view on each update. 
 *                 Instead, the view can be adapted to make it possible to only update the current history.
 */

public class ModelTracker implements IModelTracker {

	protected final String HISTORY_EXTENSION = "history";

	protected ModelTrackerModel modelTrackerModel; // keeps track of update operations before last save, and update operations since.
	
	protected ConceptTracker conceptTracker; // used to compute the current concepts. Keeps track of the concepts that were in the model on the last save.
	
	protected TransactionalEditingDomain editingDomain;

	// called when the editor is initialized. We simply initialize the instance variables.
	public void init(TransactionalEditingDomain editingDomain) {
		//System.out.println("init "+this);
		this.editingDomain = editingDomain;		
		this.modelTrackerModel = new ModelTrackerModel();
		this.conceptTracker = new ConceptTracker();
	}

	// called when the editor input has changed. We compute the new history file path and set the savedTrackedConcepts to null to signal that it should be initialized 
	// at editorWasActivated.
	public void editorInputChanged(URI newInputURI) {
		//System.out.println("editorInputChanged "+this);
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IPath workspaceRootPath = workspaceRoot.getLocation();		   
	
	    String workspacePathToResource = newInputURI.toPlatformString(true);
	    
	    IPath historyFilePath = workspaceRootPath.append(workspacePathToResource).removeFileExtension().addFileExtension(HISTORY_EXTENSION);
		File historyFile = new File(historyFilePath.removeFileExtension().addFileExtension("history").toString());		
		
		// at this time it is not yet possible to access the resource, so we set the savedTrackedConcepts
		// to null, to signal that the savededTrackConcepts need to be initialized on the next editorWasActivated.
		conceptTracker.savedTrackedConcepts = null;
	
		modelTrackerModel.setHistoryFileAndParentResource(historyFile, workspaceRoot);			
	}
	
	// Called when the editor became active. The modelTracked model is activated to ensure that the modelTracker view is viewing this model.
	// If savedTrackedConcepts is null, we initialize it with the current concepts in the model if there was a history file, and with an empty set
	// if there was no history file.
	public void editorWasActivated() {
		//System.out.println("editorWasActivated() "+this);
		
		modelTrackerModel.activate();
		
		if 	(conceptTracker.savedTrackedConcepts == null) { // this means we have a new or different om model
			conceptTracker.savedTrackedConcepts = new TreeSet<TrackedConcept>();
			if (modelTrackerModel.historyFile.exists()) {
				// There is a history file, so all concepts in the model are recorded in it.
				// Hence, we set the savedTrackedConcepts to the currentConcepts
				conceptTracker.savedTrackedConcepts = conceptTracker.computeCurrentTrackedConcepts(editingDomain);
			}
			else {
				// There was no history file, so the current concepts are the concepts since the last save.
				modelTrackerModel.setOperations( conceptTracker.computeUpdateOperations(editingDomain) );				
			}
		}
	}

	public void editorWasClosed() {
		//System.out.println("editorClosed() "+this);
		modelTrackerModel.close();
	}
	
	public void saveOperations() {
		//System.out.println("saveOperations() "+this);

		modelTrackerModel.saveHistory();
		conceptTracker.savedTrackedConcepts = conceptTracker.computeCurrentTrackedConcepts(editingDomain);
	}

	// Called on every change to the model. Unfortunately, it is called a bit too often, but since OperA models are never extremely large this is not really a problem.
	public void commandWasPerformed() {
		//System.out.println("commandWasPerformed"+conceptTracker.savedTrackedConcepts);
		
		modelTrackerModel.setOperations( conceptTracker.computeUpdateOperations(editingDomain) );
	}
		
}
