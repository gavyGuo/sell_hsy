package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/7 19:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> categoryList = categoryService.findAll();
        Assert.assertNotEquals(0,categoryList.size());
    }

    @Test
    public  void findByCategoryTypeIn() {
        List<Integer> typeList = Arrays.asList(1,2,3);
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(typeList);
        Assert.assertNotEquals(0,list.size());
    }


    @Test
    public  void save() {
        ProductCategory productCategory = new ProductCategory("最爱", 4);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotEquals(null,result);
    }
}