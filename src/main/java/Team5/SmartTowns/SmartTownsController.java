package Team5.SmartTowns;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmartTownsController {


    @GetMapping("/")
    public ModelAndView getHomePage(){
        return new ModelAndView("welcome-page");
    }
}
