package org.jiang.mapper;

import org.jiang.mapper.PaymentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jiang.beans.Payment;

@SpringBootTest
public class PaymentMapperTest {
    @Autowired
    PaymentMapper paymentMapper;
    @Test
    public void test(){
        paymentMapper.addPayment(new Payment(1,"test", 5.14F));
    }
}
