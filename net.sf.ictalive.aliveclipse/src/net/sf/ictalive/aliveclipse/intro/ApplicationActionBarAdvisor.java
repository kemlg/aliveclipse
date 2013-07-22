package net.sf.ictalive.aliveclipse.intro;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use them
    // in the fill methods.  This ensures that the actions aren't recreated
    // when fillActionBars is called with FILL_PROXY.

    private IWorkbenchAction newAction;
	private ActionList fileActions;
	private ActionList editActions;
	private ActionList navigateActions;
	private ActionList windowActions1;
	private ActionList windowActions2;
	private ActionList navigationActions;
	private ActionList helpActions;
	
	private IContributionItem showViewItem;
    private IContributionItem openPerspectiveItem;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
		
		//clear up the Eclipse interface.
		removeExtraneousActions();
	}

	/*
	 * Class for easily adding actions to menus.
	 * 
	 * In make actions, create a new ActionList containing the factories for the desired actions and the actions are created, registered. 
	 * In fillMenuBar, call addTo on the ActionList to add the actions to a menu.
	 * 
	 * A separator can be specified by providing a null in the factory list on creation.
	 */
	public class ActionList {
		private List<IWorkbenchAction> actions = new ArrayList<IWorkbenchAction>();

		// a null factory is used to denote a separator
		public ActionList(IWorkbenchWindow window, ActionFactory[] factories) {
			for (ActionFactory factory : factories) {
				if (factory != null) {
					IWorkbenchAction action = factory.create(window);
					register(action);
					actions.add(action);
				}
				else // for the null factory, add a null action that will cause addition of a separator by addTo
					actions.add(null);
			}
		}
		
		public void addTo(MenuManager menuManager) {
			for (IWorkbenchAction action : actions)
				if (action != null) 
					menuManager.add(action);
				else
					menuManager.add(new Separator());
		}
	}
	
	protected void makeActions(IWorkbenchWindow window) {
		// Creates the actions and registers them.
        // Registering is needed to ensure that key bindings work.
        // The corresponding commands keybindings are defined in the plugin.xml file.
        // Registering also provides automatic disposal of the actions when
        // the window is closed.
		
		newAction = ActionFactory.NEW.create(window); // this one is added manually, because by default is has name Other.. and an icon we don't want.
		newAction.setText("New");
		newAction.setImageDescriptor(null);
		register(newAction);

		// NOTE: the null objects in these lists denote separators.
		fileActions = new ActionList(window, new ActionFactory[] {null, ActionFactory.CLOSE, ActionFactory.CLOSE_ALL,
					null, ActionFactory.SAVE, ActionFactory.SAVE_AS, ActionFactory.SAVE_ALL, ActionFactory.REVERT, null,
					ActionFactory.MOVE, ActionFactory.RENAME, ActionFactory.REFRESH, null, ActionFactory.PRINT, null,
					ActionFactory.IMPORT, ActionFactory.EXPORT, null, ActionFactory.PROPERTIES , null, ActionFactory.QUIT });
		
		editActions = new ActionList(window, new ActionFactory[] {ActionFactory.UNDO, ActionFactory.REDO, null,
				ActionFactory.CUT, ActionFactory.COPY, ActionFactory.PASTE, null,
				ActionFactory.DELETE, ActionFactory.SELECT_ALL, null,
				ActionFactory.FIND, null});
		
		navigateActions = new ActionList(window, new ActionFactory[] {ActionFactory.GO_INTO, ActionFactory.BACK, ActionFactory.FORWARD, ActionFactory.UP, null,
				ActionFactory.NEXT, ActionFactory.PREVIOUS});
		helpActions = new ActionList(window, new ActionFactory[] {ActionFactory.ABOUT, null, ActionFactory.INTRO});        

        windowActions1 = new ActionList(window, new ActionFactory[] {ActionFactory.OPEN_NEW_WINDOW, ActionFactory.NEW_EDITOR, null});
        windowActions2 = new ActionList(window, new ActionFactory[] {null, ActionFactory.EDIT_ACTION_SETS, ActionFactory.SAVE_PERSPECTIVE, ActionFactory.RESET_PERSPECTIVE,
        		ActionFactory.CLOSE_PERSPECTIVE, ActionFactory.CLOSE_ALL_PERSPECTIVES,null});
        navigationActions = new ActionList(window, new ActionFactory[] {ActionFactory.SHOW_PART_PANE_MENU, ActionFactory.SHOW_VIEW_MENU, ActionFactory.SHOW_QUICK_ACCESS, null, 
        		ActionFactory.MAXIMIZE, ActionFactory.MINIMIZE, null,
        		ActionFactory.ACTIVATE_EDITOR, ActionFactory.NEXT_EDITOR, ActionFactory.PREVIOUS_EDITOR, ActionFactory.SHOW_OPEN_EDITORS, null,
        		ActionFactory.NEXT_PART, ActionFactory.PREVIOUS_PART, null,
        		ActionFactory.NEXT_PERSPECTIVE, ActionFactory.PREVIOUS_PERSPECTIVE});

        /* Menu items not found yet (maybe they are not necessary):
         
         * File:
         * open file   org.eclipse.ui.edit.text.actionSet.openExternalFile
         * convert line delimiters
         * switch workspace
         * restart
         * list of recent files at bottom of menu
         * 
         * Navigate:
         * Open Task
         * Activate Task
         * Deactivate Task
         * Show In
         * Quick Context View
         * Last Edit Location
         * Back submenu
         * Forward submenu
         * 
         * Search:
         * all
         * 
         * Project:
         * all
         * 
         * Edit:
         * add Bookmark
         * add task
         */
        
        
        openPerspectiveItem = ContributionItemFactory.PERSPECTIVES_SHORTLIST.create(window);
        showViewItem = ContributionItemFactory.VIEWS_SHORTLIST.create(window);

	}

	protected void fillMenuBar(IMenuManager menuBar) {
		
		MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		MenuManager editMenu = new MenuManager("&Edit", IWorkbenchActionConstants.M_EDIT);
		MenuManager navigateMenu = new MenuManager("&Navigate", IWorkbenchActionConstants.M_NAVIGATE);
		MenuManager windowMenu = new MenuManager("&Window", IWorkbenchActionConstants.M_WINDOW);
		MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(navigateMenu);
		menuBar.add(windowMenu);
		menuBar.add(helpMenu);
		
		fileMenu.add(newAction);
		fileActions.addTo(fileMenu);
		editActions.addTo(editMenu);
		navigateActions.addTo(navigateMenu);
		navigateMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS)); // need to add this explicitly or text editor doesn't work
		helpActions.addTo(helpMenu);
		helpMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

		// Window
        windowActions1.addTo(windowMenu);
        
        
		MenuManager openPerspectiveMenuMgr = new MenuManager("Open Perspective", "openPerspective");
		Separator openPerspectiveSeparator = new Separator("openPerspectiveSeparator");
		// we need to give the separator an id, so we can put actions before it using plugin locationURIs (which only support before and after)
		openPerspectiveMenuMgr.add(openPerspectiveSeparator);
		openPerspectiveMenuMgr.add(openPerspectiveItem);
		windowMenu.add(openPerspectiveMenuMgr);  // apparently, this thing gets id "perspectivesShortlist" (can be used in locationURIs in menuContributions)
		
		MenuManager showViewMenuMgr = new MenuManager("Show View", "showView");
		Separator showViewSeparator = new Separator("showViewSeparator");
		showViewMenuMgr.add(showViewSeparator);
		showViewMenuMgr.add(showViewItem);
				
		windowMenu.add(showViewMenuMgr); // gets id "viewsShortList" (can be used in locationURIs in menuContributions)

        windowActions2.addTo(windowMenu);
        
		MenuManager navigationMenuMgr = new MenuManager("Navigation", "navigation");
		navigationActions.addTo(navigationMenuMgr);
		windowMenu.add(navigationMenuMgr);
        
		
		
		
	}
	
	private void removeExtraneousActions() {

//		ActionSetRegistry reg = WorkbenchPlugin.getDefault().getActionSetRegistry();
		
		// TODO: Keeping these removals gives a lot of exceptions, check whether it is necessary to remove them and how to do it if so.
		// removing gotoLastPosition message
		//removeStandardAction(reg, "org.eclipse.ui.edit.text.actionSet.navigation");

		// Removing "Convert Line Delimiters To" menu
		//removeStandardAction(reg, "org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo");
		
		//Remove "Open File..." menu item
		//removeStandardAction(reg, "org.eclipse.ui.actionSet.openFiles");
	}

//	@SuppressWarnings("restriction")
//	private void removeStandardAction(ActionSetRegistry reg, String actionSetId) {
//
//		IActionSetDescriptor[] actionSets = reg.getActionSets();
//
//		for (int i = 0; i <actionSets.length; i++)
//		{
//		    if (!actionSets[i].getId().equals(actionSetId))
//		        continue;
//	        IExtension ext = actionSets[i].getConfigurationElement()
//	            .getDeclaringExtension();
//	        reg.removeExtension(ext, new Object[] { actionSets[i] });
//		}
//	}
}
