package com.tengyun.crazyit.chapter16thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Adam Zhao
 */
public class ThreadCallable2Test {
    public static void main(String[] args) {
        new Thread(new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;

                int printTime = 100;
                for (int i = 0; i < printTime; i++) {
                    System.out.println(Thread.currentThread().getName() + "-----" + i);
                    result = i;
                }

                return result;
            }
        })).start();

        int mainPrintTime  = 100;
        for (int i = 0; i < mainPrintTime; i++) {
            System.out.println(Thread.currentThread().getName() + "******" + i);
        }
    }
}
