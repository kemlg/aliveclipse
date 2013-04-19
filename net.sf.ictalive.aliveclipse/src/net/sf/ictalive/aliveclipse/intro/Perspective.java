package net.sf.ictalive.aliveclipse.intro;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		//TODO: This should define the "default" ALIVE perspective
		//E.g., allowing project management, dashboards, etc.
		//Other tools (plugins) will define their own perspectives for using them.
		String editorArea = layout.getEditorArea();
		
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		
		//Build the window/place views:
		
		 // Top left: Project Explorer view and Outline view placeholder
		 IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.15f,
				    editorArea);
		 IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.5f,
				    editorArea);
		 bottom.addView("net.sf.ictalive.operetta.dashboard.DashboardPart");
		 bottom.addView(IPageLayout.ID_PROP_SHEET);
		 bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		
		 topLeft.addView("net.sf.ictalive.navigator");
				
	}
}
