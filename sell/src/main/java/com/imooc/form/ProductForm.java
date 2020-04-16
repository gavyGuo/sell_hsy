package com.imooc.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Author: 郭师兄
 * @Date: 2020/4/4 11:35
 */
@Data
public class ProductForm {

    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;

}
