package com.stewart.algorithms.leetbook.hot100.ten;

import org.w3c.dom.NodeList;

/**
 * @author Stewart
 * @create 2021/10/26
 */
public class Solutition02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            //添加下一个
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }

        return pre.next;

    }


    public static void main(String[] args) {
        ListNode last = new ListNode(3, null);
        ListNode second = new ListNode(4, last);
        ListNode l1 = new ListNode(2, second);

        ListNode last2 = new ListNode(4, null);
        ListNode second2 = new ListNode(6, last2);
        ListNode l2 = new ListNode(5, second2);
        addTwoNumbers(l1, l2);
    }
}
