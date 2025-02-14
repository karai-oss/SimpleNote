package com.github.simplenotice.utils;


import java.util.Collection;

/**
 * 判空工具类
 *
 * @author Mr.xie
 * @Date 2025/2/14
 */
public class EmptyUtils {

    /**
     * 判断一个对象是否为空
     * @param o 对象
     * @return true 为空  false 不为空
     */
    public static boolean object(Object o) {
        return o == null || "".equals(o);
    }

    /**
     * 判断一个字符串是否为空
     * @param str 字符串
     * @return true 为空  false 不为空
     */
    public static boolean string(String str) {
        return str == null || "".equals(str) || str.length() == 0;
    }


    /**
     * 判断一个集合是否为空
     * @param collection 集合
     * @return true 为空  false 不为空
     */
    public static boolean collection(Collection collection) {
        return collection == null || collection.size() == 0;
    }
}
