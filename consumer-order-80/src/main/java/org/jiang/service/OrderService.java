package org.jiang.service;

import org.jiang.beans.Payment;
import org.jiang.utility.R;

public interface OrderService {
    R getOrderPayment(Integer id);
    R addOrder(Payment payment);
}
