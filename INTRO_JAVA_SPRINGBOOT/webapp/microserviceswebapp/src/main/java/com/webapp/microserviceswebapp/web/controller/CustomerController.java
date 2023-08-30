package com.webapp.microserviceswebapp.web.controller;


import com.webapp.microserviceswebapp.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
@RestController
public class CustomerController {

    ArrayList<Customer> customers = new ArrayList<Customer>(
            List.of(
                    new Customer(1, "Kageyama", "Tobio", new Date(), "Y6JF83SE7"),
                    new Customer(2, "Hinata", "Shoyo", new Date(), "FYGFFE92Z"),
                    new Customer(3, "Miya", "Atsumu", new Date(), "Z5E62TBN4"),
                    new Customer(4, "Hoshiumi", "Koray", new Date(), "D03JKZ81A")
            )
    );

    @GetMapping("/customers")
    public ArrayList listeClients() {
        return customers;
    }

    @GetMapping("/customers/{id}")
    public Customer afficherUnClient(@PathVariable int id) {
        Customer customer = new Customer(id, "Kageyama", "Tobio", new Date(), "Y6JF83SE7");
        return customer;
    }

}
