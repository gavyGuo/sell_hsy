package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/26 7:49
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
