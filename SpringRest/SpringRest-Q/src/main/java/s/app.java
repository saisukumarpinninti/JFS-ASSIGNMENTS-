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
    orderrepo cr;

	
	  @RequestMapping(value = "/order",method = RequestMethod.GET) public
	  List<order> getAllDetails(){ 
		  List<order> orderList= cr.FindAllorder();
		  return orderList; 
		  }
	 
    @RequestMapping(value="/order/{id}",method=RequestMethod.GET)
    public order getorderById(@PathVariable("id") int id){
        return cr.findById(id);
    }

	
	  @RequestMapping(value="/order",method =RequestMethod.POST) public order
	  addorder(@RequestBody order cust){ return cr.addorder(cust);
	  
	  }
	  
	  @RequestMapping(value="/order/{id}",method = RequestMethod.DELETE) public
	  void deleteorder(@PathVariable("id") int id){ 
	  cr.deleteorder(id);
	  
	  }
	  
	  @RequestMapping(value = "/order",method = RequestMethod.PUT) public
	  order updateorder(@RequestBody order cust){ return
	  cr.updateEmployee(cust); }
	 
}
