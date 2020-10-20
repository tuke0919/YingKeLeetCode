package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-20
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode83_删除排序链表中重复的元素 {
    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     *
     * 示例 1:
     *
     * 输入: 1->1->2
     * 输出: 1->2
     * 示例 2:
     *
     * 输入: 1->1->2->3->3
     * 输出: 1->2->3
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    /**
     * 双指针
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) {
             return null;
         }
         ListNode p = head;
         ListNode q = head.next;
         while (q != null) {
             if (q.val != p.val) {
                 p = p.next;
                 q = q.next;
             } else {
                 p.next = q.next;
                 q = q.next;
             }
         }
         return head;
    }


}
