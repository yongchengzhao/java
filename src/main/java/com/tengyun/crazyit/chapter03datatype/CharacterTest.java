package com.tengyun.crazyit.chapter03datatype;

/**
 * @author Adam
 */
public class CharacterTest {
    public static void main(String[] args) {
        myName();
    }

    public static void int2Char() {
        System.out.println((char)65);
        System.out.println((char)97);
    }

    public static void myName() {

        System.out.println((int)'赵');
        System.out.println(0x8d75);

        System.out.println((int)'成');
        System.out.println(0x6210);

        System.out.println((int)'永');
        System.out.println(0x6c38);

        System.out.println((int)'腾');
        System.out.println(0x817e);

        System.out.println((int)'云');
        System.out.println(0x4e91);
    }
}
