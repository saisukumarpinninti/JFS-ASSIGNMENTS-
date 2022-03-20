package s.Q5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDb  {
	Connection connection ;
	
// Constructor
	public EmpDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	   	    this.connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
	   	    PreparedStatement preparedStatement= connection.prepareStatement("select * from employee");
			ResultSet resultSet=preparedStatement.executeQuery();
		}catch (Exception e) {
				System.out.println("Not Connected TO DB;");
			}
		}
	
// Method to get all Employee Details as List :
	public List<Employee> getDetails() throws Exception{
		PreparedStatement ps= connection.prepareStatement("SELECT * FROM employee");
		ResultSet rS=ps.executeQuery();
		List<Employee> i = new ArrayList<>();
		while(rS.next()) {
			Employee e = new Employee();
			e.setEmployeeId(rS.getInt("employeeid"));
			e.setEmployeeName(rS.getString("employeeName"));
			e.setEmployeeDepartment(rS.getString("employeeDepartment"));
			e.setEmployeeDesignation(rS.getString("employeeDesignation"));
			e.setEmployeeId(rS.getInt("employeeSalary"));
			i.add(e);
		}
		return i;
	}
	
	
	// Method to get all Employee Details as List using id :
	
	
	public Employee getEmp(int id) throws SQLException {
		PreparedStatement ps= connection.prepareStatement("SELECT * FROM employee WHERE employeeid =? ");
		ps.setInt(1,id);
		System.out.println(id);
		ResultSet rS=ps.executeQuery();
		Employee e = new Employee();
		while(rS.next()) {
			e.setEmployeeId(id);
			e.setEmployeeName(rS.getString("employeeName"));
			e.setEmployeeDepartment(rS.getString("employeeDepartment"));
			e.setEmployeeDesignation(rS.getString("employeeDesignation"));
			e.setEmployeeId(rS.getInt("employeeSalary"));
		}
		return e;
	}

	
	
	public Employee addEmployee(Employee employee) throws SQLException {
		String employeeName=employee.getEmployeeName();
		
		 String employeeDepartment=employee.getEmployeeDepartment();
		 String employeeDesignation=employee.getEmployeeDesignation();
		 int employeeSalary=employee.getEmployeeSalary();
		 
		 PreparedStatement preparedStatement = 
				 connection.prepareStatement("insert into employee "
				 		+ "(employeeName,employeeDepartment,employeeDesignation,employeeSalary) values(?,?,?,?)");
		 preparedStatement.setInt(1, 1);
   	 preparedStatement.setString(1, employeeName);
   	 preparedStatement.setString(2,employeeDepartment);
   	 preparedStatement.setString(3, employeeDesignation);
   	 preparedStatement.setInt(4,employeeSalary);
   	 preparedStatement.executeUpdate();
		return employee;
	}

	public void deleteEmployee(int id)throws Exception{
		
		PreparedStatement preparedStatement = connection.prepareStatement("DELETE from employee where employeeId=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		
	}
	
	public Employee updateEmployee(Employee employee) throws SQLException {
		String sql = "UPDATE employee SET employeeName=?,employeeDepartment=?,employeeDesignation=?,employeeSalary=? where employeeId=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, employee.getEmployeeName());
		preparedStatement.setString(2, employee.getEmployeeDepartment());
		preparedStatement.setString(3, employee.getEmployeeDesignation());
		preparedStatement.setInt(4, employee.getEmployeeSalary());
		preparedStatement.setInt(5, employee.getEmployeeId());
		
		preparedStatement.executeUpdate();
		return employee;
	}
	
	


		
	}


	
	
	



