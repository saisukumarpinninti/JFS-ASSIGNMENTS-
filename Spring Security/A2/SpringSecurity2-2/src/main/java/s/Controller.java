package s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/AD")
	public String H() {return "<h1>Access-Denied</h1>";}
	
	@GetMapping("/user")
	public String Hel() {return "<h1>Hi,User</h1>" ;}
	
	@GetMapping("/admin")
	public String He() {return "<h1>HelloAdmin</h1>" ;}

}
