package net.sf.ictalive.operetta.psdeditor;

import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Constant;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
//import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditor;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class CustomizedPropertyDescriptor extends PropertyDescriptor {


	public CustomizedPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}



	public CellEditor createPropertyEditor(Composite composite) {
		// based on example from http://dev.eclipse.org/newslists/news.eclipse.modeling.gmf/msg10837.html
		
		CellEditor result = super.createPropertyEditor(composite);
		if (result == null)
			return result;
		EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);
		if (feature.getEType().getInstanceClass() == PartialStateDescription.class && object instanceof EObject) {
			final EObject eObject = (EObject)object;
			final PartialStateDescription oldPSD = (PartialStateDescription)(eObject.eGet((EStructuralFeature) itemPropertyDescriptor.getFeature(object)));
									
			result = new ExtendedDialogCellEditor(composite,
					getEditLabelProvider()) {

				// inspired by http://www.eclipse.org/articles/Article-VE-Custom-Widget/customwidget.html
				protected Object openDialogBox(Control cellEditorWindow) {

					// get the editing domain from the active editor. This should be a TransactionalEditingDomain.
					TransactionalEditingDomain editingDomain = null;
					IWorkbench workbench= PlatformUI.getWorkbench();
					IEditorPart part= workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
					if (part instanceof IEditingDomainProvider) {
						EditingDomain dom = ((IEditingDomainProvider)part).getEditingDomain();
						if (dom instanceof TransactionalEditingDomain) 
							editingDomain = (TransactionalEditingDomain)dom;
					}
					
					Display display = cellEditorWindow.getDisplay();
					PSDEditor dialog = new PSDEditor(oldPSD, eObject, editingDomain, display.getActiveShell());   
					//System.out.println("Opening");
					Object o = dialog.open();
					//System.out.println("Done");
					
					return o;
					
					}
				};
			};

		
	

	return result;
}
}