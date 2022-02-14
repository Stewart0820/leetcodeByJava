package com.stewart.algorithms.newstudy.one;

/**
 * @author Stewart
 * @create 2022/2/13
 * @Description 盛最多水的容器
 */
public class Solution03 {
    public static int maxArea(int[] height) {
       int left = 0,right = height.length-1;
       int max = 0;
        for (int i = 0; i < height.length-1; i++) {
            if(height[left]>height[right]){
                int temp = height[right]*(right-left);
                if(max<temp){
                    max = temp;
                }
                right = right-1;
            }else{
                int temp = height[left]*(right-left);
                if(max<temp){
                    max = temp;
                }
                left = left+1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1,4};
        System.out.println(maxArea(arr));
    }
}
