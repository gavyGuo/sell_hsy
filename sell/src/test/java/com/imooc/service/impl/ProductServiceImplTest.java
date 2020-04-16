package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/10 17:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public  class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productList = productService.findUpAll();
        Assert.assertNotEquals(0,productList.size());
    }

    @Test
    public  void findAll() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<ProductInfo> page = productService.findAll(pageRequest);
        //System.out.println(page.getTotalElements());
        Assert.assertNotEquals(0,page);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(6.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很不好喝的粥");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(1);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale(){
        ProductInfo productInfo = productService.onSale("123456");
        Assert.assertEquals(ProductStatusEnum.UP.getCode() ,productInfo.getProductStatus());

    }
    @Test
    public void offSale(){
        ProductInfo productInfo = productService.offSale("123456");
        Assert.assertEquals(ProductStatusEnum.DOWN.getCode() ,productInfo.getProductStatus());
    }
}