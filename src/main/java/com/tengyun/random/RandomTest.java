package com.tengyun.random;

import java.util.Random;

/**
 * @author Adam
 */
public class RandomTest {
    public static void main(String[] args) {
        int randInt = getInt(9000, 10000);
        System.out.println(randInt);

        float randFloat = getFloat(9000.0f, 10000.0f);
        System.out.println(randFloat);

        double randDouble = getDouble(9000.0, 10000.0);
        System.out.println(randDouble);
    }

    /**
     * 随机小数。
     */
    public static double getDouble(double min, double max){
        if (min > max){
            return -1.0;
        }

        int randInt = getInt((int)min, (int)max);
        Random random = new Random();

        while (true){
            double randDouble = random.nextDouble() + randInt;
            if (randDouble > min && randDouble < max){
                return randDouble;
            }
        }
    }

    /**
     * 随机小数。
     */
    public static Float getFloat(float min, float max){
        if (min > max){
            return -1.0f;
        }

        int randInt = getInt((int)min, (int)max);
        Random random = new Random();

        while (true){
            float randFloat = random.nextFloat() + randInt;
            if (randFloat > min && randFloat < max){
                return randFloat;
            }
        }
    }

    /**
     * 随机整数
     */
    public static int getInt(int min, int max){
        if (min > max){
            return -1;
        }

        Random random = new Random();

        while(true) {
            int randInt = random.nextInt(max);
            if (randInt > min){
                return randInt;
            }
        }
    }
}
