package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * @Author: 师兄
 * @Date: 2020/3/29 15:00
 */
public interface BuyerService {

    /**
     * 查询一个订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid,String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid,String orderId);
}
