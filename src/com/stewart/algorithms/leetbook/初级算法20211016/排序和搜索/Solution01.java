package com.stewart.algorithms.leetbook.初级算法20211016.排序和搜索;

import java.util.Arrays;

/**
 * @author Stewart
 * @create 2021/10/25
 * 合并两个有序数组
 */
public class Solution01 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for (int i = 0; i < m; i++) {
            arr[i]=nums1[i];
        }
        for (int i = 0; i < n; i++) {
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < m+n; i++) {
            nums1[i]=  arr[i];
        }
        //官方的api
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,0,0,0};
        int arr1[] ={2,5,6};
        merge(arr,3,arr1,3);
    }
}
