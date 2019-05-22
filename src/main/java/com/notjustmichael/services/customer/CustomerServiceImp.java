package com.notjustmichael.services.customer;


import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CustomerServiceImpl")
public class CustomerServiceImp implements CustomerService {
    @Autowired
    @Qualifier("InMem2")
    private CustomerRepository repository;

    @Override
    public Customer create(Customer customer) {
        return repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.update(customer);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Customer read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Customer> getAll() {
        return repository.getAll();
    }
}