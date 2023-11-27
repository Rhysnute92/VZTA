package Team5.SmartTowns.Landmarks;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandmarksController {

    @GetMapping("/landmarkSubmission")
    public ModelAndView landmarkSubmission(){
        ModelAndView modelAndView = new ModelAndView("Landmarks/LandmarkFormTh.html");
        modelAndView.addAllObjects("Landmarks", new Landmarks());
        return modelAndView;
        
    }



}
