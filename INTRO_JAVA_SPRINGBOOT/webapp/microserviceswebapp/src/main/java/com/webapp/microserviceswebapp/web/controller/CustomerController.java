package com.webapp.microserviceswebapp.web.controller;


import com.webapp.microserviceswebapp.model.Customer;
import com.webapp.microserviceswebapp.web.dao.CustomerDao;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CustomerController {

    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("/customers")
    public List<Customer> listeClients() {
        return customerDao.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer afficherUnClient(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @PostMapping("/customers")
    public void ajouterUnClient(@RequestBody Customer customer) {
        customerDao.save(customer);
    }

    @PutMapping("/customers/{id}")
    public void modifierUnClient(@PathVariable int id, @RequestBody Customer customer) {
        customerDao.update(id, customer);
    }
}
