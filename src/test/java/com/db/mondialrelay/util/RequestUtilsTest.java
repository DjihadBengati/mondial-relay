package com.db.mondialrelay.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;

import static com.db.mondialrelay.util.RequestUtils.generateSecurityField;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RequestUtilsTest {

    @Test
    void testGenerateSecurityFieldWithAllNonNullArgs() {
        String result = generateSecurityField("Enseigne", "Pays", "Ville", "CP", 10);
        String expected = DigestUtils.md5Hex("EnseignePaysVilleCP10").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithNullArgs() {
        String result = generateSecurityField("Enseigne", null, "Ville", "CP", 10);
        String expected = DigestUtils.md5Hex("EnseigneVilleCP10").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithBlankStringArgs() {
        String result = generateSecurityField("Enseigne", "", "Ville", "CP", 10);
        String expected = DigestUtils.md5Hex("EnseigneVilleCP10").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithEmptyStringArgs() {
        String result = generateSecurityField("Enseigne", " ", "Ville", "CP", 10);
        String expected = DigestUtils.md5Hex("Enseigne VilleCP10").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithAllNullArgs() {
        String result = generateSecurityField(null, null, null);
        String expected = DigestUtils.md5Hex("").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithNoArgs() {
        String result = generateSecurityField();
        String expected = DigestUtils.md5Hex("").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithSpecialCharacters() {
        String result = generateSecurityField("Enseigne!", "@Pays#", "$Ville%", "^CP&", "*10");
        String expected = DigestUtils.md5Hex("Enseigne!@Pays#$Ville%^CP&*10").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithNumericArgs() {
        String result = generateSecurityField(123, 456.78, 90);
        String expected = DigestUtils.md5Hex("123456.7890").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void testGenerateSecurityFieldWithBooleanArgs() {
        String result = generateSecurityField(true, false);
        String expected = DigestUtils.md5Hex("truefalse").toUpperCase();
        assertThat(expected).isEqualTo(result);
    }
}
