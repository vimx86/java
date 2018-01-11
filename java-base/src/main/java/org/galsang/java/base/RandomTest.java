package org.galsang.java.base;

import java.util.Random;

/**
 * Description：获取指定范围的随机数
 * <br /> Author： galsang
 */
public class RandomTest {

    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        Random random = new Random();

        int s = random.nextInt(max) % (max - min + 1) + min;
        System.out.println(s);
    }
}
