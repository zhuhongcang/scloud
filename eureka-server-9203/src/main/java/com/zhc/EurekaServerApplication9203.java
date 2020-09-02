package com.zhc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Bryan
 * @date 2020/9/2 10:56
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication9203 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication9203.class, args);
    }
}
