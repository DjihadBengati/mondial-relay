package com.db.mondialrelay.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static org.apache.commons.codec.digest.DigestUtils.md5Hex;

/**
 * Request utils
 *
 * @Author Djihad BENGATI
 */

@UtilityClass
public class RequestUtils {

    /**
     * This function generates a security field by concatenating the non-null strings provided as arguments,
     * applying MD5 hashing to the concatenated string, and then converting the result to uppercase.
     *
     * @param args elements for security field
     * @return {@link String} the security field
     */
    public static String generateSecurityField(Object... args) {
        String result = stream(args)
                .filter(s -> Objects.nonNull(s) || (s instanceof String && StringUtils.isNotBlank((String) s)))
                .map(Object::toString)
                .collect(Collectors.joining());
        return md5Hex(result).toUpperCase();
    }
}
