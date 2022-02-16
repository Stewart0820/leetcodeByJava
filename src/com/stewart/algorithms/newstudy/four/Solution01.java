package com.stewart.algorithms.newstudy.four;

/**
 * @author Stewart
 * @create 2022/2/16
 * @Description 344. 反转字符串
 */
public class Solution01 {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < s.length / 2) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] arr = {'H', 'e', 's', 'l', 'l', 'o'};
        reverseString(arr);
    }
}
