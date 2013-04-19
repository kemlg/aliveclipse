package control.diagram.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.navigator.AdaptabilityUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import control.diagram.part.ControlCreationWizard;
import control.diagram.part.ControlDiagramEditorPlugin;

public class OWLS2XMIAction implements IObjectActionDelegate {

	Logger log = LoggerFactory.getLogger(OWLS2XMIAction.class);

	private IWorkbenchPart activePart;
	private String selectedPath;
	private IFile selectedFile;
	
	private ISelection currentSelection;

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
		// TODO Auto-generated method stub
		System.out.println("Running OWLS2XMIAction on:" + selectedFile.getFullPath().toString());

		OWLS2XMI converter = new OWLS2XMI();

		control.OuterProcess model = converter.convertFile(selectedFile.getLocationURI().toString());
		Map<String, String> modelProperties = makeModelPropertiesMap(model);
		
		pluginShell = ControlDiagramEditorPlugin.getInstance().getWorkbench().getDisplay().getActiveShell();	
		//pluginShell = null;
		ControlCreationWizard wizard = new ControlCreationWizard();
		wizard.init(ControlDiagramEditorPlugin.getInstance().getWorkbench(), (IStructuredSelection)currentSelection, model, modelProperties);
		WizardDialog wDialog = new WizardDialog(pluginShell, wizard);
		try {
			wDialog.create();
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		wDialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		// ensure that the selection is a file which is available
		// in the underlying filesystem
		if(!(selection instanceof TreeSelection)){
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
			currentSelection = (IStructuredSelection)selection;
		} else {
			selectedFile = (IFile)openable;
			currentSelection = (IStructuredSelection)selection;
		}
	}
	
	private Map<String, String> makeModelPropertiesMap (control.OuterProcess model) {
		Map<String, String> propertiesMap = new HashMap<String, String>();
		propertiesMap.put("name", model.getServiceName());
		propertiesMap.put("processName", model.getName());
		propertiesMap.put("uri", model.getServiceURI());
		propertiesMap.put("description", model.getServiceDescription());
		return propertiesMap;
	}

}
