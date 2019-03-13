package com.blue;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/7 14:48
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class YoungGenGC {

    /**
     * jvm param: -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args) {
        int k = 1024;
        int[] arr = new int[20*k];
    }
}
