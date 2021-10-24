package com.stewart.algorithms.leetbook.初级算法20211016.链表;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/24
 * 删除链表的倒数第N个节点
 */
public class Solution02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        //5-1=4
        int last = length(head) - n;
        //如果last等于0表示删除的是头结点
        if(last==0){
            //那就是除去第一个，剩余其他的
            return head.next;
        }
        //这里首先要找到要删除链表的前一个结点
        for (int i = 0; i < last-1; i++) {
            pre=pre.next;
        }
        //然后让前一个结点的next指向要删除节点的next
        pre.next = pre.next.next;
        return head;
    }
    private int length(ListNode head){
        int len =0;
        while (head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}

