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
public class 排序4_希尔排序_或者缩小增量排序 {

    /**
     * 希尔排序：
     * 希尔排序又叫缩小增量排序。基本算法思路是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。（说白了还是直接插入排序，只不过每次增量不一样）
     *
     * 算法步骤：
     *
     * 我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
     * 即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
     * ————————————————
     * 版权声明：本文为CSDN博主「tuke_tuke」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/tuke_tuke/article/details/51072999
     *
     *
     * @param a
     */

    public static void shellSort(int[] a){
        int d = a.length / 2;
        // 以各种不同的间隔距离d进行排序
        while (d >= 1) {
            // 直接插入排序, 在某个d值下对各组进行排序
            for (int i = d; i < a.length ;i++) {
                int j = i - d;
                int temp = a[i];
                // 按某个d值为间距进行组内比较
                while (j >= 0 && temp < a[j]) {
                    a[j + d] = a[j];
                    j -=d;
                }
                // 插入正确的位置
                a[j + d] = temp;
            }
            d = d / 2;
        }
    }

    public static void main(String[] args) {
        int[] a={49, 38, 65, 52, 13, 25, 45, 62, 20};
        shellSort(a);
        System.out.print("排序结果：");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
