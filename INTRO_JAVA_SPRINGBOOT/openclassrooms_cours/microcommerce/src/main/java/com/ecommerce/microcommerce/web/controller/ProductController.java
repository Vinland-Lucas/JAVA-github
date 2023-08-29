package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String listeProduits() {
        return "Un exemple de produit";
    }

    @GetMapping(value = "/products/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product = new Product(id, new String("Aspirateur"), 100);
        return product;
    }
}
