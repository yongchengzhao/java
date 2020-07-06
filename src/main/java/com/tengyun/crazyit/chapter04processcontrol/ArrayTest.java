package com.tengyun.crazyit.chapter04processcontrol;

/**
 * @author Adam
 */
public class ArrayTest {
    public static void main(String[] args) {
        initTwoDimensionArray();
    }

    /**
     * 遍历数组。
     */
    private static void traversalArray() {
        int[][] intInt = new int[4][2];
        System.out.println(intInt.length);
        System.out.println(intInt[0].length);

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
    private static void initTwoDimensionArray() {
        int[][] intB = new int[][]{new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{3, 3, 3}};
        for (int[] arr: intB){
            for (int ii : arr) {
                System.out.print(ii + ",");
            }
            System.out.println();
        }
    }
}
