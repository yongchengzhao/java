package com.tengyun.debug;

public class TestDebugg {
    public static void main(String[] args) {
        System.out.println("----------main----------");
        TestDebugg debugger = new TestDebugg();
        debugger.testDebug();
    }

    public void testDebug(){
        System.out.println(0);
        System.out.println(111);
        System.out.println(222);
        System.out.println(333);
        System.out.println(444);
        System.out.println(555);
        System.out.println(666);
        System.out.println(777);
        System.out.println(888);
        System.out.println(999);
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("ddd");
    }
}
