package com.tengyun.crazyit.chapter04processcontrol;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adam
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        int start = 1;
        int end = 10000;
        List<Integer> primeNumberList = new ArrayList<>();

        for (int i = start; i < end + 1; i++){
            boolean isPrimeNumber = true;
            // 从 2 开始除，一直除到数值本身 -1。如果中途可以整除，说明不是质数，然后跳出循环，开始判断下一个值。
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber){
                primeNumberList.add(i);
            }
        }

        System.out.println(primeNumberList);
        System.out.println(primeNumberList.size());
    }
}
