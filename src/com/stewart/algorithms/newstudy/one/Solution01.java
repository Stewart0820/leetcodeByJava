package com.stewart.algorithms.newstudy.one;

/**
 * @author Stewart
 * @create 2022/2/13
 * 35. 搜索插入位置
 * @Description
 */
public class Solution01 {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                return i;
            }
        }
        int left = 0,right = nums.length;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2;
            if(nums[mid]>target){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }
}
