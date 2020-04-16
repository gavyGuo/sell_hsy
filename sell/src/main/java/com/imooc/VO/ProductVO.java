package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品，包含类目
 * @Author: 郭师兄
 * @Date: 2020/2/11 20:14
 */
@Data
public class ProductVO<T> {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
