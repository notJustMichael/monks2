package com.notjustmichael.factory;

import com.notjustmichael.domain.driver.Driver;
import com.notjustmichael.util.Generator;

public class DriverFactory {

    public static Driver createDriver(String dNo, String name, String dPhNo) {
        return new Driver.Builder()
                .dNo(dNo)
                .dPhNo(dPhNo)
                .dName(name)
                .dNo(Generator.generateId())
                .build();
    }

}
