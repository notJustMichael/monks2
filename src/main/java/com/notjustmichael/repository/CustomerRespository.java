package com.notjustmichael.repository;

import com.notjustmichael.domain.Customer;

import java.util.Set;

public interface CustomerRespository extends RepositoryInterface<Customer, String>
{
    Set<Customer> getAll();
}
