package Team5.SmartTowns.Organisation;

import Team5.SmartTowns.localauthority.localAuthority;
import Team5.SmartTowns.localauthority.localAuthorityRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class organisationControllers {
    @GetMapping("/local-authorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView mav = new ModelAndView("local-authorities");
        List<localAuthority> localAuthority = localAuthorityRepository.getAllLocalAuthority();
        mav.addObject("localAuth", localAuthority);
        return mav;
    }
    @GetMapping("/localForm")
    public ModelAndView getLocalAuthForm(){
        ModelAndView modelAndView = new ModelAndView("local-auth-data");
        modelAndView.addObject("localAuthority",new localAuthority());
        return modelAndView;
    }
    @Autowired
    private localAuthorityRepository localAuthorityRepository;
    @PostMapping("/localSub")
    public ModelAndView localAuthSent(@Valid @ModelAttribute("localAuthority")localAuthority localAuthority, BindingResult bindingResult, Model model ) {
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
