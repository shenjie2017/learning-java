package com.blue.syntax.interface_demo;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/5/8 17:13
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue.syntax.interface_demo
 * @Description:
 */
public class ClassB extends ClassA implements InterfaceB {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.setObjectA(new ObjectA("obj001"));

        InterfaceB interB = obj;
        System.out.println(interB.getObjectA());
    }
    public void run(String[] args) {
        System.out.println("ClassB.run");
    }
}
