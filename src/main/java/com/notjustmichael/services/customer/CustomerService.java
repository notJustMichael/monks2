package com.notjustmichael.services.customer;

import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.services.ServiceInterface;

import java.util.Set;

public interface CustomerService extends ServiceInterface<Customer,String> {
    Set<Customer> getAll();
}

