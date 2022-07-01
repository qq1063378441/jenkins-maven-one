package com.cskt.jenkinsmavenone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JenkinsMavenOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsMavenOneApplication.class, args);
    }

}
