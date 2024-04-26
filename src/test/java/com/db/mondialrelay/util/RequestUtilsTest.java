package com.db.mondialrelay.util;

import org.junit.jupiter.api.Test;

import static com.db.mondialrelay.util.RequestUtils.generateSecurityField;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RequestUtilsTest {

    @Test
    public void generateSecurityField_successful() {
        assertThat(generateSecurityField("BDTEST13", "FR", "57100"))
                .isEqualTo("4B9478DE33BCAC6B25153C989FB62D0F");
    }
}
