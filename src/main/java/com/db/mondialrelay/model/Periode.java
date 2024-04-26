package com.db.mondialrelay.model;

import lombok.Builder;

/**
 * Periode Object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record Periode(String debut, String fin) {
}
