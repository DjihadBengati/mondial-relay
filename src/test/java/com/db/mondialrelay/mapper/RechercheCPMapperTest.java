package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.wsdl.WSI2RechercheCP;
import org.junit.jupiter.api.Test;

import static com.db.mondialrelay.RechercheCpData.FULL_REQUEST;
import static com.db.mondialrelay.RechercheCpData.ws12RechercheCPFullRequest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RechercheCPMapperTest {

    @Test
    public void shouldSucceed_mapFullRequest() {
        WSI2RechercheCP expected = ws12RechercheCPFullRequest();
        WSI2RechercheCP wsi2RechercheCP = RechercheCPMapper.mapRequest("BDTEST13",
                "PrivateK",
                FULL_REQUEST);
        assertThat(wsi2RechercheCP.getCP()).isEqualTo(expected.getCP());
        assertThat(wsi2RechercheCP.getVille()).isEqualTo(expected.getVille());
        assertThat(wsi2RechercheCP.getEnseigne()).isEqualTo(expected.getEnseigne());
        assertThat(wsi2RechercheCP.getPays()).isEqualTo(expected.getPays());
        assertThat(wsi2RechercheCP.getNbResult()).isEqualTo(expected.getNbResult());
        assertThat(wsi2RechercheCP.getSecurity()).isEqualTo(expected.getSecurity());
    }
}
