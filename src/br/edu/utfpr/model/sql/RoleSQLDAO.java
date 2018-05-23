package br.edu.utfpr.model.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;

import br.edu.utfpr.model.RoleBean;
import br.edu.utfpr.model.UserBean;

public class RoleSQLDAO extends SQLBase{
	public RoleSQLDAO() {
		
	}
	
	public void create(UserBean u, RoleBean r) {
		open();
		
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement(
				"INSERT INTO roles (login, role) VALUES (?,?)");
				stm.setString(1, u.getUsuario());
				stm.setString(2, r.getRole());
		
				stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public List<RoleBean> all(){
		ArrayList<RoleBean> result = new ArrayList<>();
		open();
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("SELECT * FROM roles ORDER BY id ASC;");
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				RoleBean r = new RoleBean(
					rs.getString(1),
					rs.getString(2)
				);
				result.add(r);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	public void update(RoleBean r) {
		open();
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("UPDATE roles SET "+
				"login = ?,"+
				"role = ?"+
				"WHERE email = ?;"				
				);
			stm.setString(2, r.getLogin());
			stm.setString(3, r.getRole());
			stm.setString(3, r.getLogin());
			
			stm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			close();
		}
	}
	public void delete(RoleBean r) {
		open();
		try {
			PreparedStatement stm = (PreparedStatement) conn.
				prepareStatement("DELETE FROM roles WHERE email = ?;" );
			
			stm.setString(1, r.getLogin());
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public RoleBean find(String role){
		RoleBean result = null;
		open();
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.
					prepareStatement("SELECT * FROM roles WHERE role = ?;");
			
			stm.setString(1, role);
			ResultSet rs = stm.executeQuery();
			
			if (rs.next()) {
				RoleBean r = new RoleBean(
					rs.getString(1),
					rs.getString(2)
					
				);
				result = r;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	
}
