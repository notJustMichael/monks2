package com.notjustmichael.repository;

import com.notjustmichael.domain.driver.Driver;

import java.util.Set;

public interface DriverRepository extends RepositoryInterface <Driver, String>
{
    Set<Driver> getAll();

}