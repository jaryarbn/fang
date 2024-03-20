package org.jiang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jiang.beans.Payment;

@Mapper
public interface PaymentMapper {
    int addPayment(Payment payment);
    Payment getPaymentById(Integer id);
}
