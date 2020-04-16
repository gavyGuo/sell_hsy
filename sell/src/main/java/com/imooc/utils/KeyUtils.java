package com.imooc.utils;

import java.util.Random;

/**
 * @Author: 郭师兄
 * @Date: 2020/3/10 23:27
 */
public class KeyUtils {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static  synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+(number+"");

    }
}
