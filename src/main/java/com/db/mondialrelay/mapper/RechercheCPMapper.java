package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.model.wsdl.ObjectFactory;
import com.db.mondialrelay.model.wsdl.WSI2RechercheCP;
import lombok.experimental.UtilityClass;

import static com.db.mondialrelay.util.RequestUtils.generateSecurityField;

@UtilityClass
public class RechercheCPMapper {

    // TODO Test
    public static WSI2RechercheCP map(RechercheCPRequest request) {
        WSI2RechercheCP wsi2RechercheCP = new ObjectFactory().createWSI2RechercheCP();
        wsi2RechercheCP.setEnseigne(request.enseigne());
        wsi2RechercheCP.setPays(request.pays());
        wsi2RechercheCP.setVille(request.ville());
        wsi2RechercheCP.setCP(request.cp());
        wsi2RechercheCP.setNbResult(request.nbResult());

        wsi2RechercheCP.setSecurity(generateSecurityField(request.enseigne(),
                request.pays(),
                request.pays(),
                request.ville(),
                request.ville(),
                request.cp(),
                request.nbResult()));
        return wsi2RechercheCP;
    }
}
