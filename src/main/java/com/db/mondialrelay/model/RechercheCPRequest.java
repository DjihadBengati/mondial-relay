package com.db.mondialrelay.model;

import lombok.Builder;

/**
 * Recherche CP request object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record RechercheCPRequest(String pays,
                                 String ville,
                                 String cp,
                                 String nbResult) {
}
