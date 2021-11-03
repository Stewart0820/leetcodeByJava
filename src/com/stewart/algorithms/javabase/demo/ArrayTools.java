package com.stewart.algorithms.javabase.demo;

/**
 * 数组工具
 *
 * @author Stewart
 *
 */
public class ArrayTools {
    /**
     * 求一个数组的最大值
     *
     * @param arr
     *            接收到数组
     * @return
     */
    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            /**
             * 两数比较
             */
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        /**
         * 返回最大值
         */
        return arr[max];
    }

    /**
     * 求一个数组的最小值
     *
     * @param arr
     *            接收到数组
     * @return
     */
    public static int getMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            /**
             * 两数比较
             */
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        /**
         * 返回最小值
         */
        return arr[min];
    }

}
