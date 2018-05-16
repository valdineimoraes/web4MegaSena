package br.edu.utfpr.model;

import br.edu.utfpr.model.sql.UserSQLDAO;

public class UserBean {
	private String name;
	private String usuario;
	private String password;
	private Integer _id;

	public UserBean(String name, String login, String pwd) {
		super();
		this.name = name;
		this.usuario = login;
		this.password = pwd;
	}

	public UserBean(Integer _id, String name, String login, String pwd) {
		this._id = _id;
		this.name = name;
		this.usuario = login;
		this.password = pwd;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", usuario=" + usuario + ", password=" + password + ", _id=" + _id + "]\n";
	}

	// Data Access Object

	public static UserSQLDAO dao = new UserSQLDAO();

	public void save() {
		if (_id != null && dao.find(_id) != null)
			dao.update(this);
		else {
			dao.create(this);
		}
	}

	public void delete() {
		if (dao.find(_id) != null)
			dao.delete(this);
	}

	public static UserBean find(int pk) {
		return dao.find(pk);
	}
}
