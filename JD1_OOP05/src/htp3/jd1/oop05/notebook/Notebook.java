package htp3.jd1.oop05.notebook;

import java.util.*;

class Notebook {
	private ArrayList<Note> list;
	private String nameNotebook;

	public Notebook() {

	}

	/*public Notebook(ArrayList<Note> list) {
		this.list = list;
	}

	public Notebook(String s) {
		this.nameNotebook = s;
	}*/

	public Notebook(String s, ArrayList<Note> list) {
		this.nameNotebook = s;
		this.list = list;
	}

	public ArrayList<Note> getList() {
		return list;
	}

	public void setNotebook(ArrayList<Note> list) {
		this.list = list;
	}

	public String getNameNotebook() {
		return nameNotebook;
	}

	public void setNameNotebook(String s) {
		this.nameNotebook = s;
	}
}
