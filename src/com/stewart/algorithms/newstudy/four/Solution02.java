package com.stewart.algorithms.newstudy.four;

/**
 * @author Stewart
 * @create 2022/2/16
 * @Description
 */
public class Solution02 {
    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String a = "";
        for (int i = 0; i < s1.length; i++) {
            s1[i]  = reverseString(s1[i].toCharArray());
            if(i==s1.length-1){
                a= a+s1[i];
            }else{
                a= a+s1[i]+" ";
            }
        }
        return a;
    }
    public static String reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < s.length / 2) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        String a = "";
        for (int i = 0; i < s.length; i++) {
            a = a+s[i];
        }
        return a;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
