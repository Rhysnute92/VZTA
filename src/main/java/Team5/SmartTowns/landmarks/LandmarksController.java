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

import java.util.List;
//import jakarta.validation.Valid;

@Controller
public class LandmarksController {

    // Controllers for LandmarkFormTh.html landmark submission form
    @GetMapping("/landmarkSubmission")
    public ModelAndView landmarkSubmission() {
        ModelAndView modelAndView1 = new ModelAndView("Landmarks/LandmarkFormTh.html");
        modelAndView1.addObject("landmarkData", new Landmarks());
        return modelAndView1;

    }

    @Autowired
    private LocationRepository locationRepository;

    @PostMapping("/landmarkSub")
    public ModelAndView landmarkSent(@Valid @ModelAttribute("landmarkData") Landmarks landmarks, BindingResult bindingResult, Model model) {


        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("Landmarks/LandmarkFormTh.html", model.asMap());
            return modelAndView;

        } else {
            // converts valid response using Location constructor into a submittable format to the sql table
            Location loc = new Location(landmarks.getLandmarkName(), landmarks.getLandmarkEmail(), landmarks.getLandmarkDescription(), landmarks.getLandmarkLocation(), landmarks.getTrailID(), false);
            locationRepository.addLocation(loc); // adds valid landmark to locations table
            ModelAndView modelAndView = new ModelAndView("redirect:/home");
            return modelAndView;

        }

    }

    @Autowired
    private PlacesCoordinatesRepository placesCoordinatesRepo;


    // For form that allows an administrator to add an unapproved location to a trail
    @GetMapping("/checkpointApproval")
    public ModelAndView adminCheckpointApproval() {
        List<Location> unapprovedLocations = locationRepository.getAllUnapprovedLocations(); //change to unauthorised once merger 68 accepted!! todo

        ModelAndView modelAndView = new ModelAndView("Landmarks/locationApprovalFormTh.html");
        modelAndView.addObject("uLocs", unapprovedLocations);
        modelAndView.addObject("location", new Location());
        modelAndView.addObject("locationCoord", new LocationsCoordinates());
        return modelAndView;

    }

    @PostMapping("/checkpointSubmitted")
    public ModelAndView checkpointSent(@Valid LocationsCoordinates locCoord, Location location, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("Landmarks/locationApprovalFormTh.html", model.asMap());
            return modelAndView;

        } else {

            int locationID = locationRepository.nametoLocationID(location.getLocationName());
            // converts valid response using Location constructor into a submittable format to the sql table
            LocationsCoordinates ALocCoord = new LocationsCoordinates(locationID, locCoord.getLocationCoordsLat(), locCoord.getLocationCoordsLong());
            placesCoordinatesRepo.addLocationCoord(ALocCoord); // adds valid landmark to locations table
            locationRepository.updateApprovalStatus(locationID); // updates approval status accordingly
            System.out.println(placesCoordinatesRepo.getAllLocationCoords());
            ModelAndView modelAndView = new ModelAndView("redirect:/home"); //todo redirect to trails?
            return modelAndView;

//        }

        }
    }
}

