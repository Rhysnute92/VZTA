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
        ModelAndView modelAndView = new ModelAndView("local-authorities");
        return modelAndView;
    }
}
