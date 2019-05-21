package com.notjustmichael.factory;

import com.notjustmichael.domain.customer.CustAddress;
import com.notjustmichael.domain.customer.CustContact;
import com.notjustmichael.domain.customer.Customer;

public class CustomerFactory {

    public static Customer createCustomer(String cNo, CustAddress cAddress, String name, CustContact cPhNo) {
        return new Customer.Builder()
                .cNo(cNo)
                .cPhNo(cPhNo)
                .cName(name)
                .cAddress(cAddress)
                .build();
    }

}
