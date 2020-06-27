package com.yingke.swordoffer.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-27
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer68_I_二叉搜索树的最近公共祖先 {
    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     *
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     *
     * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
     *
     *
     *
     *  
     *
     * 示例 1:
     *
     * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
     * 输出: 6
     * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
     * 示例 2:
     *
     * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
     * 输出: 2
     * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
     *  
     *
     * 说明:
     *
     * 所有节点的值都是唯一的。
     * p、q 为不同节点且均存在于给定的二叉搜索树中。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    /**
     * 解题思路：
     * 祖先的定义： 若节点 p 在节点 root的左（右）子树中，或 p = root，则称 root是 pp 的祖先。
     *
     *
     * 最近公共祖先的定义： 设节点 root 为节点 p,q的某公共祖先，若其左子节点 root.left 和右子节点 root.right 都不是 p,q 的公共祖先，则称 root 是 “最近的公共祖先” 。
     *
     * 根据以上定义，若 root 是 p,q 的 最近公共祖先 ，则只可能为以下情况之一：
     *
     * 1,p 和 q 在 root 的子树中，且分列 root 的 异侧（即分别在左、右子树中）；
     * 2,p = root，且 q 在 root 的左或右子树中；
     * 3,q = root，且 p 在 root 的左或右子树中；
     *
     *
     *
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/mian-shi-ti-68-i-er-cha-sou-suo-shu-de-zui-jin-g-7/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     *
     * 方法一：迭代
     * 循环搜索： 当节点 root 为空时跳出；
     * 当 p, q 都在 root 的 右子树 中，则遍历至 root.right ；
     * 否则，当 p, q都在 root 的 左子树 中，则遍历至 root.left ；
     * 否则，说明找到了 最近公共祖先 ，跳出。
     * 返回值： 最近公共祖先 root
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            if (root.val < p.val && root.val < q.val) {  // p,q 都在 root 的右子树中
                root = root.right; // 遍历至右子节点
            } else if (root.val > p.val && root.val > q.val) { // p,q 都在 root 的左子树中
                root = root.left;// 遍历至左子节点
            } else break;
        }
        return root;

    }



}
