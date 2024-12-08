package ru.hello.roboeducation.helloroboeducationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloRoboeducationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloRoboeducationServerApplication.class, args);
    }

}
