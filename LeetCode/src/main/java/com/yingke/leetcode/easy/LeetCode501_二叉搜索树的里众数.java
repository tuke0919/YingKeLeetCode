package com.yingke.leetcode.easy;

import java.util.ArrayList;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-25
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode501_二叉搜索树的里众数 {
    /**
     * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
     *
     * 假定 BST 有如下定义：
     *
     * 结点左子树中所含结点的值小于等于当前结点的值
     * 结点右子树中所含结点的值大于等于当前结点的值
     * 左子树和右子树都是二叉搜索树
     * 例如：
     * 给定 BST [1,null,2,2],
     *
     *    1
     *     \
     *      2
     *     /
     *    2
     * 返回[2].
     *
     * 提示：如果众数超过1个，不需考虑输出顺序
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int preVal = 0;
    private int curTimes = 0;
    private int maxTimes = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        inOrder(root);

         //list转换为int[]
        int size = list.size();
        int[] ans = new int[size];
        for(int i = 0; i < size; i++){
            ans[i] = list.get(i);
        }
        return ans;

    }



    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (root.val == preVal) {
            curTimes++;
        } else {
            preVal = root.val;
            curTimes = 1;
        }

        if (curTimes == maxTimes) {
            list.add(root.val);
        } else if (curTimes > maxTimes){
            list.clear();
            list.add(root.val);
            maxTimes = curTimes;
        }

        inOrder(root.right);
    }





}
