package com.tengyun.crazyit.chapter16thread;

/**
 * @author Adam Zhao
 */
public class ThreadRunnable2Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int printTime = 100;
                for (int i = 0; i < printTime; i ++) {
                    System.out.println(Thread.currentThread().getName() + "*****" + i);
                }
            }
        }).start();

        int mainPrintTime = 100;
        for (int i = 0; i < mainPrintTime; i ++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
