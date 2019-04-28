package com.notjustmichael.factory;

import com.notjustmichael.domain.Driver;
import com.notjustmichael.util.Generator;

public class DriverFactory {

    public static Driver createDriver(String dNo, String name, String dPhNo) {
        return new Driver.Builder()
                .dPhNo(dPhNo)
                .dName(name)
                .dNo(Generator.generateId())
                .build();
    }

}
