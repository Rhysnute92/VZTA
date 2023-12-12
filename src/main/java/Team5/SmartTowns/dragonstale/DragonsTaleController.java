package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.landmarks.Landmarks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static Team5.SmartTowns.dragonstale.DragonsTale.landmarksDragonstrail;

public class DragonsTaleController {

    @GetMapping("/dragonstale")
    public ModelAndView getDragonsTale(){
        List<Landmarks> landmarksList = landmarksDragonstrail;
        ModelAndView modelAndView = new ModelAndView("/dragonstale/index");
        modelAndView.addObject("landmarksList", landmarksList);
        return modelAndView;
    }

    //
//    @GetMapping("dragonstale/{qrCode}/{id}")
//    public String qrCodeCheck(@PathVariable Optional<String> qrCode, @PathVariable Optional<Integer> id){
//        if (qrCode.isPresent()){
//
//            //Check if ID is present, if do this, if not dfo that.
//
//        }
//    }

}
