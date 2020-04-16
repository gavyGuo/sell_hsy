package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: 郭师兄
 * @Date: 2020/4/4 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerServiceImplTest {

    private  static  final  String OPENID="abc";
    @Autowired
    SellerServiceImpl sellerService;
    @Test
    public void findSellerInfoByOpenid() {
        SellerInfo result = sellerService.findSellerInfoByOpenid(OPENID);
        Assert.assertEquals(OPENID,result.getOpenid());
    }
}