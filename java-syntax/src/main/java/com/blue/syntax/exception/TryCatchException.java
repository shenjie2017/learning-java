package com.blue.syntax.exception;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/7/15 10:07
 * @Modified by:
 * @Project: learning-java
 * @Package: com.blue.syntax.exception
 * @Description:
 */
public class TryCatchException {
    public static void main(String[] args) {
        try {
            throw new RemoteException("remote Exception");
//            int i = 1/0;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            int t = new Random().nextInt();
            if (t % 5 == 0) {
                throw new RuntimeException("throw runtime exception!!");
            } else {
                System.out.println(t);
            }
        }
    }
}
