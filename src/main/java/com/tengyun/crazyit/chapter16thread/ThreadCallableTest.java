package com.tengyun.crazyit.chapter16thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Adam Zhao
 */
public class ThreadCallableTest {
    public static void main(String[] args) {
        ThreadCallable tc = new ThreadCallable();
        FutureTask<Integer> ft = new FutureTask<>(tc);
        new Thread(ft).start();

        int mainPrintTime = 100;
        for (int i = 0; i < mainPrintTime; i++) {
            System.out.println(Thread.currentThread().getName() + "---------------" + i);
        }
    }
}

class ThreadCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        int result = 0;

        int printTime = 100;
        for (int i = 0; i < printTime; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
            result = i;
        }

        return result;
    }
}
