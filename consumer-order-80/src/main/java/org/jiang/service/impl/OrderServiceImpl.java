package org.jiang.service.impl;

import jakarta.annotation.Resource;
import org.jiang.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.jiang.beans.Payment;
import org.jiang.utility.EnumStatus;
import org.jiang.utility.R;
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private RestTemplate restTemplate;
    @Value("${payment-service.url}")
    private String paymentServiceUrl;
    @Override
    public R getOrderPayment(Integer id) {
        return restTemplate.getForObject(paymentServiceUrl+"/payment/getpayment/"+id, R.class);
    }

    @Override
    public R addOrder(Payment payment) {
        restTemplate.postForObject(paymentServiceUrl+"/payment/addpayment", payment, R.class);
        return new R<EnumStatus>().success();
    }
}
