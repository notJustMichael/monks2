package com.notjustmichael;

import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.domain.driver.DriverContact;
import com.notjustmichael.factory.DriverFactory;
import com.notjustmichael.repository.DriverRepository;
import com.notjustmichael.repository.implement.DriverRepositoryImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static org.springframework.cglib.beans.BeanMap.create;

@SpringBootApplication
public class DriverManagementApplication {



    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(DriverManagementApplication.class, args);
    }

    public void addDrivers()
    {
        Driver driver = DriverFactory.createDriver("Driver001", "Bobby", new DriverContact("072123456789"));
        

    }
}
