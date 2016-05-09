package htp3.jd1.mylibrary.command.impl;

import htp3.jd1.mylibrary.bean.Request;
import htp3.jd1.mylibrary.bean.Response;
import htp3.jd1.mylibrary.command.Command;
import htp3.jd1.mylibrary.service.ClientService;
import htp3.jd1.mylibrary.service.ServiceFactory;

public class AuthorizationCommand implements Command {

	@Override
	public Response execute(Request request) {
		String login = request.getLogin();
		String password = request.getPassword();

		ServiceFactory factory = ServiceFactory.getInstance();
		ClientService service = factory.getClientService();

		boolean result = service.logination(login, password);

		Response response = new Response();
		response.setErrorMessage(null);
		response.setMessage("Logination is successful.");
		return response;
	}
}
