package com.yingke.leetcode.medium;

import java.util.List;

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
public class LeetCode34_在排序数组中查找元素的第一个和最后一个位置 {


    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     * 你的算法时间复杂度必须是 O(log n) 级别。
     *
     * 如果数组中不存在目标值，返回 [-1, -1]。
     *
     * 示例 1:
     *
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: [3,4]
     * 示例 2:
     *
     * 输入: nums = [5,7,7,8,8,10], target = 6
     * 输出: [-1,-1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }

        // >= 2 二分法
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] >= target) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        // 没找到
        if(nums[i] != target) {
            return ans;
        }

        ans[0] = i;
        for (int k = i; k < nums.length; k++) {
            if (nums[k] != target) {
                ans[1] = k - 1;
                break;
            } else {
                if (k == nums.length - 1) {
                    ans[1] = k;
                    break;
                }
            }
        }

        return ans;


    }
}
