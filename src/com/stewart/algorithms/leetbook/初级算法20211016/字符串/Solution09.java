package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/21
 */
public class Solution09 {
    public static String longestCommonPrefix(String[] strs) {
        // 找出最小长度的的字符串
        int minLen = Integer.MAX_VALUE;
        String minStr = "";
        for (String str : strs) {
            if (minLen > str.length()) {
                minLen = str.length();
                minStr = str;
            }
        }

        for (String str : strs) {
            while (minLen > 0) {
                // 是否是共同前缀
                boolean start = str.startsWith(minStr.substring(0, minLen));
                if (start) {
                    break;
                } else {
                    minLen--;
                }
            }
        }
        return minStr.substring(0, minLen);


    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
}
