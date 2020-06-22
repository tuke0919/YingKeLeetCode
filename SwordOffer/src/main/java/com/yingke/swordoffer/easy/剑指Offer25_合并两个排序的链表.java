package com.yingke.swordoffer.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer25_合并两个排序的链表 {
    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     *
     * 示例1：
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * 限制：
     *
     * 0 <= 链表长度 <= 1000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * 两个指针
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode header = null;
        ListNode k = null;
        ListNode p = l1;
        ListNode q = l2;

        while (p != null && q != null){
            if (p.val <= q.val) {
                if (header == null) {
                    header = p;
                    k = header;
                    p = p.next;
                } else {
                    k.next = p;
                    k = k.next;
                    p = p.next;
                }
            } else {
                if (header == null) {
                    header = q;
                    k = header;
                    q = q.next;
                } else {
                    k.next = q;
                    k = k.next;
                    q = q.next;
                }
            }
        }

        if (p != null) {
            k.next = p;
        }

        if (q != null) {
            k.next = q;
        }
        return header;
    }


}
