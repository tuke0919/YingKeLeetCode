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
public class 排序5_简单选择排序 {

    /**
     * 简单选择排序：时间复杂度O(n^2)
     * 算法基本思路：指每次从待排序的记录中选出关键字最小（最大）的记录，顺序放入已排好序的有序序列中，直到全部排完
     *
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     * 算法步骤：
     *
     * 第一趟，从n 个记录中找出关键码最小的记录与第一个记录交换；
     * 第二趟，从第二个记录开始的n-1 个记录中再选出关键码最小的记录与第二个记录交换；
     * 以此类推.....
     * 第i 趟，则从第i 个记录开始的n-i+1 个记录中选出关键码最小的记录与第i 个记录交换，
     * 直到整个序列按关键码有序。
     * ————————————————
     * 版权声明：本文为CSDN博主「tuke_tuke」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/tuke_tuke/article/details/51072999
     *
     */

    public static void selectSort(int[] a){

        for (int i = 0; i < a.length; i++) {
            // 开始的时候k和i指向一样
            int k = i;
            int temp = a[i];
            // 在后边找最小的，把k指向最小数的坐标
            for (int j = i + 1; j < a.length ; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    k = j;
                }
            }
            // 如果k不等于i就交换
            if (k != i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 52, 13, 25, 45, 62, 20};
        selectSort(a);
        System.out.print("排序结果：");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
