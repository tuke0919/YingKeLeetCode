package com.yingke.leetcode.medium;

import java.util.List;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-21
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 两数相加 {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     */

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode header = null;
        ListNode node = null;
        ListNode p = l1;
        ListNode q = l2;
        // 进位
        int d = 0;
        while (p != null || q != null) {
            int l1Value = 0;
            if (p != null) {
                l1Value = p.val;
            }

            int l2Value = 0;
            if (q != null) {
                l2Value = q.val;
            }

            int sum  = l1Value + l2Value + d;
            // 进位
            d = sum / 10;
            // 余数
            int value = sum % 10;
            if (header == null) {
                header = new ListNode(value);
                node = header;
            } else {
                node.next = new ListNode(value);
                node = node.next;
            }

            if (p != null) {
                p = p.next;
            }

            if (q != null) {
                q = q.next;
            }
        }

        if (d != 0) {
            node.next = new ListNode(d);
        }

        return header;
    }

}
