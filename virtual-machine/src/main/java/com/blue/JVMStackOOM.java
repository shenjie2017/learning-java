package com.blue;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/7 15:25
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class JVMStackOOM {

    private void dontStop(){
        while(true){

        }
    }

    public void stackLeakByThread(){
        while(true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JVMStackOOM oom = new JVMStackOOM();
        oom.stackLeakByThread();
    }
}
