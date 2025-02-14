package com.github.simplenotice.utils;


/**
 * 判空工具类
 *
 * @author Mr.xie
 * @Date 2025/2/14
 */
public class EmptyUtils {

    public static boolean object(Object o){
        return o == null || "".equals(o);
    }
}
