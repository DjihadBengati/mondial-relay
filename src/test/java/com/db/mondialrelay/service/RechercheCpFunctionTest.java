package com.db.mondialrelay.service;

import com.db.mondialrelay.exception.MondialRelayException;
import com.db.mondialrelay.model.RechercheCPRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.db.mondialrelay.RechercheCpData.FULL_REQUEST;
import static com.db.mondialrelay.RechercheCpData.FULL_RESPONSE;
import static com.db.mondialrelay.exception.MondialRelayStatusCodeEnum.CODE_37;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class RechercheCpFunctionTest {

    @Autowired
    private MondialRelayService service;

    @Test
    public void shouldSucceed_fullRequest() throws MondialRelayException {
        assertThat(service.rechercheCp(FULL_REQUEST))
                .usingRecursiveAssertion()
                .isEqualTo(FULL_RESPONSE);
    }

    @Test
    public void shouldFail_requestNotAllowedToBeNull() {
        Exception exception = null;
        try {
            service.rechercheCp(null);
        } catch (Exception e) {
            exception = e;
        }
        assertThat(exception).isNotNull();
    }

    @Test
    public void shouldFail_incorrectCountry() {
        MondialRelayException exception = null;
        try {
            service.rechercheCp(RechercheCPRequest.builder().build());
        } catch (MondialRelayException e) {
            exception = e;
        }
        assert exception != null;
        assertThat(exception.getCode()).isEqualTo(CODE_37.getCode());
        assertThat(exception.getMessage()).isEqualTo(CODE_37.getMessage());
    }
}
