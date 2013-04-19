package net.sf.ictalive.service.matchmakertab.views;

import java.net.URI;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import agents.ws.MatchMakerWS.AdaptationEdge;
import agents.ws.MatchMakerWS.AdaptationEdges;
import agents.ws.MatchMakerWS.MatchResult;

public class MatchResultCanvas extends Canvas {

	private MatchResult mr;
	
	private int paramCount;
	private int inputAdaptationCount;
	private int outputAdaptationCount;
	
	public MatchResultCanvas(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	
		this.addPaintListener(new PaintListener() {			
			public void paintControl(org.eclipse.swt.events.PaintEvent e) {
				paint(e);
			}
		});
	}

	public void setMatchResult(MatchResult m) {
		mr = m;
		this.adjustSize();
		this.redraw();
	}
	
	public MatchResult getMatchResult() {
		return mr;
	}
	
	private void adjustSize() {
	
		if(mr == null) {
			this.setSize(200, 200);
		} else {
			
			adjustCounts();
			
			serviceWidth = (paramSpace * 2) + ( (paramCount-1) * paramSpace);
			
			int height = (margin * 2) + serviceHeight + 
				(2 * inputOutputHeight) + (verticalSpace * (2 + inputAdaptationCount + outputAdaptationCount));
			
			
			this.setSize((margin * 2) + serviceWidth, height);
			
		}
	
	}
	
	private void adjustCounts() {
		
		inputAdaptationCount = 0;
		outputAdaptationCount = 0;
		paramCount = 0;
		
		for(URI param : mr.getServiceInputAdaptations().keySet()) {
		
			paramCount++;
			
			AdaptationEdges inputs = mr.getServiceInputAdaptations().get(param);
			
			if(inputs.getList().size() > inputAdaptationCount) {
				inputAdaptationCount = inputs.getList().size();
			}
			
		}
		
		int outputparams = 0;
		
		for(URI param : mr.getQueryOutputAdaptations().keySet()) {
			
			outputparams++;
			
			AdaptationEdges outputs = mr.getQueryOutputAdaptations().get(param);
			
			if(outputs.getList().size() > inputAdaptationCount) {
				inputAdaptationCount = outputs.getList().size();
			}
			
		}
		
		//System.out.println("paramCount: " + paramCount);
		
		if(outputparams > paramCount) {
			paramCount = outputparams;
		}
		//System.out.println("outputparams: " + outputparams);
		//System.out.println("inputAdaps: " + inputAdaptationCount);
		//System.out.println("outputAdaps: " + outputAdaptationCount);
		
	}
	
	
	int paramSpace = 100;
	
	
	int inputOutputHeight = 25;
	
	int serviceHeight = 80;
	int serviceWidth;
	
	int margin = 50;
	
	int verticalSpace = 70;
	int adapCircleSize = 40;
	
	private void paint(PaintEvent e) {
		
		//draw canvas white
		e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_WHITE) );
		e.gc.fillRectangle(0, 0, e.width, e.height);
		
		if(mr != null) {
			
			int inputsEnd = margin + inputOutputHeight;
			
			int inputcount = inputAdaptationCount == 0 ? 1 : inputAdaptationCount;
			int outputcount = outputAdaptationCount == 0 ? 1 : outputAdaptationCount;
			
			int serviceStart = inputsEnd + (verticalSpace * inputcount);
			int serviceEnd = serviceStart + serviceHeight;
			
			int outputsStart = serviceEnd + (verticalSpace * outputcount);
			
			int firstParamX = margin + paramSpace;
			
			e.gc.setLineWidth(3);
			
			//draw input rectangle
			e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_DARK_YELLOW) );
			e.gc.fillRoundRectangle(margin, margin ,serviceWidth, inputOutputHeight, 2, 2);
			e.gc.drawRoundRectangle(margin, margin ,serviceWidth, inputOutputHeight, 2, 2);
			
			e.gc.drawString("Inputs", margin + 5, margin +5);
			
			int curP = 0;
			
			
			for(URI param : mr.getServiceInputAdaptations().keySet()) {
				
				AdaptationEdges inputs = mr.getServiceInputAdaptations().get(param);
					
				int paramX = firstParamX + (curP * paramSpace);
				
				if(inputs.getList().size() == 0) {
					//draw line directly
					e.gc.drawLine(paramX, inputsEnd, paramX, serviceStart);
				} else {
					
					int adapLineLength = (verticalSpace - adapCircleSize) / 2;
					
					for(int i = 0; i < inputs.getList().size(); i++) {
					
						int adapStart = inputsEnd + (i * verticalSpace);
						
						//draw start line
						e.gc.drawLine(paramX, adapStart, paramX, adapStart + adapLineLength);
						
						//draw adap circle
						e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_DARK_MAGENTA) );
						e.gc.fillOval(paramX - (adapCircleSize / 2), adapStart + adapLineLength, adapCircleSize, adapCircleSize);
						e.gc.drawOval(paramX - (adapCircleSize / 2), adapStart + adapLineLength, adapCircleSize, adapCircleSize);
						
						//draw end line
						e.gc.drawLine(paramX, adapStart + adapLineLength + adapCircleSize, paramX, adapStart + verticalSpace);
												
					}
					
					if(inputs.getList().size() < inputAdaptationCount) {
						e.gc.drawLine(paramX, inputsEnd + inputs.getList().size() * verticalSpace, paramX, serviceStart);						
					}
				}
				
				//draw names for uri				
				e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
				e.gc.drawString(param.getFragment(), paramX - (int) (paramSpace / 1.2), inputsEnd + 5);
				
				curP++;
			}
			
			//draw service rectangle
			
			e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_DARK_CYAN) );
			e.gc.fillRoundRectangle(margin, serviceStart ,serviceWidth, serviceHeight, 2, 2);
			e.gc.drawRoundRectangle(margin, serviceStart ,serviceWidth, serviceHeight, 2, 2);
			
			e.gc.drawString("Service " + mr.getService().getFragment(), margin + 5, serviceStart +5);
			
			curP = 0;
			
			for(URI param : mr.getQueryOutputAdaptations().keySet()) {
				
				AdaptationEdges outputs = mr.getQueryOutputAdaptations().get(param);
					
				int paramX = firstParamX + (curP * paramSpace);
				
				if(outputs.getList().size() == 0) {
					//draw line directly					
					e.gc.drawLine(paramX, serviceEnd, paramX, outputsStart);
				} else {
					
					int adapLineLength = (verticalSpace - adapCircleSize) / 2;
					
					for(int i = 0; i < outputs.getList().size(); i++) {
					
						int adapStart = serviceEnd + (i * verticalSpace);
						
						//draw start line
						e.gc.drawLine(paramX, serviceEnd, paramX, adapStart + adapLineLength);
						
						//draw adap circle
						e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_DARK_MAGENTA) );
						e.gc.fillOval(paramX - (adapCircleSize / 2), adapStart + adapLineLength, adapCircleSize, adapCircleSize);
						e.gc.drawOval(paramX - (adapCircleSize / 2), adapStart + adapLineLength, adapCircleSize, adapCircleSize);
						
						//draw end line
						e.gc.drawLine(paramX, adapStart + adapLineLength + adapCircleSize, paramX, adapStart + verticalSpace);
												
					}
					
					if(outputs.getList().size() < inputAdaptationCount) {
						e.gc.drawLine(paramX, serviceEnd + outputs.getList().size() * paramSpace, paramX, serviceStart);						
					}
					
				}
				
				//draw names for uri				
				e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
				e.gc.drawString(param.getFragment(), paramX - (int) (paramSpace / 1.2), serviceEnd + 5);
				
				curP++;
			}
			
			e.gc.setBackground( e.display.getSystemColor(SWT.COLOR_DARK_GREEN) );
			e.gc.fillRoundRectangle(margin, outputsStart ,serviceWidth, inputOutputHeight, 2, 2);
			e.gc.drawRoundRectangle(margin, outputsStart ,serviceWidth, inputOutputHeight, 2, 2);
			
			e.gc.drawString("Outputs", margin + 5, outputsStart +5);
		}
	}
	
}
