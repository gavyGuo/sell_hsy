package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/24 22:25
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**订单id*/
    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    /**订单状态，默认为0新下单*/
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();
    /**默认0未支付*/
    private Integer payStatus= PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;






}
