package com.stewart.algorithms.leetbook.初级算法20211016.动态规划;

/**
 * @author Stewart
 * @create 2021/11/1
 */
public class Solution03 {
    public static int maxSubArray(int[] num) {
            //超时
//        if(nums.length==1){
//            return nums[0];
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int res = 0;
//            for (int j = i; j < nums.length; j++) {
//                res = res+nums[j];
//                if(max<res){
//                    max = res;
//                }
//            }
//        }
//        return max;
//        return 1;
        int length = num.length;
        int[] dp = new int[length];
        //边界条件
        dp[0] = num[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            //转移公式
            dp[i] = Math.max(dp[i - 1], 0) + num[i];
            //记录最大值
            max = Math.max(max, dp[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {-1};
        maxSubArray(arr);
    }
}
