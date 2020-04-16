package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/24 22:36
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
