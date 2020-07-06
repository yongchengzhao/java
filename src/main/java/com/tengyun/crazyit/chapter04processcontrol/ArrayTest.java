package com.tengyun.crazyit.chapter04processcontrol;

/**
 * @author Adam
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] intInt = new int[4][2];
        System.out.println(intInt.length);
        System.out.println(intInt[0].length);

        for (int i = 0; i < intInt.length; i++) {
            for (int j = 0; j < intInt[i].length; j++) {
                System.out.print(intInt[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
