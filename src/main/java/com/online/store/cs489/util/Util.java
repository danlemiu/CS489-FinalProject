package com.online.store.cs489.util;

import java.util.UUID;

public class Util {

    public static String randomString() {
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
