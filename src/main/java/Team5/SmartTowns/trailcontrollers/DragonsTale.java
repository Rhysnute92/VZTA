package Team5.SmartTowns.trailcontrollers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DragonsTale {
    @GetMapping("/dragonstale")
    public ModelAndView getDragonsTale(){
        ModelAndView modelAndView = new ModelAndView("src/main/resources/templates/towns/trails/dragonstale/index.html");
        return modelAndView;
    }
}
