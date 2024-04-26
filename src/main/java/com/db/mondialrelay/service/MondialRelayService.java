package com.db.mondialrelay.service;

import com.db.mondialrelay.client.MondialRelayClient;
import com.db.mondialrelay.exception.MondialRelayException;
import com.db.mondialrelay.mapper.PointRelaisRechercheMapper;
import com.db.mondialrelay.mapper.RechercheCPMapper;
import com.db.mondialrelay.model.PointRelaisRechercheRequest;
import com.db.mondialrelay.model.PointRelaisRechercheResponse;
import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.model.RechercheCPResponse;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * Mondial Relay service
 *
 * @Author Djihad BENGATI
 */
@Service
@AllArgsConstructor
public class MondialRelayService {

    private final String enseigne;

    private final String key;

    private final MondialRelayClient client;

    /**
     * This function permits to have a list of communities and zip codes with the town’s name.
     *
     * @param request {@link RechercheCPRequest}
     * @return {@link RechercheCPResponse}
     * @throws MondialRelayException the service exception
     */
    public RechercheCPResponse rechercheCp(@NonNull RechercheCPRequest request)
            throws MondialRelayException {
        return RechercheCPMapper.mapResponse(
                client.rechercheCp(RechercheCPMapper.mapRequest(enseigne, key, request)));
    }

    /**
     * This method permits to search the 30 nearest Points Relais® from a given location
     * (from a GPS address or by both Zip code/Country). The results can be sorted by Points Relais® trade type.
     *
     * @param request {@link PointRelaisRechercheRequest}
     * @return {@link PointRelaisRechercheResponse}
     * @throws MondialRelayException the service exception
     */
    public PointRelaisRechercheResponse pointRelaisRecherche(@NonNull PointRelaisRechercheRequest request)
            throws MondialRelayException {
        return PointRelaisRechercheMapper.mapResponse(
                client.pointRelaisRecherche(PointRelaisRechercheMapper.mapRequest(enseigne, key, request)));
    }
}
