package com.yingke.swordoffer.easy;

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
public class 剑指Offer55_II_平衡二叉树 {
    /**
     * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
     *
     *  
     *
     * 示例 1:
     *
     * 给定二叉树 [3,9,20,null,null,15,7]
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回 true 。
     *
     * 示例 2:
     *
     * 给定二叉树 [1,2,2,3,3,null,null,4,4]
     *
     *        1
     *       / \
     *      2   2
     *     / \
     *    3   3
     *   / \
     *  4   4
     * 返回 false 。
     *
     *  
     *
     * 限制：
     *
     * 1 <= 树的结点个数 <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    /**
     * 将表述翻译代码即可，使用递归实现。
     * 终止条件：root==null
     * 判断条件：如果左或右子树不平衡则不平衡，如果左右子树深度相差大于1则不平衡
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return  true;
        }

        // 判断 当前节点
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        if (Math.abs(maxLeft - maxRight) > 1) {
            return false;
        }

        // 当前节点 是 平衡的，再判断 左右子树 是否平衡的
        return isBalanced(root.left) && isBalanced(root.right);
    }


    /**
     * 二叉树 深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        return Math.max(maxLeft, maxRight) + 1;
    }







}
