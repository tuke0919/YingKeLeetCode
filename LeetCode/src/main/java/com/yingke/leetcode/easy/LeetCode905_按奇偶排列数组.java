package com.yingke.leetcode.easy;

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
public class LeetCode905_按奇偶排列数组 {
    /**
     * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
     *
     * 你可以返回满足此条件的任何数组作为答案。
     *
     *  
     *
     * 示例：
     *
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     *  
     *
     * 提示：
     *
     * 1 <= A.length <= 5000
     * 0 <= A[i] <= 5000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 双指针
     */
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            while (i < j && A[i] % 2 == 0) {
                i++;
            }
            while (i < j && A[j] % 2 == 1) {
                j--;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        return A;

    }
}
