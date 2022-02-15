package com.stewart.algorithms.newstudy.three;

import java.util.Arrays;

/**
 * @author Stewart
 * @create 2022/2/15
 * @Description
 */
public class Solution01 {
    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int flag = nums.length ;
        while(flag>0){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
            flag--;
        }


        for (int s = 0; s < nums.length; s++) {
            System.out.println(nums[s]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
