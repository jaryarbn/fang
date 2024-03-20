package org.jiang.controller;

import jakarta.annotation.Resource;
import org.jiang.service.OrderService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.jiang.beans.Payment;
import org.jiang.utility.R;

@RestController
@RequestMapping("/order")
public class OrderController {
    //支付服务的地址
    private static final String PAYMENT_URL="http://localhost:8081";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrderService orderService;

    @GetMapping("/getpayment/{id}")
    public R<?> getOrderPayment(@PathVariable("id") int id){
       return orderService.getOrderPayment(id);
    }

    @PostMapping("/addpayment")
    public R<?> addOrder(@RequestBody Payment payment){
        // System.out.println("下单成功! 支付成功!");
        return orderService.addOrder(payment);
    }


}
