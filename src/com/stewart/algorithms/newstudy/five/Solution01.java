package com.stewart.algorithms.newstudy.five;

import com.stewart.algorithms.leetbook.初级算法20211016.链表.Solution02;
import com.stewart.algorithms.leetbook.初级算法20211016.链表.demo.MyLink;

/**
 * @author Stewart
 * @create 2022/2/17
 * @Description 876. 链表的中间结点
 */


public class Solution01 {
    public static ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}
