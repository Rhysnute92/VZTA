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

@Controller
public class organisationControllers {
    @GetMapping("/localauthorities")
    public ModelAndView getLocalAuthoritiesPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/local-authorities.html");
        return modelAndView;
    }
    @GetMapping("/businesses")
    public ModelAndView getBusinessPage(){
        ModelAndView modelAndView = new ModelAndView("WorkWith/business.html");
        return modelAndView;
    }
    @Autowired
    private businessRepository businessRepository;
    @PostMapping("/businesssub")
    public ModelAndView localAuthSent(@Valid @ModelAttribute("business-data")business  business, BindingResult bindingResult, Model model ) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("business-data", model.asMap());
            return modelAndView;
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
