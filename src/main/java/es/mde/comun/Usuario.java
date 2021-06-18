package es.mde.comun;

public class Usuario {

	private String email;
	private String username;
	private String passwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Usuario() {
		super();
	}

	public Usuario(Long id, String email, String username, String passwd) {
		super();

		this.email = email;
		this.username = username;
		this.passwd = passwd;
	}

}
