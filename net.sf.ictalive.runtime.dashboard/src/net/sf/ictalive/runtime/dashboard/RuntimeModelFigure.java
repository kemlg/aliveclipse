package net.sf.ictalive.runtime.dashboard;

import net.sf.ictalive.dashboard.ActionSpecification;
import net.sf.ictalive.dashboard.figure.ModelFigure;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.swt.graphics.Image;

public class RuntimeModelFigure extends ModelFigure<RuntimeDashboardState> {

	private String modelLocation;
	
	private RuntimeDashboardMediator mediator;

	public RuntimeModelFigure(ActionSpecification[] labelActionIds, boolean hasName) {
		super(labelActionIds, hasName);
		if (hasName) {
			Image deleteImage = Plugin.getDefault().getImageRegistry().get(Plugin.DELETE_ICON);
			setNameIcon(deleteImage);
			
			getNameLabel().addMouseListener( new MouseListener() {
				public void mouseDoubleClicked(MouseEvent me) {
				}
				
				public void mousePressed(MouseEvent me) {
					
					if(me.button == 1 && getNameLabel().getIconBounds().contains(me.x, me.y)) {
						RuntimeDashboardState state = mediator.getState();
						if (state != null && state.getPreferences() != null && modelLocation != null) {
							state.write(modelLocation, null);
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
		if (mediator != null) {
			RuntimeDashboardState state = mediator.getState();
			if (state != null && state.getPreferences() != null && modelLocation != null) {
				String location = state.read(state.getPreferences(), modelLocation);
				
				if(location == null)
					setNameIcon(null);
				else {
					Image deleteImage = Plugin.getDefault().getImageRegistry().get(Plugin.DELETE_ICON);
					setNameIcon(deleteImage);
				}
				
				setName(location == null ? Messages.ModelFigure_NoName : location);
				setFullName(location);
				setForegroundColor(location == null ? RuntimeDashboardFigure.DASHBOARD_FG : RuntimeDashboardFigure.DASHBOARD_COMPLETED);
			}
		}
	}
	
	public void setModelLocation(String modelLocation) {
		this.modelLocation = modelLocation;
	}
	
	public void setMediator(RuntimeDashboardMediator mediator) {
		this.mediator = mediator;
	}
			

}
