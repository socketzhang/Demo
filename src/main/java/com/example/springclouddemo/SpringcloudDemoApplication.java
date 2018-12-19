package com.example.springclouddemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudDemoApplication {

    public static void main(String[] args) {
        System.out.println("hello world!");
        SpringApplication.run(SpringcloudDemoApplication.class, args);
    }
}
