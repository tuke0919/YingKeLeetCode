package com.yingke.basic;

/**
 * 功能：
 * CSDN：
 * https://blog.csdn.net/tuke_tuke/article/details/51072999
 *
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 排序3_简单插入排序 {
    /**
     * 算法步骤：对数组a
     *
     * 1，设置监视哨a[i],将待插结果的值赋值给temp
     *
     * 2, 设置开始查找的位置j=i-1;
     *
     * 3，在数组j后面搜索，如果temp<a[j],那么将第j个记录后移，直到temp>=a[j]
     *
     * 4,将temp插入到a[j+1]的位置
     *
     * @param a
     */


    public static void insertSort(int[] a){
        int temp = 0;

        for (int i = 1; i < a.length; i++) {
             int j = i - 1;
             temp = a[i];
             while (j >= 0 && temp < a[j]) { // temp比前边的值小，前边的值就依次后移
                 a[j + 1] = a[j];
                 j--;
             }
             a[j + 1] = temp;

            // 每趟输出
            Output(a,i);
        }
    }

    public static void Output(int[] a,int i){
        System.out.print("第"+i+"趟： ");
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a={ 49, 38, 65, 52, 13, 25, 45, 62, 20};
        insertSort(a);
        System.out.print("排序结果：");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }


}
