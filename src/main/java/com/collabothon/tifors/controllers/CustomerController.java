package com.collabothon.tifors.controllers;

import com.collabothon.tifors.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Maciej on 23/08/2018
 */
@Controller
public class CustomerController {

    @GetMapping("/customers/")
    public String showIngredients(Model model){


        model.addAttribute("customers", CustomerRepository.getInstance().getCustomerList());

        return "customers";
    }

}
