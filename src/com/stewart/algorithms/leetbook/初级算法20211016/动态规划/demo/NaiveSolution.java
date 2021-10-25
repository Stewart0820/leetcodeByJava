package com.stewart.algorithms.leetbook.初级算法20211016.动态规划.demo;

/**
 * @author Stewart
 * @create 2021/10/25
 */
public class NaiveSolution {
    static int getValue(int[] values, int length) {
        if (length <= 0) {
            return 0;
        }
        int tmpMax = -1;
        for (int i = 0; i < length; i++) {
            tmpMax = Math.max(tmpMax, values[i] + getValue(values, length - i - 1));
        }
        return tmpMax;
    }

    public static void main(String[] args) {
        int[] values = new int[]{3, 7, 1, 3, 9};
        int rodLength = values.length;

        System.out.println("Max rod value: " + getValue(values, rodLength));
    }
}
