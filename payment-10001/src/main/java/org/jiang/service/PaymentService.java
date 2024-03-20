package org.jiang.service;

import org.jiang.beans.Payment;

public interface PaymentService {
    boolean addPayment(Payment payment);
    Payment getPaymentById(Integer id);
}
