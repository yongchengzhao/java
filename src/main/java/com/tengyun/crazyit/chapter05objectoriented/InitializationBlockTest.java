package com.tengyun.crazyit.chapter05objectoriented;

/**
 * @author Adam
 */
public class InitializationBlockTest {
    public static void main(String[] args) {
        System.out.println("-----main-----");

//        Foo aaa = new Foo();
        Bar bbb = new Bar(2);
    }
}

class Foo {
    {
        System.out.println("A 的实例初始化块。");
    }

    public Foo(){
        this(2);
        System.out.println("A 的无参构造器。");
    }

    public Foo(int i){
        System.out.println("A 的有参构造器。");
    }
}

class Bar extends Foo {
    {
        System.out.println("B 的实例初始化块。");
    }

    public Bar() {
//        super();
        System.out.println("B 的无参构造器。");
    }

    public Bar(int i) {
        System.out.println("B 的有参构造器");
    }
}
