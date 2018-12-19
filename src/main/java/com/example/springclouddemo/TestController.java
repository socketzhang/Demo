package com.example.springclouddemo;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/intance")
    public String serviceUrl() {
        InstanceInfo info = eurekaClient.getNextServerFromEureka("ZHANGFEIXIANG-PC",false);

        return info.getHomePageUrl();
    }



}
