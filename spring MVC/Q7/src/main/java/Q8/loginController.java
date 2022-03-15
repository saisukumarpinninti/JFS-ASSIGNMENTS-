package Q8;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class loginController {

    @RequestMapping("/login.html")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        return  modelAndView;
    }
    @RequestMapping("/NewFile.html")
    public ModelAndView lo(){
        ModelAndView modelAndView = new ModelAndView("NewFile");
        return  modelAndView;
    }
    
    @RequestMapping(value="/validation.html" )
    public String hello(@Valid @ModelAttribute("customer")customer c, BindingResult bindingResult , RedirectAttributes attr, HttpSession session) {

	 if(bindingResult.hasErrors()) {
		 attr.addFlashAttribute("org.springframework.validation.BindingResult.register", bindingResult);
		    attr.addFlashAttribute("coustmer", c);
            System.out.println("Error");
            return "login";
        }
	 System.out.println("Success");
        return "NewFile";
    }
}