package com.notjustmichael.services.driver;


import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DriverServiceImpl")
public class DriverServiceImp  implements DriverService {
    @Autowired
    @Qualifier("InMem1")
    private DriverRepository repository;

    @Override
    public Driver create(Driver driver) {
        return repository.create(driver);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.update(driver);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Driver read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Driver> getAll() {
        return repository.getAll();
    }
}