package com.tengyun.crazyit.chapter04processcontrol;

/**
 * @author Adam
 */
public class ArrayTest {
    public static void main(String[] args) {
        traversalArray();
    }

    /**
     * 遍历数组。
     */
    public static void traversalArray() {
        int[][] intInt = new int[4][2];
        System.out.println(intInt.length);
        System.out.println(intInt[0].length);

        // 遍历数组前练习一下基本类型局部变量的赋值。
        // 0
        System.out.println(intInt[2][1]);
        int newInt = intInt[2][1];
        // 0
        System.out.println(newInt);
        intInt[2][1] = 666;
        // 0
        System.out.println(newInt);

        for (int[] intArray : intInt) {
            for (int anInt : intArray) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }

    /**
     * 初始化二维数组。
     */
    public static void initTwoDimensionArray() {
        int[][] intB = new int[][]{new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{3, 3, 3}};
        for (int[] arr: intB){
            for (int ii : arr) {
                System.out.print(ii + ",");
            }
            System.out.println();
        }
    }
}
