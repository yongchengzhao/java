package com.tengyun.crazyit.chapter03datatype;

/**
 * @author Adam
 */
public class IntegerTest {
    public static void main(String[] args) {
        trans2Binary(16);
        trans2Octal(16);
        trans2Hexadecimal(16);
    }

    public static void trans2Binary(int i) {
        System.out.println(Integer.toBinaryString(i));
    }

    public static void trans2Octal(int i) {
        System.out.println(Integer.toOctalString(i));
    }

    public static void trans2Hexadecimal(int i) {
        System.out.println(Integer.toHexString(i));
    }
}
