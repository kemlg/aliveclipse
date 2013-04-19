package net.sf.ictalive.aliveclipse;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.navigator.CommonNavigator;

public class AliveNavigator extends CommonNavigator {

	/*
	 * Fix for empty navigator problem (which does not show contents until it's right clicked)
	 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=143430
	 */
	public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                getCommonViewer().setInput( ResourcesPlugin.getWorkspace ().getRoot() );
            }
        });
    }

}
