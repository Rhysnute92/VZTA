package Team5.SmartTowns.Landmarks;

import Team5.SmartTowns.Data.location;
import Team5.SmartTowns.Data.locationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.swing.*;
import java.sql.PreparedStatement;
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

    @Autowired
    private locationRepository locationRepository;
    @PostMapping("/landmarkSub")
    public ModelAndView landmarkSent(@Valid @ModelAttribute("landmarkData") Landmarks landmarks, BindingResult bindingResult, Model model ) {


        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("Landmarks/LandmarkFormTh.html", model.asMap());
            return modelAndView;

        } else{

            location loc= new location(landmarks.getLandmarkID(),landmarks.getLandmarkName(), landmarks.getLandmarkEmail(), landmarks.getLandmarkDescription(), landmarks.getLandmarkLocation(), landmarks.getTrailID());
            System.out.println(loc);
            locationRepository.addLocation(loc);
            ModelAndView modelAndView = new ModelAndView("redirect:/home");
            return modelAndView;

        }







    }


}
