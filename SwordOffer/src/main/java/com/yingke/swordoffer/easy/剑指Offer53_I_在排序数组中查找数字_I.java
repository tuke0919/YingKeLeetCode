package com.yingke.swordoffer.easy;

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
public class 剑指Offer53_I_在排序数组中查找数字_I {

    /**
     * 统计一个数字在排序数组中出现的次数。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: 2
     * 示例 2:
     *
     * 输入: nums = [5,7,7,8,8,10], target = 6
     * 输出: 0
     *  
     *
     * 限制：
     *
     * 0 <= 数组长度 <= 50000
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public int search(int[] nums, int target) {
        int count = 0;
        // 二分查找
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // 找到了
        while (left < nums.length && nums[left++] == target) {
            count ++;
        }
        return count;

    }



}
