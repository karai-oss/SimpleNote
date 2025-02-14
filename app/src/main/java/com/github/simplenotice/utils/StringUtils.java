package com.github.simplenotice.utils;


import static java.util.UUID.randomUUID;

/**
 * 字符串工具类
 *
 * @author Mr.xie
 * @Date 2025/2/14
 */
public class StringUtils {



    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || "".equals(str);
    }

    public static String uuid(){
        return randomUUID().toString().replace("-", "");
    }



}
