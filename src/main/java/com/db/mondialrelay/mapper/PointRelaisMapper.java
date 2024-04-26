package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.Periode;
import com.db.mondialrelay.model.PointRelais;
import com.db.mondialrelay.model.wsdl.PointRelaisDetails;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PointRelaisMapper {
    public static PointRelais map(PointRelaisDetails pointRelaisDetails) {
        return PointRelais.builder()
                .stat(pointRelaisDetails.getSTAT())
                .num(pointRelaisDetails.getNum())
                .lgAdr1(pointRelaisDetails.getLgAdr1())
                .lgAdr2(pointRelaisDetails.getLgAdr2())
                .lgAdr3(pointRelaisDetails.getLgAdr3())
                .lgAdr4(pointRelaisDetails.getLgAdr4())
                .cp(pointRelaisDetails.getCP())
                .ville(pointRelaisDetails.getVille())
                .pays(pointRelaisDetails.getPays())
                .localisation1(pointRelaisDetails.getLocalisation1())
                .localisation2(pointRelaisDetails.getLocalisation2())
                .latitude(pointRelaisDetails.getLatitude())
                .longitude(pointRelaisDetails.getLongitude())
                .typeActivite(pointRelaisDetails.getTypeActivite())
                .nace(pointRelaisDetails.getNACE())
                .information(pointRelaisDetails.getInformation())
                .horairesLundi(pointRelaisDetails.getHorairesLundi().getString())
                .horairesMardi(pointRelaisDetails.getHorairesMardi().getString())
                .horairesMercredi(pointRelaisDetails.getHorairesMercredi().getString())
                .horairesJeudi(pointRelaisDetails.getHorairesJeudi().getString())
                .horairesVendredi(pointRelaisDetails.getHorairesVendredi().getString())
                .horairesSamedi(pointRelaisDetails.getHorairesSamedi().getString())
                .horairesDimanche(pointRelaisDetails.getHorairesDimanche().getString())
                .informationsDispo(pointRelaisDetails.getInformationsDispo().getPeriode().stream()
                        .map(p -> Periode.builder()
                                .debut(p.getDebut().toString())
                                .fin(p.getFin().toString())
                                .build())
                        .toList())
                .urlPhoto(pointRelaisDetails.getURLPhoto())
                .distance(pointRelaisDetails.getDistance())
                .build();
    }
}
