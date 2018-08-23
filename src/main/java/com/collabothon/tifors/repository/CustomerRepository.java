package com.collabothon.tifors.repository;

import com.collabothon.tifors.domain.Customer;

import java.util.List;

/**
 * Created by Maciej on 23/08/2018
 */
public class CustomerRepository {


    List<Customer> customerList;
    private static CustomerRepository instance = null;

    protected CustomerRepository() {
        // Exists only to defeat instantiation.
    }
    public static CustomerRepository getInstance() {
        if(instance == null) {
            instance = new CustomerRepository();
        }
        return instance;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}