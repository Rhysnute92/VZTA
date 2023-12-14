package Team5.SmartTowns.Organisation;

import Team5.SmartTowns.business.Business;
import Team5.SmartTowns.business.BusinessRepository;
import Team5.SmartTowns.localauthority.LocalAuthority;
import Team5.SmartTowns.localauthority.LocalAuthorityRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OrganisationControllers {
    @Autowired
    private LocalAuthorityRepository localAuthorityRepository;

    @Autowired
    private BusinessRepository businessRepository;

    @GetMapping("/local-authorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView mav = new ModelAndView("local-authorities");
        List<LocalAuthority> localAuthority = localAuthorityRepository.getAllLocalAuthority();
        mav.addObject("localAuth", localAuthority);
        return mav;
    }
    @GetMapping("/localForm")
    public ModelAndView getLocalAuthForm(){
        ModelAndView modelAndView = new ModelAndView("local-auth-data");
        modelAndView.addObject("localAuthority",new LocalAuthority());
        return modelAndView;
    }


    @GetMapping("/businesses")
    public ModelAndView getBusinessPage() {
        ModelAndView modelAndView = new ModelAndView("businesses");
        List<Business> business = businessRepository.getAllBusinesses();
        modelAndView.addObject("busiSub", business);
        return modelAndView;
    }

    @GetMapping("/businessSub")
    public ModelAndView getBusinessSubPage() {
        ModelAndView modelAndView = new ModelAndView("business-data");
        modelAndView.addObject("business", new Business());
        return modelAndView;
    }


    @PostMapping("/local-authorities")
    public ModelAndView localAuthoritySent(@Valid @ModelAttribute("local-auth-data") LocalAuthority localAuthority, BindingResult bindingResult, Model model) {
        ModelAndView modelAndView = new ModelAndView("local-authorities");
        if (bindingResult.hasErrors()) {
            LocalAuthority loc = new LocalAuthority(localAuthority.getLocalAuthorityName(), localAuthority.getAddress1(), localAuthority.getAddress2(), localAuthority.getCity(), localAuthority.getCounty(), localAuthority.getPostcode(), localAuthority.getWebsite());
            System.out.println(loc);
            localAuthorityRepository.addLocalAuthority(loc); //add local authority to local authority table
            List<LocalAuthority> localAuthorities = localAuthorityRepository.getAllLocalAuthority();
            modelAndView.addObject("localAuth", localAuthorities);

        } else {
            LocalAuthority loc = new LocalAuthority(localAuthority.getLocalAuthorityName(), localAuthority.getAddress1(), localAuthority.getAddress2(), localAuthority.getCity(), localAuthority.getCounty(), localAuthority.getPostcode(), localAuthority.getWebsite());
            System.out.println(loc);
            localAuthorityRepository.addLocalAuthority(loc); //add local authority to local authority table
            List<LocalAuthority> localAuthorities = localAuthorityRepository.getAllLocalAuthority();
            modelAndView.addObject("localAuth", localAuthorities);
        }
        return modelAndView;
    }

    @PostMapping("/businesses")
    public ModelAndView businessSent (@Valid @ModelAttribute("local-auth-data") Business business, BindingResult bindingResult, Model model ){

        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("businesses", model.asMap());
            return modelAndView;
        } else { // converts user input using the organisation constructor into a submittable format to the sql table
            Business bus = new Business(business.getBusinessName(), business.getAddress1(), business.getAddress2(), business.getCity(), business.getCounty(), business.getPostcode(), business.getWebsite());
            businessRepository.addBusiness(bus); //add local authority to local authority table
            ModelAndView modelAndView = new ModelAndView("businesses");
            List<Business> localBusiness = businessRepository.getAllBusinesses();
            modelAndView.addObject("busiSub", localBusiness);
            return modelAndView;
        }
    }
    @GetMapping("/consumers")
    public ModelAndView getConsumersPage () {
        ModelAndView modelAndView = new ModelAndView("WorkWith/consumers.html");
        return modelAndView;
    }
    @GetMapping("/towns")
    public ModelAndView getTownsPage () {
        ModelAndView modelAndView = new ModelAndView("WorkWith/towns.html");
        return modelAndView;
    }
}
