package com.yingke.leetcode.easy;

import java.util.Arrays;

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
public class LeetCode455_小孩发饼干 {
    /**
     * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
     *
     * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
     *
     *  
     * 示例 1:
     *
     * 输入: g = [1,2,3], s = [1,1]
     * 输出: 1
     * 解释:
     * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
     * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
     * 所以你应该输出1。
     * 示例 2:
     *
     * 输入: g = [1,2], s = [1,2,3]
     * 输出: 2
     * 解释:
     * 你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
     * 你拥有的饼干数量和尺寸都足以让所有孩子满足。
     * 所以你应该输出2.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/assign-cookies
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int findContentChildren(int[] g, int[] s) {
        int chlid = 0;
        int cookie = 0;
        // 贪心算法 的思想是 用尽量小的饼干去满足小需求的孩子，才能尽量满足更多孩子，所以要排序
        Arrays.sort(g);
        Arrays.sort(s);
        // 双指针
        while (chlid < g.length && cookie < s.length) {
            // 如果 当前饼干 能满足 当前孩子，那么就算，轮到下一个孩子了
            if (g[chlid] <= s[cookie]) {
                chlid ++;
            }
            // 无论 能不能 满足当前孩子，这块饼干都没有作用了，尝试用大一点的饼干
            cookie ++;
        }
        return chlid;

    }


}
