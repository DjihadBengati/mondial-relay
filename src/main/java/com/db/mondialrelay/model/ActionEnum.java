package com.db.mondialrelay.model;

/**
 * Used to define and adjust the type of “Point Relais®” eligible and offered according
 * to the size of the parcel
 *
 * @Author Djihad BENGATI
 */
public enum ActionEnum {
    SMA("SMA"), APM("APM"), REL("REL"), MED("MED"), R24("24R"), L24("24L"), XOH("XOH");
    private final String value;

    ActionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
