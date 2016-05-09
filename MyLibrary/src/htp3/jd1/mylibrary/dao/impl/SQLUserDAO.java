package htp3.jd1.mylibrary.dao.impl;

import htp3.jd1.mylibrary.bean.Book;
import htp3.jd1.mylibrary.bean.Library;
import htp3.jd1.mylibrary.dao.UserDao;

public class SQLUserDAO implements UserDao{

	@Override
	public Library getCatalog() {
		
		return new Library();
	}

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
