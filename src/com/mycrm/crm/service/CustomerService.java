package com.mycrm.crm.service;

import com.mycrm.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
}
