package com.db.mondialrelay.model;

import lombok.Builder;

import java.util.List;

/**
 * Recherche CP response object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record RechercheCPResponse(String stat, List<Commune> communes) {
}
