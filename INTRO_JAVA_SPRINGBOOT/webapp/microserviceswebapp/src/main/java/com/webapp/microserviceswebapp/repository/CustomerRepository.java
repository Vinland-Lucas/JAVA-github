package com.webapp.microserviceswebapp.repository;

import com.webapp.microserviceswebapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();

    Customer findById(int id);

    Customer save(Customer customer);

    Customer deleteById(int id);

}
