package com.imooc.dto;

import lombok.Data;

/**
 * @Author: 郭师兄
 * @Date: 2020/3/16 22:48
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
