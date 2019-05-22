package com.notjustmichael.controller;

import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


public class CustomerController {

    private final CustomerService service;

    @Autowired
    public CustomerController(@Qualifier("CustomerServiceImpl") CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customer")
    @ResponseBody
    public String welcomeCust() {return "WELCOME TO THE CUSTOMER PAGE" ;}

    @PostMapping("/customer/create")
    @ResponseBody
    public Customer create(Customer customer) {
        return service.create(customer);
    }

    @PostMapping("/customer/update")
    @ResponseBody
    public Customer update(Customer customer) {
        return service.update(customer);
    }

    @GetMapping("/customer/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/customer/read/{id}")
    @ResponseBody
    public Customer read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/customer/read/all")
    @ResponseBody
    public Set<Customer> getAll() {
        return service.getAll();
    }

}
