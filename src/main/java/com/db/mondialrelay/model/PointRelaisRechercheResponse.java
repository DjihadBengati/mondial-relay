package com.db.mondialrelay.model;

import lombok.Builder;

import java.util.List;

/**
 * Point relais recherche response object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record PointRelaisRechercheResponse(String stat,
                                           List<PointRelais> pointRelaisList) {
}
