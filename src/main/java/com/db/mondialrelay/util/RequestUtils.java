package com.db.mondialrelay.util;

import lombok.experimental.UtilityClass;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@UtilityClass
public class RequestUtils {

    public static String generateSecurityField(String... args) {
        try {
            String result = Arrays.stream(args)
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining());
            StringBuilder sb = new StringBuilder();
            for (byte b : MessageDigest.getInstance("MD5")
                    .digest(result.getBytes())) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
