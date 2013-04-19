package net.sf.ictalive.log.analysis_v2.pages;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class TableViewerContentProvider implements IStructuredContentProvider {
	
	public Object[] getElements(Object elem) {
		if(elem instanceof List<?>){
			return ((List<?>)elem).toArray();
		}else
			return new Object[0];
		
//		List<Role> roles = (List<Role>) elem;
//		return roles.toArray();
	}
	
	public void dispose(){	}


	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {		
	}
}