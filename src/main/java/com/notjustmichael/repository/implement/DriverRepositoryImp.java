package com.notjustmichael.repository.implement;

import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.repository.DriverRepository;

import java.util.HashSet;
import java.util.Iterator;
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
        drivers.remove(driver);
        drivers.add(driver);

        return driver;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Driver read(String s) throws NullPointerException {

        Iterator i = drivers.iterator();
        Driver temp;
        Driver found = null;

        while (i.hasNext())
        {
            temp = ((Driver)i.next());
            if(s.equals(temp.getdNo()))
            {
                found = temp;
            }

        }

        return found;

    }

    @Override
    public Set<Driver> getAll() {
        return null;
    }
}
