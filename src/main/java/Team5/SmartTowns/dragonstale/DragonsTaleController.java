package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.landmarks.Landmarks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static Team5.SmartTowns.dragonstale.DragonsTale.landmarksDragonstrail;



@RestController

public class DragonsTaleController {
    ModelAndView modelAndView;

    @GetMapping("/dragonstale")
    public ModelAndView getDragonsTale(){
        List<Landmarks> landmarksList = landmarksDragonstrail;
        int landmarksListSize = landmarksDragonstrail.size();
        modelAndView = new ModelAndView("/dragonstale/index")
                .addObject("landmarksList", landmarksList)
                .addObject("getListSize", landmarksListSize);
        return modelAndView;
    }

    @GetMapping ("/QRScan") //In here, we could use trailID as a string variable and use it to track what trail the user clicked from.
    public ModelAndView getQRScanner(){
        modelAndView = new ModelAndView("fragments/qr-scanner");
        //Can we extract the pathvariable in a JS function?
        return modelAndView;
    }

    @GetMapping("/dragonstale/{landmarkID}")
    public Integer getDTLandmarkID(@RequestParam(value="landmarkID") int landmark){
        Integer idCounter = 0;
        modelAndView = new ModelAndView("/dragonstale/{landmarkID}")
                .addObject() //All your doing is retrieving the information from the database giving it to a string variable.
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
