package com.yingke.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

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
public class LeetCode112_二叉树路径总和等于某值 {
    /**
     * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * 示例: 
     * 给定如下二叉树，以及目标和 sum = 22，
     *
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \      \
     *         7    2      1
     * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
     *
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/path-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> sumQueue = new LinkedList<>();
        nodeQueue.offer(root);
        sumQueue.offer(root.val);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            int sumTemp = sumQueue.poll();
            // 叶子节点
            if (node.left == null && node.right == null) {
                if (sumTemp == sum) {
                    return true;
                }
                continue;
            }

            // 非叶子节点
            if (node.left != null) {
                nodeQueue.offer(node.left);
                sumQueue.offer(sumTemp + node.left.val);
            }

            if (node.right != null) {
                nodeQueue.offer(node.right);
                sumQueue.offer(sumTemp + node.right.val);
            }

        }

        return false;
    }


}
