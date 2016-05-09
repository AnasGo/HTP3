package htp3.jd1.mylibrary.command.impl;

import htp3.jd1.mylibrary.bean.Library;
import htp3.jd1.mylibrary.bean.Request;
import htp3.jd1.mylibrary.bean.Response;
import htp3.jd1.mylibrary.command.Command;
import htp3.jd1.mylibrary.service.LibraryService;
import htp3.jd1.mylibrary.service.ServiceFactory;

public class GetCatalog implements Command {

	@Override
	public Response execute(Request request) {
		ServiceFactory factory = ServiceFactory.getInstance();
		LibraryService service = factory.getLibraryService();

		Library lib = service.getCatalog();
		
		Response response = new Response();
		response.setErrorMessage(null);
		response.setLibrary(lib);
		
		return response;
	}

}
