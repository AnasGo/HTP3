package htp3.jd1.mylibrary.controller;

import htp3.jd1.mylibrary.bean.Request;
import htp3.jd1.mylibrary.bean.Response;
import htp3.jd1.mylibrary.command.Command;

public class Controller {

	private final CommandHelper helper = new CommandHelper();

	public Controller() {

	}

	public Response doAction(Request request) {

		String commandName = request.getCommandName();
		Command command = helper.getCommand(commandName);
		Response response = command.execute(request);
		return response;
	}

}
