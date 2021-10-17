package com.stewart.algorithms.初级算法20211016.数组;

import java.util.Arrays;

/**
 * @author Stewart
 * @create 2021/10/17
 */
public class Solution05 {
    public static int singleNumber(int[] nums) {
        //方法1：暴力法
//        int result=0;
//        int flag=0;
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length-1; i+=2) {
//            if(nums[i]!=nums[i+1]){
//                flag=1;
//                result = nums[i];
//                break;
//            }
//        }
//        if(flag==0){
//            result = nums[nums.length-1];
//        }
//        System.out.println(result);
//        return result;
        //方法2:异或运算:适合一堆数字中找出一个不同的数字
        /*
            a^a=0；自己和自己异或等于0
            a^0=a；任何数字和0异或还等于他自己
            a^b^c=a^c^b；异或运算具有交换律
         */
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
            System.out.println(reduce);
        }
        return reduce;


    }

    public static void main(String[] args) {
        int arr[] = {1,3,1,-1,3};
        singleNumber(arr);
    }
}
