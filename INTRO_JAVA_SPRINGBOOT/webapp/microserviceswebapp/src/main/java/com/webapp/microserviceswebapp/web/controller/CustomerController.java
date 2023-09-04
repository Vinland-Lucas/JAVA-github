package com.webapp.microserviceswebapp.web.controller;


import com.webapp.microserviceswebapp.model.Customer;
import com.webapp.microserviceswebapp.repository.CustomerRepository;
import com.webapp.microserviceswebapp.web.dao.CustomerDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.List;

@RequestMapping("/customers")
@Api("API pour les opérations CRUD sur les clients")

@RestController
public class CustomerController {
    RestTemplate restTemplate = new RestTemplate();

   // private final CustomerDao customerDao;

   @Autowired

    private CustomerRepository customerRepository;
    private final String url = "http://localhost:8081/licenses/";

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void validDriverLicense(String driverLicenseNumber) {
        Boolean isValid = restTemplate.getForObject(url + driverLicenseNumber, Boolean.class);

        if (isValid == false) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid Driving License"
            );
        }
    }

    @ApiOperation(value = "méthode permettant d'afficher tous les clients de notre liste ou BDD à travers une requête de type GET. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers")
    @GetMapping
    public List<Customer> listeClients() {
        return customerRepository.findAll();
    }

    @ApiOperation(value = "méthode permettant d'afficher un client grâce à son ID à condition que celui-ci existe, utilisant une requête GET. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @GetMapping("/{id}")
    public Customer afficherUnClient(@PathVariable int id) {
        return customerRepository.findById(id);
    }

    @ApiOperation(value = "méthode permettant d'ajouter un client à notre liste ou BDD à travers une requête de type POST. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers")
    @PostMapping
    public @ResponseBody Customer ajouterUnClient(@RequestBody Customer customer) {
        validDriverLicense(customer.getDriverLicenseNumber());
        return customerRepository.save(customer);
    }

    @ApiOperation(value = "méthode permettant d'update un client dans notre liste ou BDD en utilisant une requête PUT. Cette méthode ne répondra qu'à une requête ayant une URL de type customers/id")
    @PutMapping("/{id}")
    public Customer modifierUnClient(@RequestBody Customer customer) {
        validDriverLicense(customer.getDriverLicenseNumber());
        return customerRepository.save(customer);
    }

    @ApiOperation(value = "méthode permettant de supprimer un client de notre liste ou BDD en utilisant une requête de type DELETE. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @DeleteMapping("/{id}")
    public Customer supprimerUnClient (@PathVariable int id) {
        return customerRepository.deleteById(id);
    }


    /*
    @ApiOperation(value = "méthode permettant d'afficher un client grâce à son ID à condition que celui-ci existe, utilisant une requête GET. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @GetMapping("/customers/{id}")
    public Customer afficherUnClient(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @ApiOperation(value = "méthode permettant d'ajouter un client à notre liste ou BDD à travers une requête de type POST. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers")
    @PostMapping("/customers")
    public void ajouterUnClient(@RequestBody Customer customer) {
        validDriverLicense(customer.getDriverLicenseNumber());
        customerDao.save(customer);
    }

    @ApiOperation(value = "méthode permettant d'update un client dans notre liste ou BDD en utilisant une requête PUT. Cette méthode ne répondra qu'à une requête ayant une URL de type customers/id")
    @PutMapping("/customers/{id}")
    public void modifierUnClient(@PathVariable int id, @RequestBody Customer customer) {
        validDriverLicense(customer.getDriverLicenseNumber());
        customerDao.update(id, customer);
    }

    @ApiOperation(value = "méthode permettant de supprimer un client de notre liste ou BDD en utilisant une requête de type DELETE. Cette méthode ne répondra qu'à une requête ayant une URL de type /customers/id")
    @DeleteMapping("customers/{id}")
    public void supprimerUnClient (@PathVariable int id) {
        customerDao.deleteById(id);
    }
     */
}
