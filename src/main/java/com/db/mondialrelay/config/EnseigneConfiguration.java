package com.db.mondialrelay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mondial Relay enseigne configuration
 *
 * @Author Djihad BENGATI
 */
@Configuration
public class EnseigneConfiguration {
    @Value("${mondialrelay.enseigne:BDTEST13}")
    private String enseigne;

    @Value("${mondialrelay.key:PrivateK}")
    private String key;

    @Bean
    public String enseigne() {
        return enseigne;
    }

    @Bean
    public String key() {
        return key;
    }
}
