package com.stewart.algorithms.leetbook.初级算法20211016.设计问题;

/**
 * @author Stewart
 * @create 2021/11/4
 */
public class Solution01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}
