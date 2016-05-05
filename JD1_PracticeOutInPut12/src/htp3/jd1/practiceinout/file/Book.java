package htp3.jd1.practiceinout.file;

public class Book {
	private String name;
	private String author;
	private int year;
	private String content;
	private int price;

	public Book(String name, String author, int year, String content, int price) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.content = content;
		this.price = price;
	}

	private Book(BookBuilder book) {
		this.name = book.name;
		this.author = book.author;
		this.year = book.year;
		this.content = book.content;
		this.price = book.price;
	}

	public String getName() {
		return name;
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
		private String name;
		private String author;
		private int year;
		private String content;
		private int price;

		public BookBuilder() {
		}

		public BookBuilder setName(String name) {
			this.name = name;
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

		public Book installBook() {
			return new Book(this);
		}
	}

	public void printBookInformation() {
		String bookInformation = "Name - " + this.name + "; author - " + this.author + "; year - " + this.year
				+ "; content - " + this.content + "; price - " + this.price;
		System.out.println(bookInformation);
	}
	
	public String bookInformation() {
		String bookInformation = "Name - " + this.name + "; author - " + this.author + "; year - " + this.year
				+ "; content - " + this.content + "; price - " + this.price;
		return bookInformation;
	}
}
