package net.sf.ictalive.aliveclipse.dashboard;

import net.sf.ictalive.dashboard.ActionSpecification;
import net.sf.ictalive.dashboard.figure.ModelFigure;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.Image;

public class AliveModelFigure extends ModelFigure<AliveDashboardState> {

	private String modelURILocation;
	
	private AliveDashboardMediator mediator;
	
	public AliveModelFigure(ActionSpecification[] labelActionIds, boolean hasName) {
		super(labelActionIds, hasName);
		if (hasName) {
			Image deleteImage = Plugin.getDefault().getImageRegistry().get(Plugin.DELETE_ICON);
			setNameIcon(deleteImage);
			
			getNameLabel().addMouseListener( new MouseListener() {
	
				public void mouseDoubleClicked(MouseEvent me) {					
				}
	
				public void mousePressed(MouseEvent me) {
					if (me.button == 1 && getNameLabel().getIconBounds().contains(me.x,me.y)) {
						
						AliveDashboardState state = mediator.getState();
						if (state != null && state.getPreferences()!= null && modelURILocation != null) {
							state.write(modelURILocation, null);							
						}
						refresh();
					}
				}
	
				public void mouseReleased(MouseEvent me) {
				}
			});
		}
	}

	public void refresh() {
		if (mediator != null ) {
			AliveDashboardState state = mediator.getState();
			if (state != null && state.getPreferences()!= null && modelURILocation != null) {
				URI modelURI = state.read(state.getPreferences(), modelURILocation);
				
				if (modelURI == null) 
					setNameIcon(null);
				else {
					Image deleteImage = Plugin.getDefault().getImageRegistry().get(Plugin.DELETE_ICON);
					setNameIcon(deleteImage);
				}
				
				setName(modelURI == null ? null : modelURI.lastSegment());
				setFullName(modelURI == null ? null : modelURI.toString());
				setForegroundColor(modelURI == null ? AliveDashboardFigure.DASHBOARD_FG : AliveDashboardFigure.DASHBOARD_COMPLETED);		
			}
		}
	}
	
	// todo: move to constructor
	public void setModelURILocation(String modelURILocation) {
		this.modelURILocation = modelURILocation;
	}
	
	// move to BoxFigure so we can do this for all BoxFigures
	public void setMediator(AliveDashboardMediator mediator) {
		this.mediator = mediator;
	}
}
