package com.notjustmichael.services.driver;

import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.services.ServiceInterface;

import java.util.Set;

public interface DriverService extends ServiceInterface<Driver,String> {
    Set<Driver> getAll();
}

