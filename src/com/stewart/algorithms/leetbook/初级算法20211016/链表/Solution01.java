package com.stewart.algorithms.leetbook.初级算法20211016.链表;

/**
 * @author Stewart
 * @create 2021/10/24
 * 删除链表中的节点
 */

public class Solution01 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
