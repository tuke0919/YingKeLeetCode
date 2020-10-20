package com.yingke.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class LeetCode107_二叉树的层次遍历_II {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> oneLevel = new ArrayList<>();
            // 每次都取出一层的所有数据
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {
                TreeNode node = queue.poll();
                oneLevel.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // 每次都往队头塞
            result.addFirst(oneLevel);
        }

        return result;
    }



}
