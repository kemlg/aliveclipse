package control.diagram.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.navigator.AdaptabilityUtility;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import control.diagram.part.ControlDiagramActionBarContributor;
import control.diagram.part.ControlDiagramEditorPlugin;

public class PublishOWLSAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;
	private String selectedPath;
	private IFile selectedFile;

	//Logger log = LoggerFactory.getLogger(PublishOWLSAction.class);
	Shell pluginShell;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		activePart = targetPart;
		pluginShell = targetPart.getSite().getShell();
	}

	@Override
	public void run(IAction action) {

		pluginShell = ControlDiagramEditorPlugin.getInstance().getWorkbench().getDisplay().getActiveShell();	
		if(selectedFile == null) {
			makeMessageBox(SWT.ICON_ERROR, "Aborting - cannot open the selected file");
		} else {
		//makeMessageBox(SWT.ICON_INFORMATION, "In publish action:  " + getClass() + 
			//	"\nActive selection is: " + selectedFile.getLocationURI());
		}
		PublishOWLSWizard wizard = new PublishOWLSWizard (selectedFile);
		WizardDialog wDialog = new WizardDialog(pluginShell, wizard);
		wDialog.create();
		wDialog.open();
		

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// ensure that the selection is a file which is available
		// in the underlying filesystem
		if(!(selection instanceof TreeSelection)) {
			return;
		}
		TreeSelection activeTreeSelection = (TreeSelection)selection;
		Object o = activeTreeSelection.getFirstElement();

		IAdaptable openable = (IAdaptable) AdaptabilityUtility
		.getAdapter(o, IResource.class);
		// otherwise try ResourceMapping
		if (openable == null) {
			openable = (IAdaptable) AdaptabilityUtility.getAdapter(o,
					ResourceMapping.class);
		} else if (((IResource) openable).getType() != IResource.FILE) {
			openable = null;
		}
		
		if(openable == null || ((IResource)openable).isAccessible()) {
		selectedFile = (IFile)openable;
		} else {
			selectedFile = (IFile)openable;
		}

	}

	private void makeMessageBox(int style, String msgString) {
		MessageBox mb = new MessageBox(pluginShell, style);

		mb.setText("Publish to repository");
		mb.setMessage(msgString);
		mb.open();
	}

}
