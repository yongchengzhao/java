package com.tengyun.crazyit.chapter16thread;

/**
 * @author Adam
 */
public class ThreadTest extends Thread {

    @Override
    public void run() {
        int printTimes = 100;
        for (int i = 0; i < printTimes; i++) {
            System.out.println(getName() + "---" + i);
        }
    }

    public static void main(String[] args) {
        int mainTimes = 100;
        for (int i = 0; i < mainTimes; i ++){
            System.out.println(Thread.currentThread().getName() + "---" + i);

            if (3 == i){
                new ThreadTest().start();
                new ThreadTest().start();
            }
        }
    }
}
