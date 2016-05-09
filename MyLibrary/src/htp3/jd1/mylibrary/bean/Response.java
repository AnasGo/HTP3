package htp3.jd1.mylibrary.bean;

public class Response {
	private Library library;
	private Book book;
	private String errorMessage;
	private String message;

	public Response() {

	}

	public Response(Library library, Book book, String errorMessage, String message) {
		this.library = library;
		this.book = book;
		this.errorMessage = errorMessage;
		this.message = message;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
