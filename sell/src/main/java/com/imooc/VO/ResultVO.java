package com.imooc.VO;

import lombok.Data;

import java.util.List;

/**
 * http请求返回的最外层对象
 * @Author: 郭师兄
 * @Date: 2020/2/11 15:52
 */
@Data
public class ResultVO<T> {
    /**错误码*/
     private  Integer code;
     /**提示信息*/
     private  String  msg;
     /**具体内容*/
     private T  data;
}
