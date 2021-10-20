package com.stewart.algorithms.leetbook.初级算法20211016.数组;

/**
 * @author Stewart
 * @create 2021/10/17
 */
public class Solution08 {
    public static void moveZeroes(int[] nums) {
        /**
         * 方法1 by me
         */
//        int flag = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==0){
//                flag++;
//            }
//        }
//        if(nums.length==flag){
//            return ;
//        }
//        String s= "";
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=0){
//                s = s+nums[i]+",";
//            }
//        }
//        System.out.println(s);
//        String[] split = s.split(",");
//        for (int i = 0; i < split.length; i++) {
//            nums[i]=Integer.parseInt(split[i]);
//        }
//        for (int i = nums.length; i > split.length; i--) {
//            nums[i-1]= 0;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }


        /**
         * 方法2
         * 把全部的数字都移动到前面
         *
         */
//        if (nums == null || nums.length == 0) {
//            return;
//        }
//        int index = 0;
//        //一次遍历，把非零的都往前挪
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[index++] = nums[i];
//            }
//        }
//        //后面的都是0,
//        while (index < nums.length) {
//            nums[index++] = 0;
//        }


        /**
         * 方法3
         * 双指针
         */
//        int i = 0;
//        for (int j = 0; j < nums.length; j++) {
//            //只要不为0就往前挪
//            if (nums[j] != 0) {
//                //i指向的值和j指向的值交换
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//            }
//        }



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
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
