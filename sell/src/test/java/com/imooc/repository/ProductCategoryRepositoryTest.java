package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


/**
 * @Author: 郭师兄
 * @Date: 2020/2/7 16:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public  class ProductCategoryRepositoryTest {


    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public void findOne(){
       ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findAll(){
        List<ProductCategory> list = repository.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        ProductCategory result = repository.save(productCategory);
        System.out.println("result:"+result.toString());
        Assert.assertNotNull(result);
 //       Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> typeList = repository.findByCategoryTypeIn(list);
        System.out.println(typeList);
        Assert.assertNotEquals(0,typeList.size());
    }
}