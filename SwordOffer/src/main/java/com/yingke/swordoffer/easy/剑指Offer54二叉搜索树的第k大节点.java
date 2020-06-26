package com.yingke.swordoffer.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-24
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer54二叉搜索树的第k大节点 {
    /**
     * 给定一棵二叉搜索树，请找出其中第k大的节点。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * 输出: 4
     * 示例 2:
     *
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     *        5
     *       / \
     *      3   6
     *     / \
     *    2   4
     *   /
     *  1
     * 输出: 4
     *  
     *
     * 限制：
     *
     * 1 ≤ k ≤ 二叉搜索树元素个数
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = levelOrder(root);
        Collections.sort(list);
        return list.get(list.size() - k);

    }

    /**
     * 二叉树 层次遍历
     * @param head
     * @return
     */
    public List<Integer> levelOrder(TreeNode head){
        List<Integer> list = new ArrayList<>();
        if (head == null) {
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return list;

    }



}
