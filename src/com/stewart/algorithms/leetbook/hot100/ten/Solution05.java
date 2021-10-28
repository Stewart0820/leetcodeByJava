package com.stewart.algorithms.leetbook.hot100.ten;

/**
 * @author Stewart
 * @create 2021/10/27
 * 最长回文子串
 */
public class Solution05 {
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int i = 0;
        int j = length-1;
        int res = 0;
        while (i<length-1&&j>0){
            if(chars[i]==chars[j]){
                i++;
            }else{
                res = 0;
            }
            j--;
        }

        return null;
    }
    public static void main(String[] args) {
        String s ="babad";
        longestPalindrome(s);
    }
}
