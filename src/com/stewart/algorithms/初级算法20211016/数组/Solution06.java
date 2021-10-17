package com.stewart.algorithms.初级算法20211016.数组;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Stewart
 * @create 2021/10/17
 * 传入两个数组，求交集
 */
public class Solution06 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        /**
         * 当Map集合中有这个key时，就使用这个key值；
         *   如果没有就使用默认值defaultValue。
         */
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(map.getOrDefault(nums2[i],0)>0){
                //如果有一个值相同的话，就加一个
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }


        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2, 2};
        intersect(arr1, arr2);
    }
}
