package s;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class App {
	
	@GetMapping("/Q1")
	public String Q1(){return "Hello World";}
	
	@GetMapping("/Q2/validate/{username}/{password}")
	public String validateUser(@PathVariable String  username,@PathVariable String password)
	{
        if(username.equals("Sukumar") && password.equals("Q2"))return "Valid User";else return "Invalid User"; }
	
	
	@GetMapping("/Q3/{Zipcode}")
	public ZipCode Q3(@PathVariable Integer Zipcode)   {
		ZipCode z = new ZipCode(532292,"Manikyapuram","Andhra Pradesh","India");
		if(Zipcode==z.getId())return z ; else return null ; 
		//http://api.geonames.org/postalCodeSearchJSON?formatted=true&postalcode=201306&maxRows=10&username=jhon&style=full	
}
	@GetMapping("/Q4/{CardNo}")
	public String Q2(@PathVariable String CardNo)   { return GetCardStatus(CardNo);}
    public String GetCardStatus( String CardNo){
        String  ans="Not valid";
        if(CardNo.matches("((?:3528|3589|35[0-9]{3})[0-9]{11,14})")){
            ans="Valid + JCB";
        }
        else if(CardNo.matches("(4[0-9]{12}(?:[0-9]{3})?)"))
            ans="Valid + Visa";
        else if(CardNo.matches("^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))"))
            ans="Valid + MasterCard";
        return ans;
    }

}