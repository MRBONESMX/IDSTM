package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthModel {
	private AuthModel model;
	
	public AuthModel() {
		
	}
	
	public boolean login(String email, String password) {
		String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
		
		Connection conn =  null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
				    "jdbc:mysql://sql.freedb.tech:3306/freedb_1RSWI58V",
				    "u_BVV2lm",
				    "rzGt8DFTX1y1"
				);
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				rs.close();
				ps.close();
				conn.close();
				return true;
			}
			rs.close();
			ps.close();
			conn.close();
			
			System.out.print(query);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean register(String username, String password, String email) {

    String query = "INSERT INTO usuarios (username, password, email) VALUES (?, ?, ?)";

    Connection conn = null;

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(
        	    "jdbc:mysql://sql.freedb.tech:3306/freedb_1RSWI58V",
        	    "u_BVV2lm",
        	    "rzGt8DFTX1y1"
        	);

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
	public static void main(String[] args) {
		

	}

}
