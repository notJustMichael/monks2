package com.notjustmichael.factory;


import com.notjustmichael.domain.customer.CustAddress;
import com.notjustmichael.domain.customer.CustContact;
import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.factory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {
    @Test
    public void createCustomer() throws Exception {

        String custNo = "098MichaelLol";
        CustContact number = new CustContact("0725868191");
        String name = "Andy";
        CustAddress address = new CustAddress("21 Street Road", "Pleasant Place", "Cape Town");

        Customer customer = CustomerFactory.createCustomer(custNo, address,name ,number);
        System.out.println(customer);
        Assert.assertEquals(name,customer.getcName());

    }

}