package com.yingke.basic;

import java.util.Arrays;

/**
 * 功能：https://www.cnblogs.com/luomeng/p/10618709.html
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 排序6_堆排序 {


    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     *
     * @param arr
     * @param parent 数组中父节点的位置
     * @param end    待排序的尾元素索引
     */
    public static void adjustHeap(int []arr,int parent, int end){
        // 先取出当前元素i
        int temp = arr[parent];

        // //从parent结点的左子结点开始，也就是2*parent+1处开始
        for (int left = 2 * parent + 1; left < end; left = 2 * left + 1) {

            int maxChildIndex = left;

            // 如果左子结点小于右子结点，maxChildIndex, left都指向右子结点
            if (left + 1 < end && arr[left] < arr[left + 1]) {
                left ++;
                maxChildIndex = left;
            }

            // 如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if (temp < arr[maxChildIndex]) {
                arr[parent] = arr[maxChildIndex];
                parent = maxChildIndex;
            } else {
                break;
            }
        }
        // 将temp值放到最终的位置
        arr[parent] = temp;
    }

    public static void sort(int []arr){
        // 1.构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            // 从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,  i, arr.length);
        }

        // 2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length -1; j > 0; j--) {
            // 将堆顶元素与末尾元素进行交换
            swap(arr, 0, j);
            // 重新对堆进行调整
            adjustHeap(arr, 0, j);
        }
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String []args){
        int []arr = {25, 15, 88, 45, 8, 1, 33, 21, 55, 6};
        System.out.println("排序前：" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序前：" + Arrays.toString(arr));
    }
}
