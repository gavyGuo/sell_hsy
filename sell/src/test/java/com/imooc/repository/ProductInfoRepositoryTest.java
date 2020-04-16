package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
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
 * @Date: 2020/2/8 16:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private  ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("瘦肉粥");
        productInfo.setProductPrice(new BigDecimal(6.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,list.size());
    }
}