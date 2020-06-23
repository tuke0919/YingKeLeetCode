package com.yingke.swordoffer.easy;

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
public class 剑指Offer21_调整数组顺序使奇数位于偶数前面 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     *
     *  
     *
     * 示例：
     *
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,2,4]
     * 注：[3,1,2,4] 也是正确的答案之一。
     *
     * 提示：
     *
     * 1 <= nums.length <= 50000
     * 1 <= nums[i] <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 简单，但超时错误，O(n^2)
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int i;
        int j;
        for (i = 0; i < nums.length; i ++ ) {
            if (nums[i] % 2 == 0) {
                for (j = i + 1; j < nums.length; j ++) {
                    if (nums[j] % 2 == 1) {
                        // 交换
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    /**
     * 快速排序思想
     *
     * @param nums
     * @return
     */
    public int[] exchange1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // 奇数，一直往右走
            while (left < right && nums[left] % 2 != 0){
                left ++;
            }

            // 偶数，一直往左走
            while (left < right && nums[right] % 2 == 0 ) {
                right --;
            }

            // 交换
            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;
    }




}
