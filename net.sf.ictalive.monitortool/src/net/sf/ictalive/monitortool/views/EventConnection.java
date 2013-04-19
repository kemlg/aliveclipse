package net.sf.ictalive.monitortool.views;

import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;

public class EventConnection extends PolylineConnection
{

	@Override
	public void setSourceDecoration(RotatableDecoration dec)
	{
		add(dec, new PolylineLabelLocator(this));
	}

	@Override
	public void setTargetDecoration(RotatableDecoration dec)
	{
		add(dec, new PolylineLabelLocator(this));
	}
}
