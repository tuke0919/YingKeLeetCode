package com.yingke.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

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
public class LeetCode448_找到数组中消失的数字 {
    /**
     *
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     *
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     *
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     *
     * 示例:
     *
     * 输入:
     * [4,3,2,7,8,2,3,1]
     *
     * 输出:
     * [5,6]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null) {
            return res;
        }
        // 遍历数组，将索引为num[i] - 1的数值标记为负
        for (int i = 0; i < nums.length ; i++) {
            // 先取 当前元素的绝对值，然后 -1，然后 把当前值 转换成 数组的索引值
            int index = Math.abs(nums[i]) - 1;
            // 如果 索引值大于0，就变成负的，已经是负的了，不用管
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        // 再次遍历数组，如果num[i] 为负，说明 数组中 出现过 i+1,反之 为正值，说明数组中没有出现过 i+ 1
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;

    }
}
