package s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class adduser {

	Connection c ;
	
	@Autowired
	PasswordEncoder encoder;
	
	public adduser() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "s", "sai");
			this.encoder =  new BCryptPasswordEncoder();
			//this.c = ds.getConnection() ;
		} catch (Exception e) {
			System.out.println("Not Connected TO DB;");
		}
	}
	
	public void adduserdetails(String username,String Password) throws SQLException {
		PreparedStatement ps = c.prepareStatement("INSERT INTO users (username, password, enabled) VALUES (?, ?, 1)");
		ps.setString(1,username);
		String password = encoder.encode(Password);
		ps.setString(2,password);
		ps.execute();
		PreparedStatement ps2 = c.prepareStatement("INSERT INTO users (username, authority) VALUES ('?', '?')");
		ps2.setString(1,username);
		String authority = "ROLE_USER";
		ps2.setString(2,authority);
		ps2.execute();
		PreparedStatement ps3 = c.prepareStatement("INSERT INTO user_attempts (uname, attempts, lastModified) "
				+ "VALUES ('?', 0, current_timestamp())");
		ps3.setString(1,username);
		ps3.execute();
	}
	
	

}
