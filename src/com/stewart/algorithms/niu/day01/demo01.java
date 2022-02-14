package com.stewart.algorithms.niu.day01;

/**
 * @author Stewart
 * @create 2022/1/29
 * @Description
 */
public class demo01 {

    /**
     * 2  2  2=21
     * 3  4  3=22
     * 4  8  4=23
     * 1 1 1 1
     * 2 1 1
     * 1 2 1
     * 1 1 2
     * 2 2
     * 3 1
     * 1 3
     * 4
     */
    public static int CalulateMethodCount (int num_money) {
        // write code here
        return (int) Math.pow(2,num_money-1);
    }
    public static void main(String[] args) {
        System.out.println(CalulateMethodCount(3));
    }
}
