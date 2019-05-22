package com.notjustmichael.controller;

import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.services.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


public class DriverController {

    @Autowired
    @Qualifier("DriverServiceImpl")
    private DriverService service;

    @PostMapping("driver/create")
    @ResponseBody
    public Driver create(Driver driver) {
        return service.create(driver);
    }

    @PostMapping("driver/update")
    @ResponseBody
    public Driver update(Driver driver) {
        return service.update(driver);
    }

    @GetMapping("driver/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("driver/read/{id}")
    @ResponseBody
    public Driver read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("driver/read/all")
    @ResponseBody
    public Set<Driver> getAll() {
        return service.getAll();
    }

}
