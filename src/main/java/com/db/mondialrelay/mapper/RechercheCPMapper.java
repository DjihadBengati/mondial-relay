package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.model.RechercheCPResponse;
import com.db.mondialrelay.model.wsdl.ObjectFactory;
import com.db.mondialrelay.model.wsdl.WSI2RechercheCP;
import com.db.mondialrelay.model.wsdl.WSI2RechercheCPResponse;
import lombok.experimental.UtilityClass;

import static com.db.mondialrelay.util.RequestUtils.generateSecurityField;
import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

/**
 * Recherche CP mapper
 *
 * @Author Djihad BENGATI
 */
@UtilityClass
public class RechercheCPMapper {

    public static WSI2RechercheCP mapRequest(String enseigne, String key, RechercheCPRequest request) {
        WSI2RechercheCP wsi2RechercheCP = new ObjectFactory().createWSI2RechercheCP();
        wsi2RechercheCP.setEnseigne(enseigne);
        wsi2RechercheCP.setPays(request.pays());
        wsi2RechercheCP.setVille(isNotEmpty(request.ville()) ?
                request.ville().toUpperCase() :
                request.ville());
        wsi2RechercheCP.setCP(request.cp());
        wsi2RechercheCP.setNbResult(request.nbResult());

        wsi2RechercheCP.setSecurity(generateSecurityField(enseigne,
                request.pays(),
                request.ville(),
                request.cp(),
                request.nbResult(),
                key));
        return wsi2RechercheCP;
    }

    public static RechercheCPResponse mapResponse(WSI2RechercheCPResponse response) {
        return RechercheCPResponse.builder()
                .stat(response.getWSI2RechercheCPResult().getSTAT())
                .communes(ofNullable(response.getWSI2RechercheCPResult()).isPresent() ?
                        ofNullable(response.getWSI2RechercheCPResult().getListe()).isPresent() ?
                                response.getWSI2RechercheCPResult()
                                        .getListe()
                                        .getCommune().stream().map(CommuneMapper::map).toList() :
                                emptyList() :
                        emptyList())
                .build();
    }
}
