package com.tengyun.tostring;

import com.alibaba.fastjson.JSON;

/**
 * @author Adam
 */
public class TestToString {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 24);

        System.out.println(JSON.toJSONString(p1));
        System.out.println(p1);
    }
}

class Person {
    public String name;
    public int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
