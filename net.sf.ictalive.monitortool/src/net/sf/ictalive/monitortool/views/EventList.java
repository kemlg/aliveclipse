package net.sf.ictalive.monitortool.views;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.sf.ictalive.monitortool.domain.EventBusNode;
import net.sf.ictalive.monitortool.domain.EventGraphCreator;
import net.sf.ictalive.monitortool.domain.VisualizationKind;
import net.sf.ictalive.monitortool.eventbus.EventBusControllerListener;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Cause;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.PointOfView;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Fact;

import net.sf.ictalive.monitortool.Configuration.Singleton;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import net.sf.ictalive.monitortool.JungVisualization.EventTypeNotSupportedException;
import net.sf.ictalive.monitortool.JungVisualization.JungEventGraphBuilder;
import net.sf.ictalive.monitortool.JungVisualization.JungViewBuilder;

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

public class EventList extends ViewPart implements EventBusControllerListener
{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "monitortool.views.EventList";

	public static EventBusControllerListener currentInstance;
	
	private long lastRefreshTime;
	
	private TableViewer viewer;
	private EventSorter eventSorter;
	private EventFilter filter;	
	private int n_showed_events = 0;
	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	protected List<Event> events;

	private VisualizationKind vkEvent;

	private Action doubleClickAction;

	private Action action1;
	private Action action2;

	class ViewContentProvider implements IStructuredContentProvider
	{
		public void inputChanged(Viewer v, Object oldInput, Object newInput)
		{
			System.out.println("inputChanged!");
		}

		public void dispose()
		{
		}

		public Object[] getElements(Object parent)
		{
			/*
			 * String[][] dummy = new String[5][7];
			 * 
			 * dummy[0][0] = "This is value 00"; dummy[0][1] =
			 * "This is value 01"; dummy[0][2] = "This is value 02"; dummy[0][3]
			 * = "This is value 03"; dummy[0][4] = "This is value 04";
			 * dummy[0][5] = "This is value 05"; dummy[0][6] =
			 * "This is value 06";
			 * 
			 * dummy[1][0] = "This is value 10"; dummy[1][1] =
			 * "This is value 11"; dummy[1][2] = "This is value 12"; dummy[1][3]
			 * = "This is value 13"; dummy[1][4] = "This is value 14";
			 * dummy[1][5] = "This is value 15"; dummy[1][6] =
			 * "This is value 16";
			 * 
			 * dummy[2][0] = "This is value 20"; dummy[2][1] =
			 * "This is value 21"; dummy[2][2] = "This is value 22"; dummy[2][3]
			 * = "This is value 23"; dummy[2][4] = "This is value 24";
			 * dummy[2][5] = "This is value 25"; dummy[2][6] =
			 * "This is value 26";
			 * 
			 * dummy[3][0] = "This is value 30"; dummy[3][1] =
			 * "This is value 31"; dummy[3][2] = "This is value 32"; dummy[3][3]
			 * = "This is value 33"; dummy[3][4] = "This is value 34";
			 * dummy[3][5] = "This is value 35"; dummy[3][6] =
			 * "This is value 36";
			 * 
			 * dummy[4][0] = "This is value 40"; dummy[4][1] =
			 * "This is value 41"; dummy[4][2] = "This is value 42"; dummy[4][3]
			 * = "This is value 43"; dummy[4][4] = "This is value 44";
			 * dummy[4][5] = "This is value 45"; dummy[4][6] =
			 * "This is value 46";
			 * 
			 * return dummy;
			 */

			return events.toArray(new Event[0]);
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider
	{
		public String getColumnText(Object obj, int columnIndex)
		{
			try
			{
				String result = "Invalid row index! A robar carteras!";
				Event row = (Event) obj;
				if (columnIndex == EventViewRowNameSingleton.LOCAL_KEY)
				{
					net.sf.ictalive.runtime.event.Key rowKey = row
							.getLocalKey();
					result = rowKey.getId();
				}

				if (columnIndex == EventViewRowNameSingleton.ASSERTER)
				{
					Actor rowActor = row.getAsserter();
					result = rowActor.getName() + "@" + rowActor.getUrl();
				}

				if (columnIndex == EventViewRowNameSingleton.CONTENT)
				{
					Content rowContent = row.getContent();
					Fact rowContentFact = rowContent.getFact();
					result = rowContentFact.getClass().getSimpleName();
				}

				if (columnIndex == EventViewRowNameSingleton.CONTENTEFFECT)
				{
					Content rowContent = row.getContent();
					Iterator<net.sf.ictalive.runtime.action.Action> rowContentFactIt = rowContent
							.getEffect().iterator();
					result = "";
					while (rowContentFactIt.hasNext())
					{
						net.sf.ictalive.runtime.action.Action rowContentAction = rowContentFactIt
								.next();
						result = result + " | " + rowContentAction.toString();
					}
					// result = result.substring(0, result.length() -
					// " | ".length());
				}

				if (columnIndex == EventViewRowNameSingleton.POINT_OF_VIEW)
				{
					PointOfView rowPointOfView = row.getPointOfView();
					result = rowPointOfView.getClass().getSimpleName();
				}

				if (columnIndex == EventViewRowNameSingleton.PROVENANCE)
				{
					Iterator<Cause> rowProvenanceIt = row.getProvenance()
							.iterator();
					result = "";
					while (rowProvenanceIt.hasNext())
					{
						Cause rowContentCause = rowProvenanceIt.next();
						result = result + " | "
								+ rowContentCause.getEvent().getLocalKey();
					}
					// result = result.substring(0, result.length() -
					// " | ".length());
				}

				if (columnIndex == EventViewRowNameSingleton.TIMESTAMP)
				{
					Date TimeStamp = row.getTimestamp();
					java.text.SimpleDateFormat dummy = new java.text.SimpleDateFormat(
							"dd/MM/yyyy hh:mm:ss");
					result = dummy.format(TimeStamp);
				}
				return result;
			}
			catch (java.lang.ClassCastException E)
			{
				String[] dummy = (String[]) obj;
				String result = dummy[columnIndex];
				return result;
			}
			catch (java.lang.NullPointerException E)
			{
				return "Invalid event";
			}

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

	class EventFilter extends ViewerFilter
	{

		private String searchString;

		public void setSearchText(String s)
		{
			// Search must be a substring of the existing value
			this.searchString = ".*" + s + ".*";
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element)
		{
			// System.out.println(searchString);
			if (searchString == null || searchString.length() == 0)
			{
				return true;
			}
			try
			{
				Event ev = (Event) element;
				Actor event_actor = ev.getAsserter();
				Date event_timestap = ev.getTimestamp();
				java.text.SimpleDateFormat dummy = new java.text.SimpleDateFormat(
						"dd/MM/yyyy hh:mm:ss");
				String event_id;
				try
				{
					event_id = ev.getLocalKey().toString();
				}
				catch (java.lang.NullPointerException E)
				{
					event_id = "Invalid Event";
				}
				String event_asserter;
				try
				{
					event_asserter = event_actor.getName() + "@"
							+ event_actor.getUrl();
				}
				catch (java.lang.NullPointerException E)
				{
					event_asserter = "Invalid Event";
				}
				String event_timestamp = dummy.format(event_timestap);
				// System.out.println("IGNASI" + searchString + "|" +
				// event_asserter);
				// System.out.println("IGNASI" + searchString + "|" +
				// event_timestamp);

				if (event_id.matches(searchString))
				{
					return true;
				}
				if (event_asserter.matches(searchString))
				{
					return true;
				}
				if (event_timestamp.matches(searchString))
				{
					return true;
				}

				return false;
			}
			catch (java.lang.ClassCastException E)
			{
				String[] eles = (String[]) element;

				// System.out.println("IGNASI" + searchString + "|" + eles);
				for (String ele : eles)
				{
					if (ele.matches(searchString))
					{
						// System.out.println("MATCH!");
						return true;
					}
				}
				return false;
			}
		}
	}

	class EventSorter extends ViewerSorter
	{
		private int columnIndex;
//		private static final int ASCENDING = 0;
		private static final int DESCENDING = 1;

		private int direction = DESCENDING;

		public EventSorter()
		{
			this.columnIndex = 0;
			direction = DESCENDING;
		}

		public void setColumn(int column)
		{
			if (column == this.columnIndex)
			{
				// Same column as last sort; toggle the direction
				direction = 1 - direction;
			}
			else
			{
				// New column; do an ascending sort
				this.columnIndex = column;
				direction = DESCENDING;

			}
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2)
		{
			try
			{
				Event row1 = (Event) e1;
				Event row2 = (Event) e2;
				String result1 = "Invalid row index! A robar carteras!";
				String result2 = "Invalid row index! A robar carteras!";
				int rc = 0;

				if (columnIndex == EventViewRowNameSingleton.LOCAL_KEY)
				{

					net.sf.ictalive.runtime.event.Key rowKey = row1
							.getLocalKey();
					try
					{
						result1 = rowKey.getId();
					}
					catch (java.lang.NullPointerException E)
					{
						result1 = "Invalid Event";
					}
					rowKey = row2.getLocalKey();
					try
					{
						result2 = rowKey.getId();
					}
					catch (java.lang.NullPointerException E)
					{
						result2 = "Invalid Event";
					}

				}

				if (columnIndex == EventViewRowNameSingleton.ASSERTER)
				{
					Actor rowActor = row1.getAsserter();
					try
					{
						result1 = rowActor.getName() + "@" + rowActor.getUrl();
					}
					catch (java.lang.NullPointerException E)
					{
						result1 = "Invalid Event";
					}

					rowActor = row2.getAsserter();
					try
					{
						result2 = rowActor.getName() + "@" + rowActor.getUrl();
					}
					catch (java.lang.NullPointerException E)
					{
						result2 = "Invalid Event";
					}
				}

				if (columnIndex == EventViewRowNameSingleton.CONTENT)
				{
					try
					{
						Content rowContent = row1.getContent();
						Fact rowContentFact = rowContent.getFact();
						result1 = rowContentFact.getClass().getSimpleName();

						rowContent = row2.getContent();
						rowContentFact = rowContent.getFact();
						result2 = rowContentFact.getClass().getSimpleName();
					}
					catch (java.lang.NullPointerException E)
					{
						return 0;
					}

				}

				if (columnIndex == EventViewRowNameSingleton.CONTENTEFFECT)
				{
					Content rowContent = row1.getContent();
					Iterator<net.sf.ictalive.runtime.action.Action> rowContentFactIt = rowContent
							.getEffect().iterator();
					result1 = "";
					while (rowContentFactIt.hasNext())
					{
						net.sf.ictalive.runtime.action.Action rowContentAction = rowContentFactIt
								.next();
						result1 = result1 + " | " + rowContentAction.toString();
					}

					rowContent = row2.getContent();
					rowContentFactIt = rowContent.getEffect().iterator();
					result2 = "";
					while (rowContentFactIt.hasNext())
					{
						net.sf.ictalive.runtime.action.Action rowContentAction = rowContentFactIt
								.next();
						result2 = result2 + " | " + rowContentAction.toString();
					}
					// result = result.substring(0, result.length() -
					// " | ".length());
				}

				if (columnIndex == EventViewRowNameSingleton.POINT_OF_VIEW)
				{
					PointOfView rowPointOfView = row1.getPointOfView();
					result1 = rowPointOfView.getClass().getSimpleName();

					rowPointOfView = row2.getPointOfView();
					result2 = rowPointOfView.getClass().getSimpleName();
				}

				if (columnIndex == EventViewRowNameSingleton.PROVENANCE)
				{
					Iterator<Cause> rowProvenanceIt = row1.getProvenance()
							.iterator();
					result1 = "";
					while (rowProvenanceIt.hasNext())
					{
						Cause rowContentCause = rowProvenanceIt.next();
						result1 = result1 + " | "
								+ rowContentCause.getEvent().getLocalKey();
					}

					rowProvenanceIt = row2.getProvenance().iterator();
					result2 = "";
					while (rowProvenanceIt.hasNext())
					{
						Cause rowContentCause = rowProvenanceIt.next();
						result2 = result2 + " | "
								+ rowContentCause.getEvent().getLocalKey();
					}
					// result = result.substring(0, result.length() -
					// " | ".length());
				}

				if (columnIndex == EventViewRowNameSingleton.TIMESTAMP)
				{
					Date TimeStamp = row1.getTimestamp();
					java.text.SimpleDateFormat dummy = new java.text.SimpleDateFormat(
							"dd/MM/yyyy hh:mm:ss");
					result1 = dummy.format(TimeStamp);

					TimeStamp = row2.getTimestamp();
					dummy = new java.text.SimpleDateFormat(
							"dd/MM/yyyy hh:mm:ss");
					result2 = dummy.format(TimeStamp);
				}
				rc = result1.compareTo(result2);

				// If descending order, flip the direction
				if (direction == DESCENDING)
				{
					rc = -rc;
				}
				// System.out.println(rc);
				return rc;
			}
			catch (java.lang.ClassCastException E)
			{
				int rc = 0;
				String[] dummy1 = (String[]) e1;
				String[] dummy2 = (String[]) e2;
				String result1 = dummy1[columnIndex];
				String result2 = dummy2[columnIndex];
				rc = result1.compareTo(result2);

				// If descending order, flip the direction
				if (direction == DESCENDING)
				{
					rc = -rc;
				}
				// System.out.println(rc);
				return rc;
			}
		}

	}

	/**
	 * The constructor.
	 */
	public EventList()
	{
		events = new LinkedList<Event>();
		currentInstance = this;
		System.out.println("EventList currentInstance = " + currentInstance);
		vkEvent = new VisualizationKind("Event", new EventGraphCreator());
	}

	// This will create the columns for the table
	private void createColumns(TableViewer viewer)
	{

		String[] titles = EventViewRowNameSingleton.rowNames;
		int[] bounds = EventViewRowNameSingleton.rowBounds;

		for (int i = 0; i < titles.length; i++)
		{
			final TableViewerColumn viewerColumn = new TableViewerColumn(
					viewer, SWT.NONE);
			final org.eclipse.swt.widgets.TableColumn column = viewerColumn
					.getColumn();
			final int index = i;

			column.setText(titles[i]);
			column.setWidth(bounds[i]);
			column.setResizable(true);
			column.setMoveable(true);
			// Setting the right sorter
			column
					.addSelectionListener(new EventSelectionAdapter(index,
							column));

		}
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}

	class EventSelectionAdapter extends SelectionAdapter
	{
		int index;
		org.eclipse.swt.widgets.TableColumn column;

		public EventSelectionAdapter(int _index,
				org.eclipse.swt.widgets.TableColumn _column)
		{
			this.index = _index;
			this.column = _column;
		}

		@Override
		public void widgetSelected(SelectionEvent e)
		{
			eventSorter.setColumn(index);
			int dir = viewer.getTable().getSortDirection();
			if (viewer.getTable().getSortColumn() == column)
			{
				dir = dir == SWT.UP ? SWT.DOWN : SWT.UP;
			}
			else
			{

				dir = SWT.DOWN;
			}
			System.out.println(dir);
			viewer.getTable().setSortDirection(dir);
			viewer.getTable().setSortColumn(column);
			viewer.refresh();
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent)
	{

		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);
		Label searchLabel = new Label(parent, SWT.NONE);
		searchLabel.setText("Search: ");
		final Text searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
		searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));

		searchText.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(org.eclipse.swt.events.KeyEvent ke)
			{
				filter.setSearchText(searchText.getText());
				viewer.refresh();
			}

		});

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		createColumns(viewer);
		viewer.setLabelProvider(new ViewLabelProvider());
		this.eventSorter = new EventSorter();
		getSite().setSelectionProvider(viewer);
		viewer.setSorter(this.eventSorter);
		viewer.setInput(getViewSite());
		filter = new EventFilter();
		viewer.addFilter(filter);

		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);

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
				EventList.this.fillContextMenu(manager);
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
		 manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager)
	{
		 manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager)
	{
		 manager.add(action1);
		manager.add(action2);
	}

	private void exportToCSV()
	{
		String	st;
		
		st = tableToCSV(viewer.getTable());
		FileDialog dialog = new FileDialog(viewer.getControl().getShell(), SWT.SAVE);

		String filename = dialog.open();

		try
		{
			save(st, dialog.getFilterPath() + File.separator + filename);
		}
		catch (IOException e)
		{
			showMessage(e.getMessage());
		}
	}

	private void save(String st, String file) throws IOException
	{
		File				f;
		FileOutputStream	fos;
		
		f = new File(file);
		f.delete();
		f.createNewFile();
		fos = new FileOutputStream(f);
		fos.write(st.getBytes("UTF-8"));
	}

	private String tableToCSV(Table table)
	{
		StringBuffer	sb;
		int				i, j;
		TableItem[]		ti;
		
		sb = new StringBuffer();
		ti = table.getItems();
		for(i=0;i<ti.length;i++)
		{
			for(j=0;j<table.getColumnCount();j++)
			{
				sb.append(ti[i].getText(j) + ";");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}	
	
	private void makeActions()
	{
		 action1 = new Action()
		 {
			 public void run()
			 {
				 exportToCSV();
			 }
		 };
		 action1.setText("Export to CSV...");
		 action1.setToolTipText("Export to CSV...");
		 action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
		 .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		 action2 = new Action()
		 {
			 public void run()
			 {
				 refreshEventList();
			 }
		 };
		 action2.setText("Refresh");
		 action2.setToolTipText("Refresh Event List");
		 action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
		 .getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		 
		doubleClickAction = new Action()
		{
			public void run()
			{
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				VisualizationKind v = vkEvent;
				// location =
				// (EventBusNode)((ITreeSelection)event.getSelection()).getPaths()[0].getFirstSegment();
				EventBusNode location = new EventBusNode("127.0.0.1");
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();

				try
				{
																
					JungViewData.setEvent((Event)obj);
					page.showView(JungView.ID, "" + obj.hashCode(),
							IWorkbenchPage.VIEW_CREATE);
					page.showView(JungView.ID, "" + obj.hashCode(),
							IWorkbenchPage.VIEW_VISIBLE);
					page.showView(JungView.ID, "" + obj.hashCode(),
							IWorkbenchPage.VIEW_ACTIVATE);
										
	                
					
				}
				catch (EventTypeNotSupportedException e)
				{					
					//Print stack trace
					e.printStackTrace();
					
					try
					{
					//As Jung view is not availabe, use the simple one
					//page.showView(EventView.ID);
					EventViewData.setData(location, v);
					EventViewData.setEvent((Event) obj);
					page.showView(EventView.ID, v.getName() + obj.hashCode(),
							IWorkbenchPage.VIEW_CREATE);
					page.showView(EventView.ID, v.getName() + obj.hashCode(),
							IWorkbenchPage.VIEW_VISIBLE);
					page.showView(EventView.ID, v.getName() + obj.hashCode(),
							IWorkbenchPage.VIEW_ACTIVATE);
					}
					catch (PartInitException ee)
					{					
						ee.printStackTrace();
					}
				}
				catch (PartInitException ee)
				{					
					ee.printStackTrace();
				}
				/*
				page.showView(EventView.ID);
				EventViewData.setData(location, v);
				EventViewData.setEvent((Event) obj);
				page.showView(EventView.ID, v.getName() + obj.hashCode(),
						IWorkbenchPage.VIEW_CREATE);
				page.showView(EventView.ID, v.getName() + obj.hashCode(),
						IWorkbenchPage.VIEW_VISIBLE);
				page.showView(EventView.ID, v.getName() + obj.hashCode(),
						IWorkbenchPage.VIEW_ACTIVATE);
						*/	
								
				
			}
		};
	}

	private void hookDoubleClickAction()
	{
		viewer.addDoubleClickListener(new IDoubleClickListener()
		{
			public void doubleClick(DoubleClickEvent event)
			{
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message)
	{
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"EventList", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus()
	{
		viewer.getControl().setFocus();
	}

	@Override
	public void updateConnecting()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized void submitEvent(Event event)
	{
		
		events.add(event);
		int n_un_showed_events = events.size() - n_showed_events;
		if ( (System.currentTimeMillis() > lastRefreshTime + Singleton.EventListRefreshTime) || n_un_showed_events > Singleton.n_max_unshowed_events)
		{
			lastRefreshTime = System.currentTimeMillis();
			refreshEventList();
			n_showed_events = events.size();
		}
		
	}
	
	private void refreshEventList()
	{
		
			Display.getDefault().syncExec(new Runnable()
			{
				public void run()
				{
					viewer.refresh();
				}
			});		
	}
	
}
