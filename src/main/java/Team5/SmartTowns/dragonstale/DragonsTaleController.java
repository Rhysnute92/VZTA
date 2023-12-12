package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.landmarks.Landmarks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static Team5.SmartTowns.dragonstale.DragonsTale.landmarksDragonstrail;



@Controller
public class DragonsTaleController {
    ModelAndView modelAndView;

    @GetMapping("/dragonstale")
    public ModelAndView getDragonsTale(){
        List<Landmarks> landmarksList = landmarksDragonstrail;
        int landmarksListSize = landmarksDragonstrail.size();
        modelAndView = new ModelAndView("/dragonstale/index");
        modelAndView.addObject("landmarksList", landmarksList);
        modelAndView.addObject("getListSize", landmarksListSize);
        return modelAndView;
    }

    @RequestMapping ("/QRScan") //In here, we could use trailID as a string variable and use it to track what trail the user clicked from.
    public ModelAndView getQRScanner(){
        modelAndView = new ModelAndView("fragments/qr-scanner");
        //Can we extract the pathvariable in a JS function?
        return modelAndView;
    }

    //Create another controller that directs to the given DragonsTale..Trail.. and updates the users account accordingly.

// This code is to be used
//    @GetMapping("dragonstale/{qrCode}/{id}")
//    public String qrCodeCheck(@PathVariable Optional<String> qrCode, @PathVariable Optional<Integer> id){
//        if (qrCode.isPresent()){
//
//            //Check if ID is present, if do this, if not dfo that.
//
//        }
//    }



}
