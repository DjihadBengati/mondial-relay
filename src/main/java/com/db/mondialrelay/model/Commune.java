package com.db.mondialrelay.model;

import lombok.Builder;

/**
 * Commune object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record Commune(String cp, String ville, String pays) {
}
