package com.collabothon.tifors.controllers;

import com.collabothon.tifors.domain.Customer;
import com.collabothon.tifors.repository.CustomerRepository;
import com.collabothon.tifors.repository.ServiceProviderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Maciej on 23/08/2018
 */
@Controller
public class CustomerController {

    @GetMapping("/customers/")
    public String showCustomers(Model model){


        model.addAttribute("customers", CustomerRepository.getInstance().getCustomerList());

        return "customers";
    }

    @GetMapping("/customer/{customerID}")
    public String showCustomer(@PathVariable Integer customerID, Model model){


        model.addAttribute("customer", CustomerRepository.getInstance().getCustomerList().get(customerID));

        return "customerdetail";
    }



    @PostMapping("/customer/{customerID}")
    public String saveOrUpdate(@ModelAttribute Customer customer){

        ServiceProviderRepository.getInstance().getServiceProviderList().get(customer.getInterestedIn())
                .getInterestedCustomers().add(CustomerRepository.getInstance().getCustomerList().get(customer.getId()));

        return "redirect:/customer/{customerID}/";
    }
}
