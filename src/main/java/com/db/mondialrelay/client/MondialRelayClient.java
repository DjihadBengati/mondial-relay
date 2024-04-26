package com.db.mondialrelay.client;

import com.db.mondialrelay.exception.MondialRelayException;
import com.db.mondialrelay.exception.MondialRelayStatusCodeEnum;
import com.db.mondialrelay.model.wsdl.*;
import lombok.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import java.util.Optional;

import static com.db.mondialrelay.client.config.MondialRelayActions.*;
import static com.db.mondialrelay.exception.MondialRelayStatusCodeEnum.*;

/**
 * Mondial Relay client
 *
 * @Author Djihad BENGATI
 */
@Component
public class MondialRelayClient extends WebServiceGatewaySupport {

    /**
     * This function permits to have a list of communities and zip codes with the town’s name.
     *
     * @param request {@link WSI2RechercheCP}
     * @return {@link WSI2RechercheCPResponse}
     * @throws MondialRelayException the client exception
     */
    public WSI2RechercheCPResponse rechercheCp(WSI2RechercheCP request)
            throws MondialRelayException {
        WSI2RechercheCPResponse response =
                (WSI2RechercheCPResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                        message -> ((SoapMessage) message).setSoapAction(WSI2_RECHERCHE_CP));
        if (isNotErrorStatusCode(response.getWSI2RechercheCPResult().getSTAT()))
            return response;

        throw throwException(response.getWSI2RechercheCPResult().getSTAT());
    }

    /**
     * This method permits to search the 30 nearest Points Relais® from a given location
     * (from a GPS address or by both Zip code/Country). The results can be sorted by Points Relais® trade type.
     *
     * @param request {@link WSI4PointRelaisRecherche}
     * @return {@link WSI4PointRelaisRechercheResponse}
     * @throws MondialRelayException the client exception
     */
    public WSI4PointRelaisRechercheResponse pointRelaisRecherche(WSI4PointRelaisRecherche request)
            throws MondialRelayException {
        WSI4PointRelaisRechercheResponse response =
                (WSI4PointRelaisRechercheResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                        message -> ((SoapMessage) message).setSoapAction(WSI4_POINT_RELAIS_RECHERCHE));
        if (isNotErrorStatusCode(response.getWSI4PointRelaisRechercheResult().getSTAT()))
            return response;

        throw throwException(response.getWSI4PointRelaisRechercheResult().getSTAT());
    }

    /**
     * Throws a MondialRelayException based on the provided status string.
     *
     * @param stat The status string indicating the MondialRelay status.
     * @return A {@link MondialRelayException} with the corresponding code and message.
     */
    private static MondialRelayException throwException(@NonNull String stat) {
        Optional<MondialRelayStatusCodeEnum> status = getStatusCode(stat);
        return status.map(mondialRelayStatusCodeEnum ->
                        new MondialRelayException(mondialRelayStatusCodeEnum.getCode(),
                                mondialRelayStatusCodeEnum.getMessage()))
                .orElseGet(() -> new MondialRelayException(CODE_100));
    }
}
