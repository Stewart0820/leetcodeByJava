package com.stewart.algorithms.leetbook.初级算法20211016.链表;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author Stewart
 * @create 2021/10/24
 */
public class Solution06 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            //如果重复出现说明有环
            //判断next的指向是否重复
            if (set.contains(head)) {
                return true;
            }
            //否则就把当前节点加入到集合中
            set.add(head);
            head = head.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
