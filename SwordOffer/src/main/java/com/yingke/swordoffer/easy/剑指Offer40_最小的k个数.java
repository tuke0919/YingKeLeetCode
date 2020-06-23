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
public class 剑指Offer40_最小的k个数 {

    /**
     * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：arr = [3,2,1], k = 2
     * 输出：[1,2] 或者 [2,1]
     * 示例 2：
     *
     * 输入：arr = [0,1,2,1], k = 1
     * 输出：[0]
     *  
     *
     * 限制：
     *
     * 0 <= k <= arr.length <= 10000
     * 0 <= arr[i] <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 快速排序 思想
     * https://blog.csdn.net/tuke_tuke/article/details/51476630
     * https://blog.csdn.net/tuke_tuke/article/details/50385376
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        if (k == 0 || k > arr.length) {
            return new int[0];
        }

        int start = 0;
        int end = arr.length - 1;
        int index = partition(arr, start, end);
        while (index != k -1) {
            if (index > k - 1) {
                end = index -1;
                index = partition(arr, start, end);
            } else {
                start = index + 1;
                index = partition(arr, start, end);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public int partition(int[] arr, int start, int end){
        int privot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && arr[j] >= privot) {
                j--;
            }
            // 交换
            swap(arr, i, j);
            while (i < j && arr[i] <= privot) {
                i++;
            }
            // 交换
            swap(arr, i, j);
        }
        return i;
    }

    public void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }




}
