package com.yingke.swordoffer.easy;

import java.util.ArrayList;
import java.util.List;

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
public class 剑指Offer57_II_和为s的连续正数序列 {

    /**
     * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
     *
     * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：target = 9
     * 输出：[[2,3,4],[4,5]]
     * 示例 2：
     *
     * 输入：target = 15
     * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
     *  
     *
     * 限制：
     *
     * 1 <= target <= 10^5
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 1,要有一个区间的概念，这里的区间是(1, 2, 3, ..., target - 1)
     * 2,套滑动窗口模板，l是窗口左边界，r是窗口右边界，窗口中的值一定是连续值。
     * 3,当窗口中数字和小于target时，r右移; 大于target时，l右移; 等于target时就获得了一个解
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int left = 1;
        int right = 1;
        int sum = 0;
        for (; right < target; right++) {
            sum = sum + right;

            while (sum > target) {
                sum = sum - left;
                left++;
            }
            if (sum == target) {
                int[] temp = new int[right - left + 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = left + i;
                }
                list.add(temp);
            }
        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < res.length ; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
