package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.figures.RectangleFactory;
import edu.iis.powp.figures.SquareFactory;

public class SelectTestFigureOptionListener implements ActionListener
{
	private int scriptNr = 1;
	private int x = 0;
	private int y = 0;
	
	public SelectTestFigureOptionListener(int scriptNr) {
		this.scriptNr = scriptNr;
	}
	
	public SelectTestFigureOptionListener(int scriptNr, int x) {
		this.scriptNr = scriptNr;
		this.x = x;
	}
	
	public SelectTestFigureOptionListener(int scriptNr, int x, int y) {
		this.scriptNr = scriptNr;
		this.x = x;
		this.y = y;
	}
	
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	switch(scriptNr) {
    	case 1:
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	case 2:
    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	case 3:
    		new RectangleFactory(x, y);
    		break;
    	case 4:
    		new SquareFactory(x);
    		break;
    	}
    }
}
