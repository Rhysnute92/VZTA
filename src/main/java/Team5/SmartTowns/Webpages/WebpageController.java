package Team5.SmartTowns.Webpages;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
@Controller
public class WebpageController {
    @GetMapping("/Caerleon")
    public ModelAndView getCaerleonPage(){
        ModelAndView modelAndView = new ModelAndView("towns/caerleon");
        return modelAndView;
    }

    @GetMapping("/Caerphilly")
    public ModelAndView getCaerphillyPage(){
        ModelAndView modelAndView = new ModelAndView("towns/caerphilly");
        return modelAndView;
    }

    @GetMapping("/Risca")
    public ModelAndView getRiscaPage(){
        ModelAndView modelAndView = new ModelAndView("towns/risca");
        return modelAndView;
    }




}
