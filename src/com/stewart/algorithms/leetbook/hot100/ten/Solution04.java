package com.stewart.algorithms.leetbook.hot100.ten;

import java.util.Arrays;

/**
 * @author Stewart
 * @create 2021/10/27
 * 寻找两个正序数组的中位数
 */
public class Solution04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        int mid = arr.length / 2;
        //如果是偶数
        double res;
        if (arr.length % 2 == 0) {
            res = Math.round(arr[mid-1] + arr[mid])/ 2.00000;
        } else {
            res = arr[mid]/1.00000;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,4
        };
        findMedianSortedArrays(arr1, arr2);
    }
}
