package Q7;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class productController {
	
	@Autowired
	private productServies productServies;
	@GetMapping("/show/{Id}")
	public product t(@PathVariable String Id) {
		return productServies.FindbyId(Id);
	}
	@GetMapping("/showAll")
	public List<product> getAll() {
		return productServies.getAll();
	}
	@PostMapping("/Place")
	public product Place(@RequestBody product s) {
		return productServies.place(s);
	}
	@PutMapping("/Update")
	public product Update(@RequestBody product s) {
		return productServies.update(s);
	}
	@DeleteMapping("/delete/{Id}")
	public void del(@PathVariable String Id) {
		productServies.deleteById(Id);
	}

}