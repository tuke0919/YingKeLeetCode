package com.yingke.leetcode.easy;

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
public class LeetCode485_最大连续1的个数 {

    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数。
     *
     * 示例 1:
     *
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/max-consecutive-ones
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 思路1，两个指针，遍历一遍，
     * 思路2, 转换为 字符串，在分割
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i: nums) {
            sb.append( i == 0 ? " " : "1");
        }
        String s = sb.toString().trim();
        String[] strs = s.split(" ");

        int max = 0;
        for (String s1: strs) {
            if (s1.length() > max) {
                max = s1.length();
            }
        }
        return max;
    }
}
