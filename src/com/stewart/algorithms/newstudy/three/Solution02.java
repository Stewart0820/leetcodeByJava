package com.stewart.algorithms.newstudy.three;

/**
 * @author Stewart
 * @create 2022/2/16
 * @Description 两数之和 II - 输入有序数组
 */
public class Solution02 {
    public static int[] twoSum(int[] numbers, int target) {
//        int i ;
//        int j =1;
//        int flag = 0;
//        for (i = 0; i < numbers.length; i++) {
//            for (j = 1; j < numbers.length; j++) {
//                if(target==numbers[i]+numbers[j]&&i!=j){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==1){
//                break;
//            }
//        }
//        int[] arr = {i + 1, j + 1};
//        return arr;

        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,9,56,90};
        int[] ints = twoSum(arr, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
