package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	private List<PlotterCommand> listOfCommands = new ArrayList<PlotterCommand>();

	@Override
	public void execute(IPlotter p) {
		for (PlotterCommand command : listOfCommands) {
			command.execute(p);
		}
	}

	public void add(PlotterCommand command) {
		listOfCommands.add(command);
	}

	public void remove(PlotterCommand command) {
		listOfCommands.remove(command);
	}
}
