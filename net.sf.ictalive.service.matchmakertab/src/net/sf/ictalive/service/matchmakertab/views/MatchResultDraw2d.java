package net.sf.ictalive.service.matchmakertab.views;

import java.net.URI;
import java.util.ArrayList;
import java.util.Map.Entry;

import net.sf.ictalive.coordination.actions.Action;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.DropShadowBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RectangularDropShadowLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Canvas;

import com.ibm.icu.text.Transliterator.Position;

import edu.bath.matchmaker.ServiceDescriptor;

import agents.ws.MatchMakerWS.AdaptationEdge;
import agents.ws.MatchMakerWS.AdaptationEdges;
import agents.ws.MatchMakerWS.MatchResult;

public class MatchResultDraw2d extends LightweightSystem {

	private MatchResult matchResult;
	private ServiceDescriptor query;

	private Canvas canvas;

	private int totalIOContainerWidth;
	private int totalIOwidth;
	private int serviceContainerWidth;

	static final int smallIndent = 5;
	static final int inputOutputWidth = 150;
	static final int inputOutputSpace = 5;
	static final int inputOutputIndent = 40;
	static final int inputOutputContainerIndent = 15;

	static final int adaptationHeight = 50;
	static final int adaptationVerticalSpace = 20;

	static final Color inputActiveColor = new Color(null, 177, 236, 145);
	static final Color inputInactiveColor = new Color(null, 161, 177, 158);

	static final Color outputInactiveColor = new Color(null, 206, 220, 248);
	static final Color outputActiveColor = new Color(null, 145, 197, 236);

	static final Color queryInputsColor = new Color(null, 207, 222, 205);
	static final Color queryOutputsColor = new Color(null, 205, 212, 222);

	static final Color serviceColor = new Color(null, 222, 217, 205);

	static final Color serviceInputsColor = new Color(null, 103, 172, 105);
	static final Color serviceOutputsColor = new Color(null, 103, 149, 172);

	static final Color adaptationColor = new Color(null, 219, 184, 182);

	static final Font serviceTitleFont = new Font(null, "Arial", 14, SWT.BOLD);
	static final Font serviceNameFont = new Font(null, "Arial", 10, SWT.ITALIC);

	static final Font groupTitleFont = new Font(null, "Arial", 12, SWT.BOLD);
	static final Font titleFont = new Font(null, "Arial", 10, SWT.BOLD);

	static final Font nameFont = new Font(null, "Arial", 10, SWT.NONE);
	static final Font typeFont = new Font(null, "Arial", 10, SWT.ITALIC);
	static final Font descriptionFont = new Font(null, "Arial", 10, SWT.NONE);

	public MatchResultDraw2d(Canvas c) {
		super(c);
		// TODO Auto-generated constructor stub

		canvas = c;

	}

	public void setMatchResultAndQuery(MatchResult mr, ServiceDescriptor qry) {
		matchResult = mr;
		query = qry;

		createFigure();

	}

	private void createFigure() {

		if (matchResult == null) {
			this.setContents(null);
			return;
		}

		ArrayList<InputFigure> queryInputs = new ArrayList<InputFigure>();
		ArrayList<OutputFigure> queryOutputs = new ArrayList<OutputFigure>();

		ArrayList<InputFigure> serviceInputs = new ArrayList<InputFigure>();
		ArrayList<OutputFigure> serviceOutputs = new ArrayList<OutputFigure>();

		int maxInputsOutputs = 0;

		int maxInputAdaptations = 0;
		int maxOutputAdaptations = 0;

		for (AdaptationEdges edges : matchResult.getServiceInputAdaptations()
				.values()) {
			if (edges != null && edges.getList() != null
					&& edges.getList().size() > maxInputAdaptations) {
				maxInputAdaptations = edges.getList().size();
			}
		}

		for (AdaptationEdges edges : matchResult.getQueryOutputAdaptations()
				.values()) {
			if (edges != null && edges.getList() != null
					&& edges.getList().size() > maxOutputAdaptations) {
				maxOutputAdaptations = edges.getList().size();
			}
		}

		if (query == null) {

			// no action, so actionInput/Output same as serviceInputOutput;

			for (Entry<URI, URI> kvp : matchResult.getServiceInputs()
					.entrySet()) {
				queryInputs.add(new InputFigure(kvp.getKey(), kvp.getValue(),
						true));
				serviceInputs.add(new InputFigure(kvp.getKey(), kvp.getValue(),
						true));

			}

			for (Entry<URI, URI> kvp : matchResult.getServiceOutputs()
					.entrySet()) {
				queryOutputs.add(new OutputFigure(kvp.getKey(), kvp.getValue(),
						true));
				serviceOutputs.add(new OutputFigure(kvp.getKey(), kvp
						.getValue(), true));
			}

		} else {

			ArrayList<Entry<URI, URI>> tmpQueryInputs = new ArrayList<Entry<URI, URI>>();
			tmpQueryInputs.addAll(query.getInputs().entrySet());

			ArrayList<InputFigure> inactiveServiceInputs = new ArrayList<InputFigure>();

			for (Entry<URI, URI> kvp : query.getInputs().entrySet()) {
				System.out.println("k: " + kvp.getKey() + " v: "
						+ kvp.getValue());
			}

			for (URI kvp : matchResult.getServiceInputAdaptations().keySet()) {
				System.out.println("k: " + kvp);
			}

			for (Entry<URI, URI> kvp : matchResult.getServiceInputs()
					.entrySet()) {

				AdaptationEdges edges = matchResult
						.getServiceInputAdaptations().get(kvp.getValue());

				System.out.println("kvp.value: " + kvp.getValue());

				URI targetType;

				if (edges == null || edges.getList() == null
						|| edges.getList().isEmpty()) {
					System.out.println("edges null");
					targetType = kvp.getValue();
				} else {
					targetType = edges.getList().get(0).getFrom();
				}

				System.out.println("targetType: " + targetType);

				// now find target type in QUERY inputs
				Entry<URI, URI> target = null;
				for (Entry<URI, URI> ent : tmpQueryInputs) {
					if (ent.getValue().equals(targetType)) {
						target = ent;
						break;
					}
				}

				if (target == null) {
					// not found, so not used
					inactiveServiceInputs.add(new InputFigure(kvp.getKey(), kvp
							.getValue(), false));
				} else {
					serviceInputs.add(new InputFigure(kvp.getKey(), kvp
							.getValue(), true));
					queryInputs.add(new InputFigure(target.getKey(), target
							.getValue(), true));

					tmpQueryInputs.remove(target);
				}

			}

			// now add UNUSED service inputs
			for (InputFigure i : inactiveServiceInputs) {
				serviceInputs.add(i);
			}

			// now do outputs

			ArrayList<Entry<URI, URI>> tmpOutputs = new ArrayList<Entry<URI, URI>>();
			tmpOutputs.addAll(matchResult.getServiceOutputs().entrySet());

			for (Entry<URI, URI> kvp : query.getOutputs().entrySet()) {
				queryOutputs.add(new OutputFigure(kvp.getKey(), kvp.getValue(),
						true));

				// now find the corresponding service input
				AdaptationEdges edges = matchResult.getQueryOutputAdaptations()
						.get(kvp.getValue());

				URI targetType;

				if (edges == null || edges.getList() == null
						|| edges.getList().isEmpty()) {
					targetType = kvp.getValue();
				} else {
					targetType = edges.getList().get(0).getFrom();
				}

				// now find target type in SERVICE inputs
				Entry<URI, URI> target = null;
				for (Entry<URI, URI> ent : tmpOutputs) {
					if (ent.getValue().equals(targetType)) {
						target = ent;
						break;
					}
				}

				// remove from list of service inputs
				tmpOutputs.remove(target);

				serviceOutputs.add(new OutputFigure(target.getKey(), target
						.getValue(), true));

			}

			// now add UNUSED service inputs
			for (Entry<URI, URI> kvp : tmpOutputs) {
				serviceOutputs.add(new OutputFigure(kvp.getKey(), kvp
						.getValue(), false));
			}

		}

		if (serviceInputs.size() > serviceOutputs.size()) {
			maxInputsOutputs = serviceInputs.size();
		} else {
			maxInputsOutputs = serviceOutputs.size();
		}

		totalIOwidth = inputOutputSpace + (inputOutputSpace + inputOutputWidth)
				* maxInputsOutputs;
		totalIOContainerWidth = totalIOwidth + (inputOutputIndent * 2);

		System.out.println("totalIOWidth:  " + totalIOwidth);

		if (totalIOContainerWidth < 500) {
			totalIOContainerWidth = 400;
		}

		serviceContainerWidth = totalIOContainerWidth
				+ (2 * inputOutputContainerIndent);

		// create new figure and set layout
		Figure fig = new Figure();
		XYLayout contentsLayout = new XYLayout();
		fig.setLayoutManager(contentsLayout);

		InputOutputContainer queryInputContainer = new InputOutputContainer(
				"Query Inputs", queryInputsColor, true);
		for (InputFigure f : queryInputs) {
			queryInputContainer.addToSubContainer(f);
		}

		InputOutputContainer queryOutputContainer = new InputOutputContainer(
				"Query Outputs", queryOutputsColor, false);
		for (OutputFigure f : queryOutputs) {
			queryOutputContainer.addToSubContainer(f);
		}

		InputOutputContainer serviceInputContainer = new InputOutputContainer(
				"Service Inputs", serviceInputsColor, false);
		for (InputFigure f : serviceInputs) {
			serviceInputContainer.addToSubContainer(f);
		}

		InputOutputContainer serviceOutputContainer = new InputOutputContainer(
				"Service Outputs", serviceOutputsColor, true);
		for (OutputFigure f : serviceOutputs) {
			serviceOutputContainer.addToSubContainer(f);
		}

		// calculate positions of main boxes

		int inputStartY = 20;
		int serviceStartY = 100
				+ inputStartY
				+ adaptationVerticalSpace
				+ (maxInputAdaptations * (adaptationVerticalSpace + adaptationHeight));
		int outputStartY = 280
				+ serviceStartY
				+ adaptationVerticalSpace
				+ (maxOutputAdaptations * (adaptationVerticalSpace + adaptationHeight));

		ServiceContainer serviceContainer = new ServiceContainer(matchResult
				.getService(), serviceInputContainer, serviceOutputContainer);

		contentsLayout.setConstraint(queryInputContainer, new Rectangle(36,
				inputStartY, totalIOContainerWidth, 100));
		contentsLayout.setConstraint(serviceContainer, new Rectangle(20,
				serviceStartY, serviceContainerWidth, 280));
		contentsLayout.setConstraint(queryOutputContainer, new Rectangle(36,
				outputStartY, totalIOContainerWidth, 100));

		ArrayList<Figure> connectList = new ArrayList<Figure>();

		fig.add(queryInputContainer);
		fig.add(serviceContainer);
		fig.add(queryOutputContainer);

		// display adaptations

		int adaptationStartY = inputStartY + 100 + adaptationVerticalSpace;
		int adaptationStartX = 36 + inputOutputIndent + 1;

		for (int i = 0; i < queryInputs.size(); i++) {

			AdaptationEdges edges = matchResult.getServiceInputAdaptations()
					.get(serviceInputs.get(i).getType());

			AdaptationFigure lastFig = null;

			if (edges != null && edges.getList() != null
					&&!edges.getList().isEmpty()) {

				int curX = adaptationStartX
						+ (i * (inputOutputWidth + inputOutputSpace + 2));

				for (int j = 0; j < edges.getList().size(); j++) {

					int curY = adaptationStartY
							+ (j * (adaptationHeight + adaptationVerticalSpace));

					AdaptationEdge edge = edges.getList().get(j);

					AdaptationFigure af = new AdaptationFigure(edge.getFrom(),
							edge.getTo(), edge.getDescription());
					contentsLayout.setConstraint(af, new Rectangle(curX, curY,
							inputOutputWidth + 2, adaptationHeight));
					fig.add(af);
					if (lastFig == null) {
						connectList.add(connect(queryInputs.get(i), af));
					} else {
						connectList.add(connect(lastFig, af));
					}

					lastFig = af;
				}

				connectList.add(connect(lastFig, serviceInputs.get(i)));

			} else {
				// just connect query input to service input
				connectList.add(connect(queryInputs.get(i), serviceInputs
						.get(i)));
			}

		}

		adaptationStartY = serviceStartY + 280 + adaptationVerticalSpace;

		for (int i = 0; i < queryOutputs.size(); i++) {

			AdaptationEdges edges = matchResult.getQueryOutputAdaptations()
					.get(queryOutputs.get(i).getType());

			AdaptationFigure lastFig = null;

			if (edges != null && edges.getList() != null && !edges.getList().isEmpty()) {

				int curX = adaptationStartX
						+ (i * (inputOutputWidth + inputOutputSpace + 2));

				int curNum = 0;
				for (int j = edges.getList().size() - 1; j >= 0; j--) {

					int curY = adaptationStartY
							+ (curNum * (adaptationHeight + adaptationVerticalSpace));

					AdaptationEdge edge = edges.getList().get(j);

					AdaptationFigure af = new AdaptationFigure(edge.getFrom(),
							edge.getTo(), edge.getDescription());
					contentsLayout.setConstraint(af, new Rectangle(curX, curY,
							inputOutputWidth + 2, adaptationHeight));
					fig.add(af);
					if (lastFig == null) {
						connectList.add(connect(serviceOutputs.get(i), af));
					} else {
						connectList.add(connect(lastFig, af));
					}

					lastFig = af;
					curNum++;
				}

				connectList.add(connect(lastFig, queryOutputs.get(i)));

			} else {
				// just connect query input to service input
				connectList.add(connect(serviceOutputs.get(i), queryOutputs
						.get(i)));
			}

		}

		for (Figure f : connectList) {
			fig.add(f);
		}

		// ScrollPane scroll = new ScrollPane();
		// scroll.setContents(fig);
		// this.setContents(scroll);

		canvas.setSize(serviceContainerWidth + 100, 800);

		this.setContents(fig);
		this.getUpdateManager().performUpdate();
		canvas.redraw();

	}

	private Figure connect(Figure sourcefig, Figure targetfig) {

		assert(sourcefig!=null);
		assert(targetfig!=null);
		PolylineConnection con = new PolylineConnection();
		con.setLineWidth(2);
		ChopboxAnchor source = new ChopboxAnchor(sourcefig);
		ChopboxAnchor target = new ChopboxAnchor(targetfig);
		con.setSourceAnchor(source);
		con.setTargetAnchor(target);

		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setFill(true);
		PointList pl = new PointList();
		pl.addPoint(0, 0);
		pl.addPoint(-2, 2);
		pl.addPoint(-2, -2);
		decoration.setTemplate(pl);

		con.setTargetDecoration(decoration);

		return con;
	}

	private String getFragment(URI uri) {
		String s = uri.getFragment();
		if (s == null || s.length() == 0) {
			return uri.toString();
		} else {
			return s;
		}
	}

	abstract class InputOutputFigure extends Figure {

		private URI type;

		public InputOutputFigure(String title, URI name, URI type) {
			// super(new RectangularDropShadowLineBorder());

			// ToolbarLayout layout = new ToolbarLayout(false);
			// layout.setSpacing(2);

			this.type = type;

			XYLayout layout = new XYLayout();

			setLayoutManager(layout);
			setBorder(new LineBorder(ColorConstants.black, 1));
			// setBorder(new RectangularDropShadowLineBorder());
			setOpaque(true);

			// setLabel(title);
			// setLabelFont(titleFont);
			// Label lblTitle = new Label(title);
			// lblTitle.setFont(titleFont);

			Label lblName = new Label(getFragment(name));
			lblName.setLabelAlignment(Label.LEFT);
			lblName.setFont(nameFont);
			lblName.setToolTip(new Label(name.toString()));

			Label lblType = new Label(getFragment(type));
			lblType.setLabelAlignment(Label.LEFT);
			lblType.setFont(typeFont);
			lblType.setToolTip(new Label(type.toString()));

			layout.setConstraint(lblName, new Rectangle(smallIndent, 3,
					inputOutputWidth - smallIndent, 20));
			layout.setConstraint(lblType, new Rectangle(smallIndent, 23,
					inputOutputWidth - smallIndent, 20));

			// add(lblTitle);
			add(lblName);
			add(lblType);

		}

		public URI getType() {
			return type;
		}

	}

	class InputFigure extends InputOutputFigure {

		public InputFigure(URI name, URI type, boolean active) {
			super("Input", name, type);

			setBackgroundColor(active ? inputActiveColor : inputInactiveColor);

		}

	}

	class OutputFigure extends InputOutputFigure {

		Color activeColor = new Color(null, 100, 100, 150);
		Color inactiveColor = new Color(null, 200, 200, 250);

		public OutputFigure(URI name, URI type, boolean active) {
			super("Output", name, type);

			setBackgroundColor(active ? outputActiveColor : outputInactiveColor);
		}

	}

	class InputOutputContainer extends Figure {

		private Figure subContainer;

		public InputOutputContainer(String title, Color color, boolean top) {
			// ToolbarLayout layout = new ToolbarLayout(false);

			XYLayout layout = new XYLayout();

			setLayoutManager(layout);
			setBorder(new LineBorder(ColorConstants.black, 1));
			setOpaque(true);
			setBackgroundColor(color);

			// setLabel(title);
			// setLabelFont(groupTitleFont);
			Label lblTitle = new Label(title);
			lblTitle.setLabelAlignment(Label.LEFT);
			lblTitle.setFont(groupTitleFont);

			subContainer = new Figure();
			// subContainer.setBorder(new LineBorder(1));
			ToolbarLayout subLayout = new ToolbarLayout(true);
			// FlowLayout subLayout = new FlowLayout(true);
			subLayout.setSpacing(inputOutputSpace);

			subContainer.setLayoutManager(subLayout);
			subContainer.setOpaque(true);

			if (top) {
				// title goes on top
				layout.setConstraint(lblTitle, new Rectangle(smallIndent, 10,
						200, 20));
				layout.setConstraint(subContainer, new Rectangle(
						inputOutputIndent, 40, totalIOwidth, 50));
			} else {
				layout.setConstraint(subContainer, new Rectangle(
						inputOutputIndent, 10, totalIOwidth, 50));
				layout.setConstraint(lblTitle, new Rectangle(smallIndent, 70,
						200, 20));
			}

			add(lblTitle);
			add(subContainer);

		}

		public void addToSubContainer(IFigure figure) {
			subContainer.add(figure);
		}

	}

	class ServiceContainer extends Figure {

		public ServiceContainer(URI name, InputOutputContainer inputs,
				InputOutputContainer outputs) {
			// ToolbarLayout layout = new ToolbarLayout(false);
			// layout.setSpacing(5);

			XYLayout layout = new XYLayout();

			setLayoutManager(layout);
			setBorder(new LineBorder(ColorConstants.black, 1));
			setOpaque(true);
			setBackgroundColor(serviceColor);

			// setLabel("Service");
			// setLabelFont(serviceTitleFont);

			Label lblTitle = new Label("Service");
			lblTitle.setFont(serviceTitleFont);
			lblTitle.setLabelAlignment(Label.LEFT);

			Label lblName = new Label(name.toString());
			lblName.setFont(serviceNameFont);
			lblName.setLabelAlignment(Label.LEFT);
			lblName.setToolTip(new Label(name.toString()));

			layout
					.setConstraint(inputs, new Rectangle(
							inputOutputContainerIndent, 10,
							totalIOContainerWidth, 100));
			layout.setConstraint(lblTitle, new Rectangle(smallIndent, 120, 200,
					20));
			layout.setConstraint(lblName, new Rectangle(smallIndent, 140,
					serviceContainerWidth - smallIndent * 2, 20));
			layout.setConstraint(outputs,
					new Rectangle(inputOutputContainerIndent, 170,
							totalIOContainerWidth, 100));

			add(inputs);
			add(lblTitle);
			add(lblName);
			add(outputs);

		}

	}

	class AdaptationFigure extends Figure {

		public AdaptationFigure(URI from, URI to, String desc) {
			// super(new RectangularDropShadowLineBorder());

			ToolbarLayout layout = new ToolbarLayout(false);
			setLayoutManager(layout);
			setBorder(new LineBorder(ColorConstants.black, 1));
			setOpaque(true);
			setBackgroundColor(adaptationColor);
			layout.setSpacing(1);

			Label lblFrom = new Label(getFragment(from));
			lblFrom.setFont(typeFont);
			lblFrom.setToolTip(new Label(from.toString()));

			Label lblDesc = new Label(desc);
			lblDesc.setFont(descriptionFont);
			lblDesc.setToolTip(new Label(desc));

			Label lblTo = new Label(getFragment(to));
			lblTo.setFont(typeFont);
			lblTo.setToolTip(new Label(to.toString()));

			add(lblFrom);
			add(lblDesc);
			add(lblTo);

		}

	}

}
