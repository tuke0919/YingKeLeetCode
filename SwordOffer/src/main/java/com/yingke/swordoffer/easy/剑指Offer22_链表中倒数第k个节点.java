package com.yingke.swordoffer.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-27
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer22_链表中倒数第k个节点 {

    /**
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
     *
     *  
     *
     * 示例：
     *
     * 给定一个链表: 1->2->3->4->5, 和 k = 2.
     *
     * 返回链表 4->5.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }


    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        int kk = k;
        while (q != null && kk > 0) {
            q = q.next;
            kk--;
        }

        // 恰好列表尾
        if (q == null && kk == 0) {
            return p;
        }
        // 链表长度 比 k小
        if (q == null && kk > 0) {
            return null;
        }

        while (q != null) {
            q = q.next;
            p = p .next;
        }

        return p;
    }
}
