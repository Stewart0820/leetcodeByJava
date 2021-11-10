package com.stewart.algorithms.leetbook.初级算法20211016.动态规划;

/**
 * @author Stewart
 * @create 2021/11/4
 * 打家劫舍
 */
public class Solution04 {
    public static int rob(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int[][] dp = new int[length][2];
        dp[0][0] = 0;//第1家没偷
        dp[0][1] = nums[0];//第1家偷了
        //从第2个开始判断
        for (int i = 1; i < length; i++) {
            //下面两行是递推公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        //最后取最大值即可
        return Math.max(dp[length - 1][0], dp[length - 1][1]);



    }

    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int rob = rob(arr);
        System.out.println(rob);
    }
}
