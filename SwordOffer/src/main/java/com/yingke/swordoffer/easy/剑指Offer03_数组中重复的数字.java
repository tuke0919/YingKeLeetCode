package com.yingke.swordoffer.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer03_数组中重复的数字 {

    /**
     * 找出数组中重复的数字。
     *
     *
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 示例 1：
     *
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     *  
     *
     * 限制：
     *
     * 2 <= n <= 100000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     *  时间 O(N) 空间 O(N)
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int index = 0 ; index < nums.length; index ++) {
             if (set.contains(nums[index])) {
                 return nums[index];
             } else {
                 set.add(nums[index]);
             }
        }
        return -1;

    }


    /**
     *  先排序，然后看相邻元素是否有相同的，有直接return。 不过很慢，时间O(nlogn)了，空间O(1)
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums) {

        Arrays.sort(nums);
        int pre = nums[0];
        for (int index = 1 ; index < nums.length; index ++) {
            if (nums[index] == pre) {
                return pre;
            }
            pre = nums[index];
        }
        return -1;

    }


}
