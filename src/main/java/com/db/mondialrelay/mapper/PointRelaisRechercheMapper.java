package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.PointRelaisRechercheRequest;
import com.db.mondialrelay.model.PointRelaisRechercheResponse;
import com.db.mondialrelay.model.wsdl.ObjectFactory;
import com.db.mondialrelay.model.wsdl.WSI4PointRelaisRecherche;
import com.db.mondialrelay.model.wsdl.WSI4PointRelaisRechercheResponse;
import lombok.experimental.UtilityClass;

import java.util.Objects;

import static com.db.mondialrelay.util.RequestUtils.generateSecurityField;

/**
 * Point relais recherche mapper
 *
 * @Author Djihad BENGATI
 */
@UtilityClass
public class PointRelaisRechercheMapper {

    public static WSI4PointRelaisRecherche mapRequest(String enseigne,
                                                      String key,
                                                      PointRelaisRechercheRequest request) {
        WSI4PointRelaisRecherche wsi4PointRelaisRecherche = new ObjectFactory().createWSI4PointRelaisRecherche();
        wsi4PointRelaisRecherche.setEnseigne(enseigne);
        wsi4PointRelaisRecherche.setPays(request.pays());
        wsi4PointRelaisRecherche.setNumPointRelais(request.numPointRelais());
        wsi4PointRelaisRecherche.setVille(request.ville());
        wsi4PointRelaisRecherche.setCP(request.cp());
        wsi4PointRelaisRecherche.setLatitude(request.latitude());
        wsi4PointRelaisRecherche.setLongitude(request.longitude());
        wsi4PointRelaisRecherche.setTaille(Objects.nonNull(request.taille()) ?
                request.taille().getValue() :
                null);
        wsi4PointRelaisRecherche.setPoids(request.poids());
        wsi4PointRelaisRecherche.setAction(Objects.nonNull(request.action()) ?
                request.action().getValue() :
                null);
        wsi4PointRelaisRecherche.setDelaiEnvoi(request.delaiEnvoi());
        wsi4PointRelaisRecherche.setRayonRecherche(request.rayonRecherche());
        wsi4PointRelaisRecherche.setTypeActivite(request.typeActivite());
        wsi4PointRelaisRecherche.setNombreResultats(request.nombreResultats());

        wsi4PointRelaisRecherche.setSecurity(generateSecurityField(enseigne,
                request.pays(),
                request.numPointRelais(),
                request.ville(),
                request.cp(),
                request.latitude(),
                request.longitude(),
                Objects.nonNull(request.taille()) ? request.taille().getValue() : null,
                request.poids(),
                Objects.nonNull(request.action()) ? request.action().getValue() : null,
                request.delaiEnvoi(),
                request.rayonRecherche(),
                request.typeActivite(),
                request.nombreResultats(),
                key));

        return wsi4PointRelaisRecherche;
    }

    public static PointRelaisRechercheResponse mapResponse(WSI4PointRelaisRechercheResponse response) {
        return PointRelaisRechercheResponse.builder()
                .stat(response.getWSI4PointRelaisRechercheResult().getSTAT())
                .pointRelaisList(response.getWSI4PointRelaisRechercheResult()
                        .getPointsRelais()
                        .getPointRelaisDetails()
                        .stream()
                        .map(PointRelaisMapper::map)
                        .toList())
                .build();
    }
}
