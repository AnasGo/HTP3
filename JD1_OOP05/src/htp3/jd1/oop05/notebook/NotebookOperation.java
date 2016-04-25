package htp3.jd1.oop05.notebook;

import java.util.ArrayList;

class NotebookOperation {

	public static Notebook addNote(Note note, Notebook notebook) {
		ArrayList<Note> temp = notebook.getList();
		temp.add(note);
		return notebook;
	}

	public static void printNote(Note note) {
		System.out.print("Имя " + note.getName() + " Фамилия " + note.getSurname() + " Телефонный номер "
				+ note.getTelnum() + " Адрес " + note.getAdress() + " Компания " + note.getCompany());
		System.out.println("");

	}

	public static void printNotebook(Notebook notebook) {
		if (!(notebook.getNameNotebook() == null)) {
			System.out.println("Имя записной книжки: " + notebook.getNameNotebook());
		}
		ArrayList<Note> temp = notebook.getList();
		for (Note note : temp) {
			printNote(note);
		}
	}

	public static boolean findNote(Note note, Notebook notebook) {
		boolean fN = false;
		ArrayList<Note> temp = notebook.getList();
		for (int i = 0; i<temp.size(); i++) {
			if (note.equals(temp.get(i))) {
				fN = true;
			}
		}
		return fN;
	}
}
