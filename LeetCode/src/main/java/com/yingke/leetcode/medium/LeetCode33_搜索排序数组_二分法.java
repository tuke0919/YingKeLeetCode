package com.yingke.leetcode.medium;

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
public class LeetCode33_搜索排序数组_二分法 {
    /**
     * 给你一个升序排列的整数数组 nums ，和一个整数 target 。
     *
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。（例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] ）。
     *
     * 请你在数组中搜索 target ，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     *
     *  
     * 示例 1：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     * 示例 2：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     * 示例 3：
     *
     * 输入：nums = [1], target = 0
     * 输出：-1
     *  
     *
     * 提示：
     *
     * 1 <= nums.length <= 5000
     * -10^4 <= nums[i] <= 10^4
     * nums 中的每个值都 独一无二
     * nums 肯定会在某个点上旋转
     * -10^4 <= target <= 10^4
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     *  // 一个完整的上升区间分裂为左右两个上升区间
     *     // 左侧为值较大的上升区间、右侧为值较小的上升区间
     *     // 二分法取中位值，中位值可能会落在左侧大区间，也可能是右侧小区间
     *     // a. 当中位值位于左侧大区间 (mid > start)
     *     // 当target比中位值小且比头部大，落在左侧大区间的左部，尾部左移，继续二分
     *     // 否则 target落在左侧大区间右部，头部右移，继续二分
     *     // b. 当中位值位于右侧小区间 (mid < start)
     *     // 当target比中位值大且比尾部小，位于右侧小区间的右部，头部右移，继续二分
     *     // 否则 target落在右侧小区间的左部，尾部左移，继续二分
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[start]) {
                // 左侧大区间
                if (nums[start] <= target && target < nums[mid]) {
                    // target位于 左区间的左部，尾部左移
                    end = mid - 1;
                } else {
                    // 位于左侧大区间右部，头部右移 start -->
                    start = mid + 1;
                }
            } else {
                // 右侧 小区间
                if (target > nums[mid] && target <= nums[end]) {
                    // target位于右侧小区间右部，头部邮寄 start -->
                    start = mid + 1;
                } else {
                    // target位于右侧小区间左部，尾部左移 <-- end
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
