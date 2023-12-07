package Team5.SmartTowns.Organisation;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
@Controller
public class organisationControllers {
    @GetMapping("/localauthorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/local-authorities.html");
        return modelAndView;
    }
    @GetMapping("/businesses")
    public ModelAndView getBusinessPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/business.html");
        return modelAndView;
    }
    @GetMapping("/consumers")
    public ModelAndView getConsumersPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/consumers.html");
        return modelAndView;
    }
    @GetMapping("/towns")
    public ModelAndView getTownsPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/towns.html");
        return modelAndView;
    }
}
