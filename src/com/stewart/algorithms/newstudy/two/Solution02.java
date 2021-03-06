package com.stewart.algorithms.newstudy.two;

/**
 * @author Stewart
 * @create 2022/2/14
 * @Description  轮转数组
 */
public class Solution02 {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2};
        rotate(arr,3);
    }
}
