package org.jiang.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumStatus {
    OK(200,"操作成功"),
    ERROR(-1,"操作失败"),
    NOT_FOUND(-2,"没有查到对应的数据");

    private final Integer value;
    private final String msg;

    @Override
    public String toString() {
        return "EnumStatus{" +
                "value=" + value +
                ", msg='" + msg + '\'' +
                '}';
    }

}