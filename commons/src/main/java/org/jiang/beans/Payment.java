package org.jiang.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;  //自增ID
    private String serialNo;  //支付流水号
    private Float money; //金额

    public Payment(String serialNo, float money){
        this.serialNo=serialNo;
        this.money=money;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serialNo='" + serialNo + '\'' +
                ", money=" + money +
                '}';
    }
}
