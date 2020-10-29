package com.yingke.leetcode.medium;

import com.yingke.leetcode.ListNode;

import java.util.List;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode19_删除单链表倒数第n个节点 {
    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     *
     * 示例：
     *
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     *
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     * 说明：
     *
     * 给定的 n 保证是有效的。
     *
     * 进阶：
     *
     * 你能尝试使用一趟扫描实现吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int count = 0;

        ListNode node = head;
        while (node != null) {
            node = node.next;
            count ++;
        }

        if (count < n) {
            return head;
        }

        if (count == n) {
            return head.next;
        }
        ListNode p = head;
        ListNode q = head;
        // q先移动k步
        int k = n;
        while (q != null && k > 0) {
            q = q.next;
            k--;
        }
        // 一起移动
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next;
        }
        // p 的后一个节点 就是要删除的节点
        p.next = p.next.next;
        return head;
    }

}
