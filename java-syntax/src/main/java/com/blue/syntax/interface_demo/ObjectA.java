package com.blue.syntax.interface_demo;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/5/8 17:08
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue.syntax.interface_demo
 * @Description:
 */
public class ObjectA {

    private String name = null;

    public ObjectA(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectA{" +
                "name='" + name + '\'' +
                '}';
    }
}
