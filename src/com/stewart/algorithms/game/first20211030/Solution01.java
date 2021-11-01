package com.stewart.algorithms.game.first20211030;

import java.util.*;

/**
 * @author Stewart
 * @create 2021/10/30
 * 数组中第 K 个独一无二的字符串
 */
public class Solution01 {

    public static String kthDistinct(String[] arr, int k) {

        Map<String, Integer> num_freq = new HashMap<>();
        for (String x: arr) {
            num_freq.put(x, num_freq.getOrDefault(x, 0) + 1);
        }

        List<String> nums = new ArrayList<>();
        for (String x: arr) {
            if (num_freq.get(x) == 1) {
                nums.add(x);
            }
        }
        System.out.println(nums.size() < k ? "" : nums.get(k - 1));
        return nums.size() < k ? "" : nums.get(k - 1);


    }

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        kthDistinct(arr, 2);
    }
}
