package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


/**
 * @Author: 郭师兄
 * @Date: 2020/2/25 7:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OderMasterRepositoryTest {

    @Autowired
    OrderMasterRepository repository;

    private final String OPENID="110110";

    @Test
    public  void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("34234");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("2324325");
        orderMaster.setBuyerAddress("南沙");
        orderMaster.setBuyerOpenid("232");
        orderMaster.setOrderAmount(new BigDecimal(3.3));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result );
    }

    @Test
    public void findByBuyerOpenid(){
        PageRequest pageRequest = PageRequest.of(0,2);

        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID,pageRequest);
        Assert.assertNotEquals(0,result);
        System.out.println(result.getTotalElements());

    }

}