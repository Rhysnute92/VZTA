package Team5.SmartTowns.Landmarks;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
//import jakarta.validation.Valid;

@Controller
public class LandmarksController {


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

//       LandmarksArray userArray = LandmarksArray.getInstance();
//        Landmarks newUserSubmission = new Landmarks(landmarkData.getFormUsername(),userSubmission.getFormEmail(),
//                userSubmission.getFormPark(), userSubmission.getFormDescription(),userSubmission.getFormCafe(), userSubmission.getFormToilets());
//        userArray.addUserSubmission(newUserSubmission);
//        System.out.println(userArray.getFormItems());
//
        ModelAndView modelAndView = new ModelAndView("redirect:/test.html");
            return modelAndView;

        }

//        return modelAndView;





    }

//    @PostMapping("/landmarkSubmission")
//    public ModelAndView landmarkSubmission( Landmarks landmarks){
//        System.out.println(landmarks);
//        ModelAndView modelAndView = new ModelAndView("redirect:/thankyou.html");
//
//        return modelAndView;
//
//    }

}
