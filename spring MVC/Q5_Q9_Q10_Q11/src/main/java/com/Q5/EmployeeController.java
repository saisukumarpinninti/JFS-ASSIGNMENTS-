package com.Q5;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDao;
	
	@RequestMapping(value = "/addEmployee.html",method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView modelAndView = new ModelAndView("EmployeeForm");
		return modelAndView;
	}
	
	@RequestMapping(value ="/InsertEmployee.html",method =RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute ("employee")Employee employee) throws Exception {
		employeeDao.insertUser(employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");

		return modelAndView;
	}
	@RequestMapping(value ="/employeeDetail.html")
	public ModelAndView emp() throws Exception {	
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		return modelAndView;
	}
	@RequestMapping(value ="/edexcel.html")
	public ModelAndView emp2() throws Exception {	
		ModelAndView modelAndView = new ModelAndView("edexcel");
		return modelAndView;
	}@RequestMapping(value ="/edpdf.html")
	public ModelAndView emp3() throws Exception {	
		ModelAndView modelAndView = new ModelAndView("edpdf");
		return modelAndView;
	}
	@RequestMapping("/deleteEmployee/{userId}")
	public ModelAndView deleteEmployee(@PathVariable ("userId") int userId)throws Exception {
		employeeDao.deleteEmployee(userId);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",userId);
		return modelAndView;
	}
	
	@RequestMapping("/editEmployeeDetail/{userId}")
	public ModelAndView editEmployee(@PathVariable ("userId") int userId) {
		ModelAndView modelAndView = new ModelAndView("updateEmployee");
		modelAndView.addObject("userId",userId);
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateEmployee.html",method = RequestMethod.POST)
	public ModelAndView updateDetails(@ModelAttribute ("employee")Employee employee) throws Exception {
		employeeDao.updateDetails(employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",employee);
		return modelAndView;
	}
	
    @RequestMapping(value = "/viewemp/{pageNo}")
    public ModelAndView employeeView(@PathVariable int pageNo) throws SQLException{
        ModelAndView modelAndView = new ModelAndView("EmployeePage");
        int total=5;
        if(pageNo==1){}
        else{
            pageNo=(pageNo-1)*total+1;
        }
        List<Employee> list=employeeDao.getEmployeeByPageNO(pageNo,total) ;
        modelAndView.addObject("msg",list);
        return  modelAndView;
    }
 

}