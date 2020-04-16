package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @Author: 郭师兄
 * @Date: 2020/3/30 0:04
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
