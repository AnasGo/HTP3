package htp3.jd1.mylibrary.bean;

public class Request {
	private String commandName;
	private String login;
	private String password;
	private String title;

	public Request() {

	}

	public Request(String login, String password, String title) {
		this.login = login;
		this.password = password;
		this.title = title;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
