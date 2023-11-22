package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {

    private final static String PAYMENT_SERVICE = "http://consulDemoPayment";


    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/comsumer/payment/cs")
    public String paymentInfo2() {
        return restTemplate.getForObject(PAYMENT_SERVICE + "/payment/cs", String.class);
    }

    @RequestMapping("services")
    public Object getServices(){

        List<ServiceInstance> instances = discoveryClient.getInstances("consulDemoPayment");
        System.out.println(instances.toString());
        return instances;
    }

    /**
     * 轮训获取服务中的其中一个
     * @return String
     */
    @RequestMapping("discover")
    public String discover(){

        return loadBalancerClient.choose("consulDemoPayment").toString();
    }
}