package htp3.jd1.mylibrary.dao.impl;

import htp3.jd1.mylibrary.bean.Book;
import htp3.jd1.mylibrary.dao.AdminDao;

public class SQLAdminDAO implements AdminDao{

	@Override
	public boolean blockUser(int idUser) {
		
		return false;
	}

	@Override
	public boolean addBook(Book book) {
		
		return false;
	}

}
