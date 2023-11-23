package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "consulDemoPayment")
public interface ConsulDemoPaymentFeign {

    @GetMapping("/payment/cs")
    String paymentConsul();
}
