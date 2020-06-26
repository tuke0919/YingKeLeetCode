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
public class 剑指Offer53_II_0_n_1中缺失的数字 {

    /**
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: [0,1,3]
     * 输出: 2
     * 示例 2:
     *
     * 输入: [0,1,2,3,4,5,6,7,9]
     * 输出: 8
     *  
     *
     * 限制：
     *
     * 1 <= 数组长度 <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 最简单
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    /**
     * 解题思路：
     * 排序数组中的搜索问题，首先想到 二分法 解决。
     * 根据题意，数组可以按照以下规则划分为两部分。
     * 左子数组： nums[i] ==i ；
     * 右子数组： nums[i] !=i;
     *
     * 缺失的数字等于 “右子数组的首位元素” 对应的索引；因此考虑使用二分法查找 “右子数组的首位元素”
     *
     *算法解析：
     * 初始化： 左边界 i = 0，右边界 j = len(nums) - 1；代表闭区间 [i, j]。
     * 循环二分： 当 i≤j 时循环 （即当闭区间 [i, j]为空时跳出） ；
     * 计算中点 m = (i + j) // 2 ，其中 "//" 为向下取整除法；
     * 若 nums[m] == m，则 “右子数组的首位元素” 一定在闭区间 [m + 1, j] 中，因此执行 i = m + 1
     * 若 nums[m] != m, 则 “左子数组的末位元素” 一定在闭区间 [i, m - 1] 中，因此执行 j = m - 1；
     *
     * 返回值： 跳出时，变量 i 和 j分别指向 “右子数组的首位元素” 和 “左子数组的末位元素” 。因此返回 i即可
     *
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/solution/mian-shi-ti-53-ii-0n-1zhong-que-shi-de-shu-zi-er-f/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] != mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
