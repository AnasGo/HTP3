package htp3.jd1.mylibrary.bean;

public class Book {
	String title;
	String author;
	int year;
	String content;
	int price;
	
	public Book(){
		this.title = "no Title";
		this.author = "no Author";
		this.year = 0;
		this.content = "no Content";
		this.price = 0;
	}

	private Book(BookBuilder book) {
		this.title = book.title;
		this.author = book.author;
		this.year = book.year;
		this.content = book.content;
		this.price = book.price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getContent() {
		return content;
	}

	public int getPrice() {
		return price;
	}

	public static class BookBuilder {
		private String title;
		private String author;
		private int year;
		private String content;
		private int price;

		public BookBuilder() {
			this.title = "no Name";
			this.author = "no Author";
			this.year = 0;
			this.content = "no Content";
			this.price = 0;
		}

		public BookBuilder setTitle(String name) {
			this.title = name;
			return this;
		}

		public BookBuilder setAuthor(String author) {
			this.author = author;
			return this;
		}

		public BookBuilder setYear(int year) {
			this.year = year;
			return this;
		}

		public BookBuilder setContent(String content) {
			this.content = content;
			return this;
		}

		public BookBuilder setPrice(int price) {
			this.price = price;
			return this;
		}

		public Book getBook() {
			return new Book(this);
		}
	}
}
