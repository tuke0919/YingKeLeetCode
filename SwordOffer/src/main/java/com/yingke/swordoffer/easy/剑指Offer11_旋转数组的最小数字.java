package com.yingke.swordoffer.easy;

import java.util.Arrays;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer11_旋转数组的最小数字 {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
     *
     * 示例 1：
     *
     * 输入：[3,4,5,1,2]
     * 输出：1
     * 示例 2：
     *
     * 输入：[2,2,2,0,1]
     * 输出：0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param numbers
     * @return
     */

    public int minArray(int[] numbers) {
        if(numbers == null){
            return -1;
        }
        Arrays.sort(numbers);
        return numbers[0];

    }

    /**
     * 二分法，mid元素与right元素比较，
     * 如果mid元素小，说明mid右边的数组是递增数组,那么最小值必然在mid左边，right = mid;
     * 如果mid元素比right元素大，说明最小值在mid与right之间，left = mid + 1;
     * 如果相等，说明mid与right区间的元素相等重复，right--;
     *
     * @param numbers
     * @return
     */
    public int minArray1(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int left  = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]){
                left = mid + 1;
            } else {
                right --;
            }
        }
        return numbers[left];

    }
}
