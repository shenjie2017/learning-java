package com.blue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/12 10:57
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class MonitoringTest {
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    /**
     * jvm param: -Xmx100m -Xms100m -XX:+UseSerialGC
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }
}
