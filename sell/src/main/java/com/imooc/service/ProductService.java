package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/10 11:10
 */
public interface ProductService {

    ProductInfo findOne(String productId);
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
   /**加库存 减库存*/
    void  increaseStock(List<CartDTO> cartDTOList);
    void  decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     */
    ProductInfo onSale(String productId);

    /** 下架*/
    ProductInfo offSale(String productId);

}
