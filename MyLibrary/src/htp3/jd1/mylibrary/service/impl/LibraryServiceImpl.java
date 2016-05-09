package htp3.jd1.mylibrary.service.impl;

import htp3.jd1.mylibrary.bean.Book;
import htp3.jd1.mylibrary.bean.Library;
import htp3.jd1.mylibrary.dao.AdminDao;
import htp3.jd1.mylibrary.dao.DAOFactory;
import htp3.jd1.mylibrary.dao.UserDao;
import htp3.jd1.mylibrary.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public Book findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBook(String title, String author) {
		Book book = new Book();
		DAOFactory factory = DAOFactory.getInstance();
		AdminDao adminDao = factory.getAdminDao();
		
		adminDao.addBook(book);
		return false;
	}

	@Override
	public Library getCatalog() {
		DAOFactory factory = DAOFactory.getInstance();
		UserDao userDao = factory.getUserDao();
		
		Library lib = userDao.getCatalog();
		return lib;
	}

}
