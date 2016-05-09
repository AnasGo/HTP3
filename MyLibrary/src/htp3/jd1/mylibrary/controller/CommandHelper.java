package htp3.jd1.mylibrary.controller;

import java.util.*;

import htp3.jd1.mylibrary.command.*;
import htp3.jd1.mylibrary.command.impl.*;

public class CommandHelper {
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandHelper(){
		commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
		commands.put(CommandName.ADD_BOOK_COMMAND, new AddBookCommand());
		commands.put(CommandName.GET_CATALOG, new GetCatalog());
		commands.put(CommandName.REGISTER_USER, new RegisterUser());
	}
	
	public Command getCommand(String commandName){
		CommandName command = CommandName.valueOf(commandName);
		Command executeCommand = commands.get(command);
		return executeCommand;
	}
	
}
