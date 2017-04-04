package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter {
	private int startX = 0, startY = 0;
	private ILine line = LineFactory.getBasicLine();
	private DrawPanelController dpc;

	public LinePlotterAdapter(ILine line, DrawPanelController dpc) {
		this.line = line;
		this.dpc = dpc;
	}

	@Override
	public void drawTo(int x, int y) {
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		dpc.drawLine(line);

		setPosition(x, y);
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

}
