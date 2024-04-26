package com.db.mondialrelay.mapper;

import org.junit.jupiter.api.Test;

import static com.db.mondialrelay.RechercheCpData.FULL_COMMUNE;
import static com.db.mondialrelay.RechercheCpData.fullCommune;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommuneMapperTest {

    @Test
    public void shouldSucceed_mapFullCommune() {
        assertThat(CommuneMapper.map(fullCommune()))
                .usingRecursiveAssertion()
                .isEqualTo(FULL_COMMUNE);
    }
}
