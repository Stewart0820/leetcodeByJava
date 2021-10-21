package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/20
 * 验证回文串
 */
public class Solution05 {
    public static boolean isPalindrome(String s) {
        //正则处理，空格替换为空，转小写
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome("race a car");
    }
}
