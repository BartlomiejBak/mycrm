package com.mycrm.crm.controller;

import com.mycrm.crm.dao.CustomerDAO;
import com.mycrm.crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> customerList = customerDAO.getCustomers();
        theModel.addAttribute("customers", customerList);


        return "list-customers";
    }



}
