package com.db.mondialrelay.model;

import lombok.Builder;

import java.util.List;

/**
 * Point relais Object
 *
 * @Author Djihad BENGATI
 */
@Builder
public record PointRelais(String stat,
                          String num,
                          String lgAdr1,
                          String lgAdr2,
                          String lgAdr3,
                          String lgAdr4,
                          String cp,
                          String ville,
                          String pays,
                          String localisation1,
                          String localisation2,
                          String latitude,
                          String longitude,
                          String typeActivite,
                          String nace,
                          String information,
                          List<String> horairesLundi,
                          List<String> horairesMardi,
                          List<String> horairesMercredi,
                          List<String> horairesJeudi,
                          List<String> horairesVendredi,
                          List<String> horairesSamedi,
                          List<String> horairesDimanche,
                          List<Periode> informationsDispo,
                          String urlPhoto,
                          String urlPlan,
                          String distance) {
}
