package htp3.jd1.mylibrary.dao;
import htp3.jd1.mylibrary.bean.Book;

public interface AdminDao {
	boolean blockUser(int idUser);
	boolean addBook(Book book);

}
