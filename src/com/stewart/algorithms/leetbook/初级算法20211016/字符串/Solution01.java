package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/19
 * 反转char
 */
public class Solution01 {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp =s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] ch = {'H','a','n','m','i','o'};
        reverseString(ch);
    }
}
