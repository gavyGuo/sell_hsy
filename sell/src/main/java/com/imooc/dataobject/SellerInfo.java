package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: 郭师兄
 * @Date: 2020/4/4 16:23
 */
@Entity
@Data
public class SellerInfo {

    @Id
    private  String sellerId;

    private String username;

    private String password;

    private  String openid;

    private Date createTime;

    private Date updateTime;
}
