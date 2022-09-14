package org.fu.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("org.fu.user.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ProducerMain {
    public static void main(String[] args) {
        SpringApplication.run(ProducerMain.class);
    }
}
