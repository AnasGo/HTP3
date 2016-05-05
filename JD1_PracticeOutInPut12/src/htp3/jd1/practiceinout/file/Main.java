package htp3.jd1.practiceinout.file;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Book b1 = new Book("Finansist", "Draiser", 1950, "Frank Kaupervood in Filadelphia", 218000);
		Book b2 = new Book("Titan", "Draiser", 1954, "Frank Kaupervood in Chicago", 220000);
		Book b3 = new Book("Stoik", "Draiser", 1956, "Frank Kaupervood and Berenis", 258000);
		Book b4 = new Book("Genius", "Draiser", 1965, "Writer", 300000);
		Book b5 = new Book("American Tragedy", "Draiser", 1947, "Live", 274000);

		ArrayList<Book> library = new ArrayList<Book>();
		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(b4);
		library.add(b5);

		FileWriter fw = new FileWriter("library.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		for (Book book : library) {
			pw.println(book.bookInformation());
		}
		pw.close();

		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}

}
