package com.db.mondialrelay.service;

import com.db.mondialrelay.exception.MondialRelayException;
import com.db.mondialrelay.model.PointRelaisRechercheRequest;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.db.mondialrelay.PointRelaisRechercheData.FULL_REQUEST;
import static com.db.mondialrelay.exception.MondialRelayStatusCodeEnum.CODE_37;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
public class PointRelaisRechercheFunctionTest {

    @Autowired
    private MondialRelayService service;

    @Test
    public void shouldSucceed_fullRequest() throws MondialRelayException {
        val response = service.pointRelaisRecherche(FULL_REQUEST);
        assertThat(response.stat()).isEqualTo("0");
        assertThat(response.pointRelaisList()).hasSize(2);
        assertThat(response.pointRelaisList().get(0).cp()).isEqualTo(FULL_REQUEST.cp());
        assertThat(response.pointRelaisList().get(1).cp()).isEqualTo(FULL_REQUEST.cp());
    }

    @Test
    public void shouldFail_requestNotAllowedToBeNull() {
        Exception exception = null;
        try {
            service.pointRelaisRecherche(null);
        } catch (Exception e) {
            exception = e;
        }
        assertThat(exception).isNotNull();
    }

    @Test
    public void shouldFail_incorrectCountry() {
        MondialRelayException exception = null;
        try {
            service.pointRelaisRecherche(PointRelaisRechercheRequest.builder().build());
        } catch (MondialRelayException e) {
            exception = e;
        }
        assert exception != null;
        assertThat(exception.getCode()).isEqualTo(CODE_37.getCode());
        assertThat(exception.getMessage()).isEqualTo(CODE_37.getMessage());
    }
}
