package com.yingke.swordoffer.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class 剑指Offer32_I_从上到下打印二叉树 {
    /**
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     *
     *  
     *
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回：
     *
     * [3,9,20,15,7]
     *  
     *
     * 提示：
     *
     * 节点总数 <= 1000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    /**
     * 层次遍历：用队列，先根结点入队列，在出队列，输出值，左节点和右节点入队列
     *
     * @param root
     * @return
     */
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            if (node != null) {
                result.add(node.val);
                if (node.left != null) {
                    list.offer(node.left);
                }
                if (node.right != null) {
                    list.offer(node.right);
                }
            }
        }
        int[] resultList = new int[result.size()];
        int i = 0;
        for (Integer val: result) {
            resultList[i++] = val;
        }
        return resultList;
    }


}
