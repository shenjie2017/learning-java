package com.blue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/7 16:27
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class RuntimeConstantPoolOOM {

    final static String language = "java";

    /**
     * jvm param: -XX:PermSize=10M -XX:MaxPermSize=10M -Xmx10m -Xms10m -Xss10m
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        System.out.println((new String("java")) == language);
        System.out.println((new String("java").intern()) == language);
        System.out.println((language.intern()) == language);

        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
