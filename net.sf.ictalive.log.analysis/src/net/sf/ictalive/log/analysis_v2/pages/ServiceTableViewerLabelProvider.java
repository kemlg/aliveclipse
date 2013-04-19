package net.sf.ictalive.log.analysis_v2.pages;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ServiceTableViewerLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex){
		return null;
	}
	/*	public Image getColumnImage(Object element, int columnIndex) {
		// In case you don't like image just return null here
		if (columnIndex == 3) {
			if (((Person) element).isMarried()) {
				return CHECKED;
			} else {
				return UNCHECKED;
			}
		}
		return null;
	}*/

	public String getColumnText(Object element, int columnIndex){
//		Role r = (Role) element;
		switch (columnIndex) {
		case 0:
			return "name";//r.getName();
		case 1:
			return "r.getObjective()";
		case 2:
			return "r.getSubobjective()";
		case 3:
			return "r.getObliged()";
		default:
			throw new RuntimeException("Should not happen");
		}

	}

}