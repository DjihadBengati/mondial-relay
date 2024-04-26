package com.db.mondialrelay.model;

import lombok.Builder;

@Builder
public record RechercheCPRequest(String enseigne,
                                 String pays,
                                 String ville,
                                 String cp,
                                 String nbResult) {
}
