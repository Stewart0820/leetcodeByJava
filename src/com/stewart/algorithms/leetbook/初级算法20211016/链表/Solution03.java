package com.stewart.algorithms.leetbook.初级算法20211016.链表;

import java.util.Stack;

/**
 * @author Stewart
 * @create 2021/10/24
 */
public class Solution03 {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }

        if(stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode dummy  =node;
        while (!stack.isEmpty()){
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        //最后一个要设置为空
        node.next = null;
        return dummy ;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    public static void main(String[] args) {

    }
}
