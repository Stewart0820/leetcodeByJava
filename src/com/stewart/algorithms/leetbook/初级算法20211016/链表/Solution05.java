package com.stewart.algorithms.leetbook.初级算法20211016.链表;

import java.util.List;
import java.util.Stack;

/**
 * @author Stewart
 * @create 2021/10/24
 * 1234
 * 4321
 *回文链表
 * 我们知道栈是先进后出的一种数据结构，这里还可以使用栈先把链表的节点全部存放到栈中，然后再一个个出栈，这样就相当于链表从后往前访问了，
 */
public class Solution05 {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        //把链表节点的值存放到栈中
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        //然后再出栈
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
