package com.stewart.algorithms.newstudy.six;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Stewart
 * @create 2022/2/18
 * @Description 3. 无重复字符的最长子串
 */
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        if (s == "") {
            return 0;
        }
        int res = 0;
        // 字符串的长度
        int length = s.length();
        int a = 0;
        while (length != 0) {
            Set<Character> set = new HashSet<>();
            for (int i = a; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!set.add(c)) {
                    break;
                }
            }
            if (set.size() > res) {
                res = set.size();
            }

            a++;
            length--;
            System.out.println(set);
        }

        return res;
    }

    public static int lengthOfLongestSubstringTwo(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i), flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                        return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstringTwo(s));
    }
}
