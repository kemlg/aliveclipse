package net.sf.ictalive.monitortool.views;

import net.sf.ictalive.eventbus.exception.EventBusConnectionException;
import net.sf.ictalive.monitortool.dialogs.EventBusLocation;
import net.sf.ictalive.monitortool.domain.AsserterGraphCreator;
import net.sf.ictalive.monitortool.domain.CoordinationGraphCreator;
import net.sf.ictalive.monitortool.domain.EventBusList;
import net.sf.ictalive.monitortool.domain.EventBusNode;
import net.sf.ictalive.monitortool.domain.EventLogList;
import net.sf.ictalive.monitortool.domain.EventLogNode;
import net.sf.ictalive.monitortool.domain.GeneralGraphCreator;
import net.sf.ictalive.monitortool.domain.OrganizationGraphCreator;
import net.sf.ictalive.monitortool.domain.RunGrahpCreator;
import net.sf.ictalive.monitortool.domain.VisualizationKind;
import net.sf.ictalive.monitortool.eventbus.EventProvider;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class EventBusLocationView extends ViewPart
{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "monitortool.views.EventBusLocationView";
	
	private EventBusList buslist;
	private EventLogList loglist;
	private TreeViewer viewer;
	private Action addEventBus, addEventLog;
	private Action action2;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements ITreeContentProvider
	{
		public void inputChanged(Viewer v, Object oldInput, Object newInput)
		{
		}

		public void dispose()
		{
		}

		public Object[] getElements(Object parent)
		{
			Object[]	objs;
			
			if(parent.equals("Event Buses"))
			{
				objs = buslist.getEventBusNodes();
			}
			else if(parent.equals("Event Logs"))
			{
				objs = loglist.getEventLogNodes();
			}
			else
			{
				objs = new Object[] {"Event Buses", "Event Logs"};
			}
				
			return objs;
		}

		@Override
		public Object[] getChildren(Object parentElement)
		{
			Object[]	res;
			
			System.out.println(parentElement);
			res = null;
			if(parentElement instanceof EventBusNode && ((EventBusNode)parentElement).isConnected())
			{
				res = vk;
			}
			else if(parentElement instanceof EventLogNode && ((EventLogNode)parentElement).isConnected())
			{
				res = vk;
			}
			else if(parentElement.equals("Event Buses"))
			{
				res = buslist.getEventBusNodes();
			}
			else if(parentElement.equals("Event Logs"))
			{
				res = loglist.getEventLogNodes();
			}
			else
			{
				res = new Object[] {"Event Buses", "Event Logs"};
			}
			
			return res;
		}

		@Override
		public Object getParent(Object element)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasChildren(Object parentElement)
		{
			boolean res;
			
			res = false;
			if(parentElement instanceof EventBusNode && ((EventBusNode)parentElement).isConnected())
			{
				res = buslist.getEventBusNodes().length > 0;
			}
			else if(parentElement instanceof EventLogNode && ((EventLogNode)parentElement).isConnected())
			{
				res = loglist.getEventLogNodes().length > 0;
			}
			else if(parentElement.equals("Event Buses"))
			{
				res = true;
			}
			else if(parentElement.equals("Event Logs"))
			{
				res = true;
			}
			
			return res;
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider
	{
		public String getColumnText(Object obj, int index)
		{
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index)
		{
			return getImage(obj);
		}

		public Image getImage(Object obj)
		{
			Image			img;
			EventBusNode	location;
//			
//			location = (EventBusNode)obj;
//			if(location.isConnected())
//			{
//			}
			if(obj instanceof EventBusNode)
			{
				location = (EventBusNode)obj;
				if(location.isConnected())
				{
					img = PlatformUI.getWorkbench().getSharedImages().getImage(
							ISharedImages.IMG_TOOL_FORWARD);
				}
				else
				{
					img = PlatformUI.getWorkbench().getSharedImages().getImage(
							ISharedImages.IMG_OBJS_ERROR_TSK);
				}
			}
			else
			{
				img = PlatformUI.getWorkbench().getSharedImages().getImage(
						ISharedImages.IMG_DEF_VIEW);
			}
			
			return img;
		}
	}

	class NameSorter extends ViewerSorter
	{
	}

	private VisualizationKind[]	vk;

	/**
	 * The constructor.
	 */
	public EventBusLocationView()
	{
		buslist = new EventBusList();
		loglist = new EventLogList();
		vk = new VisualizationKind[10];
		vk[0] = new VisualizationKind("Coordination", new CoordinationGraphCreator());
		vk[1] = new VisualizationKind("Organization", new OrganizationGraphCreator());
		vk[2] = new VisualizationKind("General", new GeneralGraphCreator());
		vk[3] = new VisualizationKind("Asserters", new AsserterGraphCreator());
		vk[4] = new VisualizationKind("Role-Task", new AsserterGraphCreator());
		vk[5] = new VisualizationKind("Plans", new AsserterGraphCreator());
		vk[6] = new VisualizationKind("Landmarks", new AsserterGraphCreator());
		vk[7] = new VisualizationKind("Norm Instances", new AsserterGraphCreator());
		vk[8] = new VisualizationKind("Violations", new AsserterGraphCreator());
		vk[9] = new VisualizationKind("Run", new RunGrahpCreator());
		IEclipsePreferences preferences = new ConfigurationScope().getNode("monitortool");
		// This would be using default n scope
		// Preferences preferences = new DefaultScope()
		// .getNode(Application.PLUGIN_ID);
		Preferences ebs = preferences.node("eventbus");
		int amount = Integer.parseInt(ebs.get("amount", "0"));
		for (int i = 0; i < amount; i++)
		{
			String location = ebs.get("eb" + i, "127.0.0.1");
			buslist.addNode(new EventBusNode(location));
		}
		ebs = preferences.node("eventlog");
		amount = Integer.parseInt(ebs.get("amount", "0"));
		for (int i = 0; i < amount; i++)
		{
			String location = ebs.get("el" + i, "127.0.0.1");
			loglist.addNode(new EventLogNode(location));
		}
//		if(amount > 0)
//		{
//			EventViewData.setData(buslist.getEventBusNodes()[0], vk[0]);
//		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent)
	{
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
				"MonitorTool.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu()
	{
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener()
		{
			public void menuAboutToShow(IMenuManager manager)
			{
				EventBusLocationView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars()
	{
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager)
	{
		manager.add(addEventBus);
		manager.add(addEventLog);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager)
	{
		manager.add(addEventBus);
		manager.add(addEventLog);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager)
	{
		manager.add(addEventBus);
		manager.add(addEventLog);
		manager.add(action2);
	}
	
	protected void removeEventBusLocation()
	{
		ITreeSelection	tsel;
		ISelection selection = viewer.getSelection();
		
		if(selection instanceof ITreeSelection)
		{
			tsel = (ITreeSelection)selection;
			if(tsel.getFirstElement() instanceof EventBusNode)
			{
				buslist.removeNode((EventBusNode)tsel.getFirstElement());
			}
			if(tsel.getFirstElement() instanceof EventLogNode)
			{
				loglist.removeNode((EventLogNode)tsel.getFirstElement());
			}
			viewer.refresh();
			updatePrefs();
		}
	}
	
	private void updatePrefs()
	{
		IEclipsePreferences preferences;
		EventBusNode[] ebb;
		EventLogNode[]	elb;
		int i;

		preferences = new ConfigurationScope().getNode("monitortool");
		// This would be using default n scope
		// Preferences preferences = new DefaultScope()
		// .getNode(Application.PLUGIN_ID);
		System.out.println("1");
		Preferences ebs = preferences.node("eventbus");
		System.out.println("2");
		ebb = buslist.getEventBusNodes();
		System.out.println("3");
		ebs.put("amount", "" + ebb.length);
		System.out.println("4");
		for (i = 0; i < ebb.length; i++)
		{
			ebs.put("eb" + i, ebb[i].getName());
		}
		System.out.println("5");
		ebs = preferences.node("eventlog");
		System.out.println("6");
		elb = loglist.getEventLogNodes();
		System.out.println("7");
		ebs.put("amount", "" + elb.length);
		System.out.println("8");
		for (i = 0; i < elb.length; i++)
		{
			ebs.put("el" + i, elb[i].getName());
		}
		System.out.println("9");
		try
		{
			// Forces the application to save the preferences
			preferences.flush();
		}
		catch (BackingStoreException e)
		{
			e.printStackTrace();
		}
		System.out.println("10");
	}

	protected void runEventBusLocationDialog(boolean eventBus)
	{
		EventBusLocation	ebl;
		String				value;
		EventBusNode		node;
		EventLogNode		eln;
		
		ebl = new EventBusLocation();
		ebl.init(this);
		ebl.run(null);

		value = ebl.getValue();
		System.out.println(value);
		if(value != null)
		{
			if(eventBus)
			{
				node = new EventBusNode(value);
				buslist.addNode(node);
			}
			else
			{
				eln = new EventLogNode(value);
				loglist.addNode(eln);
			}
		}
		System.out.println("1");
		updatePrefs();
		System.out.println("2");
		viewer.refresh();
		System.out.println("3");
	}

	private void makeActions()
	{
		addEventBus = new Action()
		{
			public void run()
			{
				runEventBusLocationDialog(true);
			}
		};
		addEventBus.setText("Add Event Bus");
		addEventBus.setToolTipText("Add Event Bus");
		addEventBus.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

		addEventLog = new Action()
		{
			public void run()
			{
				runEventBusLocationDialog(false);
			}
		};
		addEventLog.setText("Add Event Log");
		addEventLog.setToolTipText("Add Event Log");
		addEventLog.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

		action2 = new Action()
		{
			public void run()
			{
				removeEventBusLocation();
//				SampleNewWizardPage	page = new SampleNewWizardPage(null);
//				page.setVisible(true);
			}
		};
		action2.setText("Remove Event Bus");
		action2.setToolTipText("Remove Event Bus");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE));
//		doubleClickAction = new Action()
//		{
//			public void run()
//			{
//				ISelection selection = viewer.getSelection();
//				Object obj = ((IStructuredSelection) selection)
//						.getFirstElement();
//				showMessage("Double-click detected on " + obj.toString());
//			}
//		};
	}

	private void hookDoubleClickAction()
	{
		viewer.addDoubleClickListener(new IDoubleClickListener()
		{
			public void doubleClick(DoubleClickEvent event)
			{
				EventBusNode		ebn;
				EventLogNode		eln;
				EventProvider 		location;
				Object				obj;
				VisualizationKind	v;
				IWorkbenchPage		page;
				
				obj = ((ITreeSelection)event.getSelection()).getFirstElement();
				
				if(obj instanceof EventBusNode)
				{
					ebn = (EventBusNode)obj;
					ebn.setConnected(openEventBus(ebn));
				}
				else if(obj instanceof EventLogNode)
				{
					eln = (EventLogNode)obj;
					eln.setConnected(openEventLog(eln));
				}
				else if(obj instanceof VisualizationKind)
				{										
					v = (VisualizationKind)obj;
					location = (EventProvider)((ITreeSelection)event.getSelection()).getPaths()[0].getSegment(1);
					page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					
					try
					{
//						page.showView(EventView.ID);
						EventViewData.setData(location, v);
						page.showView(EventView.ID, v.getName(), IWorkbenchPage.VIEW_CREATE);
						page.showView(EventView.ID, v.getName(), IWorkbenchPage.VIEW_VISIBLE);
						page.showView(EventView.ID, v.getName(), IWorkbenchPage.VIEW_ACTIVATE);
					}
					catch (PartInitException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				viewer.refresh();
			}
		});
	}
	
	protected boolean openEventBus(EventBusNode location)
	{
		ProgressMonitorDialog	pmd;
		boolean					connected;
		
		connected = false;
		pmd = new ProgressMonitorDialog(viewer.getControl().getShell());
		pmd.setCancelable(false);
		pmd.open();
		try
		{
			location.connect();
			System.out.println("location.addListener: " + EventList.currentInstance);
			location.addListener(EventList.currentInstance);
//			EventBusController.getInstance().setIp(location.getName());
			connected = true;
		}
		catch (EventBusConnectionException e)
		{
			MessageDialog.openError(viewer.getControl().getShell(),
					"EventBus exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		pmd.close();
		
		return connected;
	}

	protected boolean openEventLog(EventLogNode location)
	{
		ProgressMonitorDialog	pmd;
		boolean					connected;
		
		connected = false;
		pmd = new ProgressMonitorDialog(viewer.getControl().getShell());
		pmd.setCancelable(false);
		pmd.open();
		try
		{			
			location.connect();
			System.out.println("location.addListener: " + EventList.currentInstance);
			location.addListener(EventList.currentInstance);
//			EventBusController.getInstance().setIp(location.getName());
			connected = true;
		}
		catch (Exception e)
		{
			MessageDialog.openError(viewer.getControl().getShell(),
					"EventLog exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		pmd.close();
		
		return connected;
	}

	private void showMessage(String message)
	{
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Sample View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus()
	{
		viewer.getControl().setFocus();
	}
}
