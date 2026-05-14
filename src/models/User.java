package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public User(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public ArrayList<User> get(){
		ArrayList<User> users = new ArrayList();
		
		String query = "SELECT * FROM usuarios";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/therianspage", "root", "VibePass0407");
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				User tmp = new User();
				tmp.setId(rs.getInt("id"));
				tmp.setUsername(rs.getString("username"));
				tmp.setEmail(rs.getString("email"));
				
				users.add(tmp);
				
				int id = rs.getInt("id");
			}
			rs.close();
			ps.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return users;
	}
	
	public boolean make(String email, String username, String password) {
	    String query = "INSERT INTO usuarios (username, password, email) VALUES (?, ?, ?)";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/therianspage", "root", "VibePass0407");
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setString(1, username);
	        ps.setString(2, password);
	        ps.setString(3, email);
	        int rowsAffected = ps.executeUpdate();
	        ps.close();
	        conn.close();
	        return rowsAffected > 0;
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
