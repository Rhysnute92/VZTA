package Team5.SmartTowns.Organisation;

import Team5.SmartTowns.Data.localAuthority;
import Team5.SmartTowns.Data.localAuthorityRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class organisationControllers {
    @GetMapping("/localauthorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView mav = new ModelAndView("local-authorities");
        List<localAuthority> localAuthority = localAuthorityRepository.getAllLocalAuthority();
        mav.addObject("localAuthority", localAuthority);
        return mav;
    }
    @Autowired
    private localAuthorityRepository localAuthorityRepository;
    @PostMapping("/localauthsub")
    public ModelAndView localAuthSent(@Valid @ModelAttribute("local-auth-data")localAuthority localAuthority, BindingResult bindingResult, Model model ) {
        if (bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("local-auth-data", model.asMap());
            return modelAndView;
        }else{// converts user input using the organisation constructor into a submittable format to the sql table

            localAuthority loc = new localAuthority(localAuthority.getLocalAuthorityName(), localAuthority.getAddress1(), localAuthority.getAddress2(), localAuthority.getCity(), localAuthority.getCounty(), localAuthority.getPostcode(), localAuthority.getWebsite());
            System.out.println(loc);
            localAuthorityRepository.addLocalAuthority(loc); //add local authority to local authority table
            ModelAndView modelAndView = new ModelAndView("redirect:/local-authorities");
            return modelAndView;
        }
    }
    @GetMapping("/businesses")
    public ModelAndView getBusinessesPage(){
        ModelAndView mav1 = new ModelAndView("Businesses");
        return mav1;
    }
    @GetMapping("/towns")
    public ModelAndView getTownsPage(){
        ModelAndView mav2 = new ModelAndView("towns");
        return mav2;
    }
    @GetMapping("/consumers")
    public ModelAndView getConsumersPage(){
        ModelAndView mav3 = new ModelAndView("consumers");
        return mav3;
    }



}
