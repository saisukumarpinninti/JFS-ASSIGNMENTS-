package Sukumar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Service;

@Service()
public class DataBaseService {
	private Connection connection;
	
	public DataBaseService() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
   	    this.connection = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "");
		}catch (Exception e) {
			
		}
	}
	
	public void insertData(user user) throws Exception {
		 String Pswd = user.getPswd();
    	 String Uname = user.getUname();
    	 String Email = user.getEmail();
    	 PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
    	 preparedStatement.setString(1, Uname);
    	 preparedStatement.setString(2, Email);
    	 preparedStatement.setNString(3, Pswd);
    	 preparedStatement.executeUpdate();
    	 
	}
	
	public  boolean  getData(user user) throws Exception {
		 PreparedStatement pst=connection.prepareStatement("select * from user where Uname=?");
    	 pst.setString(1, user.getUname());
		 ResultSet resultSet = pst.executeQuery();
		 if(resultSet.next()==false) {
				return false;
			}
			String Uname="";
			String pass="";
			while(resultSet.next()){
				Uname=resultSet.getString(1);
				pass=resultSet.getString(3);
			}
			
			if(Uname.equals(user.getUname()) && pass.equals(user.getPswd()))
				return true;
			else 
			  return false;
		
	}
}
