package com.collabothon.tifors.controllers;

import com.collabothon.tifors.domain.ServiceProvider;
import com.collabothon.tifors.repository.CustomerRepository;
import com.collabothon.tifors.repository.ServiceProviderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Maciej on 23/08/2018
 */
@Controller
public class ServiceProviderController {

    @GetMapping("/serviceprovider/{providerID}")
    public String showCustomer(@PathVariable Integer providerID, Model model){


        model.addAttribute("provider", ServiceProviderRepository.getInstance().getServiceProviderList().get(providerID));
        ServiceProvider test = ServiceProviderRepository.getInstance().getServiceProviderList().get(providerID);
        return "providerdetail";
    }
}
