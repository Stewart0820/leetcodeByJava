package com.stewart.algorithms.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/19
 */
public class Solution02 {
    public static int reverse(int x) {
        String s = x+"";

        if(s.charAt(0)=='0'){
            return x;
        }
        int flag = 0;
        if(s.charAt(0)=='-'){
            flag = 1;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println(x);

        if(flag==1){

        }

        return 1;
    }
    public static void main(String[] args) {
        reverse(123);
    }
}
