package com.blue.syntax.exception;

import java.io.Closeable;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/7/16 14:17
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue.syntax.exception
 * @Description:
 */

class ClassA implements Closeable {
    @Override
    public void close() {
        System.out.println("close ClassA");
    }
}

class ClassB implements Closeable {
    @Override
    public void close() {
        System.out.println("close ClassB");
    }
}

public class TryWithResource {
    public static void main(String[] args) {
        try (ClassA a = new ClassA();
             ClassB b = new ClassB()) {

        }
    }
}
