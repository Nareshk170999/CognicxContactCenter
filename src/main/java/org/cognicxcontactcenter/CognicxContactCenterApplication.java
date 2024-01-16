package org.cognicxcontactcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EntityScan("org.cognicxcontextcenter.entities")
public class CognicxContactCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(CognicxContactCenterApplication.class, args);
    }
}
