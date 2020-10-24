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
 * @author tuke 时间 2020-10-24
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode404_二叉树左叶子之和 {

    /**
     * 计算给定二叉树的所有左叶子之和。
     *
     * 示例：
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *
     * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sum-of-left-leaves
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Boolean> queue1 = new LinkedList<>();
        queue.offer(root);
        queue1.offer(false);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            boolean left = queue1.poll();
            if (left && node.left == null && node.right == null) {
                res.add(node.val);
            } else {
                if (node.left != null) {
                    queue.offer(node.left);
                    queue1.offer(true);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    queue1.offer(false);
                }
            }
        }
        int rs = 0;
        for (Integer i: res) {
            rs += i;
        }

        return rs;

    }


}
