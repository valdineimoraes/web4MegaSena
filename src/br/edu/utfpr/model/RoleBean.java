package br.edu.utfpr.model;

import br.edu.utfpr.model.sql.UserSQLDAO;
import br.edu.utfpr.model.sql.RoleSQLDAO;

public class RoleBean {
	private String login;
	private String role;

	public RoleBean(String login, String role) {
		super();
		this.login = login;
		this.role = role;
	}


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

	// Data Access Object
	
			public static RoleSQLDAO dao = new RoleSQLDAO();
			
			public void save(UserBean u) {
				dao.create(u, this);
						
			}
			public void delete() {
				
				dao.delete(this);
			}
			
			public static RoleBean find(String login) {
				return dao.find(login);
			}


	



	
}
