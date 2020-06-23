package com.yingke.swordoffer.easy;

import java.util.Arrays;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-23
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer39_数组中出现次数超过一半的数字 {


    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     *
     *  
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
     * 输出: 2
     *  
     *
     * 限制：
     *
     * 1 <= 数组长度 <= 50000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 需要的数字出现次数多于一半 那么排序后必定在中间
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
