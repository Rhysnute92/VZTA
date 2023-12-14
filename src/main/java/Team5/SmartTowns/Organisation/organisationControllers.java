package Team5.SmartTowns.Organisation;

import Team5.SmartTowns.business.business;
import Team5.SmartTowns.business.businessRepository;
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
public class organisationControllers {
    @GetMapping("/localauthorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView modelAndView = new ModelAndView("local-authorities");
        return modelAndView;
    }
    @GetMapping("/businesses")
    public ModelAndView getBusinessPage(){
        ModelAndView modelAndView = new ModelAndView("businesses");
        List<business> business = businessRepository.getAllBusinesses();
        modelAndView.addObject("busiSub", business);
        return modelAndView;
    }
    @GetMapping("/businessSub")
    public ModelAndView getBusinessSubPage(){
        ModelAndView modelAndView = new ModelAndView("business-data");
        modelAndView.addObject("business", new business());
        return modelAndView;
    }
    @Autowired
    private localAuthorityRepository localAuthorityRepository;

    @PostMapping("/local-authorities")
    public ModelAndView localAuthoritySent(@Valid @ModelAttribute("local-auth-data")localAuthority localAuthority, BindingResult bindingResult, Model model ) {
        if (bindingResult.hasErrors()) {
            localAuthority loc = new localAuthority(localAuthority.getLocalAuthorityName(), localAuthority.getAddress1(), localAuthority.getAddress2(), localAuthority.getCity(), localAuthority.getCounty(), localAuthority.getPostcode(), localAuthority.getWebsite());
            System.out.println(loc);
            localAuthorityRepository.addLocalAuthority(loc); //add local authority to local authority table
            ModelAndView modelAndView = new ModelAndView("local-authorities");
            List<localAuthority> localAuthorities = localAuthorityRepository.getAllLocalAuthority();
            modelAndView.addObject("localAuth", localAuthorities);
    private businessRepository businessRepository;
    @PostMapping("/business-data")
    public ModelAndView businessSent(@Valid @ModelAttribute("business-data")business  business, BindingResult bindingResult, Model model ) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("business-data", model.asMap());
            return modelAndView;
        }else{// converts user input using the organisation constructor into a submittable format to the sql table
            localAuthority loc = new localAuthority(localAuthority.getLocalAuthorityName(), localAuthority.getAddress1(), localAuthority.getAddress2(), localAuthority.getCity(), localAuthority.getCounty(), localAuthority.getPostcode(), localAuthority.getWebsite());
            System.out.println(loc);
            localAuthorityRepository.addLocalAuthority(loc); //add local authority to local authority table
            ModelAndView modelAndView = new ModelAndView("local-authorities");
            List<localAuthority> localAuthorities = localAuthorityRepository.getAllLocalAuthority();
            modelAndView.addObject("localAuth", localAuthorities);
        } else {// converts user input using the organisation constructor into a submittable format to the sql table

            business bus = new business(business.getBusinessName(), business.getAddress1(), business.getAddress2(), business.getCity(), business.getCounty(), business.getPostcode(), business.getWebsite());
            System.out.println(bus);
            businessRepository.addBusiness(bus); //add local authority to local authority table
            ModelAndView modelAndView = new ModelAndView("redirect:/businesses");
            return modelAndView;
        }
    }
        @GetMapping("/consumers")
    public ModelAndView getConsumersPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/consumers.html");
        return modelAndView;
    }
    @GetMapping("/towns")
    public ModelAndView getTownsPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/towns.html");
        return modelAndView;
    }
}
