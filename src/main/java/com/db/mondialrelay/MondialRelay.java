package com.db.mondialrelay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MondialRelay {

    public static void main(String[] args) {
        SpringApplication.run(MondialRelay.class, args);
    }
}
