package com.db.mondialrelay.model;

public enum TailleEnum {
    XS("XS"), S("S"), M("M"), L("L"), XL("XL"), XL3("3XL");

    private final String value;

    TailleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
