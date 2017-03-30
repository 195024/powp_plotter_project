package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
	int scriptNr = 1;
	
	public SelectTestFigureOptionListener(int scriptNr) {
		this.scriptNr = scriptNr;
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
    	}
    }
}
