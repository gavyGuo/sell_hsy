package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家端
 * @Author:
 * @Date: 2020/4/4 16:47
 */
public interface SellerService {
    /**
     * 查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
