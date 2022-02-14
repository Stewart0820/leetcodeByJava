package com.stewart.algorithms.newstudy.one;

/**
 * @author Stewart
 * @create 2022/2/13
 * @Description 盛最多水的容器
 */
public class Solution02 {
    public static int maxArea(int[] height) {
        int temp = 0;
        sortPlus(height);
        return height[height.length-1]*height[height.length-2];
    }
    public static void sortPlus(int[] arr){
        if(arr != null && arr.length > 1){
            for(int i = 0; i < arr.length - 1; i++){
                // 初始化一个布尔值
                boolean flag = true;
                for(int j = 0; j < arr.length - i - 1 ; j++){
                    if(arr[j] > arr[j+1]){
                        // 调换
                        int temp;
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        // 改变flag
                        flag = false;
                    }
                }
                if(flag){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,4};
        System.out.println(maxArea(arr));
    }
}

