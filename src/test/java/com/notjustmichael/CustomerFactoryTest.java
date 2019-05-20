package com.notjustmichael;


import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.factory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {
    @Test
    public void createCustomer() throws Exception {

        String name = "Andy";
        String address = "35 Street Road, Place Town";
        String number = "078946311";

        Customer customer = CustomerFactory.createCustomer(address,name,number);
        System.out.println(customer);
        Assert.assertEquals(name,customer.getcName());

    }

}