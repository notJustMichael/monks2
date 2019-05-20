package com.notjustmichael.factory;

import com.notjustmichael.domain.Customer;

public class CustomerFactory {

    public static Customer createCustomer(String cNo, String cAddress, String name, String cPhNo) {
        return new Customer.Builder()
                .cNo(cNo)
                .cPhNo(cPhNo)
                .cName(name)
                .cAddress(cAddress)
                .build();
    }

}
