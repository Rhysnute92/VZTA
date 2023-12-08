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
//    private locationRepository locationRepository;
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
//        List<Location> Locations = locationRepository.getAllLocation();
//        mav2.addObject("location", Locations);
//        return mav2;
//    }
//}
