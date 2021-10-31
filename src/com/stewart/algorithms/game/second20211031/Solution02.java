package com.stewart.algorithms.game.second20211031;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Stewart
 * @create 2021/10/31
 */
public class Solution02 {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        //第一个
        ListNode pre = head;
        ArrayList<Integer> list = new ArrayList<>();
        int flag=0;
        head = head.next;
        while(head!=null&&head.next!=null){
            if(head.val>pre.val&&head.val>head.next.val){
                list.add(flag);
                System.out.println(pre.val);
                System.out.println(head.next.val);
                System.out.println(head.val);
                System.out.println("大于");
            }
            if(head.val<pre.val&&head.val<head.next.val){
                System.out.println(pre.val);
                System.out.println(head.next.val);
                System.out.println(head.val);
                System.out.println("小于");
                list.add(flag);
            }
            head = head.next;
            pre = pre.next;
            flag++;

        }
        System.out.println(list);
        if(list.size()==0||list.size()<2){
            int[] arr = {-1,-1};
            return arr;
        }
        System.out.println(list);
        System.out.println(list.size());
        int min = 0;

        for (int i = list.size()-1; i >0; i--) {
            int res = list.get(i) - list.get(i - 1);
            if(i==list.size()-1){
                min = res;
            }
            if(min>res){
                min = res;
            }
        }

        int[] arr = {min,Collections.max(list)-Collections.min(list)};
        return arr;
    }

    public static void main(String[] args) {
        ListNode last = new ListNode(3, null);
        ListNode second = new ListNode(1, last);
        ListNode l1 = new ListNode(2, second);
        ListNode l2 = new ListNode(2, l1);
//        ListNode l3 = new ListNode(1, l2);
//        ListNode l4 = new ListNode(3, l3);
//        ListNode l5 = new ListNode(5, l4);


        nodesBetweenCriticalPoints(l2);
    }
}
