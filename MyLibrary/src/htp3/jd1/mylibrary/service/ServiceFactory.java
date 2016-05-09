package htp3.jd1.mylibrary.service;

import htp3.jd1.mylibrary.service.impl.*;

public class ServiceFactory {
	private static ServiceFactory factory = new ServiceFactory();
	private final ClientService clientService = new ClientServiceImpl();
	private final LibraryService libraryService = new LibraryServiceImpl();
	
	private ServiceFactory(){
		
	}
	public static ServiceFactory getInstance(){
		return factory;
	}
	
	public ClientService getClientService(){
		return clientService;
	}
	
	public LibraryService getLibraryService(){
		return libraryService;
	}

}
