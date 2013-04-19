package net.sf.ictalive.operetta.editor.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class OperettAPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		
		//Build the window/place views:
		
		 // Top left: Project Explorer view and Outline view placeholder
		 IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f,
		    editorArea);
		 topLeft.addView("org.eclipse.ui.views.ResourceNavigator");
		 topLeft.addPlaceholder(IPageLayout.ID_OUTLINE);

		 // Bottom left: Problem view
		 IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.66f,
		 	   "topLeft");
		 bottomLeft.addView(IPageLayout.ID_PROBLEM_VIEW);

		 // Bottom right: Property Sheet view and Console view placeholder
		 IFolderLayout bottomRight = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.66f, editorArea);
		 bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		 bottomRight.addPlaceholder(IConsoleConstants.ID_CONSOLE_VIEW);
		 bottomRight.addPlaceholder("net.sf.ictalive.operetta.dashboard.DashboardPart");
		
		 
		 
	}

}
