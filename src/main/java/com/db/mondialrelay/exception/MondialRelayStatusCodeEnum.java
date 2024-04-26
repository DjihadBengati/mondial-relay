package com.db.mondialrelay.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * Mondial Relay status codes
 *
 * @Author Djihad BENGATI
 */
@AllArgsConstructor
@Getter
public enum MondialRelayStatusCodeEnum {

    CODE_1("1", "Incorrect merchant"),
    CODE_2("2", "Merchant number empty"),
    CODE_3("3", "Incorrect merchant account number"),
    CODE_4("4", ""),
    CODE_5("5", "Incorrect Merchant shipment reference"),
    CODE_6("6", ""),
    CODE_7("7", "Incorrect Consignee reference (Field NCLIENT)"),
    CODE_8("8", "Incorrect password or hash"),
    CODE_9("9", "Unknown or not unique city"),
    CODE_10("10", "Incorrect type of collection"),
    CODE_11("11", "Point Relais® collection number incorrect"),
    CODE_12("12", "Point Relais® collection country incorrect"),
    CODE_13("13", "Incorrect type of delivery"),
    CODE_14("14", "Incorrect delivery Point Relais® number"),
    CODE_15("15", "Point Relais delivery country incorrect"),
    CODE_16("16", ""),
    CODE_17("17", ""),
    CODE_18("18", ""),
    CODE_19("19", ""),
    CODE_20("20", "Incorrect parcel weight"),
    CODE_21("21", "Incorrect developed length (length + height)"),
    CODE_22("22", "Incorrect parcel size"),
    CODE_23("23", ""),
    CODE_24("24", "Incorrect shipment number"),
    CODE_25("25", ""),
    CODE_26("26", "Incorrect assembly time"),
    CODE_27("27", "Incorrect mode of collection or delivery"),
    CODE_28("28", "Incorrect mode of collection"),
    CODE_29("29", "Incorrect mode of delivery"),
    CODE_30("30", "Incorrect address (L1)"),
    CODE_31("31", "Incorrect address (L2)"),
    CODE_32("32", ""),
    CODE_33("33", "Incorrect address (L3)"),
    CODE_34("34", "Incorrect address (L4)"),
    CODE_35("35", "Incorrect city"),
    CODE_36("36", "Incorrect zipcode"),
    CODE_37("37", "Incorrect country"),
    CODE_38("38", "Incorrect phone number"),
    CODE_39("39", "Incorrect e-mail"),
    CODE_40("40", "Missing parameters"),
    CODE_41("41", ""),
    CODE_42("42", "Incorrect COD value"),
    CODE_43("43", "Incorrect COD currency"),
    CODE_44("44", "Incorrect shipment value"),
    CODE_45("45", "Incorrect shipment value currency"),
    CODE_46("46", "End of shipments number range reached"),
    CODE_47("47", "Incorrect number of parcels"),
    CODE_48("48", "Multi-Parcel not permitted at Point Relais®"),
    CODE_49("49", "Incorrect action"),
    CODE_50("50", ""),
    CODE_51("51", ""),
    CODE_52("52", ""),
    CODE_53("53", ""),
    CODE_54("54", ""),
    CODE_55("55", ""),
    CODE_56("56", ""),
    CODE_57("57", ""),
    CODE_58("58", ""),
    CODE_59("59", ""),
    CODE_60("60", "Incorrect text field (this error code has no impact)"),
    CODE_61("61", "Incorrect notification request"),
    CODE_62("62", "Incorrect extra delivery information"),
    CODE_63("63", "Incorrect insurance"),
    CODE_64("64", "Incorrect assembly time"),
    CODE_65("65", "Incorrect appointment"),
    CODE_66("66", "Incorrect take back"),
    CODE_67("67", "Incorrect latitude"),
    CODE_68("68", "Incorrect longitude"),
    CODE_69("69", "Incorrect merchant code"),
    CODE_70("70", "Incorrect Point Relais® number"),
    CODE_71("71", "Incorrect Nature de point de vente non valide"),
    CODE_72("72", ""),
    CODE_73("73", ""),
    CODE_74("74", "Incorrect language"),
    CODE_75("75", ""),
    CODE_76("76", ""),
    CODE_77("77", ""),
    CODE_78("78", "Incorrect country of collection"),
    CODE_79("79", "Incorrect country of delivery"),
    CODE_80("80", "Tracking code : Recorded parcel"),
    CODE_81("81", "Tracking code : Parcel in process at Mondial Relay"),
    CODE_82("82", "Tracking code : Delivered parcel"),
    CODE_83("83", "Tracking code : Anomaly"),
    CODE_84("84", "(Reserved tracking code)"),
    CODE_85("85", "(Reserved tracking code)"),
    CODE_86("86", "(Reserved tracking code)"),
    CODE_87("87", "(Reserved tracking code)"),
    CODE_88("88", "(Reserved tracking code)"),
    CODE_89("89", "(Reserved tracking code)"),
    CODE_90("90", ""),
    CODE_91("91", ""),
    CODE_92("92", "The Point Relais country code and the consignee’s country code are different. Or Insufficient funds (pre-payed accounts)"),
    CODE_93("93", "No information given by the sorting plan. If you want to do a collection or delivery at Point Relais, please check it is available. If you want to do a return, please check if the zipcode exists."),
    CODE_94("94", "Unknown parcel"),
    CODE_95("95", "Merchant account not activated"),
    CODE_96("96", ""),
    CODE_97("97", "Incorrect security key"),
    CODE_98("98", "Generic error (Incorrect parameters)"),
    CODE_99("99", "Generic error of service system"),
    CODE_100("100", "Unknown error");

    private final String code;
    private final String message;

    public static boolean isNotErrorStatusCode(String code) {
        for (MondialRelayStatusCodeEnum status : values()) {
            if (status.getCode().equals(code))
                return false;
        }
        return true;
    }

    public static Optional<MondialRelayStatusCodeEnum> getStatusCode(String code) {
        for (MondialRelayStatusCodeEnum status : values()) {
            if (status.getCode().equals(code))
                return Optional.of(status);
        }
        return Optional.empty();
    }
}
