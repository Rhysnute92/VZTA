package Team5.SmartTowns.Landmarks;

import Team5.SmartTowns.trails.Trail;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import jakarta.validation.Valid;

@Controller
public class LandmarksController {

// Controllers for LandmarkFormTh.html landmark submission form
    @GetMapping("/landmarkSubmission")
    public ModelAndView landmarkSubmission(){
        ModelAndView modelAndView1 = new ModelAndView("Landmarks/LandmarkFormTh.html");
        modelAndView1.addObject("landmarkData", new Landmarks());
        return modelAndView1;

    }
    @PostMapping("/landmarkSub")
    public ModelAndView landmarkSent(@Valid @ModelAttribute("landmarkData") Landmarks landmarks, BindingResult bindingResult, Model model ) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("Landmarks/LandmarkFormTh.html", model.asMap());
            return modelAndView;
        } else{
            System.out.println(landmarks);
            // current functionality only prints successful Landmarks, (todo )database integration is necessary here
        ModelAndView modelAndView = new ModelAndView("redirect:/test.html");
            return modelAndView;
        }
    }

//    @GetMapping("/dragonstale/{")
//    public ModelAndView getAllTrails(){
//        ModelAndView mav = new ModelAndView("allTrails/allTrails");
//        mav.addObject("landmarks", Landmarks.landmarks); //Mock data for trails
//        return mav;
//    }








}


