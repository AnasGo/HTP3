package htp3.jd1.oop05.notebook;

import java.util.ArrayList;

public class NotebookMain {

	public static void main(String[] args) {
		Note n1 = new Note("Вася", "Пупкин", 123456, "Минск", "Гугл");
		Note n2 = new Note("Вася", "Пупкин", 123789, "Минск", "Гугл");
		Note n3 = new Note("Вася", "Пупкин", 126789, "Минск", "Гугл");
		Note n4 = new Note("Вася", "Пупкин", 123489, "Минск", "Гугл");
		Note n5 = new Note("Вася", "Пупкин", 145689, "Минск", "Гугл");
		Note n6 = new Note("Вася", "Пупкин", 134679, "Минск", "Гугл");
		Note n7 = new Note("Вася", "Пупкин", 126789, "Минск", "Гугл");
		Note n8 = new Note("Вася", "Пупкин", 126789, "Минск", "Гугл");

		ArrayList<Note> list = new ArrayList<Note>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);

		Notebook notebook = new Notebook("JobNotes", list);
		notebook = NotebookOperation.addNote(n7, notebook);
		NotebookOperation.printNotebook(notebook);
		System.out.println(NotebookOperation.findNote(n8, notebook));
	}
}
