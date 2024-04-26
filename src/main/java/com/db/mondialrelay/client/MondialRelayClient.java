package com.db.mondialrelay.client;

import com.db.mondialrelay.model.wsdl.WSI2RechercheCP;
import com.db.mondialrelay.model.wsdl.WSI2RechercheCPResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import static com.db.mondialrelay.client.config.MondialRelayActions.WSI2_RECHERCHE_CP;

@Component
public class MondialRelayClient extends WebServiceGatewaySupport {

    private final Logger logger = LoggerFactory.getLogger(MondialRelayClient.class);

    public WSI2RechercheCPResponse rechercheCP(WSI2RechercheCP request) {
        return (WSI2RechercheCPResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                message -> ((SoapMessage) message).setSoapAction(WSI2_RECHERCHE_CP));
    }
}
