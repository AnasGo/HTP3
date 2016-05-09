package htp3.jd1.mylibrary.service;

import htp3.jd1.mylibrary.bean.*;

public interface LibraryService {
	Book findByAuthor(String author);
	Book findByTitle(String title);
	boolean addBook(String title, String author);
	Library getCatalog();
	
}
