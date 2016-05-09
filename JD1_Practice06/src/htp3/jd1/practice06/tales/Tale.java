package htp3.jd1.practice06.tales;

public class Tale {
	private String name;
	private String author;
	private int year;
	private String content;
	private int rate;

	public Tale() {

	}

	private Tale(TaleBuilder tale) {
		this.name = tale.name;
		this.author = tale.author;
		this.year = tale.year;
		this.content = tale.content;
		this.rate = tale.rate;
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

	public int getRate() {
		return rate;
	}

	public static class TaleBuilder {
		private String name;
		private String author;
		private int year;
		private String content;
		private int rate;

		public TaleBuilder(String name, String author, int year, String content) {
			this.name = name;
			this.author = author;
			this.year = year;
			this.content = content;
		}

		public TaleBuilder setRate(int rate) {
			this.rate = rate;
			return this;
		}

		public Tale build() {
			return new Tale(this);
		}
	}

	public void printTale() {
		System.out.println("Name - " + this.name + "; author - " + this.author + "; year - " + this.year
				+ "; content - " + this.content + "; rate - " + this.rate);
	}
}
