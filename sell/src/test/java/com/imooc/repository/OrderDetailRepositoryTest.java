package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/25 22:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail oderDetail = new OrderDetail();
        oderDetail.setDetailId("12323");
        oderDetail.setOrderId("123456");
        oderDetail.setProductIcon("http://xxx.jpg");
        oderDetail.setProductName("皮蛋粥");
        oderDetail.setProductId("34343");
        oderDetail.setProductQuantity(2);
        oderDetail.setProductPrice(new BigDecimal(3.3));

        OrderDetail result = repository.save(oderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId(){

        List<OrderDetail> orderDetailList = repository.findByOrderId("123456");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}