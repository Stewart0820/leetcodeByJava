package com.stewart.algorithms.game.first20211030;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Stewart
 * @create 2021/10/30
 */
public class Solution01 {

    public static String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        String res = "";
        /**
         * 当Map集合中有这个key时，就使用这个key值；
         *   如果没有就使用默认值defaultValue。
         */
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > 1) {
                set.remove(arr[i]);
            }
        }
        System.out.println(set);
        int count = 0;
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            //说明次数小于1
            if (value == 1) {
                count++;
            }
        }

        int flag = 0;
        if (count >= k) {
            for (String key : map.keySet()) {
                Integer value = map.get(key);
                if (value == 1) {
                    flag++;
                }
                if (flag == count) {
                    System.out.println(set);
                    List<String> arr1 = new ArrayList<>(set);
                    res = arr1.get(count - 1);
                    System.out.println(res);
                    return res;
                }
            }
        }


        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        kthDistinct(arr, 2);
    }
}
