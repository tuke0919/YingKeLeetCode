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
public class LeetCode226_翻转二叉树 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode  node = root.left;
        root.left = root.right;
        root.right = node;
        root.left = invertTree(root.left);
        root.right =invertTree(root.right);
        return root;
    }
}
