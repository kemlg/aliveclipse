package net.sf.ictalive.monitortool.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;

public class EventLabel extends Label
{
	private Image labelImage;
	private double cacheScale;
	private Color parentBackgroundColor;
	private boolean ERROR_WHEN_PAINTING;
	private Connection connection;
	private float angle;

	public EventLabel(Connection c)
	{
		this.connection = c;
	}

	private void disposeImage() {
		if (labelImage != null) {
			if (!labelImage.isDisposed()) {
				labelImage.dispose();
			}
			labelImage = null;
		}
	}

	@Override
	protected void paintFigure(Graphics graphics)
	{
		PointList lp = connection.getPoints();
		float angleAux = getAngle(lp.getFirstPoint(), lp.getLastPoint());
		if(angle != angleAux && labelImage != null)
		{
			disposeImage();
		}
		angle = angleAux;
		if (labelImage != null && cacheScale != graphics.getAbsoluteScale()) {
			disposeImage();
		}
		if (labelImage == null
				|| (!graphics.getBackgroundColor()
						.equals(parentBackgroundColor))) {
			String theText = super.getText();
			if (theText == null || theText.trim().length() == 0) {
				theText = " "; //$NON-NLS-1$
			}
			parentBackgroundColor = graphics.getBackgroundColor();
			try {
				labelImage = createRotatedImageOfString(graphics, theText,
						super.getFont(), getForegroundColor(), graphics
								.getBackgroundColor(), true);
			} catch (Exception e) {
				e.printStackTrace();
				disposeImage();
				// if there is an error here, stop trying to create the vertical
				// label.
				ERROR_WHEN_PAINTING = true;
				super.paintFigure(graphics);
				return;
			}
			cacheScale = graphics.getAbsoluteScale();
		}

		double scale = graphics.getAbsoluteScale();
		graphics.pushState();

		graphics.scale(1 / scale);
		Point topLeft = getBounds().getTopLeft();
		
		topLeft = new Point(topLeft.x * scale, topLeft.y * scale);
		graphics.drawImage(labelImage, topLeft);
		graphics.popState();
	}
	
	public Image createRotatedImageOfString(Graphics g, String string,
			Font font, Color foreground, Color background,
			boolean useGCTransform) {
		Display display = Display.getCurrent();
		if (display == null) {
			SWT.error(SWT.ERROR_THREAD_INVALID_ACCESS);
		}

		List<FontData> fontDatas = new ArrayList<FontData>();
		// take all font datas, mac and linux specific
		for (FontData data : font.getFontData()) {
			FontData data2 = new FontData(data.getName(), (int) (data
					.getHeight() * g.getAbsoluteScale()), data.getStyle());
			fontDatas.add(data2);
		}
		// create the new font
		Font zoomedFont = new Font(display, fontDatas.toArray(new FontData[0]));
		// get the dimension in this font
		Dimension strDim = FigureUtilities.getTextExtents(string, zoomedFont);
		System.out.println(strDim.width);
		if (strDim.width == 0 || strDim.height == 0) {
			strDim = FigureUtilities.getTextExtents(string, font);
		}
		Image srcImage = useGCTransform ? new Image(display, 500, 500) : new Image(display, strDim.width, strDim.height);
		
		
		Rectangle r = getBounds();
		r.width = 500;
		r.height = 500;
		setBounds(r);
		
		GC gc = new GC(srcImage);
		if (useGCTransform && angle != 0.0) {
			Transform transform = new Transform(display);
			transform.rotate(angle);
			gc.setTransform(transform);
			System.out.println("angle is " + angle);
		}
		gc.setFont(zoomedFont);
		gc.setForeground(foreground);
		gc.setBackground(background);
		gc.fillRectangle(gc.getClipping());
		gc.drawText(string, gc.getClipping().x, gc.getClipping().y
		// - metrics.getLeading()
				);
		gc.dispose();
		if (useGCTransform) {
			// srcImage.dispose();
			zoomedFont.dispose();
			return srcImage;
		}
		disposeImage();
		// Image rotated = ImageUtilities.createRotatedImage(srcImage);
		// srcImage.dispose();
		zoomedFont.dispose();
		return srcImage;
	}

	private float getAngle(Point firstPoint, Point lastPoint)
	{
		// TODO Auto-generated method stub
		return (float) (Math.atan2(lastPoint.y - firstPoint.y, lastPoint.x - firstPoint.x) * 360 / (2 * Math.PI));
	}

	public void setReference(Connection c)
	{
		this.connection = c;
	}
}
