package org.jiang.controller;

import jakarta.annotation.Resource;
import org.jiang.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import org.jiang.beans.Payment;
import org.jiang.utility.EnumStatus;
import org.jiang.utility.R;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping("/addpayment")
    public R<EnumStatus> addPayment(@RequestBody Payment payment) {
        System.out.println(payment);
        paymentService.addPayment(payment);
        return new R<EnumStatus>().success();
    }

    @GetMapping("/getpayment/{id}")
    public R<Payment> get(@PathVariable("id") Integer id) {
        return new R<Payment>().success(paymentService.getPaymentById(id));
    }

}
