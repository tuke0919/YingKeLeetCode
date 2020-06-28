package com.yingke.basic;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 查找_二分查找 {

    /**
     * 1，必须是有序数组
     * 2，首先确定数组的中间的下标 mid = (left + right) /2
     * 3，然后让要查找的值value和arr[mid]比较
     * 4，value > arr[mid], 说明要查找的值在mid右边, 继续递归向右查找
     * 5，value < arr[mid], 说明要查找的值在mid左边, 继续递归向左查找
     * 6，value = arr[mid], 找到
     *
     * 作者：iDevOps
     * 链接：https://www.jianshu.com/p/e930f8044185
     * 来源：简书
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */


    /**
     * 非递归
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int binarySearch(int[] a,int n,int value){
        int low = 0;
        int high = n - 1;
        int mid;
        while(low < high){
            mid = (low + high)/2;
            if(value < a[mid])
                high = mid - 1;
            if(value > a[mid])
                low = mid + 1;
            if(value == a[mid])
                return mid;
        }
        return -1;
    }

    /**
     * 递归版本
     * @param a
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch2(int a[], int value, int low, int high) {
        int mid = (high + low) / 2;
        if(a[mid] == value)
            return mid;
        if(a[mid] > value)
            return binarySearch2(a, value, low, mid - 1);
        if(a[mid] < value)
            return binarySearch2(a, value, mid + 1, high);

        return -1;
    }
}

