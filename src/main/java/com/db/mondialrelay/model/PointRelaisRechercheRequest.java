package com.db.mondialrelay.model;

import lombok.Builder;

/**
 * Point relais recherche request object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record PointRelaisRechercheRequest(String pays,
                                          String numPointRelais,
                                          String ville,
                                          String cp,
                                          String latitude,
                                          String longitude,
                                          TailleEnum taille,
                                          String poids,
                                          ActionEnum action,
                                          String delaiEnvoi,
                                          String rayonRecherche,
                                          String typeActivite,
                                          Integer nombreResultats) {
}
