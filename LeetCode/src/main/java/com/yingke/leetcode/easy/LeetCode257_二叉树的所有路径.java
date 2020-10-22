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
 * @author tuke 时间 2020-10-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode257_二叉树的所有路径 {

    /**
     * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * 示例:
     *
     * 输入:
     *
     *    1
     *  /   \
     * 2     3
     *  \
     *   5
     *
     * 输出: ["1->2->5", "1->3"]
     *
     * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-paths
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     *  广度优先 搜索
     *  参考：LeetCode112
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(root.val + "");

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();

            if (node.left == null && node.right == null) {
                // 叶子节点
                paths.add(path);
            } else  {
                // 非叶子节点
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
                }

                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
                }
            }
        }
        return paths;


    }

}
