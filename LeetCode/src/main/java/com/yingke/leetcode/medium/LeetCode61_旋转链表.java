package com.yingke.leetcode.medium;

import com.yingke.leetcode.ListNode;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-11-01
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode61_旋转链表 {
    /**
     * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
     *
     * 示例 1:
     *
     * 输入: 1->2->3->4->5->NULL, k = 2
     * 输出: 4->5->1->2->3->NULL
     * 解释:
     * 向右旋转 1 步: 5->1->2->3->4->NULL
     * 向右旋转 2 步: 4->5->1->2->3->NULL
     * 示例 2:
     *
     * 输入: 0->1->2->NULL, k = 4
     * 输出: 2->0->1->NULL
     * 解释:
     * 向右旋转 1 步: 2->0->1->NULL
     * 向右旋转 2 步: 1->2->0->NULL
     * 向右旋转 3 步: 0->1->2->NULL
     * 向右旋转 4 步: 2->0->1->NULL
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rotate-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            count ++;
        }

        k = k % count;
        if (k == 0) {
            return head;
        }

        // p2先走 k 步
        ListNode p1 = head;
        ListNode p2 = head;

        while (k > 0) {
            p2 = p2.next;
            k--;
        }

        // 一起走
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        // 断开后半链
        ListNode newHead = p1.next;
        p1.next = null;
        p2.next = head;

        return newHead;
    }
}
