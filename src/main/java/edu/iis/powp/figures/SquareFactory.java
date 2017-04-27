package edu.iis.powp.figures;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class SquareFactory {
	private int x;
	private ComplexCommand cCmd = new ComplexCommand();
	
	public SquareFactory(int x) {
		this.x = x;
		fillCommandList();
		startPlotter();
	}

	private void fillCommandList() {
		cCmd.add(new CommandSetPosition(-200, -200));
		cCmd.add(new CommandDrawLineToPosition(x, -200));
		cCmd.add(new CommandDrawLineToPosition(x, x));
		cCmd.add(new CommandDrawLineToPosition(-200, x));
		cCmd.add(new CommandDrawLineToPosition(-200, -200));
	}
	
	private void startPlotter() {
		cCmd.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}
}
