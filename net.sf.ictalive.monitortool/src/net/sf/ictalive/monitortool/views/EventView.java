package net.sf.ictalive.monitortool.views;

import java.awt.Frame;
import java.io.IOException;

import net.sf.ictalive.monitortool.domain.EventBusNode;
import net.sf.ictalive.monitortool.domain.VisualizationKind;
import net.sf.ictalive.monitortool.eventbus.EventBusController;
import net.sf.ictalive.monitortool.eventbus.EventBusControllerListener;
import net.sf.ictalive.monitortool.eventbus.EventProvider;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

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

public class EventView extends ViewPart implements EventBusControllerListener
{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "monitortool.views.EventView";

	private TableViewer viewer;
//	private Action doubleClickAction;

	private EventProvider location;

	private VisualizationKind vk;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider
	{
		public void inputChanged(Viewer v, Object oldInput, Object newInput)
		{
		}

		public void dispose()
		{
		}

		public Object[] getElements(Object parent)
		{
			return new String[]
			{ "One", "Two", "Three" };
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
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter
	{
	}

	/**
	 * The constructor.
	 */
	public EventView()
	{
	}
	
	Frame frame;
	Canvas canvas;
	Composite composite;
	StandaloneGraphView	gv;
	
	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent)
	{
		composite = parent;
		
		// graphComponent.addMouseListener(this);
		EventBusController.getInstance().addListener(this);
		this.location = EventViewData.getLocation();
		this.vk = EventViewData.getVisualizationKind();
		gv = new StandaloneGraphView(parent);
		try
		{
			gv.generateGraph(vk.getGraphCreator());
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		makeActions();
		hookContextMenu();
		// hookDoubleClickAction();
		contributeToActionBars();
		if(vk.getName().equals("Event"))
		{
			this.setPartName(EventViewData.getEvent().toString());
			this.submitEvent(EventViewData.getEvent());
		}
		else
		{
			if(vk != null && location != null)
			{
				this.setPartName(vk.getName() + "@" + location.getName());
			}
			location.addListener(this);
		}
	}

	private void hookContextMenu()
	{
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener()
		{
			public void menuAboutToShow(IMenuManager manager)
			{
				EventView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(composite);
		composite.setMenu(menu);
		// getSite().registerContextMenu(menuMgr, composite);
	}

	private void contributeToActionBars()
	{
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager)
	{
		
	}

	private void fillContextMenu(IMenuManager manager)
	{
		
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager)
	{

	}

	private void makeActions()
	{
		
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

//	private void hookDoubleClickAction()
//	{
//		viewer.addDoubleClickListener(new IDoubleClickListener()
//		{
//			public void doubleClick(DoubleClickEvent event)
//			{
//				doubleClickAction.run();
//			}
//		});
//	}

	private void showMessage(String message)
	{
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Event View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus()
	{
		// canvas.setFocus();
		// gv.setFocus();
		composite.setFocus();
	}

	@Override
	public void updateConnecting()
	{
//		Object parent1 = gv.getGraph().getDefaultParent();
//		gv.getGraph().getModel().beginUpdate();
//		try
//		{
//			Object v1 = gv.getGraph().insertVertex(parent1, null, "Hello", 60, 60, 80,
//					30);
//			gv.getGraph().setCellsEditable(true);
//			Object v2 = gv.getGraph().insertVertex(parent1, null, "World!", 280, 190,
//					80, 30);
//			gv.getGraph().insertEdge(parent1, null, "Edge", v1, v2);
//		}
//		finally
//		{
//			gv.getGraph().getModel().endUpdate();
//		}
	}

	@Override
	public synchronized void submitEvent(Event event)
	{
		gv.updateGraph(event, vk.getGraphCreator());
//		Object parent1 = gv.getGraph().getDefaultParent();
//		gv.getGraph().getModel().beginUpdate();
//		try
//		{
//			Object v1 = gv.getGraph().insertVertex(parent1, null, event.getAsserter(), 100, 100, 80,
//					30);
////			Object v2 = graph.insertVertex(parent1, null, "World!", 280, 190,
////					80, 30);
////			graph.insertEdge(parent1, null, "Edge", v1, v2);
//		}
//		finally
//		{
//			gv.getGraph().getModel().endUpdate();
//		}
	}
}
