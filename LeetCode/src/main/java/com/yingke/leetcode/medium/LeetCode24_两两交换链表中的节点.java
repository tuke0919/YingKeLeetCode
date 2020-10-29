package com.yingke.leetcode.medium;

import com.yingke.leetcode.ListNode;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-29
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode24_两两交换链表中的节点 {
    /**
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     *
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * 示例 1：
     *
     *
     * 输入：head = [1,2,3,4]
     * 输出：[2,1,4,3]
     * 示例 2：
     *
     * 输入：head = []
     * 输出：[]
     * 示例 3：
     *
     * 输入：head = [1]
     * 输出：[1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     */

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int n = 2;
        ListNode pre = null;
        ListNode p = head;
        ListNode lastSecond = null;
        ListNode ans = head.next;
        while (p != null ) {

            // 链表翻转
            ListNode node = p.next;

            p.next = pre;
            pre = p;
            p = node;

            n --;

            // 每次翻转两个
            if (n == 0) {
                n = 2;
                if (lastSecond != null) {
                    lastSecond.next = pre;
                }
                lastSecond = pre.next;
                pre = null;

                // 长度是奇数，直接挂在后面
                if (p == null || p.next == null) {
                    if (lastSecond != null) {
                        lastSecond.next = p;
                    }
                    break;
                }
            }
        }

        return ans;

    }


}
