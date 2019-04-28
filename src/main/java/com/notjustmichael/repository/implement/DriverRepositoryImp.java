package com.notjustmichael.repository.implement;

import com.notjustmichael.domain.Driver;
import com.notjustmichael.repository.DriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverRepositoryImp implements DriverRepository {

    private static DriverRepositoryImp repositoryImp = null;
    private Set<Driver> drivers;

    private DriverRepositoryImp() {
        this.drivers = new HashSet<>();
    }

    public static DriverRepository getRepository(){
        if(repositoryImp == null) repositoryImp = new DriverRepositoryImp();
        return repositoryImp;
    }

    @Override
    public Driver create(Driver driver) {
        drivers.add(driver);
        return driver;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Driver read(String s) {
        return null;
    }

    @Override
    public Set<Driver> getAll() {
        return null;
    }
}
