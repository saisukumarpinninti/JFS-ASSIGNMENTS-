package s.Q5;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Q5")
public class Q5Controller {
	EmpDb n = new EmpDb();
	// Get All Employees : 
	  @GetMapping("/All")
	    public List<Employee> getemployee() throws Exception  {
	    	
	    	List<Employee> i = n.getDetails();
			return  i ;
	    }
		
		  @GetMapping("/employees/{id}") 
		  public Employee getemployee(@PathVariable int id) throws SQLException {
		  return n.getEmp(id);
		  }
		  
		  @PostMapping("/addemployee")
		    public Employee addEmployee(@RequestBody Employee emp) throws SQLException{
		        return n.addEmployee(emp);
		    }

		    @DeleteMapping("/employee/{id}")
		    public void deleteEmplolyee(@PathVariable("id") int id) throws Exception{
		        n.deleteEmployee(id);

		    }

		    @PutMapping("/employee")
		    public  Employee updateEmployee(@RequestBody Employee emp) throws SQLException{
		        return n.updateEmployee(emp);
		    } 
}
