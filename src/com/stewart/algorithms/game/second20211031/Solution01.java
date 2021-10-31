package com.stewart.algorithms.game.second20211031;

/**
 * @author Stewart
 * @create 2021/10/31
 */
public class Solution01 {
    public static int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i%10==nums[i]){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        smallestEqual(arr);
    }
}
