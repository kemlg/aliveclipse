package control.diagram.part;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import control.ControlPackage;
import control.diagram.util.OWLSBuilder;
/**
 * @generated NOT
 */
public class ExportOWLSAction extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IEditorPart diagramEditor = HandlerUtil.getActiveEditorChecked(event);
		Shell shell = diagramEditor.getEditorSite().getShell();
		assert diagramEditor instanceof DiagramEditor;
		TransactionalEditingDomain editingDomain = ((DiagramEditor) diagramEditor)
		.getEditingDomain();

		// path and file name of document editor, to use as initial settings
		// for OWL-S save file dialog
		IPath path = null;
		String fileName = null;

		// check if document is dirty, and exit if so
		if(diagramEditor.isDirty()) {
			System.out.println("Document is dirty - exiting");
			makeMessageBox(shell, SWT.ICON_WARNING, "Please save before exporting");
			throw new ExecutionException("Can't export with unsaved changes");
		}

		// get the document (not the diagram) resource from the current editingDomain
		ResourceSet rs = editingDomain.getResourceSet();

		XMIResourceImpl documentResource = null;
		for(Resource aResource : rs.getResources()) {
			if(aResource.getClass() == org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl.class) {
				documentResource = (XMIResourceImpl)aResource;
			}
		}

		// if we failed to get a document resource, we can't continue
		if(documentResource == null) {
			makeMessageBox(shell, SWT.ICON_ERROR, "Can't get the model document");
			throw new ExecutionException("Couldn't get document resource");
		} else if(documentResource.getContents().get(0).eClass()!=ControlPackage.Literals.OUTER_PROCESS) {
			// if the document root isn't an OuterProcess (somehow), we can't serialize it
			makeMessageBox(shell, SWT.ICON_ERROR, "Model is malformed");
			throw new ExecutionException("Model root element is not an OuterProcess");
		}

		// Get path and filename to write the OWL-S in the same 
		// workspace container as the Diagram and XMI, if possible
		// see org.eclipse.gmf.runtime.diagram.ui.render.actions.CopyToImageAction

		// The editor's input may provide us with an IContainer where
		// we should store items related to it.
		IContainer container = (IContainer) diagramEditor.getEditorInput()
		.getAdapter(IContainer.class);

		// If there is a container in the workspace and it exists then
		// we will use its path to store the image.
		if (container != null && container.exists()) {
			// The path has to be an absolute filesystem path for this
			// use case rather than just the path relative to the workspace
			// root.
			path = container.getLocation();
		}

		// Otherwise, we will try to adapt the input to the IFile that
		// represents the place where the editor's input file resides.
		// We can extrapolate a destination path from this file.
		if (path == null) {
			IFile file = (IFile) diagramEditor.getEditorInput().getAdapter(
					IFile.class);

			// We can't necessarily assume that the editor input is a file.
			if (file != null) {
				path = file.getLocation().removeLastSegments(1);
				fileName = file.getLocation().removeFileExtension()
				.lastSegment();
			}
		}

		// now we've got a filename and path, use them to populate a 
		// FileDialog to choose OWL-S file destination
		String owlsFilePath = makeSaveLocationDialog(shell, path, fileName);
		//System.out.println("Writing OWL-S to file: " + owlsFilePath);

		OWLSBuilder owlsBuilder;
		try {
			owlsBuilder = new OWLSBuilder();
			control.OuterProcess documentHead = (control.OuterProcess)documentResource.getContents().get(0);

			owlsBuilder.initialiseService("http://www.example.com/services");
			owlsBuilder.processOWLSModel(documentHead);
		} catch(RuntimeException re) {
			// error handling in OWLSBuilder has failed if we get here
			// make an empty (unknown cause) error dialog and rethrow
			re.printStackTrace();
			makeSerializationErrorDialog(shell, null);
			throw re;
		}

		// check how the serialization turned out...
		List<String> errors = owlsBuilder.getErrorStrings();
		if(errors==null) {
			System.out.println("Serialization completed successfully");
		} else {
			System.err.println("Serialization abandoned - see errors");
			for(String message : errors) {
				System.err.println(message);
			}
			// show errors dialog, then abandon the process
			makeSerializationErrorDialog(shell, errors);
			throw new ExecutionException("Serialization failed");

		}


		File outFile = new File(owlsFilePath);
		FileOutputStream fOut;
		try {
			fOut = new FileOutputStream(outFile);
			owlsBuilder.writeOutput(fOut);
			fOut.close();
			// TODO assuming we're in the same container as the diagram
			// refresh it after the file has been written
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			List<String> ioMsg = new LinkedList<String>();
			ioMsg.add("Serialization completed - but file write failed");
			makeSerializationErrorDialog(shell, ioMsg);
			throw new ExecutionException("Serialization failed");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			List<String> ioMsg = new LinkedList<String>();
			ioMsg.add("Serialization completed - but file close failed");
			makeSerializationErrorDialog(shell, ioMsg);
			throw new ExecutionException("Serialization failed");
		}

		makeMessageBox(shell, SWT.ICON_INFORMATION, "OWL-S serialization completed with no errors");


		return null;
	}

	private int makeMessageBox(Shell _shell, int _style, String _message) {

		MessageBox newMB = new MessageBox(_shell, _style);

		newMB.setText("Export to OWL-S");
		newMB.setMessage(_message);

		return newMB.open();

	}

	private String makeSaveLocationDialog(Shell _shell, IPath _path, String _filename) {
		FileDialog saveFileDialog = new FileDialog(_shell, SWT.SAVE);
		saveFileDialog.setOverwrite(true);
		saveFileDialog.setText("Choose a location to export OWL-S");
		saveFileDialog.setFilterExtensions(new String[] {"*.owl", "*.*"});
		saveFileDialog.setFilterNames(new String[] {"OWL-S service descriptions (*.owl)", "All files (*.*)"});
		saveFileDialog.setFilterPath(_path.toOSString());
		saveFileDialog.setFileName(_filename);	

		return saveFileDialog.open();

	}

	private void makeSerializationErrorDialog(Shell _shell, List<String> _messages) {

		String newLine = System.getProperty("line.separator");
		StringBuilder dialogMsg;
		// if called with an empty error if owlsBuilder error handling fails to handle an exception...
		if(_messages == null || _messages.isEmpty()) {
			dialogMsg = new StringBuilder("Serialization failed with an unknown error.");
		} else {	
			dialogMsg = new StringBuilder("Serialization failed with errors:");
			dialogMsg.append(newLine);
			dialogMsg.append(newLine);

			// make a status object for each of the error messages
			for(String _msg : _messages) {
				dialogMsg.append(_msg);
				dialogMsg.append(newLine);
			}
		}
		makeMessageBox(_shell, SWT.ICON_ERROR, dialogMsg.toString());

	}

}
