package com.notjustmichael;
import com.notjustmichael.domain.Driver;
import com.notjustmichael.factory.DriverFactory;
import com.notjustmichael.util.Generator;
import static org.junit.Assert.assertTrue;



import org.junit.Assert;
import org.junit.Test;

public class DriverFactoryTest {

    @Test
    public void createDriver() throws Exception{
        String phoneNumber = "0123456789";
        String id = Generator.generateId();
        String name = "john";

        Driver driver = DriverFactory.createDriver(id,name,phoneNumber);
        System.out.println(driver);
        Assert.assertEquals("john",driver.getdName());

    }


}
