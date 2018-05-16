package br.edu.utfpr.model;

import br.edu.utfpr.model.sql.UserSQLDAO;

public class RoleBean {
	private String login;
	private String role;
	
	public RoleBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public RoleBean(String login, String role) {
		super();
		this.login = login;
		this.role = role;
	}




	// Data Access Object

	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	



	
}
