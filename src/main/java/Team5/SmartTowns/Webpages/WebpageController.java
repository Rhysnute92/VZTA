package Team5.SmartTowns.Webpages;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Controller
public class WebpageController {


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
