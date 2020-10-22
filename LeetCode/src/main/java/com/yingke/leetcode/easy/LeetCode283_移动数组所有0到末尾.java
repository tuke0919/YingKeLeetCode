package com.yingke.leetcode.easy;

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
public class LeetCode283_移动数组所有0到末尾 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 示例:
     *
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 说明:
     *
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/move-zeroes
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 冒泡 排序
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 换思路 非0移到前面，后面补0
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        // 后面补0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


}
