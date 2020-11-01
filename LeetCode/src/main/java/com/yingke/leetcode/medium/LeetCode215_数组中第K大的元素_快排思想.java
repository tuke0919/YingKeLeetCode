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
public class LeetCode215_数组中第K大的元素_快排思想 {
    /**
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     *
     * 示例 1:
     *
     * 输入: [3,2,1,5,6,4] 和 k = 2
     * 输出: 5
     * 示例 2:
     *
     * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
     * 输出: 4
     * 说明:
     *
     * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int index = partition(nums, start, end);
        int len = end;
        // 转换为 第len - k + 1 小的元素
        k = len - k + 1;

        while (index != k) {
            if (index > k) {
                end = index -1;
                index = partition(nums, start, end);
            } else {
                start = index + 1;
                index = partition(nums, start, end);
            }
        }
        return nums[index];



    }

    private int partition(int[] num, int start, int end) {
        int privot = num[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && num[j] >= privot) {
                j--;
            }
            swap(num, i, j);
            while (i < j && num[i] <= privot) {
                i++;
            }
            swap(num, i, j);
        }
        return i;
    }

    public void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
