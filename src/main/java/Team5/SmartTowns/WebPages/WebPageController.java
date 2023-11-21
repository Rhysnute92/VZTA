package Team5.SmartTowns.WebPages;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Controller
public class WebPageController {


    @GetMapping()
    public ModelAndView getXWebPage("/html page here"){
        ModelAndView modelAndView = new ModelAndView("Desired ViewName");
return modelAndView;
    }

    @GetMapping()
    public ModelAndView getYWebPage("/html page here"){
        ModelAndView modelAndView = new ModelAndView("Desired ViewName");
        return modelAndView;
    }

    @GetMapping()
    public ModelAndView getZWebPage("/html page here"){
        ModelAndView modelAndView = new ModelAndView("Desired ViewName");
        return modelAndView;
    }




}
