package org.jiang.utility;

import lombok.Data;


@Data
public class R <T>{
    private int code;
    private String message;
    private T data;

    public R(EnumStatus status, T data) {
        this.code= status.getValue();
        this.message = status.getMsg();
        this.data = data;
    }

    public R() {

    }


    public R<T> success(T data){
        return new R<>(EnumStatus.OK, data);
    }
    public R<EnumStatus> success(){
        return new R<>(EnumStatus.OK, null);
    }
}
