package com.stewart.algorithms.leetbook.hot100.ten;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Stewart
 * @create 2021/10/26
 */
public class Solutition03 {
    public static int lengthOfLongestSubstring(String s) {
//        if(s.length()==0){
//            return 0;
//        }
//        int res = 0;
//        // 字符串的长度
//        int length = s.length();
//        int a = 0;
//        while (length!=0){
//            Set<Character> set = new HashSet<>();
//            for (int i = a; i < s.length(); i++) {
//                char c = s.charAt(i);
//                if(!set.add(c)){
//                    break;
//                }
//            }
//            if(set.size()>res){
//                res = set.size();
//            }
//            a++;
//            length--;
//        }
//
//        return res;
        if (s.length()==0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
