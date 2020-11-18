package com.tengyun.crazyit.chapter16thread;

/**
 * @author Adam Zhao
 */
public class ThreadRunnableTest {
    public static void main(String[] args) {
        System.out.println("***************main**************");

        ThreadRunnable tr = new ThreadRunnable();
        new Thread(tr).start();

        int mainPrintTime = 100;
        for (int i = 0; i < mainPrintTime; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
        }
    }
}

class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        int printTime = 100;
        for (int i = 0; i < printTime; i++) {
            System.out.println(Thread.currentThread().getName() + "***    " + i);
        }
    }
}
