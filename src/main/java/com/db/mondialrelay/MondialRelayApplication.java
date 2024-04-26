package com.db.mondialrelay;

import com.db.mondialrelay.model.RechercheCPRequest;
import com.db.mondialrelay.service.MondialRelayService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MondialRelayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MondialRelayApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(MondialRelayService service) {
        return args -> service.rechercheCP(RechercheCPRequest.builder()
                .enseigne("BDTEST13")
                .pays("FR")
                .cp("57100")
                .build());
    }
}
