package com.tengyun.crazyit.chapter03datatype;

import java.util.Arrays;

/**
 * @author Adam
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] intArr = new int[2][];
        char[][] charArr = new char[3][];

        // 调用 println(Object x) 方法，参数 x 可为 null。因为，打印前会调用 String.valueOf(x) 方法。
        System.out.println(Arrays.toString(intArr[0]));
        // 调用 println(char x[]) 方法，参数 x 不可为 null。因为，打印前没有调用 String.valueOf(x) 方法。到打印时直接获取 x.length
        // 导致空指针异常。
        System.out.println(charArr[0]);
    }
}
