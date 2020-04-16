package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @Author: 郭师兄
 * @Date: 2020/2/7 19:04
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
