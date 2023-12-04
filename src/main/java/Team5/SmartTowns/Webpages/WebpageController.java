package Team5.SmartTowns.Webpages;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
@Controller
public class WebpageController {
    @GetMapping("/Caerleon")
    public ModelAndView getCaerleonPage(){
        ModelAndView modelAndView = new ModelAndView("Towns/caerleon");
        return modelAndView;
    }

    @GetMapping("/Caerphilly")
    public ModelAndView getCaerphillyPage(){
        ModelAndView modelAndView = new ModelAndView("Towns/caerphilly");
        return modelAndView;
    }

    @GetMapping("/Risca")
    public ModelAndView getRiscaPage(){
        ModelAndView modelAndView = new ModelAndView("Towns/risca");
        return modelAndView;
    }

    @GetMapping("/maps")
    public ModelAndView getMapTestAPI(){
        ModelAndView modelAndView = new ModelAndView("Towns/MapApiTest");
        return modelAndView;
    }

//    @GetMapping("/home")
//    public ModelAndView getHome(){
//        ModelAndView modelAndView = new ModelAndView("Towns/home/homePage");
//        return modelAndView;
//    }


    @RequestMapping(value="/test_ajax_frag", method=RequestMethod.POST)
    public String sendHtmlFragment(Model map) {
        //map.addAttribute("foo", "bar");
        return "fragments/temp_frags.html :: trailInfo2";
    }



}
