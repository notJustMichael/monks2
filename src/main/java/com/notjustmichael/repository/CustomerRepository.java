package com.notjustmichael.repository;

import com.notjustmichael.domain.customer.Customer;

import java.util.Set;

public interface CustomerRepository extends RepositoryInterface<Customer, String>
{
    Set<Customer> getAll();
}
