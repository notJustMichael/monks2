package com.notjustmichael.util;

import java.util.UUID;

public class Generator {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }


}
