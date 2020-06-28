package com.yingke.basic;

/**
 * 功能：
 * CSDN： https://blog.csdn.net/tuke_tuke/article/details/50403413
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 排序7_归并排序 {

    /**
     *
     * 归并算法排序的思想：把原始数组分成若干子数组,对每一个子数组进行排序,继续把子数组与子数组合并,合并后仍然有序,直到全部合并完,形成有序的数组。
     *
     * 总结一句话就是：将数组不断的分成两半，直到每个子数组只包含一个元素，然后将这些小的子数组归并为稍大的有序子数组，直到最后形成一个有序的数组
     *
     *
     * @param list
     */

    public static void mergeSort(int[] list){
        if(list.length > 1){
            int firstHalfLength = list.length/2;
            int totalLength = list.length;
            int[] firstHalf = new int[firstHalfLength];
            System.arraycopy(list, 0, firstHalf, 0, firstHalfLength);//把list前一半放在firstHalf中
            mergeSort(firstHalf);//递归划分前半段

            int secondHalfLength = totalLength-firstHalfLength;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, firstHalfLength, secondHalf, 0, secondHalfLength);//把list后一半放在firstHalf中
            mergeSort(secondHalf);//递归划分后半段

            int[] temp = merge(firstHalf,secondHalf);//合并两段list
            System.arraycopy(temp, 0, list, 0, temp.length);//把合并的新数组temp赋给list
        }
    }


    /**
     * 合并两段list
     * @param list1
     * @param list2
     * @return
     */
    public static int[] merge(int[] list1, int[] list2) {
        int[] temp = new int[list1.length + list2.length];
        int c1=0;
        int c2=0;
        int c3=0;

        // 开始指针都指着0位置，比较，谁小谁放进temp中指针++
        while(c1 < list1.length && c2 < list2.length){
            if(list1[c1] < list2[c2]){
                temp[c3] = list1[c1];
                c1++;
                c3++;
            } else{
                temp[c3] = list2[c2];
                c2++;
                c3++;
            }
        }

        // list1最后一个元素
        while(c1 < list1.length){
            temp[c3] = list1[c1];
            c1++;
            c3++;
        }

        // list2最后一个元素
        while(c2 < list2.length){
            temp[c3] = list2[c2];
            c2++;
            c3++;
        }
        return temp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] list = {2, 9, 5, 4, 8, 1, 6, 7};
        System.out.println("归并前的数组是：");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "  ");
        }
        System.out.println();
        mergeSort(list);//归并排序
        System.out.println("归并后的数组是：");
        for(int i = 0;i < list.length; i++){
            System.out.print(list[i] + "  ");
        }
    }


}
