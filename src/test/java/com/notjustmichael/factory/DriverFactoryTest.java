package com.notjustmichael.factory;
import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.domain.driver.DriverContact;
import com.notjustmichael.factory.DriverFactory;
import com.notjustmichael.util.Generator;
import static org.junit.Assert.assertTrue;



import org.junit.Assert;
import org.junit.Test;

public class DriverFactoryTest {

    @Test
    public void createDriver() throws Exception{
        DriverContact phoneNumber = new DriverContact("0123456789") ;
        String id = Generator.generateId();
        String name = "john";

        Driver driver = DriverFactory.createDriver(id,name,phoneNumber);
        System.out.println(driver);
        Assert.assertEquals("john",driver.getdName());

    }


}
