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
public class LeetCode237_删除链表中的节点 {
    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
     */


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     *
     * @param node 要被删除的节点
     */
    public void deleteNode(ListNode node) {
        // 因为无法访问前一个结点，所以可以把要删除的结点的后一个结点的值前移
        node.val = node.next.val;
        //  然后删除掉后一个结点
        node.next = node.next.next;

    }

}
