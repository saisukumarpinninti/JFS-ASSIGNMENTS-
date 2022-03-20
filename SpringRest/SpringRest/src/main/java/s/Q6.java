package s;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Q6")
@RestController
public class Q6 {


    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        return  a+b;
    }

    @GetMapping( "/subtract/{a}/{b}")
    public int subtract(@PathVariable int a,@PathVariable int b){
        return  a-b;
    }
    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a,@PathVariable int b){
        return  a*b;
    }
    @GetMapping("/divide/{a}/{b}")
    public double division(@PathVariable int a,@PathVariable int b){
        return  a/b;
    }

    @GetMapping("/sqrt/{a}")
    public double squareRoot(@PathVariable int a){
        return  Math.sqrt(a);
    }
}
