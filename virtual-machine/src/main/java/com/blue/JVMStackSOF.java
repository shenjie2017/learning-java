package com.blue;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/7 15:13
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class JVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;

        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JVMStackSOF oom = new JVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
