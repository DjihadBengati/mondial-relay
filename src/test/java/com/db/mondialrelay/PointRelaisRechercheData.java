package com.db.mondialrelay;

import com.db.mondialrelay.model.PointRelaisRechercheRequest;
import lombok.experimental.UtilityClass;

import static com.db.mondialrelay.model.TailleEnum.S;

@UtilityClass
public class PointRelaisRechercheData {
    public static PointRelaisRechercheRequest FULL_REQUEST = PointRelaisRechercheRequest.builder()
            .pays("FR")
            .cp("31300")
            .taille(S)
            .nombreResultats(2)
            .build();
}
