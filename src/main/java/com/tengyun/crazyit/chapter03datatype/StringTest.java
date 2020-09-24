package com.tengyun.crazyit.chapter03datatype;

/**
 * @author Adam
 */
public class StringTest {
    public static void main(String[] args) {
        String str = ",,,";
        String[] arr = str.split(",");
        System.out.println(arr);
        System.out.println(arr.length);
    }
}
