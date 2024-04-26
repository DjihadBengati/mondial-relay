package com.db.mondialrelay.client.config;

import com.db.mondialrelay.client.MondialRelayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        String[] packagesToScan= {"com.db.mondialrelay.model.wsdl"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }

    @Bean
    public MondialRelayClient mondialRelayClient(Jaxb2Marshaller marshaller) {
        MondialRelayClient client = new MondialRelayClient();
        client.setDefaultUri("https://api.mondialrelay.com/Web_Services.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
