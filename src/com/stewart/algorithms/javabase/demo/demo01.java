package com.stewart.algorithms.javabase.demo;

/**
 * @author Stewart
 * @create 2021/11/3
 */
public class demo01 {
    // 公共的 静态 无返回值 main方法 数组
    public static void main(String[] str) {

        /**
         * 冒泡排序
         */
        int[] arr = { 3, 6, 8, 74, 99, 12 };

        for (int i = 0; i < arr.length - 1; i++) {
            // 每一次比较的元素-1，避免角标越界
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int [] [] arr1 = new int [3] [2] ;
    }
}
