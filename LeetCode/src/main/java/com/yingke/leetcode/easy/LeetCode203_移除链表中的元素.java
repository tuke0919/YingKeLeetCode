package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-21
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode203_移除链表中的元素 {


    /**
     * 删除链表中等于给定值 val 的所有节点。注意是 "所有" 不是一个
     *
     * 示例:
     *
     * 输入: 1->2->6->3->4->5->6, val = 6
     * 输出: 1->2->3->4->5
     *
     *
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val != val) {
                prev = curr;
                curr = curr.next;
            } else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return head;

    }

}
