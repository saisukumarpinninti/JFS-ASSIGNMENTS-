package s;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomLoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	Connection c;
	@Autowired
	DataSource ds ; 

	public CustomLoginFailureHandler() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "s", "sai");
			//this.c = ds.getConnection() ;
		} catch (Exception e) {
			System.out.println("Not Connected TO DB;");
		}
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		boolean status=true;
		int attempts = 0;
		String username = request.getParameter("username");
		long d = 0 ;
		try {
			ResultSet rs=getAttempts(username);
			
			while(rs.next()) 
			{
				attempts = rs.getInt(2);  
			d= rs.getDate(3).getTime() ;
			}
			status = status(username);
			long now =  new Date().getTime();
			long diff = now - d;
			if(diff>100) {
				unlock(username);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception");
		}
			if(status) {
				if(3>=attempts) {
					try {
						increaseFailedAttempts(attempts,username);
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			
			else{ System.out.println("user is Locked");exception = new
					  LockedException("Account has been locked due to 3 unsuccessful login attempt" ); }
			  } else{ System.out.println("user locked");
			  exception = new
					  LockedException("Account has been locked");}
			super.setDefaultFailureUrl("/login?error");
		super.onAuthenticationFailure(request, response, exception);

	}
	
//getlockstatus
	boolean status(String username) throws SQLException  {
		boolean s=true;
		PreparedStatement ps = c.prepareStatement("select enabled from users where username=?");
		ps.setString(1,username);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {s = rs.getBoolean("enabled");};
		return s;
	}
//get attempts data
	
	ResultSet getAttempts(String username) throws SQLException { PreparedStatement ps =
	  c.prepareStatement("select * from user_attempts where uname=?");
	
	  ps.setString(1,username); 
	  ResultSet rs = ps.executeQuery(); 
	 //System.out.println("completed attempts data");
	  return rs; } 
	 
	
	// increase attempts count
	  int increaseFailedAttempts(int n,String username) throws SQLException { 
		  n=+1;
		  PreparedStatement ps1 = c.prepareStatement("update  user_attempts set attempts= ? where uname=?");
		  ps1.setInt(1, n);
			ps1.setString(2,username);
			ps1.executeUpdate();
		  return(n); 
		  }
	 
	//unlockuser
	void unlock(String username)  throws SQLException{ 
		  PreparedStatement ps = c.prepareStatement("update  users set enabled=? where username=?");
		  ps.setBoolean(1, true);
			ps.setString(2,username);
			ps.executeUpdate();
			
			PreparedStatement ps1 = c.prepareStatement("update  user_attempts set attempts=0 where uname=?");
				ps1.setString(1,username);
				ps.executeUpdate();
		  }

	//lockuser
	  void lock(String username)  throws SQLException
	  { 
		  PreparedStatement ps = c.prepareStatement("update  users set enabled=? where username=?");
		  ps.setBoolean(1, false);
			ps.setString(2,username);
			ps.executeUpdate();
			
		  }
	 

}