package com.db.mondialrelay.service;

import com.db.mondialrelay.client.MondialRelayClient;
import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.model.RechercheCPResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.db.mondialrelay.mapper.RechercheCPMapper.map;

@Service
@AllArgsConstructor
@Slf4j
public class MondialRelayService {

    private final MondialRelayClient client;

    public RechercheCPResponse rechercheCP(RechercheCPRequest request) {
        log.info(client.rechercheCP(map(request)).getWSI2RechercheCPResult().getSTAT());
        return null;
    }
}
