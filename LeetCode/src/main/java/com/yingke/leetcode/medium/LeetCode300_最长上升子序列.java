package com.yingke.leetcode.medium;

import java.lang.reflect.Method;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-11-01
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode300_最长上升子序列 {
    /**
     *
     * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
     *
     * 示例:
     *
     * 输入: [10,9,2,5,3,7,101,18]
     * 输出: 4
     * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
     * 说明:
     *
     * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
     * 你算法的时间复杂度应该为 O(n2) 。
     * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;
        int maxans = 1;

        for (int i = 1; i < len; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;


    }
}
