package com.blue.syntax.interface_demo;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/5/8 17:10
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue.syntax.interface_demo
 * @Description:
 */
public class ClassA implements InterfaceA {

    private ObjectA obj = null;

    public ObjectA getObjectA() {
        return obj;
    }

    public void setObjectA(ObjectA obj) {
        this.obj = obj;
    }
}
