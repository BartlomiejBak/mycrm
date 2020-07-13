package com.mycrm.crm.dao;

import com.mycrm.crm.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
}
