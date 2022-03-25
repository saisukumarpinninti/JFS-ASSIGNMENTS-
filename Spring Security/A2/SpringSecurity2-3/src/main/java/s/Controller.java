package s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String Hello() {
		String s = "<h1>HelloWorld</h1>" ;
		return (s);
		
	}
	@GetMapping("/user")
	public String Hello1() {
		String s = "<h1>HelloUser</h1>" ;
		return (s);
		
	}
	@GetMapping("/admin")
	public String Hello2() {
		String s = "<h1>HelloAdmin</h1>" ;
		return (s);
		
	}

}
