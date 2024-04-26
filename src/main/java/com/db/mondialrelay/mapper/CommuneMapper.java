package com.db.mondialrelay.mapper;

import com.db.mondialrelay.model.Commune;
import lombok.experimental.UtilityClass;

/**
 * Commune mapper
 *
 * @Author Djihad BENGATI
 */
@UtilityClass
public class CommuneMapper {

    public Commune map(com.db.mondialrelay.model.wsdl.Commune commune) {
        return Commune.builder()
                .cp(commune.getCP())
                .ville(commune.getVille())
                .pays(commune.getPays())
                .build();
    }
}
