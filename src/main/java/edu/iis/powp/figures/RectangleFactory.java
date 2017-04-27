package edu.iis.powp.figures;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class RectangleFactory {
	private int x;
	private int y;
	private ComplexCommand cCmd = new ComplexCommand();

	public RectangleFactory(int x, int y) {
		this.x = x;
		this.y = y;
		fillCommandList();
		startPlotter();
	}

	private void fillCommandList() {
		cCmd.add(new CommandSetPosition(-200, -200));
		cCmd.add(new CommandDrawLineToPosition(x, -200));
		cCmd.add(new CommandDrawLineToPosition(x, y));
		cCmd.add(new CommandDrawLineToPosition(-200, y));
		cCmd.add(new CommandDrawLineToPosition(-200, -200));
	}

	private void startPlotter() {
		cCmd.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}
}
