package net.sf.ictalive.operetta.editor.modeltracker;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public interface IModelTracker {
	void init(TransactionalEditingDomain editingDomain);

	void editorInputChanged(URI newInputURI);
	
	// to make sure that the view shows the history for the active editor
	void editorWasActivated();
	
	void editorWasClosed();
	
	void saveOperations();
	
	void commandWasPerformed();
}
