package com.db.mondialrelay.model;

import lombok.Builder;

@Builder
public record Commune(String cp, String ville, String pays) {
}
