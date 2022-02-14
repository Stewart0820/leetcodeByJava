package com.stewart.algorithms.newstudy.two;

import java.util.Arrays;

/**
 * @author Stewart
 * @create 2022/2/14
 * @Description 有序数组的平方
 */
public class Solution01 {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }



    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] ints = sortedSquares(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
