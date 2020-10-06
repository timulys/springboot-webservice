package com.timulys.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Jpa Auditing 활성화
@SpringBootApplication
public class Application {

    public static final String APPLICATION_LOCATIONS = "spring.config.localtion=" +
            "classpath:application.yml," +
            "/app/config/springboot-webservice/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
