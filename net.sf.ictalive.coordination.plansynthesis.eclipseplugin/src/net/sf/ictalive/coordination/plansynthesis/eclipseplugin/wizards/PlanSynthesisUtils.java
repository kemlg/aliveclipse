/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.io.IOException;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.operetta.OM.OMPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * @author David Corsar
 *
 */
public class PlanSynthesisUtils {
	
	public static ResourceSet createResourceSet(){
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(TasksPackage.eNS_URI,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(TasksPackage.eNS_PREFIX,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(ActionsPackage.eNS_URI,
				ActionsPackage.eINSTANCE);
		rs.getPackageRegistry().put(OMPackage.eNS_URI,
				OMPackage.eINSTANCE);
		rs.getPackageRegistry().put(OMPackage.eNS_URI,
				OMPackage.eINSTANCE);
		rs.getPackageRegistry().put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE);
		return rs;
	}
	
	
	public static PlansCollection loadFirstPlanCollection(String planXmi){
		URIConverter.ReadableInputStream in = new URIConverter.ReadableInputStream(planXmi);
		ResourceSet rs = createResourceSet();
		Resource r = rs.createResource(URI.createURI("plans.plans"));
		try {
			r.load(in, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
			return null;
		}
		for (EObject obj : r.getContents()){
			if (obj instanceof PlansCollection){
				return (PlansCollection)obj;
			}
		}
		return null;
	}
}
