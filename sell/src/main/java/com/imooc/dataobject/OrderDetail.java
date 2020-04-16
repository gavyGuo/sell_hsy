package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/24 22:45
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;
    /**商品数量*/
    private  Integer productQuantity;

    private String productIcon;

    //private Date creatTime;

    //private Date updateTime;
}
