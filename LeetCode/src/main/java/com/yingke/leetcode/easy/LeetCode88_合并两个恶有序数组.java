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
public class LeetCode88_合并两个恶有序数组 {

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     *  
     *
     * 说明：
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *  
     *
     * 示例：
     *
     * 输入：
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * 输出：[1,2,2,3,5,6]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 双指针
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp_nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            temp_nums1[i] = nums1[i];
        }

        int p1 = 0;
        int p2 = 0;
        int k = 0;
        while (p1 < m && p2 < n) {
            nums1[k++] = (temp_nums1[p1] < nums2[p2]) ?  temp_nums1[p1++]: nums2[p2++];
        }

        while (p1 < m) {
            nums1[k++] = temp_nums1[p1++];
        }
        while (p2 < n) {
            nums1[k++] = nums2[p2++];
        }
    }



}

