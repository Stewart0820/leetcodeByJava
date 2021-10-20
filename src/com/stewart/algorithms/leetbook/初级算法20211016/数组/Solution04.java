package com.stewart.algorithms.leetbook.初级算法20211016.数组;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Stewart
 * @create 2021/10/17
 */
public class Solution04 {
    private static boolean containsDuplicate(int[] nums) {
        Set tempSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(!tempSet.add(nums[i])){
                return true;
            };
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        containsDuplicate(arr);
    }


}
