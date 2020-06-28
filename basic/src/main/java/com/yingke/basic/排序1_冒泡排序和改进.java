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
public class 排序1_冒泡排序和改进 {

    // 时间复杂度O(n^2)
    // 冒泡排序
    public static void bubbleSort(int[] list){
        int n = list.length;
        for (int i = 1; i < n; i++) { //总共比较n-1趟 , 从1开始
            for (int j = 0; j < n - i; j++) { // 第i趟比较n-i次
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }

            System.out.print("第"+(i)+"轮排序结果：");
            display(list);
        }
    }

    public static void display(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int[] list={25,6,56,24,9,12,55};
        System.out.println("改进的冒泡排序：");
        System.out.println("排序前的list是：");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        bubbleSort(list);//进行冒泡排序
        System.out.println();
        System.out.println("排序后的list是：");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }

    /**
     * 改进的冒泡：如果某趟遍历中没有交换，那么不需要下次遍历，因为元素以排好
     * @param list
     */
    public static void bubbleSortImproved(int[] list){
        int n = list.length;
        boolean needNextPass = true;
        for (int i = 1; i < n && needNextPass; i++) { //总共比较n-1趟 , 从1开始
            // 如果某趟遍历中没有交换，那么不需要下次遍历，因为元素以排好
            needNextPass = false;
            for (int j = 0; j < n - i; j++) { // 第i趟比较n-i次
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                    needNextPass = true;
                }
            }
            display(list);
        }
    }

}
