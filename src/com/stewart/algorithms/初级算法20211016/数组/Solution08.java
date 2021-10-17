package com.stewart.algorithms.初级算法20211016.数组;

/**
 * @author Stewart
 * @create 2021/10/17
 */
public class Solution08 {
    public static void moveZeroes(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                flag++;
            }
        }
        if(nums.length==flag){
            return ;
        }
        String s= "";
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                s = s+nums[i]+",";
            }
        }
        System.out.println(s);
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            nums[i]=Integer.parseInt(split[i]);
        }
        for (int i = nums.length; i > split.length; i--) {
            nums[i-1]= 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        moveZeroes(arr);
    }
}
