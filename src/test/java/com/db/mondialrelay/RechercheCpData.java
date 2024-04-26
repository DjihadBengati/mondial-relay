package com.db.mondialrelay;

import com.db.mondialrelay.model.Commune;
import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.model.RechercheCPResponse;
import com.db.mondialrelay.model.wsdl.ObjectFactory;
import com.db.mondialrelay.model.wsdl.WSI2RechercheCP;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class RechercheCpData {

    public static Commune FULL_COMMUNE = Commune.builder()
            .ville("TOULOUSE")
            .cp("31000")
            .pays("FR")
            .build();

    public static com.db.mondialrelay.model.wsdl.Commune fullCommune() {
        com.db.mondialrelay.model.wsdl.Commune commune = new com.db.mondialrelay.model.wsdl.Commune();
        commune.setCP("31000");
        commune.setPays("FR");
        commune.setVille("TOULOUSE");
        return commune;
    }

    public static RechercheCPRequest FULL_REQUEST = RechercheCPRequest.builder()
            .ville("TOULOUSE")
            .cp("31000")
            .pays("FR")
            .nbResult("1")
            .build();

    public static WSI2RechercheCP ws12RechercheCPFullRequest() {
        WSI2RechercheCP wsi2RechercheCP = new ObjectFactory().createWSI2RechercheCP();
        wsi2RechercheCP.setSecurity("5136002A480E5641F959126C2BE129EB");
        wsi2RechercheCP.setCP("31000");
        wsi2RechercheCP.setEnseigne("BDTEST13");
        wsi2RechercheCP.setVille("TOULOUSE");
        wsi2RechercheCP.setPays("FR");
        wsi2RechercheCP.setNbResult("1");
        return wsi2RechercheCP;
    }

    public static RechercheCPResponse FULL_RESPONSE = RechercheCPResponse.builder()
            .stat("0")
            .communes(List.of(Commune.builder()
                    .pays("FR")
                    .cp("31000")
                    .ville("TOULOUSE")
                    .build()))
            .build();
}
