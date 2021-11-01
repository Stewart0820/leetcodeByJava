package com.stewart.algorithms.leetbook.hot100.ten;

/**
 * @author Stewart
 * @create 2021/10/27
 * 最长回文子串
 */
public class Solution05 {
    public static String longestPalindrome(String s) {
        String result = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                String test = s.substring(i, j);
                if(palindrome(test)&&test.length()>max){
                    result = s.substring(i, j);
                    max = Math.max(max, result.length());
                }
            }
        }
        System.out.println(result);
        return result;
    }
    private static boolean palindrome(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="babad";
        longestPalindrome(s);
    }
}
