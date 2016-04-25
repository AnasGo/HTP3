package htp3.jd1.oop05.notebook;

class Note {
	private String name;
	private String surname;
	private int telnum;
	private String adress;
	private String company;
	
	public Note(){
		
	}
	
	public Note(String name, String surname, int telnum, String adress, String company){
		this.name = name;
		this.surname = surname;
		this.telnum = telnum;
		this.adress = adress;
		this.company = company;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTelnum() {
		return telnum;
	}

	public void setTelnum(int telnum) {
		this.telnum = telnum;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
		
}
