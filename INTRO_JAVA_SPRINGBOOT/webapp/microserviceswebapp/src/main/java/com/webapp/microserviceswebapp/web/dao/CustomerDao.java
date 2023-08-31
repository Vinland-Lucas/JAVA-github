package com.webapp.microserviceswebapp.web.dao;

import com.webapp.microserviceswebapp.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    Customer update(int id, Customer customer);
}
