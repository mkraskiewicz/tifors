package com.collabothon.tifors.repository;

import com.collabothon.tifors.domain.Customer;
import com.collabothon.tifors.domain.ServiceProvider;

import java.util.List;

/**
 * Created by Maciej on 23/08/2018
 */
public class ServiceProviderRepository {


    List<ServiceProvider> serviceProviderList;
    private static ServiceProviderRepository instance = null;

    protected ServiceProviderRepository() {
        // Exists only to defeat instantiation.
    }
    public static ServiceProviderRepository getInstance() {
        if(instance == null) {
            instance = new ServiceProviderRepository();
        }
        return instance;
    }

    public List<ServiceProvider> getServiceProviderList() {
        return serviceProviderList;
    }

    public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
    }
}
