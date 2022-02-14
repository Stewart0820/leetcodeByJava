package com.stewart.algorithms.javabase.demo02;

/**
 * @author Stewart
 * @create 2021/11/11
 */
public class Love {
    public static void main(String[] args) {
        System.out.println("      ** **");

        for (int i = 4; i < 10; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * 9 - 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        Integer.valueOf()
    }
}
