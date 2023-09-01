package com.webapp.microserviceswebapp.web.controller;


import com.webapp.microserviceswebapp.model.Customer;
import com.webapp.microserviceswebapp.web.dao.CustomerDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Api("API pour les opérations CRUD sur les clients")

@RestController
public class CustomerController {

    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @ApiOperation(value = "méthode permettant d'afficher tous les clients de notre liste ou BDD à travers une requête de type GET. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers")
    @GetMapping("/customers")
    public List<Customer> listeClients() {
        return customerDao.findAll();
    }

    @ApiOperation(value = "méthode permettant d'afficher un client grâce à son ID à condition que celui-ci existe, utilisant une requête GET. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @GetMapping("/customers/{id}")
    public Customer afficherUnClient(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @ApiOperation(value = "méthode permettant d'ajouter un client à notre liste ou BDD à travers une requête de type POST. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers")
    @PostMapping("/customers")
    public void ajouterUnClient(@RequestBody Customer customer) {
        customerDao.save(customer);
    }

    @ApiOperation(value = "méthode permettant d'update un client dans notre liste ou BDD en utilisant une requête PUT. Cette méthode ne répondra qu'à une requête ayant une URL de type customers/id")
    @PutMapping("/customers/{id}")
    public void modifierUnClient(@PathVariable int id, @RequestBody Customer customer) {
        customerDao.update(id, customer);
    }

    @ApiOperation(value = "méthode permettant de supprimer un client de notre liste ou BDD en utilisant une requête de type DELETE. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @DeleteMapping("customers/{id}")
    public void supprimerUnClient (@PathVariable int id) {
        customerDao.deleteById(id);
    }
}
