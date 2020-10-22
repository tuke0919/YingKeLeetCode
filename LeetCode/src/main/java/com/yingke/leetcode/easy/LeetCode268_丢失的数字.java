package com.yingke.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode268_丢失的数字 {

    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     *
     *  
     *
     * 进阶：
     *
     * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [3,0,1]
     * 输出：2
     * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     * 示例 2：
     *
     * 输入：nums = [0,1]
     * 输出：2
     * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     * 示例 3：
     *
     * 输入：nums = [9,6,4,2,3,5,7,0,1]
     * 输出：8
     * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/missing-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 排序
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // 判断首位
        if (nums[0] != 0) {
            return 0;
        }
        // 判断 末尾
        if (nums[nums.length -1] != n) {
            return n;
        }

        // 相邻差 不等于1
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }
        return -1;
    }

    /**
     * hashset
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int n = nums.length;
        // 检查 [0, n] 的n+1个数在 set中 有没有
        for (int i = 0; i < n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 位运算
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i] ^ i;
        }
        return result;

    }








}
