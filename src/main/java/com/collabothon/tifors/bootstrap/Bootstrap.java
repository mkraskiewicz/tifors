package com.collabothon.tifors.bootstrap;

import com.collabothon.tifors.domain.Customer;
import com.collabothon.tifors.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciej on 23/08/2018
 */
public class Bootstrap implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        CustomerRepository.getInstance().setCustomerList(loadCustomers());

    }


    private List<Customer> loadCustomers(){

        List<Customer> customerList = new ArrayList<Customer>();

        Customer maciej = new Customer();
        maciej.setId(0L);
        maciej.setFirstName("Maciej");
        maciej.setLastName("Kraskiewicz");
        maciej.setUsername("Darth_Vader");

        Customer andrzej = new Customer();
        andrzej.setId(1L);
        andrzej.setFirstName("Adnrzej");
        andrzej.setLastName("Wrzosek");
        andrzej.setUsername("Coder");


        Customer jens = new Customer();
        jens.setId(2L);
        jens.setFirstName("Jens");
        jens.setLastName("Hofmann");
        jens.setUsername("Developer");

        customerList.add(maciej);
        customerList.add(andrzej);
        customerList.add(jens);

        return customerList;
    }

}
