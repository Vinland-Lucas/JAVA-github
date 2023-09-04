package com.webapp.microserviceswebapp.web.dao;

import com.webapp.microserviceswebapp.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ON S'EN SERT PLUS de cette classe --> car on a désormais une BDD et qu'on utilise JPA pour communiquer avec la BDD et effectuer les requêtes

@Repository
public class CustomerDaoImpl implements CustomerDao {
    public static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Kageyama", "Tobio", new Date(), "Y6JF83SE7"));
        customers.add(new Customer(2, "Hinata", "Shoyo", new Date(), "FYGFFE92Z"));
        customers.add(new Customer(3, "Miya", "Atsumu", new Date(), "Z5E62TBN4"));
        customers.add(new Customer(4, "Hoshiumi", "Koray", new Date(), "D03JKZ81A"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) { // Pour chaque(for-each) élément "Customer customer" dans la liste "customers"
           if (customer.getId() == id) { // Si l'id du client (customer.getId) est égal à l'id recherché(id)...
               return customer;          // ... alors renvoie ce client et cela interrompt la boucle
           }
        }
        return null; // renvoie "null" s'il n'y a pas d'id du client correspondant à l'id recherché
    }

    @Override
    public Customer save(Customer customer) { // méthode permettant d'ajouter un client à notre liste de client "customers"
        customers.add(customer); // customer --> Customer customer = new Customer()
        return customer;

//        Customer customer = new Customer();
//        customer.setId(c.getId());
//        customer.setName(c.getName());
//        customer.setFirstname(c.getFirstname());
//        customer.setBirthday(c.getBirthday());
//        customer.setDriverLicenseNumber(c.getDriverLicenseNumber());
//        customers.add(customer);
//        return customer;
    }

    @Override
    public Customer update(int id, Customer customer) {
        Customer updateClient = findById(id);

        updateClient.setName(customer.getName());
        updateClient.setFirstname(customer.getFirstname());
        updateClient.setBirthday(customer.getBirthday());
        updateClient.setDriverLicenseNumber(customer.getDriverLicenseNumber());

        return updateClient;

        /* It also works with this code
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);

            if(c.getId() == id) {
                customers.set(i, customer);
            }
        }
        return customer;
        */
    }

    @Override
    public Customer deleteById(int id) {
        Customer deleteClient = findById(id);

        if (deleteClient.getId() == id) {
            customers.remove(deleteClient);
        }

        return deleteClient;
    }
}
