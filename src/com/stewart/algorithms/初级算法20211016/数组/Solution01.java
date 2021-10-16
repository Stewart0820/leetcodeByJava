package com.stewart.algorithms.初级算法20211016.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Stewart
 * @create 2021/10/16
 */
public class Solution01 {
    public static int removeDuplicates(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i==0 || nums[i]!=nums[i-1]){
                nums[t ++ ] = nums[i];
            }
        }

        return t;
    }
}
