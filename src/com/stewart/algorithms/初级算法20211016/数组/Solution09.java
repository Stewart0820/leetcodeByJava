package com.stewart.algorithms.初级算法20211016.数组;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Stewart
 * @create 2021/10/18
 */
public class Solution09 {
    public static int[] twoSum(int[] nums, int target) {

//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1, -1};

        //key是值，i是索引
//        Map<Integer, Integer> m = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(m);
//            //        (0-0)
//            if (m.get(target - nums[i]) != null) {
//                return new int[]{m.get(target - nums[i]), i};
//            }
//            m.put(nums[i], i);
//        }
//        System.out.println(m);
//        return new int[]{0, 0};

        //双指针
        int i=0;
        int j=1;
        while(nums[i]+nums[j]!=target){
            if(j==nums.length-1){
                i++;
                j=i;
            }
            j++;
        }
        return new int[]{i,j};

    }

    public static void main(String[] args) {
        int arr[] = {3,2,4};
        twoSum(arr,6);
    }
}
