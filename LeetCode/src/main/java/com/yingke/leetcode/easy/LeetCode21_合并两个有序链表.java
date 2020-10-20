package com.yingke.leetcode.easy;

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
public class LeetCode21_合并两个有序链表 {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
     *
     *  
     *
     * 示例：
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

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
