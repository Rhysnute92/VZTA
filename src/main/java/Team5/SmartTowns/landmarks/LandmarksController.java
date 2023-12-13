package Team5.SmartTowns.landmarks;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.placeswithcoordinates.LocationsCoordinates;
import Team5.SmartTowns.placeswithcoordinates.PlacesCoordinatesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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

// Controllers for LandmarkFormTh.html landmark submission form
    @GetMapping("/landmarkSubmission")
    public ModelAndView landmarkSubmission(){
        ModelAndView modelAndView1 = new ModelAndView("Landmarks/LandmarkFormTh.html");
        modelAndView1.addObject("landmarkData", new Landmarks());
        return modelAndView1;

    }

    @Autowired
    private LocationRepository locationRepository;
    @PostMapping("/landmarkSub")
    public ModelAndView landmarkSent(@Valid @ModelAttribute("landmarkData") Landmarks landmarks, BindingResult bindingResult, Model model ) {


        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("Landmarks/LandmarkFormTh.html", model.asMap());
            return modelAndView;

        } else{
            // converts valid response using Location constructor into a submittable format to the sql table
            Location loc= new Location(landmarks.getLandmarkName(), landmarks.getLandmarkEmail(), landmarks.getLandmarkDescription(), landmarks.getLandmarkLocation(), landmarks.getTrailID(), false);
            System.out.println(loc);
            locationRepository.addLocation(loc); // adds valid landmark to locations table
            ModelAndView modelAndView = new ModelAndView("redirect:/home");
            return modelAndView;

        }
        
    }

    @Autowired
    private PlacesCoordinatesRepository placesCoordinatesRepo;

    @Autowired
    private LocationsCoordinates locationsCoordinates;

    @GetMapping("/checkpointApproval")
    public ModelAndView adminCheckpointApproval(){
        ModelAndView modelAndView1 = new ModelAndView("Landmarks/locationApprovalFormTh.html");
        modelAndView1.addObject("locationCoord", new LocationsCoordinates());
        return modelAndView1;

    }



}
