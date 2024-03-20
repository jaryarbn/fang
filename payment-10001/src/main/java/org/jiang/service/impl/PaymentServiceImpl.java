package org.jiang.service.impl;

import jakarta.annotation.Resource;
import org.jiang.service.PaymentService;
import org.springframework.stereotype.Service;
import org.jiang.beans.Payment;
import org.jiang.mapper.PaymentMapper;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;
    @Override
    public boolean addPayment(Payment payment) {
        return paymentMapper.addPayment(payment) > 0;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }
}
