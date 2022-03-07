package com.dev.borges.projapp.controllers;

import com.dev.borges.projapp.entities.Customer;
import com.dev.borges.projapp.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {

        return customerService.save(customer);
    }
}
