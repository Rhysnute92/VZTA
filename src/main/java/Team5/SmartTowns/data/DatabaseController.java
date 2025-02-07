
//package Team5.SmartTowns.Data;
//
//import Team5.SmartTowns.users.User;
//import Team5.SmartTowns.users.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.*;
//@Controller
//public class DatabaseController {
//
//
//    @Autowired
//    private LocationRepository LocationRepository;
//    @Autowired
//    private trailsRepository trailsRepository;
//
//
//    @GetMapping("/trailList")
//    public ModelAndView trailList() {
//        ModelAndView mav1 = new ModelAndView("towns/trailsData");
//        List<trail> trail = trailsRepository.getAllTrails();
//        mav1.addObject("trails", trail);
//        return mav1;
//    }
//    @GetMapping("locationList")
//    public ModelAndView locationList(){
//        ModelAndView mav2 = new ModelAndView("towns/locationData");
//        List<Location> Locations = LocationRepository.getAllLocation();
//        mav2.addObject("location", Locations);
//        return mav2;
//    }
//}

package Team5.SmartTowns.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

@Controller
public class DatabaseController {

    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private TrailsRepository trailsRepository;

    @GetMapping("/trailList")
    public ModelAndView trailList() {
        ModelAndView mav1 = new ModelAndView("towns/trailsData");
        List<Trail> trail = trailsRepository.getAllTrails();
        mav1.addObject("trails", trail);
        return mav1;
    }
    @GetMapping("locationList")
    public ModelAndView locationList(){
        ModelAndView mav2 = new ModelAndView("towns/locationData");
        List<Location> Locations = locationRepository.getAllLocation();
        mav2.addObject("location", Locations);
        return mav2;
    }

//
//    public List<Location> approvedLocations(){
//        List<Location> locations = locationRepository.getAllLocation();
//        List<Location> locationApprovalList;
////		for (int i=0;i<locations.size();i++){
////			location
//        for (Location loc :locations){
//            if (loc.isLocationApproved()) {
//                locationApprovalList.add(loc);
//            }
//        } return locationApprovalList;
//    }
}
