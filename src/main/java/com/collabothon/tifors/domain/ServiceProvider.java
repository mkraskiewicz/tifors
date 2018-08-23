package com.collabothon.tifors.domain;

import lombok.Data;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Maciej on 23/08/2018
 */
@Data

public class ServiceProvider {


    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private Set<Customer> interestedCustomers = new HashSet<Customer>();
}
