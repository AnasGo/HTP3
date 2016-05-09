package htp3.jd1.mylibrary.dao;

import htp3.jd1.mylibrary.bean.Book;
import htp3.jd1.mylibrary.bean.Library;

public interface UserDao {
	Library getCatalog();
	Book getBookByTitle(String title);

}
