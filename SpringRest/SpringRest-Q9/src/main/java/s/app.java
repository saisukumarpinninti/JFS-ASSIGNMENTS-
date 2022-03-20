package s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app {
	
    @Autowired
    customerrepo cr;

	
	  @RequestMapping(value = "/customer",method = RequestMethod.GET) public
	  List<customer> getAllDetails(){ 
		  List<customer> customerList= cr.FindAllCustomer();
		  return customerList; 
		  }
	 
    @RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
    public customer getCustomerById(@PathVariable("id") int id){
        return cr.findById(id);
    }

	
	  @RequestMapping(value="/customer",method =RequestMethod.POST) public customer
	  addCustomer(@RequestBody customer cust){ return cr.addCustomer(cust);
	  
	  }
	  
	  @RequestMapping(value="/customer/{id}",method = RequestMethod.DELETE) public
	  void deleteCustomer(@PathVariable("id") int id){ 
	  cr.deleteCustomer(id);
	  
	  }
	  
	  @RequestMapping(value = "/customer",method = RequestMethod.PUT) public
	  customer updatecustomer(@RequestBody customer cust){ return
	  cr.updateEmployee(cust); }
	 
}
