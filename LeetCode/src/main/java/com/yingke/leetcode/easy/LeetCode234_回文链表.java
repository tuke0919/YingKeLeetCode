package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode234_回文链表 {


    /**
     *
     * 请判断一个链表是否为回文链表。
     *
     * 示例 1:
     *
     * 输入: 1->2
     * 输出: false
     * 示例 2:
     *
     * 输入: 1->2->2->1
     * 输出: true
     *
     * 进阶：
     * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 1，快慢指针 找mid
     * 2，后半段 翻转后半段链表
     * 3，比较两个链表
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // 1， 快慢指针 找mid
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2,mid 是slow，翻转后半端

        ListNode pre = null;
        ListNode p = slow.next;
        while (p != null) {
            ListNode node = p.next;

            p.next = pre;
            pre = p;
            p = node;
        }

        // 3, p是 后半段的头
        while (pre != null) {
            if (head.val != pre.val) {
                return false;
            }

            head = head.next;
            pre = pre.next;
        }

        return true;



    }

    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode q = head;
        while (q != null) {
            ListNode node = q.next;

            q.next = p;
            p = q;
            q = node;
        }
        return p;



    }
}
