package com.blue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/7 14:52
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue
 * @Description:
 */
public class HeapOOM {
    static class OOMObject{
    }

    /**
     * jvm param: -Xmx20m
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
