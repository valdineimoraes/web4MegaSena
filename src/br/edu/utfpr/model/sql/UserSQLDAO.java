package br.edu.utfpr.model.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;
import br.edu.utfpr.model.UserBean;

public class UserSQLDAO extends SQLBase{
	public UserSQLDAO() {
		open();
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement(
				"CREATE TABLE IF NOT EXISTS users ("    		+
				"id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"	+
				"name VARCHAR(100)," 							+
				"login VARCHAR(50)," 							+
				"pwd VARCHAR (20))"						);
			stm.executeUpdate();
			

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void create(UserBean u) {
		open();
		
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement(
				"INSERT INTO users (name, login, pwd) VALUES (?,?,?)");
				stm.setString(1, u.getName());
				stm.setString(2, u.getUsuario());
				stm.setString(3, u.getPassword());
		
				stm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public List<UserBean> all(){
		ArrayList<UserBean> result = new ArrayList<>();
		open();
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("SELECT * FROM users ORDER BY id ASC;");
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				UserBean u = new UserBean(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4)
				);
				result.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	public void update(UserBean u) {
		open();
		try {
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("UPDATE users SET"+
				" name = ?,"+
				"login = ?,"+
				"pwd = ?"+
				"WHERE id = ?;"				
				);
			stm.setString(1, u.getName());
			stm.setString(2, u.getUsuario());
			stm.setString(3, u.getPassword());
			stm.setInt(4, u.get_id());
			
			stm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			close();
		}
	}
	public void delete(UserBean u) {
		open();
		try {
			PreparedStatement stm = (PreparedStatement) conn.
				prepareStatement("DELETE FROM users WHERE id = ?;" );
			
			stm.setInt(1, u.get_id());
			
			stm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			close();
		}
	}
	
	public UserBean find(int pk){
		UserBean result = null;
		open();
		
		try {
			PreparedStatement stm = (PreparedStatement) conn.
					prepareStatement("SELECT * FROM users WHERE id ?;");
			
			stm.setInt(1, pk);
			ResultSet rs = stm.executeQuery();
			
			if (rs.next()) {
				UserBean u = new UserBean(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4)
				);
				result = u;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	

}
